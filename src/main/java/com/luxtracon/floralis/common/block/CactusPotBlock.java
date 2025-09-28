package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.common.helper.FloralisHelper;

import java.util.function.Supplier;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class CactusPotBlock extends FlowerPotBlock {
	public CactusPotBlock(Supplier<FlowerPotBlock> pEmpty, Supplier<? extends Block> pContent, Properties pProperties) {
		super(pEmpty, pContent, pProperties);
	}

	@Override
	public void entityInside(BlockState pBlockState, Level pLevel, BlockPos pBlockPos, Entity pEntity) {
		FloralisHelper.hurt(pLevel.damageSources().cactus(), pEntity, 1.0F);
	}

	@Override
	public PathType getBlockPathType(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos, @Nullable Mob pMob) {
		return PathType.DAMAGE_OTHER;
	}
}
