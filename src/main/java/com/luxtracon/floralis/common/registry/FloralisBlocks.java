package com.luxtracon.floralis.common.registry;

import com.luxtracon.floralis.common.block.*;

import java.util.function.Function;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, FloralisConstants.FLORALIS);

	public static final DeferredHolder<Block, Block> WHITE_DYE_BLOCK = FloralisBlocks.register("white_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.SNOW));
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_DYE_BLOCK = FloralisBlocks.register("light_gray_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_GRAY));
	public static final DeferredHolder<Block, Block> GRAY_DYE_BLOCK = FloralisBlocks.register("gray_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_GRAY));
	public static final DeferredHolder<Block, Block> BLACK_DYE_BLOCK = FloralisBlocks.register("black_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BLACK));
	public static final DeferredHolder<Block, Block> BROWN_DYE_BLOCK = FloralisBlocks.register("brown_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BROWN));
	public static final DeferredHolder<Block, Block> RED_DYE_BLOCK = FloralisBlocks.register("red_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_RED));
	public static final DeferredHolder<Block, Block> ORANGE_DYE_BLOCK = FloralisBlocks.register("orange_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_ORANGE));
	public static final DeferredHolder<Block, Block> YELLOW_DYE_BLOCK = FloralisBlocks.register("yellow_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_YELLOW));
	public static final DeferredHolder<Block, Block> LIME_DYE_BLOCK = FloralisBlocks.register("lime_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_GREEN));
	public static final DeferredHolder<Block, Block> GREEN_DYE_BLOCK = FloralisBlocks.register("green_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_GREEN));
	public static final DeferredHolder<Block, Block> CYAN_DYE_BLOCK = FloralisBlocks.register("cyan_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_CYAN));
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_DYE_BLOCK = FloralisBlocks.register("light_blue_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_BLUE));
	public static final DeferredHolder<Block, Block> BLUE_DYE_BLOCK = FloralisBlocks.register("blue_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BLUE));
	public static final DeferredHolder<Block, Block> PURPLE_DYE_BLOCK = FloralisBlocks.register("purple_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_PURPLE));
	public static final DeferredHolder<Block, Block> MAGENTA_DYE_BLOCK = FloralisBlocks.register("magenta_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_MAGENTA));
	public static final DeferredHolder<Block, Block> PINK_DYE_BLOCK = FloralisBlocks.register("pink_dye_block", DyeBlock::new, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_PINK));

	public static final DeferredHolder<Block, Block> PLANT_FIBERS_BLOCK = FloralisBlocks.register("plant_fibers_block", PlantFibersBlock::new, FloralisBlocks.propertiesPlantFibersBlock());

	public static final DeferredHolder<Block, Block> WHITE_CACTUS = FloralisBlocks.register("white_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_CACTUS = FloralisBlocks.register("light_gray_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> GRAY_CACTUS = FloralisBlocks.register("gray_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> BLACK_CACTUS = FloralisBlocks.register("black_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> BROWN_CACTUS = FloralisBlocks.register("brown_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> RED_CACTUS = FloralisBlocks.register("red_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> ORANGE_CACTUS = FloralisBlocks.register("orange_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> YELLOW_CACTUS = FloralisBlocks.register("yellow_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> LIME_CACTUS = FloralisBlocks.register("lime_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> GREEN_CACTUS = FloralisBlocks.register("green_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> CYAN_CACTUS = FloralisBlocks.register("cyan_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_CACTUS = FloralisBlocks.register("light_blue_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> BLUE_CACTUS = FloralisBlocks.register("blue_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> PURPLE_CACTUS = FloralisBlocks.register("purple_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> MAGENTA_CACTUS = FloralisBlocks.register("magenta_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> PINK_CACTUS = FloralisBlocks.register("pink_cactus", CactusBushBlock::new, FloralisBlocks.propertiesBush());

	public static final DeferredHolder<Block, Block> WHITE_FLOWER = FloralisBlocks.register("white_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_FLOWER = FloralisBlocks.register("light_gray_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> GRAY_FLOWER = FloralisBlocks.register("gray_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> BLACK_FLOWER = FloralisBlocks.register("black_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> BROWN_FLOWER = FloralisBlocks.register("brown_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> RED_FLOWER = FloralisBlocks.register("red_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> ORANGE_FLOWER = FloralisBlocks.register("orange_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> YELLOW_FLOWER = FloralisBlocks.register("yellow_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> LIME_FLOWER = FloralisBlocks.register("lime_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> GREEN_FLOWER = FloralisBlocks.register("green_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> CYAN_FLOWER = FloralisBlocks.register("cyan_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_FLOWER = FloralisBlocks.register("light_blue_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> BLUE_FLOWER = FloralisBlocks.register("blue_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> PURPLE_FLOWER = FloralisBlocks.register("purple_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> MAGENTA_FLOWER = FloralisBlocks.register("magenta_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());
	public static final DeferredHolder<Block, Block> PINK_FLOWER = FloralisBlocks.register("pink_flower", FlowerBushBlock::new, FloralisBlocks.propertiesBush());

	public static final DeferredHolder<Block, Block> WHITE_CACTUS_CROP = FloralisBlocks.register("white_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_CACTUS_CROP = FloralisBlocks.register("light_gray_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> GRAY_CACTUS_CROP = FloralisBlocks.register("gray_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> BLACK_CACTUS_CROP = FloralisBlocks.register("black_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> BROWN_CACTUS_CROP = FloralisBlocks.register("brown_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> RED_CACTUS_CROP = FloralisBlocks.register("red_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> ORANGE_CACTUS_CROP = FloralisBlocks.register("orange_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> YELLOW_CACTUS_CROP = FloralisBlocks.register("yellow_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> LIME_CACTUS_CROP = FloralisBlocks.register("lime_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> GREEN_CACTUS_CROP = FloralisBlocks.register("green_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> CYAN_CACTUS_CROP = FloralisBlocks.register("cyan_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_CACTUS_CROP = FloralisBlocks.register("light_blue_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> BLUE_CACTUS_CROP = FloralisBlocks.register("blue_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> PURPLE_CACTUS_CROP = FloralisBlocks.register("purple_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> MAGENTA_CACTUS_CROP = FloralisBlocks.register("magenta_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> PINK_CACTUS_CROP = FloralisBlocks.register("pink_cactus_crop", CactusCropBlock::new, FloralisBlocks.propertiesCrop());

	public static final DeferredHolder<Block, Block> WHITE_FLOWER_CROP = FloralisBlocks.register("white_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_FLOWER_CROP = FloralisBlocks.register("light_gray_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> GRAY_FLOWER_CROP = FloralisBlocks.register("gray_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> BLACK_FLOWER_CROP = FloralisBlocks.register("black_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> BROWN_FLOWER_CROP = FloralisBlocks.register("brown_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> RED_FLOWER_CROP = FloralisBlocks.register("red_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> ORANGE_FLOWER_CROP = FloralisBlocks.register("orange_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> YELLOW_FLOWER_CROP = FloralisBlocks.register("yellow_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> LIME_FLOWER_CROP = FloralisBlocks.register("lime_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> GREEN_FLOWER_CROP = FloralisBlocks.register("green_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> CYAN_FLOWER_CROP = FloralisBlocks.register("cyan_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_FLOWER_CROP = FloralisBlocks.register("light_blue_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> BLUE_FLOWER_CROP = FloralisBlocks.register("blue_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> PURPLE_FLOWER_CROP = FloralisBlocks.register("purple_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> MAGENTA_FLOWER_CROP = FloralisBlocks.register("magenta_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());
	public static final DeferredHolder<Block, Block> PINK_FLOWER_CROP = FloralisBlocks.register("pink_flower_crop", FlowerCropBlock::new, FloralisBlocks.propertiesCrop());

	public static final DeferredHolder<Block, Block> POTTED_WHITE_CACTUS = FloralisBlocks.register("potted_white_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.WHITE_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_GRAY_CACTUS = FloralisBlocks.register("potted_light_gray_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_GRAY_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_GRAY_CACTUS = FloralisBlocks.register("potted_gray_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GRAY_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_BLACK_CACTUS = FloralisBlocks.register("potted_black_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLACK_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_BROWN_CACTUS = FloralisBlocks.register("potted_brown_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BROWN_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_RED_CACTUS = FloralisBlocks.register("potted_red_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.RED_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_ORANGE_CACTUS = FloralisBlocks.register("potted_orange_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.ORANGE_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_YELLOW_CACTUS = FloralisBlocks.register("potted_yellow_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.YELLOW_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_LIME_CACTUS = FloralisBlocks.register("potted_lime_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIME_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_GREEN_CACTUS = FloralisBlocks.register("potted_green_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GREEN_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_CYAN_CACTUS = FloralisBlocks.register("potted_cyan_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.CYAN_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_BLUE_CACTUS = FloralisBlocks.register("potted_light_blue_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_BLUE_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_BLUE_CACTUS = FloralisBlocks.register("potted_blue_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLUE_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_PURPLE_CACTUS = FloralisBlocks.register("potted_purple_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PURPLE_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_MAGENTA_CACTUS = FloralisBlocks.register("potted_magenta_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.MAGENTA_CACTUS, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_PINK_CACTUS = FloralisBlocks.register("potted_pink_cactus", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PINK_CACTUS, properties), FloralisBlocks.propertiesPotted());

	public static final DeferredHolder<Block, Block> POTTED_WHITE_FLOWER = FloralisBlocks.register("potted_white_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.WHITE_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_GRAY_FLOWER = FloralisBlocks.register("potted_light_gray_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_GRAY_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_GRAY_FLOWER = FloralisBlocks.register("potted_gray_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GRAY_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_BLACK_FLOWER = FloralisBlocks.register("potted_black_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLACK_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_BROWN_FLOWER = FloralisBlocks.register("potted_brown_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BROWN_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_RED_FLOWER = FloralisBlocks.register("potted_red_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.RED_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_ORANGE_FLOWER = FloralisBlocks.register("potted_orange_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.ORANGE_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_YELLOW_FLOWER = FloralisBlocks.register("potted_yellow_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.YELLOW_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_LIME_FLOWER = FloralisBlocks.register("potted_lime_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIME_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_GREEN_FLOWER = FloralisBlocks.register("potted_green_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GREEN_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_CYAN_FLOWER = FloralisBlocks.register("potted_cyan_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.CYAN_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_BLUE_FLOWER = FloralisBlocks.register("potted_light_blue_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_BLUE_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_BLUE_FLOWER = FloralisBlocks.register("potted_blue_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLUE_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_PURPLE_FLOWER = FloralisBlocks.register("potted_purple_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PURPLE_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_MAGENTA_FLOWER = FloralisBlocks.register("potted_magenta_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.MAGENTA_FLOWER, properties), FloralisBlocks.propertiesPotted());
	public static final DeferredHolder<Block, Block> POTTED_PINK_FLOWER = FloralisBlocks.register("potted_pink_flower", properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PINK_FLOWER, properties), FloralisBlocks.propertiesPotted());

	public static BlockBehaviour.Properties propertiesDyeBlock(MapColor pMapColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE).mapColor(pMapColor).pushReaction(PushReaction.NORMAL).sound(SoundType.SAND).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesPlantFibersBlock() {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BANJO).mapColor(MapColor.COLOR_GREEN).pushReaction(PushReaction.NORMAL).sound(SoundType.GRASS).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesBush() {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HARP).mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).sound(SoundType.GRASS).instabreak();
	}

	public static BlockBehaviour.Properties propertiesCrop() {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HARP).mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).sound(SoundType.CROP).instabreak().randomTicks();
	}

	public static BlockBehaviour.Properties propertiesPotted() {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HARP).mapColor(MapColor.NONE).pushReaction(PushReaction.DESTROY).sound(SoundType.STONE).instabreak().noOcclusion();
	}

	public static <T extends Block> DeferredHolder<Block, T> register(String pName, Function<BlockBehaviour.Properties, T> pFunction, BlockBehaviour.Properties pProperties) {
		return FloralisBlocks.BLOCKS.register(pName, () -> pFunction.apply(pProperties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(FloralisConstants.FLORALIS, pName)))));
	}
}
