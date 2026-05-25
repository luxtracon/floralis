package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.helper.FloralisHelper;
import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.neoforged.neoforge.common.Tags;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class CactusCropBlock extends CropBlock {
	public CactusCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(FloralisBlockStateProperties.AGE, 0));
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FloralisBlockStateProperties.AGE);
	}

	@Override
	public void entityInside(BlockState pBlockState, Level pLevel, BlockPos pBlockPos, Entity pEntity, InsideBlockEffectApplier pInsideBlockEffectApplier, boolean pIntersects) {
		if (pEntity.level() instanceof ServerLevel serverLevel && pBlockState.getValue(FloralisBlockStateProperties.AGE) > 1) {
			pEntity.hurtServer(serverLevel, pLevel.damageSources().cactus(), 1.0F);
		}
	}

	@Override
	public boolean canSurvive(BlockState pBlockState, LevelReader pLevelReader, BlockPos pBlockPos) {
		return FloralisHelper.maintain(pBlockPos.below(), pLevelReader, BlockTags.SAND) || FloralisHelper.maintain(pBlockPos.below(), pLevelReader, Tags.Blocks.VILLAGER_FARMLANDS);
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
	public PathType getBlockPathType(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, @Nullable Mob pMob) {
		return pBlockState.getValue(FloralisBlockStateProperties.AGE) > 1 ? PathType.DAMAGING : PathType.WALKABLE;
	}

	@Override
	public VoxelShape getShape(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, CollisionContext pCollisionContext) {
		return FloralisVoxelShapes.CACTUS_CROP.get(pBlockState.getValue(FloralisBlockStateProperties.AGE));
	}
}
