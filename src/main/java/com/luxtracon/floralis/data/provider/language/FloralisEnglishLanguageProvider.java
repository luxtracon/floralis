package com.luxtracon.floralis.data.provider.language;

import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.data.provider.tags.FloralisBiomeTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisBlockTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisItemTagsProvider;

import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.common.data.LanguageProvider;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisEnglishLanguageProvider extends LanguageProvider {
	public FloralisEnglishLanguageProvider(PackOutput pPackOutput, String pId, String pLanguage) {
		super(pPackOutput, pId, pLanguage);
	}

	@Override
	public void addTranslations() {
		this.add(FloralisBlocks.WHITE_DYE_BLOCK.get(), "White Dye Block");
		this.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), "Light Gray Dye Block");
		this.add(FloralisBlocks.GRAY_DYE_BLOCK.get(), "Gray Dye Block");
		this.add(FloralisBlocks.BLACK_DYE_BLOCK.get(), "Black Dye Block");
		this.add(FloralisBlocks.BROWN_DYE_BLOCK.get(), "Brown Dye Block");
		this.add(FloralisBlocks.RED_DYE_BLOCK.get(), "Red Dye Block");
		this.add(FloralisBlocks.ORANGE_DYE_BLOCK.get(), "Orange Dye Block");
		this.add(FloralisBlocks.YELLOW_DYE_BLOCK.get(), "Yellow Dye Block");
		this.add(FloralisBlocks.LIME_DYE_BLOCK.get(), "Lime Dye Block");
		this.add(FloralisBlocks.GREEN_DYE_BLOCK.get(), "Green Dye Block");
		this.add(FloralisBlocks.CYAN_DYE_BLOCK.get(), "Cyan Dye Block");
		this.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), "Light Blue Dye Block");
		this.add(FloralisBlocks.BLUE_DYE_BLOCK.get(), "Blue Dye Block");
		this.add(FloralisBlocks.PURPLE_DYE_BLOCK.get(), "Purple Dye Block");
		this.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), "Magenta Dye Block");
		this.add(FloralisBlocks.PINK_DYE_BLOCK.get(), "Pink Dye Block");
		this.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), "Plant Fibers Block");
		this.add(FloralisBlocks.WHITE_CACTUS.get(), "White Cactus");
		this.add(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), "Light Gray Cactus");
		this.add(FloralisBlocks.GRAY_CACTUS.get(), "Gray Cactus");
		this.add(FloralisBlocks.BLACK_CACTUS.get(), "Black Cactus");
		this.add(FloralisBlocks.BROWN_CACTUS.get(), "Brown Cactus");
		this.add(FloralisBlocks.RED_CACTUS.get(), "Red Cactus");
		this.add(FloralisBlocks.ORANGE_CACTUS.get(), "Orange Cactus");
		this.add(FloralisBlocks.YELLOW_CACTUS.get(), "Yellow Cactus");
		this.add(FloralisBlocks.LIME_CACTUS.get(), "Lime Cactus");
		this.add(FloralisBlocks.GREEN_CACTUS.get(), "Green Cactus");
		this.add(FloralisBlocks.CYAN_CACTUS.get(), "Cyan Cactus");
		this.add(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), "Light Blue Cactus");
		this.add(FloralisBlocks.BLUE_CACTUS.get(), "Blue Cactus");
		this.add(FloralisBlocks.PURPLE_CACTUS.get(), "Purple Cactus");
		this.add(FloralisBlocks.MAGENTA_CACTUS.get(), "Magenta Cactus");
		this.add(FloralisBlocks.PINK_CACTUS.get(), "Pink Cactus");
		this.add(FloralisBlocks.WHITE_FLOWER.get(), "White Flower");
		this.add(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), "Light Gray Flower");
		this.add(FloralisBlocks.GRAY_FLOWER.get(), "Gray Flower");
		this.add(FloralisBlocks.BLACK_FLOWER.get(), "Black Flower");
		this.add(FloralisBlocks.BROWN_FLOWER.get(), "Brown Flower");
		this.add(FloralisBlocks.RED_FLOWER.get(), "Red Flower");
		this.add(FloralisBlocks.ORANGE_FLOWER.get(), "Orange Flower");
		this.add(FloralisBlocks.YELLOW_FLOWER.get(), "Yellow Flower");
		this.add(FloralisBlocks.LIME_FLOWER.get(), "Lime Flower");
		this.add(FloralisBlocks.GREEN_FLOWER.get(), "Green Flower");
		this.add(FloralisBlocks.CYAN_FLOWER.get(), "Cyan Flower");
		this.add(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), "Light Blue Flower");
		this.add(FloralisBlocks.BLUE_FLOWER.get(), "Blue Flower");
		this.add(FloralisBlocks.PURPLE_FLOWER.get(), "Purple Flower");
		this.add(FloralisBlocks.MAGENTA_FLOWER.get(), "Magenta Flower");
		this.add(FloralisBlocks.PINK_FLOWER.get(), "Pink Flower");

		this.add(FloralisItems.WHITE_CACTUS_SEEDS.get(), "White Cactus Seeds");
		this.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), "Light Gray Cactus Seeds");
		this.add(FloralisItems.GRAY_CACTUS_SEEDS.get(), "Gray Cactus Seeds");
		this.add(FloralisItems.BLACK_CACTUS_SEEDS.get(), "Black Cactus Seeds");
		this.add(FloralisItems.BROWN_CACTUS_SEEDS.get(), "Brown Cactus Seeds");
		this.add(FloralisItems.RED_CACTUS_SEEDS.get(), "Red Cactus Seeds");
		this.add(FloralisItems.ORANGE_CACTUS_SEEDS.get(), "Orange Cactus Seeds");
		this.add(FloralisItems.YELLOW_CACTUS_SEEDS.get(), "Yellow Cactus Seeds");
		this.add(FloralisItems.LIME_CACTUS_SEEDS.get(), "Lime Cactus Seeds");
		this.add(FloralisItems.GREEN_CACTUS_SEEDS.get(), "Green Cactus Seeds");
		this.add(FloralisItems.CYAN_CACTUS_SEEDS.get(), "Cyan Cactus Seeds");
		this.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), "Light Blue Cactus Seeds");
		this.add(FloralisItems.BLUE_CACTUS_SEEDS.get(), "Blue Cactus Seeds");
		this.add(FloralisItems.PURPLE_CACTUS_SEEDS.get(), "Purple Cactus Seeds");
		this.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), "Magenta Cactus Seeds");
		this.add(FloralisItems.PINK_CACTUS_SEEDS.get(), "Pink Cactus Seeds");
		this.add(FloralisItems.WHITE_FLOWER_SEEDS.get(), "White Flower Seeds");
		this.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), "Light Gray Flower Seeds");
		this.add(FloralisItems.GRAY_FLOWER_SEEDS.get(), "Gray Flower Seeds");
		this.add(FloralisItems.BLACK_FLOWER_SEEDS.get(), "Black Flower Seeds");
		this.add(FloralisItems.BROWN_FLOWER_SEEDS.get(), "Brown Flower Seeds");
		this.add(FloralisItems.RED_FLOWER_SEEDS.get(), "Red Flower Seeds");
		this.add(FloralisItems.ORANGE_FLOWER_SEEDS.get(), "Orange Flower Seeds");
		this.add(FloralisItems.YELLOW_FLOWER_SEEDS.get(), "Yellow Flower Seeds");
		this.add(FloralisItems.LIME_FLOWER_SEEDS.get(), "Lime Flower Seeds");
		this.add(FloralisItems.GREEN_FLOWER_SEEDS.get(), "Green Flower Seeds");
		this.add(FloralisItems.CYAN_FLOWER_SEEDS.get(), "Cyan Flower Seeds");
		this.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), "Light Blue Flower Seeds");
		this.add(FloralisItems.BLUE_FLOWER_SEEDS.get(), "Blue Flower Seeds");
		this.add(FloralisItems.PURPLE_FLOWER_SEEDS.get(), "Purple Flower Seeds");
		this.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), "Magenta Flower Seeds");
		this.add(FloralisItems.PINK_FLOWER_SEEDS.get(), "Pink Flower Seeds");
		this.add(FloralisItems.WHITE_PETALS.get(), "White Petals");
		this.add(FloralisItems.LIGHT_GRAY_PETALS.get(), "Light Gray Petals");
		this.add(FloralisItems.GRAY_PETALS.get(), "Gray Petals");
		this.add(FloralisItems.BLACK_PETALS.get(), "Black Petals");
		this.add(FloralisItems.BROWN_PETALS.get(), "Brown Petals");
		this.add(FloralisItems.RED_PETALS.get(), "Red Petals");
		this.add(FloralisItems.ORANGE_PETALS.get(), "Orange Petals");
		this.add(FloralisItems.YELLOW_PETALS.get(), "Yellow Petals");
		this.add(FloralisItems.LIME_PETALS.get(), "Lime Petals");
		this.add(FloralisItems.GREEN_PETALS.get(), "Green Petals");
		this.add(FloralisItems.CYAN_PETALS.get(), "Cyan Petals");
		this.add(FloralisItems.LIGHT_BLUE_PETALS.get(), "Light Blue Petals");
		this.add(FloralisItems.BLUE_PETALS.get(), "Blue Petals");
		this.add(FloralisItems.PURPLE_PETALS.get(), "Purple Petals");
		this.add(FloralisItems.MAGENTA_PETALS.get(), "Magenta Petals");
		this.add(FloralisItems.PINK_PETALS.get(), "Pink Petals");
		this.add(FloralisItems.PLANT_FIBERS.get(), "Plant Fibers");

		this.add(FloralisBiomeTagsProvider.HAS_CACTUS, "Has Cactus");
		this.add(FloralisBiomeTagsProvider.HAS_FLOWER, "Has Flower");

		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add(FloralisItemTagsProvider.SEEDS_CACTUS, "Cactus Seeds");
		this.add(FloralisItemTagsProvider.SEEDS_FLOWER, "Flower Seeds");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add("tab" + "." + FloralisConstants.FLORALIS + "." + "item_group", "Floralis");

		this.add("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers", "Used like Bone Meal or Fertilizer");
	}

	@Override
	public String getName() {
		return "English";
	}
}
