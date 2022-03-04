package com.luxtracon.floralis.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nonnull;

@SuppressWarnings("deprecation")
public class FlowerPlantBlock extends Block {
	private static final VoxelShape SHAPE = Block.box(5.25D, 0.0D, 5.25D, 10.75D, 12.0D, 10.75D);

	public FlowerPlantBlock(Properties properties) {
		super(properties);
	}

	public boolean canSurvive(@Nonnull BlockState pState, @Nonnull LevelReader pLevel, @Nonnull BlockPos pPos) {
		BlockPos posBelow = pPos.below();
		return this.mayPlaceOn(pLevel.getBlockState(posBelow));
	}

	public boolean mayPlaceOn(@Nonnull BlockState pState) {
		return pState.is(BlockTags.DIRT);
	}

	public @Nonnull BlockState updateShape(@Nonnull BlockState pState, @Nonnull Direction pFacing, @Nonnull BlockState pFacingState, @Nonnull LevelAccessor pLevel, @Nonnull BlockPos pCurrentPos, @Nonnull BlockPos pFacingPos) {
		return !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	public @Nonnull OffsetType getOffsetType() {
		return OffsetType.XZ;
	}

	public @Nonnull VoxelShape getShape(@Nonnull BlockState pState, @Nonnull BlockGetter pLevel, @Nonnull BlockPos pPos, @Nonnull CollisionContext pContext) {
		Vec3 vec3 = pState.getOffset(pLevel, pPos);
		return SHAPE.move(vec3.x, vec3.y, vec3.z);
	}
}
