package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.helper.FloralisHelper;
import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import com.mojang.serialization.MapCodec;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class CactusPlantBlock extends BushBlock {
	public static final MapCodec<CactusPlantBlock> CODEC = Block.simpleCodec(CactusPlantBlock::new);

	public CactusPlantBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public boolean mayPlaceOn(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos) {
		return pBlockState.is(BlockTags.SAND);
	}

	@Override
	public void entityInside(BlockState pBlockState, Level pLevel, BlockPos pBlockPos, Entity pEntity) {
		FloralisHelper.hurt(pLevel.damageSources().cactus(), pEntity, 1.0F);
	}

	@Override
	public PathType getBlockPathType(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, @Nullable Mob pMob) {
		return PathType.DAMAGE_OTHER;
	}

	@Override
	public VoxelShape getShape(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, CollisionContext pCollisionContext) {
		var vec3 = pBlockState.getOffset(pBlockPos);
		return FloralisVoxelShapes.CACTUS_PLANT.move(vec3.x, vec3.y, vec3.z);
	}

	@Override
	public MapCodec<CactusPlantBlock> codec() {
		return CactusPlantBlock.CODEC;
	}
}
