package com.luxtracon.floralis.data.features;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstants;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_FLOWER = FloralisConfiguredFeatures.registerKey("white_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_FLOWER = FloralisConfiguredFeatures.registerKey("light_gray_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_FLOWER = FloralisConfiguredFeatures.registerKey("gray_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_FLOWER = FloralisConfiguredFeatures.registerKey("black_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_FLOWER = FloralisConfiguredFeatures.registerKey("brown_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> RED_FLOWER = FloralisConfiguredFeatures.registerKey("red_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_FLOWER = FloralisConfiguredFeatures.registerKey("orange_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_FLOWER = FloralisConfiguredFeatures.registerKey("yellow_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_FLOWER = FloralisConfiguredFeatures.registerKey("lime_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_FLOWER = FloralisConfiguredFeatures.registerKey("green_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_FLOWER = FloralisConfiguredFeatures.registerKey("cyan_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_FLOWER = FloralisConfiguredFeatures.registerKey("light_blue_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_FLOWER = FloralisConfiguredFeatures.registerKey("blue_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_FLOWER = FloralisConfiguredFeatures.registerKey("purple_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_FLOWER = FloralisConfiguredFeatures.registerKey("magenta_flower");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_FLOWER = FloralisConfiguredFeatures.registerKey("pink_flower");

	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CACTUS = FloralisConfiguredFeatures.registerKey("white_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_CACTUS = FloralisConfiguredFeatures.registerKey("light_gray_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_CACTUS = FloralisConfiguredFeatures.registerKey("gray_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_CACTUS = FloralisConfiguredFeatures.registerKey("black_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_CACTUS = FloralisConfiguredFeatures.registerKey("brown_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CACTUS = FloralisConfiguredFeatures.registerKey("red_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_CACTUS = FloralisConfiguredFeatures.registerKey("orange_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CACTUS = FloralisConfiguredFeatures.registerKey("yellow_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_CACTUS = FloralisConfiguredFeatures.registerKey("lime_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CACTUS = FloralisConfiguredFeatures.registerKey("green_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_CACTUS = FloralisConfiguredFeatures.registerKey("cyan_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_CACTUS = FloralisConfiguredFeatures.registerKey("light_blue_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_CACTUS = FloralisConfiguredFeatures.registerKey("blue_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CACTUS = FloralisConfiguredFeatures.registerKey("purple_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_CACTUS = FloralisConfiguredFeatures.registerKey("magenta_cactus");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CACTUS = FloralisConfiguredFeatures.registerKey("pink_cactus");

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> pContext) {
		pContext.register(FloralisConfiguredFeatures.WHITE_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.WHITE_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.LIGHT_GRAY_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.LIGHT_GRAY_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.GRAY_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.GRAY_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.BLACK_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BLACK_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.BROWN_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BROWN_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.RED_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.RED_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.ORANGE_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.ORANGE_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.YELLOW_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.YELLOW_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.LIME_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.LIME_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.GREEN_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.GREEN_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.CYAN_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.CYAN_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.LIGHT_BLUE_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.LIGHT_BLUE_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.BLUE_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BLUE_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.PURPLE_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.PURPLE_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.MAGENTA_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.MAGENTA_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.PINK_FLOWER, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.PINK_FLOWER.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR))))));

		pContext.register(FloralisConfiguredFeatures.WHITE_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.WHITE_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.LIGHT_GRAY_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.LIGHT_GRAY_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.GRAY_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.GRAY_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.BLACK_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BLACK_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.BROWN_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BROWN_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.RED_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.RED_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.ORANGE_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.ORANGE_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.YELLOW_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.YELLOW_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.LIME_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.LIME_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.GREEN_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.GREEN_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.CYAN_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.CYAN_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.LIGHT_BLUE_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.LIGHT_BLUE_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.BLUE_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.BLUE_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.PURPLE_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.PURPLE_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.MAGENTA_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.MAGENTA_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
		pContext.register(FloralisConfiguredFeatures.PINK_CACTUS, new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 4, 4, PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(FloralisBlocks.PINK_CACTUS.get())), BlockPredicate.allOf(BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR))))));
	}

	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String pName) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(FloralisConstants.FLORALIS, pName));
	}
}
