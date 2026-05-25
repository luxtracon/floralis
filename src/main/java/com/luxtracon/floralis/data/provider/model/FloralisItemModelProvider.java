package com.luxtracon.floralis.data.provider.model;

import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisItemModelProvider {

	public static void register(ItemModelGenerators pItemModelGenerators) {
		FloralisItemModelProvider.generated(pItemModelGenerators);
		FloralisItemModelProvider.parent(pItemModelGenerators);
	}

	public static void generated(ItemModelGenerators pItemModelGenerators) {
		FloralisItemModelProvider.generated(FloralisItems.WHITE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.GRAY_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BLACK_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BROWN_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.RED_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.ORANGE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.YELLOW_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIME_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.GREEN_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.CYAN_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BLUE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PURPLE_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PINK_CACTUS_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.WHITE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.GRAY_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BLACK_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BROWN_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.RED_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.ORANGE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.YELLOW_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIME_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.GREEN_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.CYAN_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BLUE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PURPLE_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PINK_FLOWER_SEEDS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.WHITE_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIGHT_GRAY_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.GRAY_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BLACK_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BROWN_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.RED_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.ORANGE_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.YELLOW_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIME_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.GREEN_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.CYAN_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.LIGHT_BLUE_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.BLUE_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PURPLE_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.MAGENTA_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PINK_PETALS.get(), pItemModelGenerators);
		FloralisItemModelProvider.generated(FloralisItems.PLANT_FIBERS.get(), pItemModelGenerators);
	}

	public static void parent(ItemModelGenerators pItemModelGenerators) {
		FloralisItemModelProvider.parent(FloralisItems.WHITE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.GRAY_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BLACK_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BROWN_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.RED_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.ORANGE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.YELLOW_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIME_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.GREEN_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.CYAN_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BLUE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PURPLE_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.MAGENTA_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PINK_DYE_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PLANT_FIBERS_BLOCK.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.WHITE_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIGHT_GRAY_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.GRAY_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BLACK_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BROWN_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.RED_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.ORANGE_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.YELLOW_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIME_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.GREEN_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.CYAN_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIGHT_BLUE_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BLUE_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PURPLE_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.MAGENTA_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PINK_CACTUS.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.WHITE_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIGHT_GRAY_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.GRAY_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BLACK_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BROWN_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.RED_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.ORANGE_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.YELLOW_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIME_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.GREEN_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.CYAN_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.LIGHT_BLUE_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.BLUE_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PURPLE_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.MAGENTA_FLOWER.get(), pItemModelGenerators);
		FloralisItemModelProvider.parent(FloralisItems.PINK_FLOWER.get(), pItemModelGenerators);
	}

	public static void generated(Item pItem, ItemModelGenerators pItemModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.itemFile(FloralisConstants.MINECRAFT, "generated")).build()
			.create(FloralisModelProvider.itemFile(pItem), new TextureMapping().putForced(TextureSlot.LAYER0, new Material(FloralisModelProvider.itemFile(pItem))), pItemModelGenerators.modelOutput);
	}

	public static void parent(Item pItem, ItemModelGenerators pItemModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(Identifier.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "block" + "/" + FloralisModelProvider.itemName(pItem))).build()
			.create(FloralisModelProvider.itemFile(pItem), new TextureMapping(), pItemModelGenerators.modelOutput);
	}
}
