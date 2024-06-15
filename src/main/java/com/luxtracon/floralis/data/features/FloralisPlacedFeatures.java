package com.luxtracon.floralis.data.features;

import com.luxtracon.floralis.registry.FloralisConstants;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisPlacedFeatures {
	public static final ResourceKey<PlacedFeature> WHITE_FLOWER = FloralisPlacedFeatures.registerKey("white_flower");
	public static final ResourceKey<PlacedFeature> LIGHT_GRAY_FLOWER = FloralisPlacedFeatures.registerKey("light_gray_flower");
	public static final ResourceKey<PlacedFeature> GRAY_FLOWER = FloralisPlacedFeatures.registerKey("gray_flower");
	public static final ResourceKey<PlacedFeature> BLACK_FLOWER = FloralisPlacedFeatures.registerKey("black_flower");
	public static final ResourceKey<PlacedFeature> BROWN_FLOWER = FloralisPlacedFeatures.registerKey("brown_flower");
	public static final ResourceKey<PlacedFeature> RED_FLOWER = FloralisPlacedFeatures.registerKey("red_flower");
	public static final ResourceKey<PlacedFeature> ORANGE_FLOWER = FloralisPlacedFeatures.registerKey("orange_flower");
	public static final ResourceKey<PlacedFeature> YELLOW_FLOWER = FloralisPlacedFeatures.registerKey("yellow_flower");
	public static final ResourceKey<PlacedFeature> LIME_FLOWER = FloralisPlacedFeatures.registerKey("lime_flower");
	public static final ResourceKey<PlacedFeature> GREEN_FLOWER = FloralisPlacedFeatures.registerKey("green_flower");
	public static final ResourceKey<PlacedFeature> CYAN_FLOWER = FloralisPlacedFeatures.registerKey("cyan_flower");
	public static final ResourceKey<PlacedFeature> LIGHT_BLUE_FLOWER = FloralisPlacedFeatures.registerKey("light_blue_flower");
	public static final ResourceKey<PlacedFeature> BLUE_FLOWER = FloralisPlacedFeatures.registerKey("blue_flower");
	public static final ResourceKey<PlacedFeature> PURPLE_FLOWER = FloralisPlacedFeatures.registerKey("purple_flower");
	public static final ResourceKey<PlacedFeature> MAGENTA_FLOWER = FloralisPlacedFeatures.registerKey("magenta_flower");
	public static final ResourceKey<PlacedFeature> PINK_FLOWER = FloralisPlacedFeatures.registerKey("pink_flower");

	public static final ResourceKey<PlacedFeature> WHITE_CACTUS = FloralisPlacedFeatures.registerKey("white_cactus");
	public static final ResourceKey<PlacedFeature> LIGHT_GRAY_CACTUS = FloralisPlacedFeatures.registerKey("light_gray_cactus");
	public static final ResourceKey<PlacedFeature> GRAY_CACTUS = FloralisPlacedFeatures.registerKey("gray_cactus");
	public static final ResourceKey<PlacedFeature> BLACK_CACTUS = FloralisPlacedFeatures.registerKey("black_cactus");
	public static final ResourceKey<PlacedFeature> BROWN_CACTUS = FloralisPlacedFeatures.registerKey("brown_cactus");
	public static final ResourceKey<PlacedFeature> RED_CACTUS = FloralisPlacedFeatures.registerKey("red_cactus");
	public static final ResourceKey<PlacedFeature> ORANGE_CACTUS = FloralisPlacedFeatures.registerKey("orange_cactus");
	public static final ResourceKey<PlacedFeature> YELLOW_CACTUS = FloralisPlacedFeatures.registerKey("yellow_cactus");
	public static final ResourceKey<PlacedFeature> LIME_CACTUS = FloralisPlacedFeatures.registerKey("lime_cactus");
	public static final ResourceKey<PlacedFeature> GREEN_CACTUS = FloralisPlacedFeatures.registerKey("green_cactus");
	public static final ResourceKey<PlacedFeature> CYAN_CACTUS = FloralisPlacedFeatures.registerKey("cyan_cactus");
	public static final ResourceKey<PlacedFeature> LIGHT_BLUE_CACTUS = FloralisPlacedFeatures.registerKey("light_blue_cactus");
	public static final ResourceKey<PlacedFeature> BLUE_CACTUS = FloralisPlacedFeatures.registerKey("blue_cactus");
	public static final ResourceKey<PlacedFeature> PURPLE_CACTUS = FloralisPlacedFeatures.registerKey("purple_cactus");
	public static final ResourceKey<PlacedFeature> MAGENTA_CACTUS = FloralisPlacedFeatures.registerKey("magenta_cactus");
	public static final ResourceKey<PlacedFeature> PINK_CACTUS = FloralisPlacedFeatures.registerKey("pink_cactus");

	public static void bootstrap(BootstrapContext<PlacedFeature> pContext) {
		var configuredFeatures = pContext.lookup(Registries.CONFIGURED_FEATURE);

		pContext.register(FloralisPlacedFeatures.WHITE_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.WHITE_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.LIGHT_GRAY_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.LIGHT_GRAY_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.GRAY_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.GRAY_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.BLACK_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.BLACK_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.BROWN_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.BROWN_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.RED_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.RED_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.ORANGE_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.ORANGE_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.YELLOW_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.YELLOW_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.LIME_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.LIME_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.GREEN_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.GREEN_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.CYAN_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.CYAN_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.LIGHT_BLUE_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.LIGHT_BLUE_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.BLUE_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.BLUE_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.PURPLE_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.PURPLE_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.MAGENTA_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.MAGENTA_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.PINK_FLOWER, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.PINK_FLOWER), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.DIRT), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));

		pContext.register(FloralisPlacedFeatures.WHITE_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.WHITE_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.LIGHT_GRAY_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.LIGHT_GRAY_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.GRAY_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.GRAY_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.BLACK_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.BLACK_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.BROWN_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.BROWN_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.RED_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.RED_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.ORANGE_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.ORANGE_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.YELLOW_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.YELLOW_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.LIME_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.LIME_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.GREEN_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.GREEN_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.CYAN_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.CYAN_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.LIGHT_BLUE_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.LIGHT_BLUE_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.BLUE_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.BLUE_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.PURPLE_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.PURPLE_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.MAGENTA_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.MAGENTA_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
		pContext.register(FloralisPlacedFeatures.PINK_CACTUS, new PlacedFeature(configuredFeatures.getOrThrow(FloralisConfiguredFeatures.PINK_CACTUS), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.matchesTag(BlockTags.SAND), BlockPredicate.matchesBlocks(Blocks.AIR), 16), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));
	}

	public static ResourceKey<PlacedFeature> registerKey(String pName) {
		return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FloralisConstants.FLORALIS, pName));
	}
}
