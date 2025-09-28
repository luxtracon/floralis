package com.luxtracon.floralis.common.registry;

import java.util.function.Supplier;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisPottables {

	public static void setup() {
		FloralisPottables.set(FloralisBlocks.WHITE_FLOWER.get(), FloralisBlocks.POTTED_WHITE_FLOWER);
		FloralisPottables.set(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER);
		FloralisPottables.set(FloralisBlocks.GRAY_FLOWER.get(), FloralisBlocks.POTTED_GRAY_FLOWER);
		FloralisPottables.set(FloralisBlocks.BLACK_FLOWER.get(), FloralisBlocks.POTTED_BLACK_FLOWER);
		FloralisPottables.set(FloralisBlocks.BROWN_FLOWER.get(), FloralisBlocks.POTTED_BROWN_FLOWER);
		FloralisPottables.set(FloralisBlocks.RED_FLOWER.get(), FloralisBlocks.POTTED_RED_FLOWER);
		FloralisPottables.set(FloralisBlocks.ORANGE_FLOWER.get(), FloralisBlocks.POTTED_ORANGE_FLOWER);
		FloralisPottables.set(FloralisBlocks.YELLOW_FLOWER.get(), FloralisBlocks.POTTED_YELLOW_FLOWER);
		FloralisPottables.set(FloralisBlocks.LIME_FLOWER.get(), FloralisBlocks.POTTED_LIME_FLOWER);
		FloralisPottables.set(FloralisBlocks.GREEN_FLOWER.get(), FloralisBlocks.POTTED_GREEN_FLOWER);
		FloralisPottables.set(FloralisBlocks.CYAN_FLOWER.get(), FloralisBlocks.POTTED_CYAN_FLOWER);
		FloralisPottables.set(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER);
		FloralisPottables.set(FloralisBlocks.BLUE_FLOWER.get(), FloralisBlocks.POTTED_BLUE_FLOWER);
		FloralisPottables.set(FloralisBlocks.PURPLE_FLOWER.get(), FloralisBlocks.POTTED_PURPLE_FLOWER);
		FloralisPottables.set(FloralisBlocks.MAGENTA_FLOWER.get(), FloralisBlocks.POTTED_MAGENTA_FLOWER);
		FloralisPottables.set(FloralisBlocks.PINK_FLOWER.get(), FloralisBlocks.POTTED_PINK_FLOWER);
		FloralisPottables.set(FloralisBlocks.WHITE_CACTUS.get(), FloralisBlocks.POTTED_WHITE_CACTUS);
		FloralisPottables.set(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS);
		FloralisPottables.set(FloralisBlocks.GRAY_CACTUS.get(), FloralisBlocks.POTTED_GRAY_CACTUS);
		FloralisPottables.set(FloralisBlocks.BLACK_CACTUS.get(), FloralisBlocks.POTTED_BLACK_CACTUS);
		FloralisPottables.set(FloralisBlocks.BROWN_CACTUS.get(), FloralisBlocks.POTTED_BROWN_CACTUS);
		FloralisPottables.set(FloralisBlocks.RED_CACTUS.get(), FloralisBlocks.POTTED_RED_CACTUS);
		FloralisPottables.set(FloralisBlocks.ORANGE_CACTUS.get(), FloralisBlocks.POTTED_ORANGE_CACTUS);
		FloralisPottables.set(FloralisBlocks.YELLOW_CACTUS.get(), FloralisBlocks.POTTED_YELLOW_CACTUS);
		FloralisPottables.set(FloralisBlocks.LIME_CACTUS.get(), FloralisBlocks.POTTED_LIME_CACTUS);
		FloralisPottables.set(FloralisBlocks.GREEN_CACTUS.get(), FloralisBlocks.POTTED_GREEN_CACTUS);
		FloralisPottables.set(FloralisBlocks.CYAN_CACTUS.get(), FloralisBlocks.POTTED_CYAN_CACTUS);
		FloralisPottables.set(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS);
		FloralisPottables.set(FloralisBlocks.BLUE_CACTUS.get(), FloralisBlocks.POTTED_BLUE_CACTUS);
		FloralisPottables.set(FloralisBlocks.PURPLE_CACTUS.get(), FloralisBlocks.POTTED_PURPLE_CACTUS);
		FloralisPottables.set(FloralisBlocks.MAGENTA_CACTUS.get(), FloralisBlocks.POTTED_MAGENTA_CACTUS);
		FloralisPottables.set(FloralisBlocks.PINK_CACTUS.get(), FloralisBlocks.POTTED_PINK_CACTUS);
	}

	public static void set(Block pBlock, Supplier<? extends Block> pSupplier) {
		if (Blocks.FLOWER_POT instanceof FlowerPotBlock flowerPotBlock) {
			flowerPotBlock.addPlant(BuiltInRegistries.BLOCK.getKey(pBlock), pSupplier);
		}
	}
}
