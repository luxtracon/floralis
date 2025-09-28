package com.luxtracon.floralis.common.block;

import com.mojang.serialization.MapCodec;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class DyeBlock extends FallingBlock {
	public static final MapCodec<DyeBlock> CODEC = Block.simpleCodec(DyeBlock::new);

	public DyeBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public MapCodec<DyeBlock> codec() {
		return DyeBlock.CODEC;
	}
}
