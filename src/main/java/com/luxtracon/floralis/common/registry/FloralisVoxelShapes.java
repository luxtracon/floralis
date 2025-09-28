package com.luxtracon.floralis.common.registry;

import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisVoxelShapes {
	public static final List<VoxelShape> CACTUS_CROP = List.of(
		Block.box(7.0D, 0.0D, 7.0D, 9.0D, 2.0D, 9.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D),
		Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D),
		Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D),
		Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D),
		Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D)
	);

	public static final List<VoxelShape> FLOWER_CROP = List.of(
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 1.0D, 10.75D),
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 3.0D, 10.75D),
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 5.0D, 10.75D),
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 7.0D, 10.75D),
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 9.0D, 10.75D),
		Block.box(5.25D, -1.0D, 5.25D, 10.75D, 11.0D, 10.75D)
	);

	public static final VoxelShape CACTUS_PLANT = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);

	public static final VoxelShape FLOWER_PLANT = Block.box(5.25D, 0.0D, 5.25D, 10.75D, 12.0D, 10.75D);
}
