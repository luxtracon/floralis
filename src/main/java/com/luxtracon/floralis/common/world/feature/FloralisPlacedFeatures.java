package com.luxtracon.floralis.common.world.feature;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.config.FloralisFeaturesConfig;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@SuppressWarnings("unchecked, unused")
@MethodsReturnNonnullByDefault

public class FloralisPlacedFeatures {
	private static final int RARITY_FLOWER = FloralisFeaturesConfig.RARITY_FLOWER.get();
	private static final int RARITY_CACTUS = FloralisFeaturesConfig.RARITY_CACTUS.get();

	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Floralis.MODID);

	public static final RegistryObject<PlacedFeature> WHITE_FLOWER = PLACED_FEATURES.register("white_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.WHITE_FLOWER, List.of(rarityFlower(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> ORANGE_FLOWER = PLACED_FEATURES.register("orange_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.ORANGE_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> MAGENTA_FLOWER = PLACED_FEATURES.register("magenta_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.MAGENTA_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> LIGHT_BLUE_FLOWER = PLACED_FEATURES.register("light_blue_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.LIGHT_BLUE_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> YELLOW_FLOWER = PLACED_FEATURES.register("yellow_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.YELLOW_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> LIME_FLOWER = PLACED_FEATURES.register("lime_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.LIME_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> PINK_FLOWER = PLACED_FEATURES.register("pink_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.PINK_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> GRAY_FLOWER = PLACED_FEATURES.register("gray_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.GRAY_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> LIGHT_GRAY_FLOWER = PLACED_FEATURES.register("light_gray_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.LIGHT_GRAY_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> CYAN_FLOWER = PLACED_FEATURES.register("cyan_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.CYAN_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> PURPLE_FLOWER = PLACED_FEATURES.register("purple_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.PURPLE_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> BLUE_FLOWER = PLACED_FEATURES.register("blue_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.BLUE_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> BROWN_FLOWER = PLACED_FEATURES.register("brown_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.BROWN_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> GREEN_FLOWER = PLACED_FEATURES.register("green_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.GREEN_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> RED_FLOWER = PLACED_FEATURES.register("red_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.RED_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> BLACK_FLOWER = PLACED_FEATURES.register("black_flower", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.BLACK_FLOWER, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));

	public static final RegistryObject<PlacedFeature> WHITE_CACTUS = PLACED_FEATURES.register("white_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.WHITE_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> ORANGE_CACTUS = PLACED_FEATURES.register("orange_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.ORANGE_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> MAGENTA_CACTUS = PLACED_FEATURES.register("magenta_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.MAGENTA_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> LIGHT_BLUE_CACTUS = PLACED_FEATURES.register("light_blue_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.LIGHT_BLUE_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> YELLOW_CACTUS = PLACED_FEATURES.register("yellow_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.YELLOW_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> LIME_CACTUS = PLACED_FEATURES.register("lime_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.LIME_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> PINK_CACTUS = PLACED_FEATURES.register("pink_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.PINK_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> GRAY_CACTUS = PLACED_FEATURES.register("gray_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.GRAY_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> LIGHT_GRAY_CACTUS = PLACED_FEATURES.register("light_gray_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.LIGHT_GRAY_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> CYAN_CACTUS = PLACED_FEATURES.register("cyan_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.CYAN_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> PURPLE_CACTUS = PLACED_FEATURES.register("purple_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.PURPLE_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> BLUE_CACTUS = PLACED_FEATURES.register("blue_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.BLUE_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> BROWN_CACTUS = PLACED_FEATURES.register("brown_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.BROWN_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> GREEN_CACTUS = PLACED_FEATURES.register("green_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.GREEN_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> RED_CACTUS = PLACED_FEATURES.register("red_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.RED_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));
	public static final RegistryObject<PlacedFeature> BLACK_CACTUS = PLACED_FEATURES.register("black_cactus", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) FloralisConfiguredFeatures.BLACK_CACTUS, List.of(rarityCactus(), inSquarePlacement(), placementModifier(), biomeFilter())));

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

	public static void register(IEventBus bus) {
		PLACED_FEATURES.register(bus);
	}
}
