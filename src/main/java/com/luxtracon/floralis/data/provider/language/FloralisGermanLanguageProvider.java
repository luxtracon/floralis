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

public class FloralisGermanLanguageProvider extends LanguageProvider {
	public FloralisGermanLanguageProvider(PackOutput pPackOutput, String pId, String pLanguage) {
		super(pPackOutput, pId, pLanguage);
	}

	@Override
	public void addTranslations() {
		this.add(FloralisBlocks.WHITE_DYE_BLOCK.get(), "Weißer Farbstoffblock");
		this.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), "Hellgrauer Farbstoffblock");
		this.add(FloralisBlocks.GRAY_DYE_BLOCK.get(), "Grauer Farbstoffblock");
		this.add(FloralisBlocks.BLACK_DYE_BLOCK.get(), "Schwarzer Farbstoffblock");
		this.add(FloralisBlocks.BROWN_DYE_BLOCK.get(), "Brauner Farbstoffblock");
		this.add(FloralisBlocks.RED_DYE_BLOCK.get(), "Roter Farbstoffblock");
		this.add(FloralisBlocks.ORANGE_DYE_BLOCK.get(), "Oranger Farbstoffblock");
		this.add(FloralisBlocks.YELLOW_DYE_BLOCK.get(), "Gelber Farbstoffblock");
		this.add(FloralisBlocks.LIME_DYE_BLOCK.get(), "Hellgrüner Farbstoffblock");
		this.add(FloralisBlocks.GREEN_DYE_BLOCK.get(), "Grüner Farbstoffblock");
		this.add(FloralisBlocks.CYAN_DYE_BLOCK.get(), "Türkiser Farbstoffblock");
		this.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), "Hellblauer Farbstoffblock");
		this.add(FloralisBlocks.BLUE_DYE_BLOCK.get(), "Blauer Farbstoffblock");
		this.add(FloralisBlocks.PURPLE_DYE_BLOCK.get(), "Violetter Farbstoffblock");
		this.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), "Magenta Farbstoffblock");
		this.add(FloralisBlocks.PINK_DYE_BLOCK.get(), "Rosa Farbstoffblock");
		this.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), "Pflanzenfaserblock");
		this.add(FloralisBlocks.WHITE_CACTUS.get(), "Weißer Kaktus");
		this.add(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), "Hellgrauer Kaktus");
		this.add(FloralisBlocks.GRAY_CACTUS.get(), "Grauer Kaktus");
		this.add(FloralisBlocks.BLACK_CACTUS.get(), "Schwarzer Kaktus");
		this.add(FloralisBlocks.BROWN_CACTUS.get(), "Brauner Kaktus");
		this.add(FloralisBlocks.RED_CACTUS.get(), "Roter Kaktus");
		this.add(FloralisBlocks.ORANGE_CACTUS.get(), "Oranger Kaktus");
		this.add(FloralisBlocks.YELLOW_CACTUS.get(), "Gelber Kaktus");
		this.add(FloralisBlocks.LIME_CACTUS.get(), "Hellgrüner Kaktus");
		this.add(FloralisBlocks.GREEN_CACTUS.get(), "Grüner Kaktus");
		this.add(FloralisBlocks.CYAN_CACTUS.get(), "Türkiser Kaktus");
		this.add(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), "Hellblauer Kaktus");
		this.add(FloralisBlocks.BLUE_CACTUS.get(), "Blauer Kaktus");
		this.add(FloralisBlocks.PURPLE_CACTUS.get(), "Violetter Kaktus");
		this.add(FloralisBlocks.MAGENTA_CACTUS.get(), "Magenta Kaktus");
		this.add(FloralisBlocks.PINK_CACTUS.get(), "Rosa Kaktus");
		this.add(FloralisBlocks.WHITE_FLOWER.get(), "Weiße Blume");
		this.add(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), "Hellgraue Blume");
		this.add(FloralisBlocks.GRAY_FLOWER.get(), "Graue Blume");
		this.add(FloralisBlocks.BLACK_FLOWER.get(), "Schwarze Blume");
		this.add(FloralisBlocks.BROWN_FLOWER.get(), "Braune Blume");
		this.add(FloralisBlocks.RED_FLOWER.get(), "Rote Blume");
		this.add(FloralisBlocks.ORANGE_FLOWER.get(), "Orange Blume");
		this.add(FloralisBlocks.YELLOW_FLOWER.get(), "Gelbe Blume");
		this.add(FloralisBlocks.LIME_FLOWER.get(), "Hellgrüne Blume");
		this.add(FloralisBlocks.GREEN_FLOWER.get(), "Grüne Blume");
		this.add(FloralisBlocks.CYAN_FLOWER.get(), "Türkise Blume");
		this.add(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), "Hellblaue Blume");
		this.add(FloralisBlocks.BLUE_FLOWER.get(), "Blaue Blume");
		this.add(FloralisBlocks.PURPLE_FLOWER.get(), "Violette Blume");
		this.add(FloralisBlocks.MAGENTA_FLOWER.get(), "Magenta Blume");
		this.add(FloralisBlocks.PINK_FLOWER.get(), "Rosa Blume");

		this.add(FloralisItems.WHITE_CACTUS_SEEDS.get(), "Weiße Kaktussamen");
		this.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), "Hellgraue Kaktussamen");
		this.add(FloralisItems.GRAY_CACTUS_SEEDS.get(), "Graue Kaktussamen");
		this.add(FloralisItems.BLACK_CACTUS_SEEDS.get(), "Schwarze Kaktussamen");
		this.add(FloralisItems.BROWN_CACTUS_SEEDS.get(), "Braune Kaktussamen");
		this.add(FloralisItems.RED_CACTUS_SEEDS.get(), "Rote Kaktussamen");
		this.add(FloralisItems.ORANGE_CACTUS_SEEDS.get(), "Orange Kaktussamen");
		this.add(FloralisItems.YELLOW_CACTUS_SEEDS.get(), "Gelbe Kaktussamen");
		this.add(FloralisItems.LIME_CACTUS_SEEDS.get(), "Hellgrüne Kaktussamen");
		this.add(FloralisItems.GREEN_CACTUS_SEEDS.get(), "Grüne Kaktussamen");
		this.add(FloralisItems.CYAN_CACTUS_SEEDS.get(), "Türkise Kaktussamen");
		this.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), "Hellblaue Kaktussamen");
		this.add(FloralisItems.BLUE_CACTUS_SEEDS.get(), "Blaue Kaktussamen");
		this.add(FloralisItems.PURPLE_CACTUS_SEEDS.get(), "Violette Kaktussamen");
		this.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), "Magenta Kaktussamen");
		this.add(FloralisItems.PINK_CACTUS_SEEDS.get(), "Rosa Kaktussamen");
		this.add(FloralisItems.WHITE_FLOWER_SEEDS.get(), "Weiße Blumensamen");
		this.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), "Hellgraue Blumensamen");
		this.add(FloralisItems.GRAY_FLOWER_SEEDS.get(), "Graue Blumensamen");
		this.add(FloralisItems.BLACK_FLOWER_SEEDS.get(), "Schwarze Blumensamen");
		this.add(FloralisItems.BROWN_FLOWER_SEEDS.get(), "Braune Blumensamen");
		this.add(FloralisItems.RED_FLOWER_SEEDS.get(), "Rote Blumensamen");
		this.add(FloralisItems.ORANGE_FLOWER_SEEDS.get(), "Orange Blumensamen");
		this.add(FloralisItems.YELLOW_FLOWER_SEEDS.get(), "Gelbe Blumensamen");
		this.add(FloralisItems.LIME_FLOWER_SEEDS.get(), "Hellgrüne Blumensamen");
		this.add(FloralisItems.GREEN_FLOWER_SEEDS.get(), "Grüne Blumensamen");
		this.add(FloralisItems.CYAN_FLOWER_SEEDS.get(), "Türkise Blumensamen");
		this.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), "Hellblaue Blumensamen");
		this.add(FloralisItems.BLUE_FLOWER_SEEDS.get(), "Blaue Blumensamen");
		this.add(FloralisItems.PURPLE_FLOWER_SEEDS.get(), "Violette Blumensamen");
		this.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), "Magenta Blumensamen");
		this.add(FloralisItems.PINK_FLOWER_SEEDS.get(), "Rosa Blumensamen");
		this.add(FloralisItems.WHITE_PETALS.get(), "Weiße Blütenblätter");
		this.add(FloralisItems.LIGHT_GRAY_PETALS.get(), "Hellgraue Blütenblätter");
		this.add(FloralisItems.GRAY_PETALS.get(), "Graue Blütenblätter");
		this.add(FloralisItems.BLACK_PETALS.get(), "Schwarze Blütenblätter");
		this.add(FloralisItems.BROWN_PETALS.get(), "Braune Blütenblätter");
		this.add(FloralisItems.RED_PETALS.get(), "Rote Blütenblätter");
		this.add(FloralisItems.ORANGE_PETALS.get(), "Orange Blütenblätter");
		this.add(FloralisItems.YELLOW_PETALS.get(), "Gelbe Blütenblätter");
		this.add(FloralisItems.LIME_PETALS.get(), "Hellgrüne Blütenblätter");
		this.add(FloralisItems.GREEN_PETALS.get(), "Grüne Blütenblätter");
		this.add(FloralisItems.CYAN_PETALS.get(), "Türkise Blütenblätter");
		this.add(FloralisItems.LIGHT_BLUE_PETALS.get(), "Hellblaue Blütenblätter");
		this.add(FloralisItems.BLUE_PETALS.get(), "Blaue Blütenblätter");
		this.add(FloralisItems.PURPLE_PETALS.get(), "Violette Blütenblätter");
		this.add(FloralisItems.MAGENTA_PETALS.get(), "Magenta Blütenblätter");
		this.add(FloralisItems.PINK_PETALS.get(), "Rosa Blütenblätter");
		this.add(FloralisItems.PLANT_FIBERS.get(), "Pflanzenfasern");

		this.add(FloralisBiomeTagsProvider.HAS_CACTUS, "Hat Kaktus");

		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_DYE, "Farbstoffspeicherblock");
		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Pflanzenfaserspeicherblock");

		this.add(FloralisItemTagsProvider.SEEDS_CACTUS, "Blumensamen");
		this.add(FloralisItemTagsProvider.SEEDS_FLOWER, "Kaktussamen");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_DYE, "Farbstoffspeicherblock");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Pflanzenfaserspeicherblock");

		this.add("tab" + "." + FloralisConstants.FLORALIS + "." + "item_group", "Floralis");

		this.add("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers", "Genutzt wie Knochenmehl oder Dünger");
	}

	@Override
	public String getName() {
		return "German";
	}
}
