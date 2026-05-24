package com.luxtracon.floralis.data.provider;

import com.luxtracon.floralis.common.registry.FloralisItems;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisDataMapProvider extends DataMapProvider {
	public FloralisDataMapProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
		super(pPackOutput, pProvider);
	}

	@Override
	public void gather(HolderLookup.Provider pProvider) {
		this.compostables(FloralisItems.PLANT_FIBERS_BLOCK.get(), 0.85F);
		this.compostables(FloralisItems.WHITE_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.LIGHT_GRAY_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.GRAY_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.BLACK_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.BROWN_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.RED_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.ORANGE_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.YELLOW_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.LIME_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.GREEN_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.CYAN_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.LIGHT_BLUE_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.BLUE_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.PURPLE_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.MAGENTA_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.PINK_CACTUS.get(), 0.65F);
		this.compostables(FloralisItems.WHITE_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.LIGHT_GRAY_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.GRAY_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.BLACK_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.BROWN_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.RED_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.ORANGE_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.YELLOW_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.LIME_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.GREEN_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.CYAN_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.LIGHT_BLUE_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.BLUE_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.PURPLE_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.MAGENTA_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.PINK_FLOWER.get(), 0.65F);
		this.compostables(FloralisItems.WHITE_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.GRAY_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.BLACK_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.BROWN_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.RED_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.ORANGE_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.YELLOW_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.LIME_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.GREEN_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.CYAN_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.BLUE_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.PURPLE_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.PINK_CACTUS_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.WHITE_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.GRAY_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.BLACK_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.BROWN_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.RED_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.ORANGE_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.YELLOW_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.LIME_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.GREEN_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.CYAN_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.BLUE_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.PURPLE_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.PINK_FLOWER_SEEDS.get(), 0.3F);
		this.compostables(FloralisItems.WHITE_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.LIGHT_GRAY_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.GRAY_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.BLACK_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.BROWN_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.RED_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.ORANGE_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.YELLOW_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.LIME_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.GREEN_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.CYAN_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.LIGHT_BLUE_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.BLUE_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.PURPLE_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.MAGENTA_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.PINK_PETALS.get(), 0.3F);
		this.compostables(FloralisItems.PLANT_FIBERS.get(), 0.3F);
	}

	public void compostables(Item pItem, float pChance) {
		this.builder(NeoForgeDataMaps.COMPOSTABLES).add(BuiltInRegistries.ITEM.getKey(pItem), new Compostable(pChance), false);
	}
}
