package com.luxtracon.floralis.common.registry;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisVoxelShapes {
	public static final VoxelShape CACTUS_BUSH = Block.box(3.5D, 0.0D, 3.5D, 12.5D, 9.0D, 12.5D);
	public static final VoxelShape FLOWER_BUSH = Block.box(6.5D, 0.0D, 6.5D, 9.5D, 9.0D, 9.5D);

	public static final List<VoxelShape> CACTUS_CROP = List.of(Block.box(6.5D, 0.0D, 6.5D, 9.5D, 3.0D, 9.5D), Block.box(5.5D, 0.0D, 5.5D, 10.5D, 5.0D, 10.5D), Block.box(4.5D, 0.0D, 4.5D, 11.5D, 7.0D, 11.5D), Block.box(3.5D, 0.0D, 3.5D, 12.5D, 9.0D, 12.5D));
	public static final List<VoxelShape> FLOWER_CROP = List.of(Block.box(6.5D, 0.0D, 6.5D, 9.5D, 3.0D, 9.5D), Block.box(6.5D, 0.0D, 6.5D, 9.5D, 5.0D, 9.5D), Block.box(6.5D, 0.0D, 6.5D, 9.5D, 7.0D, 9.5D), Block.box(6.5D, 0.0D, 6.5D, 9.5D, 9.0D, 9.5D));
}
