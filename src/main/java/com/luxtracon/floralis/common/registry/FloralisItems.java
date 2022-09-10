package com.luxtracon.floralis.common.registry;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.client.tabs.FloralisTabs;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unused")
@MethodsReturnNonnullByDefault

public class FloralisItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Floralis.MODID);

	public static final RegistryObject<Item> WHITE_DYE_BLOCK = register("white_dye_block", () -> new BlockItem(FloralisBlocks.WHITE_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> ORANGE_DYE_BLOCK = register("orange_dye_block", () -> new BlockItem(FloralisBlocks.ORANGE_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> MAGENTA_DYE_BLOCK = register("magenta_dye_block", () -> new BlockItem(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_BLUE_DYE_BLOCK = register("light_blue_dye_block", () -> new BlockItem(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> YELLOW_DYE_BLOCK = register("yellow_dye_block", () -> new BlockItem(FloralisBlocks.YELLOW_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> LIME_DYE_BLOCK = register("lime_dye_block", () -> new BlockItem(FloralisBlocks.LIME_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> PINK_DYE_BLOCK = register("pink_dye_block", () -> new BlockItem(FloralisBlocks.PINK_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> GRAY_DYE_BLOCK = register("gray_dye_block", () -> new BlockItem(FloralisBlocks.GRAY_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_GRAY_DYE_BLOCK = register("light_gray_dye_block", () -> new BlockItem(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> CYAN_DYE_BLOCK = register("cyan_dye_block", () -> new BlockItem(FloralisBlocks.CYAN_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> PURPLE_DYE_BLOCK = register("purple_dye_block", () -> new BlockItem(FloralisBlocks.PURPLE_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> BLUE_DYE_BLOCK = register("blue_dye_block", () -> new BlockItem(FloralisBlocks.BLUE_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> BROWN_DYE_BLOCK = register("brown_dye_block", () -> new BlockItem(FloralisBlocks.BROWN_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> GREEN_DYE_BLOCK = register("green_dye_block", () -> new BlockItem(FloralisBlocks.GREEN_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> RED_DYE_BLOCK = register("red_dye_block", () -> new BlockItem(FloralisBlocks.RED_DYE_BLOCK.get(), propertiesItem()));
	public static final RegistryObject<Item> BLACK_DYE_BLOCK = register("black_dye_block", () -> new BlockItem(FloralisBlocks.BLACK_DYE_BLOCK.get(), propertiesItem()));

	public static final RegistryObject<Item> PLANT_FIBERS_BLOCK = register("plant_fibers_block", () -> new BlockItem(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), propertiesItem()));

	public static final RegistryObject<Item> WHITE_FLOWER = register("white_flower", () -> new BlockItem(FloralisBlocks.WHITE_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> ORANGE_FLOWER = register("orange_flower", () -> new BlockItem(FloralisBlocks.ORANGE_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> MAGENTA_FLOWER = register("magenta_flower", () -> new BlockItem(FloralisBlocks.MAGENTA_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_BLUE_FLOWER = register("light_blue_flower", () -> new BlockItem(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> YELLOW_FLOWER = register("yellow_flower", () -> new BlockItem(FloralisBlocks.YELLOW_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> LIME_FLOWER = register("lime_flower", () -> new BlockItem(FloralisBlocks.LIME_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> PINK_FLOWER = register("pink_flower", () -> new BlockItem(FloralisBlocks.PINK_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> GRAY_FLOWER = register("gray_flower", () -> new BlockItem(FloralisBlocks.GRAY_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_GRAY_FLOWER = register("light_gray_flower", () -> new BlockItem(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> CYAN_FLOWER = register("cyan_flower", () -> new BlockItem(FloralisBlocks.CYAN_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> PURPLE_FLOWER = register("purple_flower", () -> new BlockItem(FloralisBlocks.PURPLE_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> BLUE_FLOWER = register("blue_flower", () -> new BlockItem(FloralisBlocks.BLUE_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> BROWN_FLOWER = register("brown_flower", () -> new BlockItem(FloralisBlocks.BROWN_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> GREEN_FLOWER = register("green_flower", () -> new BlockItem(FloralisBlocks.GREEN_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> RED_FLOWER = register("red_flower", () -> new BlockItem(FloralisBlocks.RED_FLOWER.get(), propertiesItem()));
	public static final RegistryObject<Item> BLACK_FLOWER = register("black_flower", () -> new BlockItem(FloralisBlocks.BLACK_FLOWER.get(), propertiesItem()));

	public static final RegistryObject<Item> WHITE_CACTUS = register("white_cactus", () -> new BlockItem(FloralisBlocks.WHITE_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> ORANGE_CACTUS = register("orange_cactus", () -> new BlockItem(FloralisBlocks.ORANGE_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> MAGENTA_CACTUS = register("magenta_cactus", () -> new BlockItem(FloralisBlocks.MAGENTA_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_BLUE_CACTUS = register("light_blue_cactus", () -> new BlockItem(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> YELLOW_CACTUS = register("yellow_cactus", () -> new BlockItem(FloralisBlocks.YELLOW_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> LIME_CACTUS = register("lime_cactus", () -> new BlockItem(FloralisBlocks.LIME_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> PINK_CACTUS = register("pink_cactus", () -> new BlockItem(FloralisBlocks.PINK_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> GRAY_CACTUS = register("gray_cactus", () -> new BlockItem(FloralisBlocks.GRAY_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_GRAY_CACTUS = register("light_gray_cactus", () -> new BlockItem(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> CYAN_CACTUS = register("cyan_cactus", () -> new BlockItem(FloralisBlocks.CYAN_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> PURPLE_CACTUS = register("purple_cactus", () -> new BlockItem(FloralisBlocks.PURPLE_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> BLUE_CACTUS = register("blue_cactus", () -> new BlockItem(FloralisBlocks.BLUE_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> BROWN_CACTUS = register("brown_cactus", () -> new BlockItem(FloralisBlocks.BROWN_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> GREEN_CACTUS = register("green_cactus", () -> new BlockItem(FloralisBlocks.GREEN_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> RED_CACTUS = register("red_cactus", () -> new BlockItem(FloralisBlocks.RED_CACTUS.get(), propertiesItem()));
	public static final RegistryObject<Item> BLACK_CACTUS = register("black_cactus", () -> new BlockItem(FloralisBlocks.BLACK_CACTUS.get(), propertiesItem()));

	public static final RegistryObject<Item> WHITE_FLOWER_SEEDS = register("white_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.WHITE_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> ORANGE_FLOWER_SEEDS = register("orange_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.ORANGE_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> MAGENTA_FLOWER_SEEDS = register("magenta_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_BLUE_FLOWER_SEEDS = register("light_blue_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> YELLOW_FLOWER_SEEDS = register("yellow_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.YELLOW_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> LIME_FLOWER_SEEDS = register("lime_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIME_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> PINK_FLOWER_SEEDS = register("pink_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PINK_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> GRAY_FLOWER_SEEDS = register("gray_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GRAY_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_GRAY_FLOWER_SEEDS = register("light_gray_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> CYAN_FLOWER_SEEDS = register("cyan_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.CYAN_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> PURPLE_FLOWER_SEEDS = register("purple_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PURPLE_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> BLUE_FLOWER_SEEDS = register("blue_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLUE_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> BROWN_FLOWER_SEEDS = register("brown_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BROWN_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> GREEN_FLOWER_SEEDS = register("green_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GREEN_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> RED_FLOWER_SEEDS = register("red_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.RED_FLOWER_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> BLACK_FLOWER_SEEDS = register("black_flower_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLACK_FLOWER_CROP.get(), propertiesItem()));

	public static final RegistryObject<Item> WHITE_CACTUS_SEEDS = register("white_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.WHITE_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> ORANGE_CACTUS_SEEDS = register("orange_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.ORANGE_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> MAGENTA_CACTUS_SEEDS = register("magenta_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_BLUE_CACTUS_SEEDS = register("light_blue_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> YELLOW_CACTUS_SEEDS = register("yellow_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.YELLOW_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> LIME_CACTUS_SEEDS = register("lime_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIME_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> PINK_CACTUS_SEEDS = register("pink_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PINK_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> GRAY_CACTUS_SEEDS = register("gray_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GRAY_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> LIGHT_GRAY_CACTUS_SEEDS = register("light_gray_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> CYAN_CACTUS_SEEDS = register("cyan_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.CYAN_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> PURPLE_CACTUS_SEEDS = register("purple_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.PURPLE_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> BLUE_CACTUS_SEEDS = register("blue_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLUE_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> BROWN_CACTUS_SEEDS = register("brown_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BROWN_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> GREEN_CACTUS_SEEDS = register("green_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.GREEN_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> RED_CACTUS_SEEDS = register("red_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.RED_CACTUS_CROP.get(), propertiesItem()));
	public static final RegistryObject<Item> BLACK_CACTUS_SEEDS = register("black_cactus_seeds", () -> new ItemNameBlockItem(FloralisBlocks.BLACK_CACTUS_CROP.get(), propertiesItem()));

	public static final RegistryObject<Item> WHITE_PETALS = register("white_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> ORANGE_PETALS = register("orange_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> MAGENTA_PETALS = register("magenta_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> LIGHT_BLUE_PETALS = register("light_blue_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> YELLOW_PETALS = register("yellow_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> LIME_PETALS = register("lime_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> PINK_PETALS = register("pink_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> GRAY_PETALS = register("gray_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> LIGHT_GRAY_PETALS = register("light_gray_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> CYAN_PETALS = register("cyan_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> PURPLE_PETALS = register("purple_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> BLUE_PETALS = register("blue_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> BROWN_PETALS = register("brown_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> GREEN_PETALS = register("green_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> RED_PETALS = register("red_petals", () -> new Item(propertiesItem()));
	public static final RegistryObject<Item> BLACK_PETALS = register("black_petals", () -> new Item(propertiesItem()));

	public static final RegistryObject<Item> PLANT_FIBERS = register("plant_fibers", () -> new BoneMealItem(propertiesItem()));

	public static Item.Properties propertiesItem() {
		return new Item.Properties().tab(FloralisTabs.floralisTab);
	}

	public static <T extends Item> RegistryObject<T> register(final String pString, final Supplier<T> pSupplier) {
		return ITEMS.register(pString, pSupplier);
	}
}
