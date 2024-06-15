package com.luxtracon.floralis.events;

import com.luxtracon.floralis.data.FloralisBuiltinEntries;
import com.luxtracon.floralis.data.FloralisDataMaps;
import com.luxtracon.floralis.data.FloralisRecipes;
import com.luxtracon.floralis.data.FloralisRegistrySetBuilder;
import com.luxtracon.floralis.data.loot.FloralisLoot;
import com.luxtracon.floralis.data.tags.FloralisBiomeTags;
import com.luxtracon.floralis.data.tags.FloralisBlockTags;
import com.luxtracon.floralis.data.tags.FloralisItemTags;
import com.luxtracon.floralis.registry.FloralisConstants;
import com.luxtracon.floralis.registry.FloralisCreativeModeTabs;
import com.luxtracon.floralis.registry.FloralisItems;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("unused")

@ParametersAreNonnullByDefault

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = FloralisConstants.FLORALIS)
public class CommonModEvents {

	@SubscribeEvent
	public static void onCreativeModeTabRegister(BuildCreativeModeTabContentsEvent pEvent) {
		if (pEvent.getTab().equals(FloralisCreativeModeTabs.FLORALIS.get())) {
			pEvent.accept(FloralisItems.WHITE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.GRAY_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.BLACK_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.BROWN_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.RED_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.ORANGE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.YELLOW_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.LIME_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.GREEN_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.CYAN_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.BLUE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.PURPLE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.MAGENTA_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.PINK_DYE_BLOCK.get());

			pEvent.accept(FloralisItems.PLANT_FIBERS_BLOCK.get());

			pEvent.accept(FloralisItems.WHITE_FLOWER.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_FLOWER.get());
			pEvent.accept(FloralisItems.GRAY_FLOWER.get());
			pEvent.accept(FloralisItems.BLACK_FLOWER.get());
			pEvent.accept(FloralisItems.BROWN_FLOWER.get());
			pEvent.accept(FloralisItems.RED_FLOWER.get());
			pEvent.accept(FloralisItems.ORANGE_FLOWER.get());
			pEvent.accept(FloralisItems.YELLOW_FLOWER.get());
			pEvent.accept(FloralisItems.LIME_FLOWER.get());
			pEvent.accept(FloralisItems.GREEN_FLOWER.get());
			pEvent.accept(FloralisItems.CYAN_FLOWER.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_FLOWER.get());
			pEvent.accept(FloralisItems.BLUE_FLOWER.get());
			pEvent.accept(FloralisItems.PURPLE_FLOWER.get());
			pEvent.accept(FloralisItems.MAGENTA_FLOWER.get());
			pEvent.accept(FloralisItems.PINK_FLOWER.get());

			pEvent.accept(FloralisItems.WHITE_CACTUS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_CACTUS.get());
			pEvent.accept(FloralisItems.GRAY_CACTUS.get());
			pEvent.accept(FloralisItems.BLACK_CACTUS.get());
			pEvent.accept(FloralisItems.BROWN_CACTUS.get());
			pEvent.accept(FloralisItems.RED_CACTUS.get());
			pEvent.accept(FloralisItems.ORANGE_CACTUS.get());
			pEvent.accept(FloralisItems.YELLOW_CACTUS.get());
			pEvent.accept(FloralisItems.LIME_CACTUS.get());
			pEvent.accept(FloralisItems.GREEN_CACTUS.get());
			pEvent.accept(FloralisItems.CYAN_CACTUS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_CACTUS.get());
			pEvent.accept(FloralisItems.BLUE_CACTUS.get());
			pEvent.accept(FloralisItems.PURPLE_CACTUS.get());
			pEvent.accept(FloralisItems.MAGENTA_CACTUS.get());
			pEvent.accept(FloralisItems.PINK_CACTUS.get());

			pEvent.accept(FloralisItems.WHITE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.GRAY_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.BLACK_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.BROWN_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.RED_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.ORANGE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.YELLOW_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.LIME_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.GREEN_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.CYAN_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.BLUE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.PURPLE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.MAGENTA_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.PINK_FLOWER_SEEDS.get());

			pEvent.accept(FloralisItems.WHITE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.GRAY_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.BLACK_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.BROWN_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.RED_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.ORANGE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.YELLOW_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.LIME_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.GREEN_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.CYAN_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.BLUE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.PURPLE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.MAGENTA_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.PINK_CACTUS_SEEDS.get());

			pEvent.accept(FloralisItems.WHITE_PETALS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_PETALS.get());
			pEvent.accept(FloralisItems.GRAY_PETALS.get());
			pEvent.accept(FloralisItems.BLACK_PETALS.get());
			pEvent.accept(FloralisItems.BROWN_PETALS.get());
			pEvent.accept(FloralisItems.RED_PETALS.get());
			pEvent.accept(FloralisItems.ORANGE_PETALS.get());
			pEvent.accept(FloralisItems.YELLOW_PETALS.get());
			pEvent.accept(FloralisItems.LIME_PETALS.get());
			pEvent.accept(FloralisItems.GREEN_PETALS.get());
			pEvent.accept(FloralisItems.CYAN_PETALS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_PETALS.get());
			pEvent.accept(FloralisItems.BLUE_PETALS.get());
			pEvent.accept(FloralisItems.PURPLE_PETALS.get());
			pEvent.accept(FloralisItems.MAGENTA_PETALS.get());
			pEvent.accept(FloralisItems.PINK_PETALS.get());

			pEvent.accept(FloralisItems.PLANT_FIBERS.get());
		}
	}

	@SubscribeEvent
	public static void onGatherData(GatherDataEvent pEvent) {
		var generator = pEvent.getGenerator();
		var existingFileHelper = pEvent.getExistingFileHelper();
		var packOutput = generator.getPackOutput();
		var lookupProvider = pEvent.getLookupProvider();

		var blockTags = new FloralisBlockTags(packOutput, lookupProvider, FloralisConstants.FLORALIS, existingFileHelper);
		var registrySet = new FloralisRegistrySetBuilder();

		generator.addProvider(pEvent.includeServer(), new FloralisLoot(packOutput, lookupProvider));
		generator.addProvider(pEvent.includeServer(), new FloralisBiomeTags(packOutput, lookupProvider, FloralisConstants.FLORALIS, existingFileHelper));
		generator.addProvider(pEvent.includeServer(), blockTags);
		generator.addProvider(pEvent.includeServer(), new FloralisItemTags(packOutput, lookupProvider, blockTags.contentsGetter(), FloralisConstants.FLORALIS, existingFileHelper));
		generator.addProvider(pEvent.includeServer(), new FloralisDataMaps(packOutput, lookupProvider));
		generator.addProvider(pEvent.includeServer(), new FloralisRecipes(packOutput, lookupProvider));
		generator.addProvider(pEvent.includeServer(), new FloralisBuiltinEntries(packOutput, lookupProvider, registrySet, FloralisConstants.FLORALIS));
	}
}
