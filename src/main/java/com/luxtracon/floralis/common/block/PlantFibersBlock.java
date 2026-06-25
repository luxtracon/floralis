package com.luxtracon.floralis.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class PlantFibersBlock extends RotatedPillarBlock {
	public PlantFibersBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public void fallOn(Level pLevel, BlockState pBlockState, BlockPos pBlockPos, Entity pEntity, double pFallDistance) {
		pEntity.causeFallDamage(pFallDistance, 0.2F, pLevel.damageSources().fall());
	}

	@Override
	public int getFireSpreadSpeed(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, Direction pDirection) {
		return 60;
	}

	@Override
	public int getFlammability(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, Direction pDirection) {
		return 20;
	}
}
