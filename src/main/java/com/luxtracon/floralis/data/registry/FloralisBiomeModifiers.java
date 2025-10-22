package com.luxtracon.floralis.data.registry;

import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.data.provider.tags.FloralisBiomeTagsProvider;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
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

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBiomeModifiers {
	public static final ResourceKey<BiomeModifier> WHITE_CACTUS_CROP = FloralisBiomeModifiers.createKey("white_cactus_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_GRAY_CACTUS_CROP = FloralisBiomeModifiers.createKey("light_gray_cactus_crop");
	public static final ResourceKey<BiomeModifier> GRAY_CACTUS_CROP = FloralisBiomeModifiers.createKey("gray_cactus_crop");
	public static final ResourceKey<BiomeModifier> BLACK_CACTUS_CROP = FloralisBiomeModifiers.createKey("black_cactus_crop");
	public static final ResourceKey<BiomeModifier> BROWN_CACTUS_CROP = FloralisBiomeModifiers.createKey("brown_cactus_crop");
	public static final ResourceKey<BiomeModifier> RED_CACTUS_CROP = FloralisBiomeModifiers.createKey("red_cactus_crop");
	public static final ResourceKey<BiomeModifier> ORANGE_CACTUS_CROP = FloralisBiomeModifiers.createKey("orange_cactus_crop");
	public static final ResourceKey<BiomeModifier> YELLOW_CACTUS_CROP = FloralisBiomeModifiers.createKey("yellow_cactus_crop");
	public static final ResourceKey<BiomeModifier> LIME_CACTUS_CROP = FloralisBiomeModifiers.createKey("lime_cactus_crop");
	public static final ResourceKey<BiomeModifier> GREEN_CACTUS_CROP = FloralisBiomeModifiers.createKey("green_cactus_crop");
	public static final ResourceKey<BiomeModifier> CYAN_CACTUS_CROP = FloralisBiomeModifiers.createKey("cyan_cactus_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_BLUE_CACTUS_CROP = FloralisBiomeModifiers.createKey("light_blue_cactus_crop");
	public static final ResourceKey<BiomeModifier> BLUE_CACTUS_CROP = FloralisBiomeModifiers.createKey("blue_cactus_crop");
	public static final ResourceKey<BiomeModifier> PURPLE_CACTUS_CROP = FloralisBiomeModifiers.createKey("purple_cactus_crop");
	public static final ResourceKey<BiomeModifier> MAGENTA_CACTUS_CROP = FloralisBiomeModifiers.createKey("magenta_cactus_crop");
	public static final ResourceKey<BiomeModifier> PINK_CACTUS_CROP = FloralisBiomeModifiers.createKey("pink_cactus_crop");

	public static final ResourceKey<BiomeModifier> WHITE_FLOWER_CROP = FloralisBiomeModifiers.createKey("white_flower_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_GRAY_FLOWER_CROP = FloralisBiomeModifiers.createKey("light_gray_flower_crop");
	public static final ResourceKey<BiomeModifier> GRAY_FLOWER_CROP = FloralisBiomeModifiers.createKey("gray_flower_crop");
	public static final ResourceKey<BiomeModifier> BLACK_FLOWER_CROP = FloralisBiomeModifiers.createKey("black_flower_crop");
	public static final ResourceKey<BiomeModifier> BROWN_FLOWER_CROP = FloralisBiomeModifiers.createKey("brown_flower_crop");
	public static final ResourceKey<BiomeModifier> RED_FLOWER_CROP = FloralisBiomeModifiers.createKey("red_flower_crop");
	public static final ResourceKey<BiomeModifier> ORANGE_FLOWER_CROP = FloralisBiomeModifiers.createKey("orange_flower_crop");
	public static final ResourceKey<BiomeModifier> YELLOW_FLOWER_CROP = FloralisBiomeModifiers.createKey("yellow_flower_crop");
	public static final ResourceKey<BiomeModifier> LIME_FLOWER_CROP = FloralisBiomeModifiers.createKey("lime_flower_crop");
	public static final ResourceKey<BiomeModifier> GREEN_FLOWER_CROP = FloralisBiomeModifiers.createKey("green_flower_crop");
	public static final ResourceKey<BiomeModifier> CYAN_FLOWER_CROP = FloralisBiomeModifiers.createKey("cyan_flower_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_BLUE_FLOWER_CROP = FloralisBiomeModifiers.createKey("light_blue_flower_crop");
	public static final ResourceKey<BiomeModifier> BLUE_FLOWER_CROP = FloralisBiomeModifiers.createKey("blue_flower_crop");
	public static final ResourceKey<BiomeModifier> PURPLE_FLOWER_CROP = FloralisBiomeModifiers.createKey("purple_flower_crop");
	public static final ResourceKey<BiomeModifier> MAGENTA_FLOWER_CROP = FloralisBiomeModifiers.createKey("magenta_flower_crop");
	public static final ResourceKey<BiomeModifier> PINK_FLOWER_CROP = FloralisBiomeModifiers.createKey("pink_flower_crop");

	public static void bootstrap(BootstrapContext<BiomeModifier> pBootstrapContext) {
		pBootstrapContext.register(FloralisBiomeModifiers.WHITE_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.WHITE_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.LIGHT_GRAY_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.LIGHT_GRAY_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.GRAY_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.GRAY_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.BLACK_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.BLACK_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.BROWN_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.BROWN_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.RED_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.RED_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.ORANGE_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.ORANGE_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.YELLOW_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.YELLOW_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.LIME_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.LIME_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.GREEN_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.GREEN_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.CYAN_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.CYAN_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.LIGHT_BLUE_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.LIGHT_BLUE_CACTUS)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.BLUE_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.BLUE_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.PURPLE_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.PURPLE_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.MAGENTA_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.MAGENTA_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.PINK_CACTUS_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(FloralisBiomeTagsProvider.HAS_CACTUS), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.PINK_CACTUS_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));

		pBootstrapContext.register(FloralisBiomeModifiers.WHITE_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.WHITE_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.LIGHT_GRAY_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.LIGHT_GRAY_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.GRAY_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.GRAY_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.BLACK_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.BLACK_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.BROWN_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.BROWN_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.RED_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.RED_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.ORANGE_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.ORANGE_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.YELLOW_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.YELLOW_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.LIME_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.LIME_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.GREEN_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.GREEN_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.CYAN_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.CYAN_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.LIGHT_BLUE_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.LIGHT_BLUE_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.BLUE_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.BLUE_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.PURPLE_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.PURPLE_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.MAGENTA_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.MAGENTA_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
		pBootstrapContext.register(FloralisBiomeModifiers.PINK_FLOWER_CROP, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(FloralisPlacedFeatures.PINK_FLOWER_CROP)), GenerationStep.Decoration.VEGETAL_DECORATION));
	}

	public static ResourceKey<BiomeModifier> createKey(String pName) {
		return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(FloralisConstants.FLORALIS, pName));
	}
}
