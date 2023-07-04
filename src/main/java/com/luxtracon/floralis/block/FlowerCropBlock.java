package com.luxtracon.floralis.block;

import com.luxtracon.floralis.registry.FloralisBlockStateProperties;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FlowerCropBlock extends CropBlock {
	public static final VoxelShape[] SHAPES = new VoxelShape[] {
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 1.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 3.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 5.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 7.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 9.0D, 10.75D), Block.box(5.25D, -1.0D, 5.25D, 10.75D, 11.0D, 10.75D)
	};

	public FlowerCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), 0));
	}

	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
		return (pLevel.getRawBrightness(pPos, 0) >= 8 || pLevel.canSeeSky(pPos)) && this.mayPlaceOn(pLevel.getBlockState(pPos.below()), pLevel, pPos);
	}

	@Override
	public boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
		return pState.getBlock() instanceof FarmBlock;
	}

	@Override
	public int getBonemealAgeIncrease(Level pLevel) {
		return Mth.nextInt(pLevel.random, 1, 3);
	}

	@Override
	public int getMaxAge() {
		return 5;
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FloralisBlockStateProperties.AGE);
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		return !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public IntegerProperty getAgeProperty() {
		return FloralisBlockStateProperties.AGE;
	}

	@Override
	public ItemLike getBaseSeedId() {
		return this;
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return FlowerCropBlock.SHAPES[pState.getValue(this.getAgeProperty())];
	}
}
