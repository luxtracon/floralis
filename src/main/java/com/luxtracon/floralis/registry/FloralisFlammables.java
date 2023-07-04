package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.mixin.FireBlockMixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class FloralisFlammables {
	public static void flammableBlock(Block pBlock, int pEncouragement, int pFlammability) {
		((FireBlockMixin) Blocks.FIRE).mixinFlammable(pBlock, pEncouragement, pFlammability);
	}

	public static void setup() {
		FloralisFlammables.flammableBlock(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), 60, 20);

		FloralisFlammables.flammableBlock(FloralisBlocks.WHITE_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.GRAY_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.BLACK_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.BROWN_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.RED_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.ORANGE_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.YELLOW_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.LIME_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.GREEN_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.CYAN_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.BLUE_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.MAGENTA_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.PURPLE_FLOWER.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.PINK_FLOWER.get(), 60, 100);

		FloralisFlammables.flammableBlock(FloralisBlocks.WHITE_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.GRAY_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.BLACK_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.BROWN_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.RED_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.ORANGE_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.YELLOW_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.LIME_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.GREEN_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.CYAN_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.BLUE_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.MAGENTA_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.PURPLE_CACTUS.get(), 60, 100);
		FloralisFlammables.flammableBlock(FloralisBlocks.PINK_CACTUS.get(), 60, 100);
	}
}
