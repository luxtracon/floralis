package com.luxtracon.floralis.data;

import com.luxtracon.floralis.data.features.FloralisPlacedFeatures;
import com.luxtracon.floralis.data.tags.FloralisBiomeTags;
import com.luxtracon.floralis.registry.FloralisConstants;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class FloralisBiomeModifiers {
	public static final ResourceKey<BiomeModifier> WHITE_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "white_flower"));
	public static final ResourceKey<BiomeModifier> LIGHT_GRAY_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "light_gray_flower"));
	public static final ResourceKey<BiomeModifier> GRAY_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "gray_flower"));
	public static final ResourceKey<BiomeModifier> BLACK_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "black_flower"));
	public static final ResourceKey<BiomeModifier> BROWN_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "brown_flower"));
	public static final ResourceKey<BiomeModifier> RED_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "red_flower"));
	public static final ResourceKey<BiomeModifier> ORANGE_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "orange_flower"));
	public static final ResourceKey<BiomeModifier> YELLOW_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "yellow_flower"));
	public static final ResourceKey<BiomeModifier> LIME_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "lime_flower"));
	public static final ResourceKey<BiomeModifier> GREEN_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "green_flower"));
	public static final ResourceKey<BiomeModifier> CYAN_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "cyan_flower"));
	public static final ResourceKey<BiomeModifier> LIGHT_BLUE_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "light_blue_flower"));
	public static final ResourceKey<BiomeModifier> BLUE_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "blue_flower"));
	public static final ResourceKey<BiomeModifier> PURPLE_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "purple_flower"));
	public static final ResourceKey<BiomeModifier> MAGENTA_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "magenta_flower"));
	public static final ResourceKey<BiomeModifier> PINK_FLOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "pink_flower"));

	public static final ResourceKey<BiomeModifier> WHITE_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "white_cactus"));
	public static final ResourceKey<BiomeModifier> LIGHT_GRAY_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "light_gray_cactus"));
	public static final ResourceKey<BiomeModifier> GRAY_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "gray_cactus"));
	public static final ResourceKey<BiomeModifier> BLACK_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "black_cactus"));
	public static final ResourceKey<BiomeModifier> BROWN_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "brown_cactus"));
	public static final ResourceKey<BiomeModifier> RED_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "red_cactus"));
	public static final ResourceKey<BiomeModifier> ORANGE_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "orange_cactus"));
	public static final ResourceKey<BiomeModifier> YELLOW_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "yellow_cactus"));
	public static final ResourceKey<BiomeModifier> LIME_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "lime_cactus"));
	public static final ResourceKey<BiomeModifier> GREEN_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "green_cactus"));
	public static final ResourceKey<BiomeModifier> CYAN_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "cyan_cactus"));
	public static final ResourceKey<BiomeModifier> LIGHT_BLUE_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "light_blue_cactus"));
	public static final ResourceKey<BiomeModifier> BLUE_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "blue_cactus"));
	public static final ResourceKey<BiomeModifier> PURPLE_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "purple_cactus"));
	public static final ResourceKey<BiomeModifier> MAGENTA_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "magenta_cactus"));
	public static final ResourceKey<BiomeModifier> PINK_CACTUS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(FloralisConstants.FLORALIS, "pink_cactus"));

	public static void bootstrap(BootstrapContext<BiomeModifier> pContext) {
		var biomes = pContext.lookup(Registries.BIOME);
		var features = pContext.lookup(Registries.PLACED_FEATURE);

		pContext.register(FloralisBiomeModifiers.WHITE_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.WHITE_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.LIGHT_GRAY_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.LIGHT_GRAY_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.GRAY_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.GRAY_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.BLACK_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.BLACK_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.BROWN_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.BROWN_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.RED_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.RED_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.ORANGE_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.ORANGE_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.YELLOW_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.YELLOW_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.LIME_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.LIME_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.GREEN_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.GREEN_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.CYAN_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.CYAN_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.LIGHT_BLUE_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.LIGHT_BLUE_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.BLUE_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.BLUE_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.PURPLE_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.PURPLE_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.MAGENTA_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.MAGENTA_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.PINK_FLOWER, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.PINK_FLOWER)), GenerationStep.Decoration.VEGETAL_DECORATION));

		pContext.register(FloralisBiomeModifiers.WHITE_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.WHITE_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.LIGHT_GRAY_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.LIGHT_GRAY_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.GRAY_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.GRAY_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.BLACK_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.BLACK_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.BROWN_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.BROWN_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.RED_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.RED_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.ORANGE_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.ORANGE_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.YELLOW_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.YELLOW_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.LIME_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.LIME_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.GREEN_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.GREEN_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.CYAN_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.CYAN_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.LIGHT_BLUE_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.LIGHT_BLUE_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.BLUE_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.BLUE_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.PURPLE_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.PURPLE_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.MAGENTA_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.MAGENTA_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pContext.register(FloralisBiomeModifiers.PINK_CACTUS, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(FloralisBiomeTags.HAS_CACTUS), HolderSet.direct(features.getOrThrow(FloralisPlacedFeatures.PINK_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
	}
}
