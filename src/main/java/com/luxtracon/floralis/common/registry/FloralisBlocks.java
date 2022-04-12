package com.luxtracon.floralis.common.registry;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.blocks.*;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation, unused")
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault

public class FloralisBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Floralis.MODID);

	public static final RegistryObject<Block> WHITE_DYE_BLOCK = register("white_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.SNOW)));
	public static final RegistryObject<Block> ORANGE_DYE_BLOCK = register("orange_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_ORANGE)));
	public static final RegistryObject<Block> MAGENTA_DYE_BLOCK = register("magenta_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_MAGENTA)));
	public static final RegistryObject<Block> LIGHT_BLUE_DYE_BLOCK = register("light_blue_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_LIGHT_BLUE)));
	public static final RegistryObject<Block> YELLOW_DYE_BLOCK = register("yellow_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_YELLOW)));
	public static final RegistryObject<Block> LIME_DYE_BLOCK = register("lime_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_LIGHT_GREEN)));
	public static final RegistryObject<Block> PINK_DYE_BLOCK = register("pink_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_PINK)));
	public static final RegistryObject<Block> GRAY_DYE_BLOCK = register("gray_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_GRAY)));
	public static final RegistryObject<Block> LIGHT_GRAY_DYE_BLOCK = register("light_gray_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_LIGHT_GRAY)));
	public static final RegistryObject<Block> CYAN_DYE_BLOCK = register("cyan_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_CYAN)));
	public static final RegistryObject<Block> PURPLE_DYE_BLOCK = register("purple_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_PURPLE)));
	public static final RegistryObject<Block> BLUE_DYE_BLOCK = register("blue_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_BLUE)));
	public static final RegistryObject<Block> BROWN_DYE_BLOCK = register("brown_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_BROWN)));
	public static final RegistryObject<Block> GREEN_DYE_BLOCK = register("green_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_GREEN)));
	public static final RegistryObject<Block> RED_DYE_BLOCK = register("red_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_RED)));
	public static final RegistryObject<Block> BLACK_DYE_BLOCK = register("black_dye_block", () -> new FallingBlock(propertiesDyeBlock().color(MaterialColor.COLOR_BLACK)));

	public static final RegistryObject<Block> PLANT_FIBERS_BLOCK = register("plant_fibers_block", () -> new RotatedPillarBlock(propertiesFibersBlock()));

	public static final RegistryObject<Block> WHITE_FLOWER = register("white_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> ORANGE_FLOWER = register("orange_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> MAGENTA_FLOWER = register("magenta_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> LIGHT_BLUE_FLOWER = register("light_blue_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> YELLOW_FLOWER = register("yellow_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> LIME_FLOWER = register("lime_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> PINK_FLOWER = register("pink_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> GRAY_FLOWER = register("gray_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> LIGHT_GRAY_FLOWER = register("light_gray_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> CYAN_FLOWER = register("cyan_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> PURPLE_FLOWER = register("purple_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> BLUE_FLOWER = register("blue_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> BROWN_FLOWER = register("brown_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> GREEN_FLOWER = register("green_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> RED_FLOWER = register("red_flower", () -> new FlowerPlantBlock(propertiesFlower()));
	public static final RegistryObject<Block> BLACK_FLOWER = register("black_flower", () -> new FlowerPlantBlock(propertiesFlower()));

	public static final RegistryObject<Block> WHITE_CACTUS = register("white_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> ORANGE_CACTUS = register("orange_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> MAGENTA_CACTUS = register("magenta_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> LIGHT_BLUE_CACTUS = register("light_blue_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> YELLOW_CACTUS = register("yellow_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> LIME_CACTUS = register("lime_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> PINK_CACTUS = register("pink_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> GRAY_CACTUS = register("gray_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> LIGHT_GRAY_CACTUS = register("light_gray_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> CYAN_CACTUS = register("cyan_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> PURPLE_CACTUS = register("purple_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> BLUE_CACTUS = register("blue_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> BROWN_CACTUS = register("brown_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> GREEN_CACTUS = register("green_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> RED_CACTUS = register("red_cactus", () -> new CactusPlantBlock(propertiesCactus()));
	public static final RegistryObject<Block> BLACK_CACTUS = register("black_cactus", () -> new CactusPlantBlock(propertiesCactus()));

	public static final RegistryObject<Block> POTTED_WHITE_FLOWER = register("potted_white_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_ORANGE_FLOWER = register("potted_orange_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_MAGENTA_FLOWER = register("potted_magenta_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_LIGHT_BLUE_FLOWER = register("potted_light_blue_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_YELLOW_FLOWER = register("potted_yellow_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_LIME_FLOWER = register("potted_lime_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_PINK_FLOWER = register("potted_pink_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_GRAY_FLOWER = register("potted_gray_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_LIGHT_GRAY_FLOWER = register("potted_light_gray_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_CYAN_FLOWER = register("potted_cyan_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_PURPLE_FLOWER = register("potted_purple_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_BLUE_FLOWER = register("potted_blue_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_BROWN_FLOWER = register("potted_brown_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_GREEN_FLOWER = register("potted_green_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_RED_FLOWER = register("potted_red_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_FLOWER, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_BLACK_FLOWER = register("potted_black_flower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_FLOWER, propertiesPottedPlant()));

	public static final RegistryObject<Block> POTTED_WHITE_CACTUS = register("potted_white_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WHITE_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_ORANGE_CACTUS = register("potted_orange_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ORANGE_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_MAGENTA_CACTUS = register("potted_magenta_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAGENTA_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_LIGHT_BLUE_CACTUS = register("potted_light_blue_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_BLUE_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_YELLOW_CACTUS = register("potted_yellow_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, YELLOW_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_LIME_CACTUS = register("potted_lime_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIME_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_PINK_CACTUS = register("potted_pink_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PINK_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_GRAY_CACTUS = register("potted_gray_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRAY_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_LIGHT_GRAY_CACTUS = register("potted_light_gray_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LIGHT_GRAY_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_CYAN_CACTUS = register("potted_cyan_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, CYAN_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_PURPLE_CACTUS = register("potted_purple_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, PURPLE_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_BLUE_CACTUS = register("potted_blue_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_BROWN_CACTUS = register("potted_brown_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BROWN_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_GREEN_CACTUS = register("potted_green_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GREEN_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_RED_CACTUS = register("potted_red_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, RED_CACTUS, propertiesPottedPlant()));
	public static final RegistryObject<Block> POTTED_BLACK_CACTUS = register("potted_black_cactus", () -> new SpecialFlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLACK_CACTUS, propertiesPottedPlant()));

	public static final RegistryObject<Block> WHITE_FLOWER_CROP = register("white_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> ORANGE_FLOWER_CROP = register("orange_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> MAGENTA_FLOWER_CROP = register("magenta_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_BLUE_FLOWER_CROP = register("light_blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> YELLOW_FLOWER_CROP = register("yellow_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIME_FLOWER_CROP = register("lime_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PINK_FLOWER_CROP = register("pink_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GRAY_FLOWER_CROP = register("gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_GRAY_FLOWER_CROP = register("light_gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CYAN_FLOWER_CROP = register("cyan_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PURPLE_FLOWER_CROP = register("purple_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLUE_FLOWER_CROP = register("blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BROWN_FLOWER_CROP = register("brown_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GREEN_FLOWER_CROP = register("green_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> RED_FLOWER_CROP = register("red_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLACK_FLOWER_CROP = register("black_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));

	public static final RegistryObject<Block> WHITE_CACTUS_CROP = register("white_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> ORANGE_CACTUS_CROP = register("orange_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> MAGENTA_CACTUS_CROP = register("magenta_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_BLUE_CACTUS_CROP = register("light_blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> YELLOW_CACTUS_CROP = register("yellow_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIME_CACTUS_CROP = register("lime_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PINK_CACTUS_CROP = register("pink_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GRAY_CACTUS_CROP = register("gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> LIGHT_GRAY_CACTUS_CROP = register("light_gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CYAN_CACTUS_CROP = register("cyan_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> PURPLE_CACTUS_CROP = register("purple_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLUE_CACTUS_CROP = register("blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BROWN_CACTUS_CROP = register("brown_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> GREEN_CACTUS_CROP = register("green_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> RED_CACTUS_CROP = register("red_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> BLACK_CACTUS_CROP = register("black_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));

	public static final RegistryObject<Block> CLOCHED_WHITE_FLOWER_CROP = register("cloched_white_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_ORANGE_FLOWER_CROP = register("cloched_orange_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_MAGENTA_FLOWER_CROP = register("cloched_magenta_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_BLUE_FLOWER_CROP = register("cloched_light_blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_YELLOW_FLOWER_CROP = register("cloched_yellow_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIME_FLOWER_CROP = register("cloched_lime_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PINK_FLOWER_CROP = register("cloched_pink_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GRAY_FLOWER_CROP = register("cloched_gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_GRAY_FLOWER_CROP = register("cloched_light_gray_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_CYAN_FLOWER_CROP = register("cloched_cyan_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PURPLE_FLOWER_CROP = register("cloched_purple_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLUE_FLOWER_CROP = register("cloched_blue_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BROWN_FLOWER_CROP = register("cloched_brown_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GREEN_FLOWER_CROP = register("cloched_green_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_RED_FLOWER_CROP = register("cloched_red_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLACK_FLOWER_CROP = register("cloched_black_flower_crop", () -> new FlowerCropBlock(propertiesCrop()));

	public static final RegistryObject<Block> CLOCHED_WHITE_CACTUS_CROP = register("cloched_white_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_ORANGE_CACTUS_CROP = register("cloched_orange_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_MAGENTA_CACTUS_CROP = register("cloched_magenta_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_BLUE_CACTUS_CROP = register("cloched_light_blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_YELLOW_CACTUS_CROP = register("cloched_yellow_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIME_CACTUS_CROP = register("cloched_lime_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PINK_CACTUS_CROP = register("cloched_pink_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GRAY_CACTUS_CROP = register("cloched_gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_LIGHT_GRAY_CACTUS_CROP = register("cloched_light_gray_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_CYAN_CACTUS_CROP = register("cloched_cyan_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_PURPLE_CACTUS_CROP = register("cloched_purple_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLUE_CACTUS_CROP = register("cloched_blue_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BROWN_CACTUS_CROP = register("cloched_brown_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_GREEN_CACTUS_CROP = register("cloched_green_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_RED_CACTUS_CROP = register("cloched_red_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));
	public static final RegistryObject<Block> CLOCHED_BLACK_CACTUS_CROP = register("cloched_black_cactus_crop", () -> new CactusCropBlock(propertiesCrop()));

	private static Properties propertiesDyeBlock() {
		return Properties.of(Material.SAND).sound(SoundType.SAND).explosionResistance(0.5F).strength(0.5F);
	}

	private static Properties propertiesFibersBlock() {
		return Properties.of(Material.GRASS).color(MaterialColor.COLOR_GREEN).sound(SoundType.GRASS).explosionResistance(0.5F).strength(0.5F);
	}

	private static Properties propertiesFlower() {
		return Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission().instabreak();
	}

	private static Properties propertiesCactus() {
		return Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission().instabreak().dynamicShape();
	}

	private static Properties propertiesPottedPlant() {
		return Properties.of(Material.DECORATION).instabreak().noOcclusion();
	}

	private static Properties propertiesCrop() {
		return Properties.of(Material.PLANT).sound(SoundType.CROP).noCollission().instabreak().randomTicks();
	}

	private static class SpecialFlowerPotBlock extends FlowerPotBlock {
		public SpecialFlowerPotBlock(Supplier<FlowerPotBlock> emptyPot, Supplier<? extends Block> pContent, Properties properties) {
			super(emptyPot, pContent, properties);
		}

		@Override
		public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
			pEntity.hurt(DamageSource.CACTUS, 1.0F);
		}
	}

	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
	}
}
