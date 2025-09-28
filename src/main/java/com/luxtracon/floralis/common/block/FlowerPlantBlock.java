package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.registry.FloralisVoxelShapes;

import com.mojang.serialization.MapCodec;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FlowerPlantBlock extends BushBlock {
	public static final MapCodec<FlowerPlantBlock> CODEC = Block.simpleCodec(FlowerPlantBlock::new);

	public FlowerPlantBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public boolean mayPlaceOn(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos) {
		return pBlockState.is(BlockTags.DIRT);
	}

	@Override
	public VoxelShape getShape(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, CollisionContext pCollisionContext) {
		var vec3 = pBlockState.getOffset(pBlockPos);
		return FloralisVoxelShapes.FLOWER_PLANT.move(vec3.x, vec3.y, vec3.z);
	}

	@Override
	public MapCodec<FlowerPlantBlock> codec() {
		return FlowerPlantBlock.CODEC;
	}
}
