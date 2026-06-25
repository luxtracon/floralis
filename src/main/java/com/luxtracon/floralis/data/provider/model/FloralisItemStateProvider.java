package com.luxtracon.floralis.data.provider.model;

import com.luxtracon.floralis.common.registry.FloralisColors;
import com.luxtracon.floralis.common.registry.FloralisItems;

import java.util.List;
import java.util.Optional;

import net.minecraft.client.color.item.Constant;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.renderer.item.CuboidItemModelWrapper;
import net.minecraft.world.item.Item;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisItemStateProvider {

	public static void register(ItemModelGenerators pItemModelGenerators) {
		FloralisItemStateProvider.parent(pItemModelGenerators);
		FloralisItemStateProvider.tinted(pItemModelGenerators);
	}

	public static void parent(ItemModelGenerators pItemModelGenerators) {
		FloralisItemStateProvider.parent(FloralisItems.WHITE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GRAY_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLACK_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BROWN_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.RED_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.ORANGE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.YELLOW_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIME_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GREEN_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.CYAN_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLUE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PURPLE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.MAGENTA_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PINK_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.WHITE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GRAY_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLACK_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BROWN_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.RED_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.ORANGE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.YELLOW_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIME_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GREEN_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.CYAN_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLUE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PURPLE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PINK_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.WHITE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GRAY_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLACK_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BROWN_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.RED_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.ORANGE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.YELLOW_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIME_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GREEN_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.CYAN_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLUE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PURPLE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PINK_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.WHITE_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_GRAY_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GRAY_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLACK_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BROWN_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.RED_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.ORANGE_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.YELLOW_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIME_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.GREEN_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.CYAN_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.LIGHT_BLUE_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.BLUE_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PURPLE_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.MAGENTA_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PINK_PETALS.get(), pItemModelGenerators);
		FloralisItemStateProvider.parent(FloralisItems.PLANT_FIBERS.get(), pItemModelGenerators);
	}

	public static void tinted(ItemModelGenerators pItemModelGenerators) {
		FloralisItemStateProvider.tinted(FloralisItems.PLANT_FIBERS_BLOCK.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.WHITE_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.LIGHT_GRAY_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.GRAY_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.BLACK_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.BROWN_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.RED_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.ORANGE_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.YELLOW_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.LIME_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.GREEN_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.CYAN_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.LIGHT_BLUE_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.BLUE_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.PURPLE_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.MAGENTA_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.PINK_CACTUS.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.WHITE_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.LIGHT_GRAY_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.GRAY_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.BLACK_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.BROWN_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.RED_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.ORANGE_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.YELLOW_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.LIME_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.GREEN_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.CYAN_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.LIGHT_BLUE_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.BLUE_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.PURPLE_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.MAGENTA_FLOWER.get(), pItemModelGenerators);
		FloralisItemStateProvider.tinted(FloralisItems.PINK_FLOWER.get(), pItemModelGenerators);
	}

	public static void parent(Item pItem, ItemModelGenerators pItemModelGenerators) {
		pItemModelGenerators.itemModelOutput.accept(pItem, new CuboidItemModelWrapper.Unbaked(FloralisModelProvider.itemFile(pItem), Optional.empty(), List.of()));
	}

	public static void tinted(Item pItem, ItemModelGenerators pItemModelGenerators) {
		pItemModelGenerators.itemModelOutput.accept(pItem, new CuboidItemModelWrapper.Unbaked(FloralisModelProvider.itemFile(pItem), Optional.empty(), List.of(new Constant(FloralisColors.TINT))));
	}
}
