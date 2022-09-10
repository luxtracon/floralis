package com.luxtracon.floralis.common.world.feature;

import com.luxtracon.floralis.common.config.FloralisFeaturesConfig;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;

@MethodsReturnNonnullByDefault

public class FloralisPlacedFeatures {
	public static final int RARITY_FLOWER = FloralisFeaturesConfig.RARITY_FLOWER.get();
	public static final int RARITY_CACTUS = FloralisFeaturesConfig.RARITY_CACTUS.get();

	public static final Holder<PlacedFeature> WHITE_FLOWER = PlacementUtils.register("white_flower", FloralisConfiguredFeatures.WHITE_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> ORANGE_FLOWER = PlacementUtils.register("orange_flower", FloralisConfiguredFeatures.ORANGE_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> MAGENTA_FLOWER = PlacementUtils.register("magenta_flower", FloralisConfiguredFeatures.MAGENTA_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> LIGHT_BLUE_FLOWER = PlacementUtils.register("light_blue_flower", FloralisConfiguredFeatures.LIGHT_BLUE_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> YELLOW_FLOWER = PlacementUtils.register("yellow_flower", FloralisConfiguredFeatures.YELLOW_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> LIME_FLOWER = PlacementUtils.register("lime_flower", FloralisConfiguredFeatures.LIME_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> PINK_FLOWER = PlacementUtils.register("pink_flower", FloralisConfiguredFeatures.PINK_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> GRAY_FLOWER = PlacementUtils.register("gray_flower", FloralisConfiguredFeatures.GRAY_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> LIGHT_GRAY_FLOWER = PlacementUtils.register("light_gray_flower", FloralisConfiguredFeatures.LIGHT_GRAY_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> CYAN_FLOWER = PlacementUtils.register("cyan_flower", FloralisConfiguredFeatures.CYAN_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> PURPLE_FLOWER = PlacementUtils.register("purple_flower", FloralisConfiguredFeatures.PURPLE_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> BLUE_FLOWER = PlacementUtils.register("blue_flower", FloralisConfiguredFeatures.BLUE_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> BROWN_FLOWER = PlacementUtils.register("brown_flower", FloralisConfiguredFeatures.BROWN_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> GREEN_FLOWER = PlacementUtils.register("green_flower", FloralisConfiguredFeatures.GREEN_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> RED_FLOWER = PlacementUtils.register("red_flower", FloralisConfiguredFeatures.RED_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> BLACK_FLOWER = PlacementUtils.register("black_flower", FloralisConfiguredFeatures.BLACK_FLOWER, rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter());

	public static final Holder<PlacedFeature> WHITE_CACTUS = PlacementUtils.register("white_cactus", FloralisConfiguredFeatures.WHITE_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> ORANGE_CACTUS = PlacementUtils.register("orange_cactus", FloralisConfiguredFeatures.ORANGE_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> MAGENTA_CACTUS = PlacementUtils.register("magenta_cactus", FloralisConfiguredFeatures.MAGENTA_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> LIGHT_BLUE_CACTUS = PlacementUtils.register("light_blue_cactus", FloralisConfiguredFeatures.LIGHT_BLUE_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> YELLOW_CACTUS = PlacementUtils.register("yellow_cactus", FloralisConfiguredFeatures.YELLOW_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> LIME_CACTUS = PlacementUtils.register("lime_cactus", FloralisConfiguredFeatures.LIME_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> PINK_CACTUS = PlacementUtils.register("pink_cactus", FloralisConfiguredFeatures.PINK_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> GRAY_CACTUS = PlacementUtils.register("gray_cactus", FloralisConfiguredFeatures.GRAY_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> LIGHT_GRAY_CACTUS = PlacementUtils.register("light_gray_cactus", FloralisConfiguredFeatures.LIGHT_GRAY_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> CYAN_CACTUS = PlacementUtils.register("cyan_cactus", FloralisConfiguredFeatures.CYAN_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> PURPLE_CACTUS = PlacementUtils.register("purple_cactus", FloralisConfiguredFeatures.PURPLE_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> BLUE_CACTUS = PlacementUtils.register("blue_cactus", FloralisConfiguredFeatures.BLUE_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> BROWN_CACTUS = PlacementUtils.register("brown_cactus", FloralisConfiguredFeatures.BROWN_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> GREEN_CACTUS = PlacementUtils.register("green_cactus", FloralisConfiguredFeatures.GREEN_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> RED_CACTUS = PlacementUtils.register("red_cactus", FloralisConfiguredFeatures.RED_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());
	public static final Holder<PlacedFeature> BLACK_CACTUS = PlacementUtils.register("black_cactus", FloralisConfiguredFeatures.BLACK_CACTUS, rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter());

	public static RarityFilter rarityFlower() {
		return RarityFilter.onAverageOnceEvery(RARITY_FLOWER);
	}

	public static RarityFilter rarityCactus() {
		return RarityFilter.onAverageOnceEvery(RARITY_CACTUS);
	}

	public static InSquarePlacement inSquarePlacement() {
		return InSquarePlacement.spread();
	}

	public static PlacementModifier placementModifier() {
		return PlacementUtils.HEIGHTMAP;
	}

	public static BiomeFilter biomeFilter() {
		return BiomeFilter.biome();
	}
}
