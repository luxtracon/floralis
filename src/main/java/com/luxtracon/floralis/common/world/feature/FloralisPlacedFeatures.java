package com.luxtracon.floralis.common.world.feature;

import com.luxtracon.floralis.common.config.FloralisFeaturesConfig;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;

public class FloralisPlacedFeatures {
	private static final int RARITY_FLOWER = FloralisFeaturesConfig.RARITY_FLOWER.get();
	private static final int RARITY_CACTUS = FloralisFeaturesConfig.RARITY_CACTUS.get();

	public static final PlacedFeature WHITE_FLOWER = PlacementUtils.register("white_flower", FloralisConfiguredFeatures.WHITE_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature ORANGE_FLOWER = PlacementUtils.register("orange_flower", FloralisConfiguredFeatures.ORANGE_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature MAGENTA_FLOWER = PlacementUtils.register("magenta_flower", FloralisConfiguredFeatures.MAGENTA_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature LIGHT_BLUE_FLOWER = PlacementUtils.register("light_blue_flower", FloralisConfiguredFeatures.LIGHT_BLUE_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature YELLOW_FLOWER = PlacementUtils.register("yellow_flower", FloralisConfiguredFeatures.YELLOW_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature LIME_FLOWER = PlacementUtils.register("lime_flower", FloralisConfiguredFeatures.LIME_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature PINK_FLOWER = PlacementUtils.register("pink_flower", FloralisConfiguredFeatures.PINK_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature GRAY_FLOWER = PlacementUtils.register("gray_flower", FloralisConfiguredFeatures.GRAY_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature LIGHT_GRAY_FLOWER = PlacementUtils.register("light_gray_flower", FloralisConfiguredFeatures.LIGHT_GRAY_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature CYAN_FLOWER = PlacementUtils.register("cyan_flower", FloralisConfiguredFeatures.CYAN_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature PURPLE_FLOWER = PlacementUtils.register("purple_flower", FloralisConfiguredFeatures.PURPLE_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature BLUE_FLOWER = PlacementUtils.register("blue_flower", FloralisConfiguredFeatures.BLUE_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature BROWN_FLOWER = PlacementUtils.register("brown_flower", FloralisConfiguredFeatures.BROWN_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature GREEN_FLOWER = PlacementUtils.register("green_flower", FloralisConfiguredFeatures.GREEN_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature RED_FLOWER = PlacementUtils.register("red_flower", FloralisConfiguredFeatures.RED_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature BLACK_FLOWER = PlacementUtils.register("black_flower", FloralisConfiguredFeatures.BLACK_FLOWER.placed(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter()));

	public static final PlacedFeature WHITE_CACTUS = PlacementUtils.register("white_cactus", FloralisConfiguredFeatures.WHITE_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature ORANGE_CACTUS = PlacementUtils.register("orange_cactus", FloralisConfiguredFeatures.ORANGE_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature MAGENTA_CACTUS = PlacementUtils.register("magenta_cactus", FloralisConfiguredFeatures.MAGENTA_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature LIGHT_BLUE_CACTUS = PlacementUtils.register("light_blue_cactus", FloralisConfiguredFeatures.LIGHT_BLUE_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature YELLOW_CACTUS = PlacementUtils.register("yellow_cactus", FloralisConfiguredFeatures.YELLOW_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature LIME_CACTUS = PlacementUtils.register("lime_cactus", FloralisConfiguredFeatures.LIME_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature PINK_CACTUS = PlacementUtils.register("pink_cactus", FloralisConfiguredFeatures.PINK_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature GRAY_CACTUS = PlacementUtils.register("gray_cactus", FloralisConfiguredFeatures.GRAY_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature LIGHT_GRAY_CACTUS = PlacementUtils.register("light_gray_cactus", FloralisConfiguredFeatures.LIGHT_GRAY_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature CYAN_CACTUS = PlacementUtils.register("cyan_cactus", FloralisConfiguredFeatures.CYAN_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature PURPLE_CACTUS = PlacementUtils.register("purple_cactus", FloralisConfiguredFeatures.PURPLE_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature BLUE_CACTUS = PlacementUtils.register("blue_cactus", FloralisConfiguredFeatures.BLUE_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature BROWN_CACTUS = PlacementUtils.register("brown_cactus", FloralisConfiguredFeatures.BROWN_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature GREEN_CACTUS = PlacementUtils.register("green_cactus", FloralisConfiguredFeatures.GREEN_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature RED_CACTUS = PlacementUtils.register("red_cactus", FloralisConfiguredFeatures.RED_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));
	public static final PlacedFeature BLACK_CACTUS = PlacementUtils.register("black_cactus", FloralisConfiguredFeatures.BLACK_CACTUS.placed(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter()));

	private static RarityFilter rarityFlower() {
		return RarityFilter.onAverageOnceEvery(RARITY_FLOWER);
	}

	private static RarityFilter rarityCactus() {
		return RarityFilter.onAverageOnceEvery(RARITY_CACTUS);
	}

	private static InSquarePlacement inSquarePlacement() {
		return InSquarePlacement.spread();
	}

	private static PlacementModifier placementModifier() {
		return PlacementUtils.HEIGHTMAP;
	}

	private static BiomeFilter biomeFilter() {
		return BiomeFilter.biome();
	}
}