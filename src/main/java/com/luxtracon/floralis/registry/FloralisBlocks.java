package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.constant.FloralisConstant;
import com.luxtracon.floralis.block.*;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
@MethodsReturnNonnullByDefault

public class FloralisBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FloralisConstant.MODID);

	public static final RegistryObject<Block> WHITE_DYE_BLOCK = BLOCKS.register("white_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.SNOW)));
	public static final RegistryObject<Block> LIGHT_GRAY_DYE_BLOCK = BLOCKS.register("light_gray_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_LIGHT_GRAY)));
	public static final RegistryObject<Block> GRAY_DYE_BLOCK = BLOCKS.register("gray_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_GRAY)));
	public static final RegistryObject<Block> BLACK_DYE_BLOCK = BLOCKS.register("black_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_BLACK)));
	public static final RegistryObject<Block> BROWN_DYE_BLOCK = BLOCKS.register("brown_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_BROWN)));
	public static final RegistryObject<Block> RED_DYE_BLOCK = BLOCKS.register("red_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_RED)));
	public static final RegistryObject<Block> ORANGE_DYE_BLOCK = BLOCKS.register("orange_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_ORANGE)));
	public static final RegistryObject<Block> YELLOW_DYE_BLOCK = BLOCKS.register("yellow_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_YELLOW)));
	public static final RegistryObject<Block> LIME_DYE_BLOCK = BLOCKS.register("lime_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_LIGHT_GREEN)));
	public static final RegistryObject<Block> GREEN_DYE_BLOCK = BLOCKS.register("green_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_GREEN)));
	public static final RegistryObject<Block> CYAN_DYE_BLOCK = BLOCKS.register("cyan_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_CYAN)));
	public static final RegistryObject<Block> LIGHT_BLUE_DYE_BLOCK = BLOCKS.register("light_blue_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_LIGHT_BLUE)));
	public static final RegistryObject<Block> BLUE_DYE_BLOCK = BLOCKS.register("blue_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_BLUE)));
	public static final RegistryObject<Block> PURPLE_DYE_BLOCK = BLOCKS.register("purple_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_PURPLE)));
	public static final RegistryObject<Block> MAGENTA_DYE_BLOCK = BLOCKS.register("magenta_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_MAGENTA)));
	public static final RegistryObject<Block> PINK_DYE_BLOCK = BLOCKS.register("pink_dye_block", () -> new FallingBlock(propertiesDyeBlock(MaterialColor.COLOR_PINK)));

	public static final RegistryObject<Block> PLANT_FIBERS_BLOCK = BLOCKS.register("plant_fibers_block", () -> new PlantFibersBlock(propertiesFibersBlock()));

	public static final RegistryObject<Block> WHITE_FLOWER = BLOCKS.register("white_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> LIGHT_GRAY_FLOWER = BLOCKS.register("light_gray_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> GRAY_FLOWER = BLOCKS.register("gray_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> BLACK_FLOWER = BLOCKS.register("black_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> BROWN_FLOWER = BLOCKS.register("brown_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> RED_FLOWER = BLOCKS.register("red_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> ORANGE_FLOWER = BLOCKS.register("orange_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> YELLOW_FLOWER = BLOCKS.register("yellow_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> LIME_FLOWER = BLOCKS.register("lime_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> GREEN_FLOWER = BLOCKS.register("green_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> CYAN_FLOWER = BLOCKS.register("cyan_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> LIGHT_BLUE_FLOWER = BLOCKS.register("light_blue_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> BLUE_FLOWER = BLOCKS.register("blue_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> PURPLE_FLOWER = BLOCKS.register("purple_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> MAGENTA_FLOWER = BLOCKS.register("magenta_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> PINK_FLOWER = BLOCKS.register("pink_flower", () -> new FlowerPlantBlock(propertiesFlower()));

	public static final RegistryObject<Block> WHITE_CACTUS = BLOCKS.register("white_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> LIGHT_GRAY_CACTUS = BLOCKS.register("light_gray_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> GRAY_CACTUS = BLOCKS.register("gray_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> BLACK_CACTUS = BLOCKS.register("black_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> BROWN_CACTUS = BLOCKS.register("brown_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> RED_CACTUS = BLOCKS.register("red_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> ORANGE_CACTUS = BLOCKS.register("orange_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> YELLOW_CACTUS = BLOCKS.register("yellow_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> LIME_CACTUS = BLOCKS.register("lime_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> GREEN_CACTUS = BLOCKS.register("green_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> CYAN_CACTUS = BLOCKS.register("cyan_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> LIGHT_BLUE_CACTUS = BLOCKS.register("light_blue_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> BLUE_CACTUS = BLOCKS.register("blue_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> PURPLE_CACTUS = BLOCKS.register("purple_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> MAGENTA_CACTUS = BLOCKS.register("magenta_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> PINK_CACTUS = BLOCKS.register("pink_cactus", () -> new CactusPlantBlock(propertiesCactus()));

	public static final RegistryObject<Block> POTTED_WHITE_FLOWER = BLOCKS.register("potted_white_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_LIGHT_GRAY_FLOWER = BLOCKS.register("potted_light_gray_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_GRAY_FLOWER = BLOCKS.register("potted_gray_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_BLACK_FLOWER = BLOCKS.register("potted_black_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_BROWN_FLOWER = BLOCKS.register("potted_brown_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_RED_FLOWER = BLOCKS.register("potted_red_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_ORANGE_FLOWER = BLOCKS.register("potted_orange_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_YELLOW_FLOWER = BLOCKS.register("potted_yellow_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_LIME_FLOWER = BLOCKS.register("potted_lime_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_GREEN_FLOWER = BLOCKS.register("potted_green_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_CYAN_FLOWER = BLOCKS.register("potted_cyan_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_LIGHT_BLUE_FLOWER = BLOCKS.register("potted_light_blue_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_BLUE_FLOWER = BLOCKS.register("potted_blue_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_PURPLE_FLOWER = BLOCKS.register("potted_purple_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_MAGENTA_FLOWER = BLOCKS.register("potted_magenta_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_FLOWER, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_PINK_FLOWER = BLOCKS.register("potted_pink_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_FLOWER, propertiesPotted()));

	public static final RegistryObject<Block> POTTED_WHITE_CACTUS = BLOCKS.register("potted_white_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_LIGHT_GRAY_CACTUS = BLOCKS.register("potted_light_gray_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_GRAY_CACTUS = BLOCKS.register("potted_gray_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_BLACK_CACTUS = BLOCKS.register("potted_black_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_BROWN_CACTUS = BLOCKS.register("potted_brown_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_RED_CACTUS = BLOCKS.register("potted_red_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_ORANGE_CACTUS = BLOCKS.register("potted_orange_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_YELLOW_CACTUS = BLOCKS.register("potted_yellow_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_LIME_CACTUS = BLOCKS.register("potted_lime_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_GREEN_CACTUS = BLOCKS.register("potted_green_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_CYAN_CACTUS = BLOCKS.register("potted_cyan_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_LIGHT_BLUE_CACTUS = BLOCKS.register("potted_light_blue_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_BLUE_CACTUS = BLOCKS.register("potted_blue_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_PURPLE_CACTUS = BLOCKS.register("potted_purple_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_MAGENTA_CACTUS = BLOCKS.register("potted_magenta_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_CACTUS, propertiesPotted()));
	public static final RegistryObject<Block> POTTED_PINK_CACTUS = BLOCKS.register("potted_pink_cactus", () -> new CactusPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_CACTUS, propertiesPotted()));

	public static final RegistryObject<Block> WHITE_FLOWER_CROP = BLOCKS.register("white_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_GRAY_FLOWER_CROP = BLOCKS.register("light_gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GRAY_FLOWER_CROP = BLOCKS.register("gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLACK_FLOWER_CROP = BLOCKS.register("black_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BROWN_FLOWER_CROP = BLOCKS.register("brown_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> RED_FLOWER_CROP = BLOCKS.register("red_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> ORANGE_FLOWER_CROP = BLOCKS.register("orange_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> YELLOW_FLOWER_CROP = BLOCKS.register("yellow_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIME_FLOWER_CROP = BLOCKS.register("lime_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GREEN_FLOWER_CROP = BLOCKS.register("green_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CYAN_FLOWER_CROP = BLOCKS.register("cyan_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_BLUE_FLOWER_CROP = BLOCKS.register("light_blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLUE_FLOWER_CROP = BLOCKS.register("blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PURPLE_FLOWER_CROP = BLOCKS.register("purple_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> MAGENTA_FLOWER_CROP = BLOCKS.register("magenta_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PINK_FLOWER_CROP = BLOCKS.register("pink_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));

	public static final RegistryObject<Block> WHITE_CACTUS_CROP = BLOCKS.register("white_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_GRAY_CACTUS_CROP = BLOCKS.register("light_gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GRAY_CACTUS_CROP = BLOCKS.register("gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLACK_CACTUS_CROP = BLOCKS.register("black_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BROWN_CACTUS_CROP = BLOCKS.register("brown_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> RED_CACTUS_CROP = BLOCKS.register("red_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> ORANGE_CACTUS_CROP = BLOCKS.register("orange_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> YELLOW_CACTUS_CROP = BLOCKS.register("yellow_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIME_CACTUS_CROP = BLOCKS.register("lime_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GREEN_CACTUS_CROP = BLOCKS.register("green_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CYAN_CACTUS_CROP = BLOCKS.register("cyan_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_BLUE_CACTUS_CROP = BLOCKS.register("light_blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLUE_CACTUS_CROP = BLOCKS.register("blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PURPLE_CACTUS_CROP = BLOCKS.register("purple_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> MAGENTA_CACTUS_CROP = BLOCKS.register("magenta_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PINK_CACTUS_CROP = BLOCKS.register("pink_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));

	public static final RegistryObject<Block> CLOCHED_WHITE_FLOWER_CROP = BLOCKS.register("cloched_white_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_GRAY_FLOWER_CROP = BLOCKS.register("cloched_light_gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GRAY_FLOWER_CROP = BLOCKS.register("cloched_gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLACK_FLOWER_CROP = BLOCKS.register("cloched_black_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BROWN_FLOWER_CROP = BLOCKS.register("cloched_brown_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_RED_FLOWER_CROP = BLOCKS.register("cloched_red_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_ORANGE_FLOWER_CROP = BLOCKS.register("cloched_orange_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_YELLOW_FLOWER_CROP = BLOCKS.register("cloched_yellow_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIME_FLOWER_CROP = BLOCKS.register("cloched_lime_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GREEN_FLOWER_CROP = BLOCKS.register("cloched_green_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_CYAN_FLOWER_CROP = BLOCKS.register("cloched_cyan_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_BLUE_FLOWER_CROP = BLOCKS.register("cloched_light_blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLUE_FLOWER_CROP = BLOCKS.register("cloched_blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PURPLE_FLOWER_CROP = BLOCKS.register("cloched_purple_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_MAGENTA_FLOWER_CROP = BLOCKS.register("cloched_magenta_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PINK_FLOWER_CROP = BLOCKS.register("cloched_pink_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));

	public static final RegistryObject<Block> CLOCHED_WHITE_CACTUS_CROP = BLOCKS.register("cloched_white_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_GRAY_CACTUS_CROP = BLOCKS.register("cloched_light_gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GRAY_CACTUS_CROP = BLOCKS.register("cloched_gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLACK_CACTUS_CROP = BLOCKS.register("cloched_black_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BROWN_CACTUS_CROP = BLOCKS.register("cloched_brown_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_RED_CACTUS_CROP = BLOCKS.register("cloched_red_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_ORANGE_CACTUS_CROP = BLOCKS.register("cloched_orange_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_YELLOW_CACTUS_CROP = BLOCKS.register("cloched_yellow_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIME_CACTUS_CROP = BLOCKS.register("cloched_lime_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GREEN_CACTUS_CROP = BLOCKS.register("cloched_green_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_CYAN_CACTUS_CROP = BLOCKS.register("cloched_cyan_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_BLUE_CACTUS_CROP = BLOCKS.register("cloched_light_blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLUE_CACTUS_CROP = BLOCKS.register("cloched_blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PURPLE_CACTUS_CROP = BLOCKS.register("cloched_purple_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_MAGENTA_CACTUS_CROP = BLOCKS.register("cloched_magenta_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PINK_CACTUS_CROP = BLOCKS.register("cloched_pink_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));

	public static BlockBehaviour.Properties propertiesDyeBlock(MaterialColor pColor) {
		return BlockBehaviour.Properties.of(Material.SAND).color(pColor).sound(SoundType.SAND).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesFibersBlock() {
		return BlockBehaviour.Properties.of(Material.GRASS).color(MaterialColor.COLOR_GREEN).sound(SoundType.GRASS).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesFlower() {
		return BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).instabreak().noCollission();
	}

	public static BlockBehaviour.Properties propertiesCactus() {
		return BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).dynamicShape().instabreak().noCollission();
	}

	public static BlockBehaviour.Properties propertiesPotted() {
		return BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion();
	}

	public static BlockBehaviour.Properties propertiesCrop() {
		return BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.CROP).instabreak().noCollission().randomTicks();
	}
}
