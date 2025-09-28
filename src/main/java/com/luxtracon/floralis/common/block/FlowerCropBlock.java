package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FlowerCropBlock extends CropBlock {
	public FlowerCropBlock(Properties pProperties) {
		super(pProperties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(FloralisBlockStateProperties.AGE, 0));
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
