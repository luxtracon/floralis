package com.luxtracon.floralis.client.tint;

import com.luxtracon.floralis.common.registry.FloralisColors;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisPottedBlockTintSource implements BlockTintSource {

	@Override
	public int color(BlockState pBlockState) {
		return FloralisColors.TINT;
	}

	@Override
	public int colorAsTerrainParticle(BlockState pBlockState, BlockAndTintGetter pBlockAndTintGetter, BlockPos pBlockPos) {
		return FloralisColors.NONE;
	}

	@Override
	public int colorInWorld(BlockState pBlockState, BlockAndTintGetter pBlockAndTintGetter, BlockPos pBlockPos) {
		return BiomeColors.getAverageGrassColor(pBlockAndTintGetter, pBlockPos);
	}
}
