package com.luxtracon.floralis.common.helper;

import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisHelper {

	public static boolean maintain(BlockPos pBlockPos, LevelReader pLevelReader, TagKey<Block> pTagKey) {
		return pLevelReader.getBlockState(pBlockPos).is(pTagKey);
	}

	public static WeightedStateProvider simple(Block pBlock) {
		return new WeightedStateProvider(new WeightedList.Builder<BlockState>().add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 0)).add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 1)).add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 2)).add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 3)).build());
	}
}
