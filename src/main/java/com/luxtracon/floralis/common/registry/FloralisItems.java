package com.luxtracon.floralis.common.registry;

import com.luxtracon.floralis.common.item.PlantFibersItem;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import java.util.function.Function;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, FloralisConstants.FLORALIS);

	public static final DeferredHolder<Item, Item> WHITE_DYE_BLOCK = FloralisItems.register("white_dye_block", properties -> new BlockItem(FloralisBlocks.WHITE_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIGHT_GRAY_DYE_BLOCK = FloralisItems.register("light_gray_dye_block", properties -> new BlockItem(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> GRAY_DYE_BLOCK = FloralisItems.register("gray_dye_block", properties -> new BlockItem(FloralisBlocks.GRAY_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BLACK_DYE_BLOCK = FloralisItems.register("black_dye_block", properties -> new BlockItem(FloralisBlocks.BLACK_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BROWN_DYE_BLOCK = FloralisItems.register("brown_dye_block", properties -> new BlockItem(FloralisBlocks.BROWN_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> RED_DYE_BLOCK = FloralisItems.register("red_dye_block", properties -> new BlockItem(FloralisBlocks.RED_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> ORANGE_DYE_BLOCK = FloralisItems.register("orange_dye_block", properties -> new BlockItem(FloralisBlocks.ORANGE_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> YELLOW_DYE_BLOCK = FloralisItems.register("yellow_dye_block", properties -> new BlockItem(FloralisBlocks.YELLOW_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIME_DYE_BLOCK = FloralisItems.register("lime_dye_block", properties -> new BlockItem(FloralisBlocks.LIME_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> GREEN_DYE_BLOCK = FloralisItems.register("green_dye_block", properties -> new BlockItem(FloralisBlocks.GREEN_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> CYAN_DYE_BLOCK = FloralisItems.register("cyan_dye_block", properties -> new BlockItem(FloralisBlocks.CYAN_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_DYE_BLOCK = FloralisItems.register("light_blue_dye_block", properties -> new BlockItem(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BLUE_DYE_BLOCK = FloralisItems.register("blue_dye_block", properties -> new BlockItem(FloralisBlocks.BLUE_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> PURPLE_DYE_BLOCK = FloralisItems.register("purple_dye_block", properties -> new BlockItem(FloralisBlocks.PURPLE_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> MAGENTA_DYE_BLOCK = FloralisItems.register("magenta_dye_block", properties -> new BlockItem(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> PINK_DYE_BLOCK = FloralisItems.register("pink_dye_block", properties -> new BlockItem(FloralisBlocks.PINK_DYE_BLOCK.get(), properties), FloralisItems.propertiesBlock());

	public static final DeferredHolder<Item, Item> PLANT_FIBERS_BLOCK = FloralisItems.register("plant_fibers_block", properties -> new BlockItem(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), properties), FloralisItems.propertiesBlock());

	public static final DeferredHolder<Item, Item> WHITE_CACTUS = FloralisItems.register("white_cactus", properties -> new BlockItem(FloralisBlocks.WHITE_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIGHT_GRAY_CACTUS = FloralisItems.register("light_gray_cactus", properties -> new BlockItem(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> GRAY_CACTUS = FloralisItems.register("gray_cactus", properties -> new BlockItem(FloralisBlocks.GRAY_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BLACK_CACTUS = FloralisItems.register("black_cactus", properties -> new BlockItem(FloralisBlocks.BLACK_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BROWN_CACTUS = FloralisItems.register("brown_cactus", properties -> new BlockItem(FloralisBlocks.BROWN_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> RED_CACTUS = FloralisItems.register("red_cactus", properties -> new BlockItem(FloralisBlocks.RED_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> ORANGE_CACTUS = FloralisItems.register("orange_cactus", properties -> new BlockItem(FloralisBlocks.ORANGE_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> YELLOW_CACTUS = FloralisItems.register("yellow_cactus", properties -> new BlockItem(FloralisBlocks.YELLOW_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIME_CACTUS = FloralisItems.register("lime_cactus", properties -> new BlockItem(FloralisBlocks.LIME_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> GREEN_CACTUS = FloralisItems.register("green_cactus", properties -> new BlockItem(FloralisBlocks.GREEN_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> CYAN_CACTUS = FloralisItems.register("cyan_cactus", properties -> new BlockItem(FloralisBlocks.CYAN_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_CACTUS = FloralisItems.register("light_blue_cactus", properties -> new BlockItem(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BLUE_CACTUS = FloralisItems.register("blue_cactus", properties -> new BlockItem(FloralisBlocks.BLUE_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> PURPLE_CACTUS = FloralisItems.register("purple_cactus", properties -> new BlockItem(FloralisBlocks.PURPLE_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> MAGENTA_CACTUS = FloralisItems.register("magenta_cactus", properties -> new BlockItem(FloralisBlocks.MAGENTA_CACTUS.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> PINK_CACTUS = FloralisItems.register("pink_cactus", properties -> new BlockItem(FloralisBlocks.PINK_CACTUS.get(), properties), FloralisItems.propertiesBlock());

	public static final DeferredHolder<Item, Item> WHITE_FLOWER = FloralisItems.register("white_flower", properties -> new BlockItem(FloralisBlocks.WHITE_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIGHT_GRAY_FLOWER = FloralisItems.register("light_gray_flower", properties -> new BlockItem(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> GRAY_FLOWER = FloralisItems.register("gray_flower", properties -> new BlockItem(FloralisBlocks.GRAY_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BLACK_FLOWER = FloralisItems.register("black_flower", properties -> new BlockItem(FloralisBlocks.BLACK_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BROWN_FLOWER = FloralisItems.register("brown_flower", properties -> new BlockItem(FloralisBlocks.BROWN_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> RED_FLOWER = FloralisItems.register("red_flower", properties -> new BlockItem(FloralisBlocks.RED_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> ORANGE_FLOWER = FloralisItems.register("orange_flower", properties -> new BlockItem(FloralisBlocks.ORANGE_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> YELLOW_FLOWER = FloralisItems.register("yellow_flower", properties -> new BlockItem(FloralisBlocks.YELLOW_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIME_FLOWER = FloralisItems.register("lime_flower", properties -> new BlockItem(FloralisBlocks.LIME_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> GREEN_FLOWER = FloralisItems.register("green_flower", properties -> new BlockItem(FloralisBlocks.GREEN_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> CYAN_FLOWER = FloralisItems.register("cyan_flower", properties -> new BlockItem(FloralisBlocks.CYAN_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_FLOWER = FloralisItems.register("light_blue_flower", properties -> new BlockItem(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> BLUE_FLOWER = FloralisItems.register("blue_flower", properties -> new BlockItem(FloralisBlocks.BLUE_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> PURPLE_FLOWER = FloralisItems.register("purple_flower", properties -> new BlockItem(FloralisBlocks.PURPLE_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> MAGENTA_FLOWER = FloralisItems.register("magenta_flower", properties -> new BlockItem(FloralisBlocks.MAGENTA_FLOWER.get(), properties), FloralisItems.propertiesBlock());
	public static final DeferredHolder<Item, Item> PINK_FLOWER = FloralisItems.register("pink_flower", properties -> new BlockItem(FloralisBlocks.PINK_FLOWER.get(), properties), FloralisItems.propertiesBlock());

	public static final DeferredHolder<Item, Item> WHITE_CACTUS_SEEDS = FloralisItems.register("white_cactus_seeds", properties -> new BlockItem(FloralisBlocks.WHITE_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIGHT_GRAY_CACTUS_SEEDS = FloralisItems.register("light_gray_cactus_seeds", properties -> new BlockItem(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> GRAY_CACTUS_SEEDS = FloralisItems.register("gray_cactus_seeds", properties -> new BlockItem(FloralisBlocks.GRAY_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BLACK_CACTUS_SEEDS = FloralisItems.register("black_cactus_seeds", properties -> new BlockItem(FloralisBlocks.BLACK_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BROWN_CACTUS_SEEDS = FloralisItems.register("brown_cactus_seeds", properties -> new BlockItem(FloralisBlocks.BROWN_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> RED_CACTUS_SEEDS = FloralisItems.register("red_cactus_seeds", properties -> new BlockItem(FloralisBlocks.RED_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> ORANGE_CACTUS_SEEDS = FloralisItems.register("orange_cactus_seeds", properties -> new BlockItem(FloralisBlocks.ORANGE_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> YELLOW_CACTUS_SEEDS = FloralisItems.register("yellow_cactus_seeds", properties -> new BlockItem(FloralisBlocks.YELLOW_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIME_CACTUS_SEEDS = FloralisItems.register("lime_cactus_seeds", properties -> new BlockItem(FloralisBlocks.LIME_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> GREEN_CACTUS_SEEDS = FloralisItems.register("green_cactus_seeds", properties -> new BlockItem(FloralisBlocks.GREEN_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> CYAN_CACTUS_SEEDS = FloralisItems.register("cyan_cactus_seeds", properties -> new BlockItem(FloralisBlocks.CYAN_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_CACTUS_SEEDS = FloralisItems.register("light_blue_cactus_seeds", properties -> new BlockItem(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BLUE_CACTUS_SEEDS = FloralisItems.register("blue_cactus_seeds", properties -> new BlockItem(FloralisBlocks.BLUE_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> PURPLE_CACTUS_SEEDS = FloralisItems.register("purple_cactus_seeds", properties -> new BlockItem(FloralisBlocks.PURPLE_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> MAGENTA_CACTUS_SEEDS = FloralisItems.register("magenta_cactus_seeds", properties -> new BlockItem(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> PINK_CACTUS_SEEDS = FloralisItems.register("pink_cactus_seeds", properties -> new BlockItem(FloralisBlocks.PINK_CACTUS_CROP.get(), properties), FloralisItems.propertiesItem());

	public static final DeferredHolder<Item, Item> WHITE_FLOWER_SEEDS = FloralisItems.register("white_flower_seeds", properties -> new BlockItem(FloralisBlocks.WHITE_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIGHT_GRAY_FLOWER_SEEDS = FloralisItems.register("light_gray_flower_seeds", properties -> new BlockItem(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> GRAY_FLOWER_SEEDS = FloralisItems.register("gray_flower_seeds", properties -> new BlockItem(FloralisBlocks.GRAY_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BLACK_FLOWER_SEEDS = FloralisItems.register("black_flower_seeds", properties -> new BlockItem(FloralisBlocks.BLACK_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BROWN_FLOWER_SEEDS = FloralisItems.register("brown_flower_seeds", properties -> new BlockItem(FloralisBlocks.BROWN_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> RED_FLOWER_SEEDS = FloralisItems.register("red_flower_seeds", properties -> new BlockItem(FloralisBlocks.RED_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> ORANGE_FLOWER_SEEDS = FloralisItems.register("orange_flower_seeds", properties -> new BlockItem(FloralisBlocks.ORANGE_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> YELLOW_FLOWER_SEEDS = FloralisItems.register("yellow_flower_seeds", properties -> new BlockItem(FloralisBlocks.YELLOW_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIME_FLOWER_SEEDS = FloralisItems.register("lime_flower_seeds", properties -> new BlockItem(FloralisBlocks.LIME_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> GREEN_FLOWER_SEEDS = FloralisItems.register("green_flower_seeds", properties -> new BlockItem(FloralisBlocks.GREEN_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> CYAN_FLOWER_SEEDS = FloralisItems.register("cyan_flower_seeds", properties -> new BlockItem(FloralisBlocks.CYAN_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_FLOWER_SEEDS = FloralisItems.register("light_blue_flower_seeds", properties -> new BlockItem(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BLUE_FLOWER_SEEDS = FloralisItems.register("blue_flower_seeds", properties -> new BlockItem(FloralisBlocks.BLUE_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> PURPLE_FLOWER_SEEDS = FloralisItems.register("purple_flower_seeds", properties -> new BlockItem(FloralisBlocks.PURPLE_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> MAGENTA_FLOWER_SEEDS = FloralisItems.register("magenta_flower_seeds", properties -> new BlockItem(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> PINK_FLOWER_SEEDS = FloralisItems.register("pink_flower_seeds", properties -> new BlockItem(FloralisBlocks.PINK_FLOWER_CROP.get(), properties), FloralisItems.propertiesItem());

	public static final DeferredHolder<Item, Item> WHITE_PETALS = FloralisItems.register("white_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIGHT_GRAY_PETALS = FloralisItems.register("light_gray_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> GRAY_PETALS = FloralisItems.register("gray_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BLACK_PETALS = FloralisItems.register("black_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BROWN_PETALS = FloralisItems.register("brown_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> RED_PETALS = FloralisItems.register("red_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> ORANGE_PETALS = FloralisItems.register("orange_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> YELLOW_PETALS = FloralisItems.register("yellow_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIME_PETALS = FloralisItems.register("lime_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> GREEN_PETALS = FloralisItems.register("green_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> CYAN_PETALS = FloralisItems.register("cyan_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_PETALS = FloralisItems.register("light_blue_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> BLUE_PETALS = FloralisItems.register("blue_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> PURPLE_PETALS = FloralisItems.register("purple_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> MAGENTA_PETALS = FloralisItems.register("magenta_petals", Item::new, FloralisItems.propertiesItem());
	public static final DeferredHolder<Item, Item> PINK_PETALS = FloralisItems.register("pink_petals", Item::new, FloralisItems.propertiesItem());

	public static final DeferredHolder<Item, Item> PLANT_FIBERS = FloralisItems.register("plant_fibers", PlantFibersItem::new, FloralisItems.propertiesItem());

	public static Item.Properties propertiesBlock() {
		return new Item.Properties().useBlockDescriptionPrefix();
	}

	public static Item.Properties propertiesItem() {
		return new Item.Properties().useItemDescriptionPrefix();
	}

	public static <T extends Item> DeferredHolder<Item, T> register(String pName, Function<Item.Properties, T> pFunction, Item.Properties pProperties) {
		return FloralisItems.ITEMS.register(pName, () -> pFunction.apply(pProperties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FloralisConstants.FLORALIS, pName)))));
	}
}
