package com.luxtracon.floralis.client.tint;

import com.luxtracon.floralis.common.registry.FloralisColors;

import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisBlockTintSource implements BlockTintSource {

	@Override
	public int color(BlockState pBlockState) {
		return FloralisColors.TINT;
	}

	@Override
	public int colorAsTerrainParticle(BlockState pBlockState, BlockAndTintGetter pBlockAndTintGetter, BlockPos pBlockPos) {
		return BiomeColors.getAverageGrassColor(pBlockAndTintGetter, pBlockPos);
	}

	@Override
	public int colorInWorld(BlockState pBlockState, BlockAndTintGetter pBlockAndTintGetter, BlockPos pBlockPos) {
		return BiomeColors.getAverageGrassColor(pBlockAndTintGetter, pBlockPos);
	}
}
