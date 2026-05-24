package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.helper.FloralisHelper;
import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.neoforged.neoforge.common.Tags;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FlowerCropBlock extends CropBlock {
	public FlowerCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(FloralisBlockStateProperties.AGE, 0));
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FloralisBlockStateProperties.AGE);
	}

	@Override
	public boolean canSurvive(BlockState pBlockState, LevelReader pLevelReader, BlockPos pBlockPos) {
		return FloralisHelper.maintain(pBlockPos.below(), pLevelReader, BlockTags.DIRT) || FloralisHelper.maintain(pBlockPos.below(), pLevelReader, Tags.Blocks.VILLAGER_FARMLANDS);
	}

	@Override
	public int getBonemealAgeIncrease(Level pLevel) {
		return 1;
	}

	@Override
	public int getMaxAge() {
		return 3;
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
	public VoxelShape getShape(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, CollisionContext pCollisionContext) {
		return FloralisVoxelShapes.FLOWER_CROP.get(pBlockState.getValue(FloralisBlockStateProperties.AGE));
	}
}
