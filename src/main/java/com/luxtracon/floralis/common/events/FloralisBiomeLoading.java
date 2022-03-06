package com.luxtracon.floralis.common.events;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.world.feature.FloralisPlacedFeatures;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Floralis.MODID)
public class FloralisBiomeLoading {
	@SubscribeEvent
	public static void onBiomeLoading(BiomeLoadingEvent event) {
		BiomeGenerationSettingsBuilder getGeneration = event.getGeneration();
		if(!event.getCategory().equals(BiomeCategory.DESERT)) {
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.WHITE_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.ORANGE_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.MAGENTA_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.LIGHT_BLUE_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.YELLOW_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.LIME_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.PINK_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.GRAY_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.LIGHT_GRAY_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.CYAN_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.PURPLE_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.BLUE_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.BROWN_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.GREEN_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.RED_FLOWER);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.BLACK_FLOWER);
		} else {
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.WHITE_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.ORANGE_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.MAGENTA_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.LIGHT_BLUE_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.YELLOW_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.LIME_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.PINK_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.GRAY_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.LIGHT_GRAY_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.CYAN_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.PURPLE_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.BLUE_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.BROWN_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.GREEN_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.RED_CACTUS);
			getGeneration.addFeature(Decoration.VEGETAL_DECORATION, FloralisPlacedFeatures.BLACK_CACTUS);
		}
	}
}
