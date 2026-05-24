package com.luxtracon.floralis.data.registry;

import com.luxtracon.floralis.common.helper.FloralisHelper;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("white_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("light_gray_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("gray_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("black_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("brown_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("red_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("orange_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("yellow_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("lime_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("green_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("cyan_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("light_blue_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("blue_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("purple_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("magenta_cactus_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CACTUS_CROP = FloralisConfiguredFeatures.registerKey("pink_cactus_crop");

	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("white_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("light_gray_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("gray_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("black_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("brown_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> RED_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("red_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("orange_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("yellow_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("lime_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("green_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("cyan_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("light_blue_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("blue_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("purple_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("magenta_flower_crop");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_FLOWER_CROP = FloralisConfiguredFeatures.registerKey("pink_flower_crop");

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> pBootstrapContext) {
		pBootstrapContext.register(FloralisConfiguredFeatures.WHITE_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.WHITE_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.LIGHT_GRAY_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.GRAY_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.GRAY_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.BLACK_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.BLACK_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.BROWN_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.BROWN_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.RED_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.RED_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.ORANGE_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.ORANGE_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.YELLOW_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.YELLOW_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.LIME_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.LIME_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.GREEN_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.GREEN_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.CYAN_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.CYAN_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.LIGHT_BLUE_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.BLUE_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.BLUE_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.PURPLE_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.PURPLE_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.MAGENTA_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.MAGENTA_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.PINK_CACTUS_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.PINK_CACTUS_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));

		pBootstrapContext.register(FloralisConfiguredFeatures.WHITE_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.WHITE_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.LIGHT_GRAY_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.GRAY_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.GRAY_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.BLACK_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.BLACK_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.BROWN_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.BROWN_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.RED_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.RED_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.ORANGE_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.ORANGE_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.YELLOW_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.YELLOW_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.LIME_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.LIME_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.GREEN_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.GREEN_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.CYAN_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.CYAN_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.LIGHT_BLUE_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.BLUE_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.BLUE_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.PURPLE_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.PURPLE_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.MAGENTA_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.MAGENTA_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pBootstrapContext.register(FloralisConfiguredFeatures.PINK_FLOWER_CROP, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(FloralisHelper.simple(FloralisBlocks.PINK_FLOWER_CROP.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
	}

	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String pName) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(FloralisConstants.FLORALIS, pName));
	}
}
