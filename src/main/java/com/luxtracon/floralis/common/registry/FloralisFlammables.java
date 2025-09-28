package com.luxtracon.floralis.common.registry;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisFlammables {

	public static void setup() {
		FloralisFlammables.set(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), 60, 20);
		FloralisFlammables.set(FloralisBlocks.WHITE_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.GRAY_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.BLACK_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.BROWN_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.RED_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.ORANGE_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.YELLOW_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.LIME_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.GREEN_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.CYAN_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.BLUE_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.PURPLE_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.MAGENTA_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.PINK_FLOWER.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.WHITE_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.GRAY_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.BLACK_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.BROWN_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.RED_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.ORANGE_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.YELLOW_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.LIME_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.GREEN_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.CYAN_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.BLUE_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.PURPLE_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.MAGENTA_CACTUS.get(), 60, 100);
		FloralisFlammables.set(FloralisBlocks.PINK_CACTUS.get(), 60, 100);
	}

	public static void set(Block pBlock, int pEncouragement, int pFlammability) {
		if (Blocks.FIRE instanceof FireBlock fireBlock) {
			fireBlock.setFlammable(pBlock, pEncouragement, pFlammability);
		}
	}
}
