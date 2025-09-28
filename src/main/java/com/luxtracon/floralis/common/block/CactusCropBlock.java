package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.helper.FloralisHelper;
import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class CactusCropBlock extends CropBlock {
	public CactusCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(FloralisBlockStateProperties.AGE, 0));
	}

	@Override
	public boolean mayPlaceOn(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos) {
		return pBlockState.is(BlockTags.SAND);
	}

	@Override
	public int getBonemealAgeIncrease(Level pLevel) {
		return Mth.nextInt(pLevel.getRandom(), 1, 3);
	}

	@Override
	public int getMaxAge() {
		return 5;
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(FloralisBlockStateProperties.AGE);
	}

	@Override
	public void entityInside(BlockState pBlockState, Level pLevel, BlockPos pBlockPos, Entity pEntity) {
		super.entityInside(pBlockState, pLevel, pBlockPos, pEntity);
		FloralisHelper.hurt(pLevel.damageSources().cactus(), pEntity, 1.0F);
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
		return pBlockState.getValue(FloralisBlockStateProperties.AGE) >= 3 ? PathType.DAMAGE_OTHER : PathType.WALKABLE;
	}

	@Override
	public VoxelShape getShape(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, CollisionContext pCollisionContext) {
		return FloralisVoxelShapes.CACTUS_CROP.get(pBlockState.getValue(FloralisBlockStateProperties.AGE));
	}
}
