package com.luxtracon.floralis.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class CactusPlantBlock extends BushBlock {
	public static final MapCodec<CactusPlantBlock> CODEC = Block.simpleCodec(CactusPlantBlock::new);

	public static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);

	public CactusPlantBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
		return this.mayPlaceOn(pLevel.getBlockState(pPos.below()), pLevel, pPos);
	}

	@Override
	public boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
		return pState.is(BlockTags.SAND);
	}

	@Override
	public int getFireSpreadSpeed(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pDirection) {
		return 60;
	}

	@Override
	public int getFlammability(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pDirection) {
		return 100;
	}

	@Override
	public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
		if (pEntity instanceof Bee) {
			pEntity.setInvulnerable(true);
		}

		pEntity.hurt(pLevel.damageSources().cactus(), 1.0F);
	}

	@Override
	public PathType getBlockPathType(BlockState pState, BlockGetter pLevel, BlockPos pPos, @Nullable Mob pMob) {
		return PathType.DAMAGE_OTHER;
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		return !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	@Override
	public MapCodec<CactusPlantBlock> codec() {
		return CactusPlantBlock.CODEC;
	}

	@Override
	public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		var vec3 = pState.getOffset(pLevel, pPos);
		return CactusPlantBlock.SHAPE.move(vec3.x, vec3.y, vec3.z);
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		var vec3 = pState.getOffset(pLevel, pPos);
		return CactusPlantBlock.SHAPE.move(vec3.x, vec3.y, vec3.z);
	}
}
