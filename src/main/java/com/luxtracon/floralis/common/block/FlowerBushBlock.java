package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.helper.FloralisHelper;
import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.neoforged.neoforge.common.Tags;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FlowerBushBlock extends BushBlock {
	public FlowerBushBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public boolean canSurvive(BlockState pBlockState, LevelReader pLevelReader, BlockPos pBlockPos) {
		return FloralisHelper.maintain(pBlockPos.below(), pLevelReader, BlockTags.DIRT) || FloralisHelper.maintain(pBlockPos.below(), pLevelReader, Tags.Blocks.VILLAGER_FARMLANDS);
	}

	@Override
	public VoxelShape getShape(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, CollisionContext pCollisionContext) {
		return FloralisVoxelShapes.FLOWER_BUSH;
	}
}
