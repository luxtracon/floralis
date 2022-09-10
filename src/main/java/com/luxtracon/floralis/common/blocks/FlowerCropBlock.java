package com.luxtracon.floralis.common.blocks;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.event.ForgeEventFactory;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FlowerCropBlock extends CropBlock implements BonemealableBlock, IPlantable {
	public static final int MAX_AGE = 5;
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 5);
	public static final VoxelShape[] SHAPES = new VoxelShape[]{Block.box(5.25D, -1.0D, 5.25D, 10.75D, 1.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 3.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 5.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 7.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 9.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 11.0D, 10.75D)};

	public FlowerCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), 0));
	}

	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
		return (pLevel.getRawBrightness(pPos, 0) >= 8 || pLevel.canSeeSky(pPos)) && this.mayPlaceOn(pLevel.getBlockState(pPos.below()));
	}

	@Override
	public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
		return this.isNotMaxAge(pState);
	}

	public boolean isNotMaxAge(BlockState pState) {
		return pState.getValue(this.getAgeProperty()) < this.getMaxAge();
	}

	@Override
	public boolean isRandomlyTicking(BlockState pState) {
		return this.isNotMaxAge(pState);
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
		return this.isNotMaxAge(pState);
	}

	public boolean mayPlaceOn(BlockState pState) {
		return pState.is(Blocks.FARMLAND);
	}

	public static float getGrowthSpeed(Block pBlock, BlockGetter pLevel, BlockPos pPos) {
		BlockPos posBelow = pPos.below();
		float floatFirst = 1.0F;
		for(int i = -1; i <= 1; ++i) {
			for(int j = -1; j <= 1; ++j) {
				float floatSecond = 0.0F;
				if (pLevel.getBlockState(posBelow.offset(i, 0, j)).canSustainPlant(pLevel, posBelow.offset(i, 0, j), Direction.UP, (IPlantable) pBlock)) {
					floatSecond = 1.0F;
					if (pLevel.getBlockState(posBelow.offset(i, 0, j)).isFertile(pLevel, pPos.offset(i, 0, j))) {
						floatSecond = 3.0F;
					}
				}

				if (i != 0 || j != 0) {
					floatSecond /= 4.0F;
				}

				floatFirst += floatSecond;
			}
		}

		BlockPos posNorth = pPos.north();
		BlockPos posSouth = pPos.south();
		BlockPos posWest = pPos.west();
		BlockPos posEast = pPos.east();

		boolean flagFirst = pLevel.getBlockState(posWest).is(pBlock) || pLevel.getBlockState(posEast).is(pBlock);
		boolean flagSecond = pLevel.getBlockState(posNorth).is(pBlock) || pLevel.getBlockState(posSouth).is(pBlock);

		if (flagFirst && flagSecond) {
			floatFirst /= 2.0F;
		} else {
			boolean flagThird = pLevel.getBlockState(posWest.north()).is(pBlock) || pLevel.getBlockState(posEast.north()).is(pBlock) || pLevel.getBlockState(posEast.south()).is(pBlock) || pLevel.getBlockState(posWest.south()).is(pBlock);
			if (flagThird) {
				floatFirst /= 2.0F;
			}
		}

		return floatFirst;
	}

	@Override
	public int getAge(BlockState pState) {
		return pState.getValue(this.getAgeProperty());
	}

	@Override
	public int getBonemealAgeIncrease(Level pLevel) {
		return Mth.nextInt(pLevel.random, 1, 3);
	}

	@Override
	public int getMaxAge() {
		return MAX_AGE;
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(AGE);
	}

	@Override
	public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
		if (pEntity instanceof Ravager && ForgeEventFactory.getMobGriefingEvent(pLevel, pEntity)) {
			pLevel.destroyBlock(pPos, true, pEntity);
		}
	}

	@Override
	public void growCrops(Level pLevel, BlockPos pPos, BlockState pState) {
		int i = this.getAge(pState) + this.getBonemealAgeIncrease(pLevel);
		if (i > this.getMaxAge()) {
			i = this.getMaxAge();
		}

		pLevel.setBlock(pPos, this.getStateForAge(i), 2);
	}

	@Override
	public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
		this.growCrops(pLevel, pPos, pState);
	}

	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		if (!pLevel.isAreaLoaded(pPos, 1)) {
			return;
		}

		if (pLevel.getRawBrightness(pPos, 0) >= 8) {
			if (this.getAge(pState) < this.getMaxAge()) {
				if (ForgeHooks.onCropsGrowPre(pLevel, pPos, pState, pRandom.nextInt((int)(25.0F / getGrowthSpeed(this, pLevel, pPos)) + 1) == 0)) {
					pLevel.setBlock(pPos, this.getStateForAge(this.getAge(pState) + 1), 2);
					ForgeHooks.onCropsGrowPost(pLevel, pPos, pState);
				}
			}
		}
	}

	@Override
	public BlockState getPlant(BlockGetter pLevel, BlockPos pPos) {
		return defaultBlockState();
	}

	@Override
	public BlockState getStateForAge(int pAge) {
		return this.defaultBlockState().setValue(this.getAgeProperty(), pAge);
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		return !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public IntegerProperty getAgeProperty() {
		return AGE;
	}

	@Override
	public PlantType getPlantType(BlockGetter pLevel, BlockPos pPos) {
		return PlantType.CROP;
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return SHAPES[pState.getValue(this.getAgeProperty())];
	}
}
