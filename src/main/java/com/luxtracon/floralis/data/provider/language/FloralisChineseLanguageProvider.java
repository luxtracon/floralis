package com.luxtracon.floralis.data.provider.language;

import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.data.provider.tags.FloralisBiomeTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisBlockTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisItemTagsProvider;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.common.data.LanguageProvider;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisChineseLanguageProvider extends LanguageProvider {
	public FloralisChineseLanguageProvider(PackOutput pPackOutput, String pId, String pLanguage) {
		super(pPackOutput, pId, pLanguage);
	}

	@Override
	public void addTranslations() {
		this.add(FloralisBlocks.WHITE_DYE_BLOCK.get(), "白色染料块");
		this.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), "淡灰色染料块");
		this.add(FloralisBlocks.GRAY_DYE_BLOCK.get(), "灰色染料块");
		this.add(FloralisBlocks.BLACK_DYE_BLOCK.get(), "黑色染料块");
		this.add(FloralisBlocks.BROWN_DYE_BLOCK.get(), "棕色染料块");
		this.add(FloralisBlocks.RED_DYE_BLOCK.get(), "红色染料块");
		this.add(FloralisBlocks.ORANGE_DYE_BLOCK.get(), "橙色染料块");
		this.add(FloralisBlocks.YELLOW_DYE_BLOCK.get(), "黄色染料块");
		this.add(FloralisBlocks.LIME_DYE_BLOCK.get(), "黄绿色染料块");
		this.add(FloralisBlocks.GREEN_DYE_BLOCK.get(), "绿色染料块");
		this.add(FloralisBlocks.CYAN_DYE_BLOCK.get(), "青色染料块");
		this.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), "淡蓝色染料块");
		this.add(FloralisBlocks.BLUE_DYE_BLOCK.get(), "蓝色染料块");
		this.add(FloralisBlocks.PURPLE_DYE_BLOCK.get(), "紫色染料块");
		this.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), "品红色染料块");
		this.add(FloralisBlocks.PINK_DYE_BLOCK.get(), "粉色染料块");
		this.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), "纤维块");
		this.add(FloralisBlocks.WHITE_CACTUS.get(), "白色仙人球");
		this.add(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), "淡灰色仙人球");
		this.add(FloralisBlocks.GRAY_CACTUS.get(), "灰色仙人球");
		this.add(FloralisBlocks.BLACK_CACTUS.get(), "黑色仙人球");
		this.add(FloralisBlocks.BROWN_CACTUS.get(), "棕色仙人球");
		this.add(FloralisBlocks.RED_CACTUS.get(), "红色仙人球");
		this.add(FloralisBlocks.ORANGE_CACTUS.get(), "橙色仙人球");
		this.add(FloralisBlocks.YELLOW_CACTUS.get(), "黄色仙人球");
		this.add(FloralisBlocks.LIME_CACTUS.get(), "黄绿色仙人球");
		this.add(FloralisBlocks.GREEN_CACTUS.get(), "绿色仙人球");
		this.add(FloralisBlocks.CYAN_CACTUS.get(), "青色仙人球");
		this.add(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), "淡蓝色仙人球");
		this.add(FloralisBlocks.BLUE_CACTUS.get(), "蓝色仙人球");
		this.add(FloralisBlocks.PURPLE_CACTUS.get(), "紫色仙人球");
		this.add(FloralisBlocks.MAGENTA_CACTUS.get(), "品红色仙人球");
		this.add(FloralisBlocks.PINK_CACTUS.get(), "粉色仙人球");
		this.add(FloralisBlocks.WHITE_FLOWER.get(), "白色花朵");
		this.add(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), "淡灰色花朵");
		this.add(FloralisBlocks.GRAY_FLOWER.get(), "灰色花朵");
		this.add(FloralisBlocks.BLACK_FLOWER.get(), "黑色花朵");
		this.add(FloralisBlocks.BROWN_FLOWER.get(), "棕色花朵");
		this.add(FloralisBlocks.RED_FLOWER.get(), "红色花朵");
		this.add(FloralisBlocks.ORANGE_FLOWER.get(), "橙色花朵");
		this.add(FloralisBlocks.YELLOW_FLOWER.get(), "黄色花朵");
		this.add(FloralisBlocks.LIME_FLOWER.get(), "黄绿色花朵");
		this.add(FloralisBlocks.GREEN_FLOWER.get(), "绿色花朵");
		this.add(FloralisBlocks.CYAN_FLOWER.get(), "青色花朵");
		this.add(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), "淡蓝色花朵");
		this.add(FloralisBlocks.BLUE_FLOWER.get(), "蓝色花朵");
		this.add(FloralisBlocks.PURPLE_FLOWER.get(), "紫色花朵");
		this.add(FloralisBlocks.MAGENTA_FLOWER.get(), "品红色花朵");
		this.add(FloralisBlocks.PINK_FLOWER.get(), "粉色花朵");

		this.add(FloralisItems.WHITE_CACTUS_SEEDS.get(), "白色仙人球种子");
		this.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), "淡灰色仙人球种子");
		this.add(FloralisItems.GRAY_CACTUS_SEEDS.get(), "灰色仙人球种子");
		this.add(FloralisItems.BLACK_CACTUS_SEEDS.get(), "黑色仙人球种子");
		this.add(FloralisItems.BROWN_CACTUS_SEEDS.get(), "棕色仙人球种子");
		this.add(FloralisItems.RED_CACTUS_SEEDS.get(), "红色仙人球种子");
		this.add(FloralisItems.ORANGE_CACTUS_SEEDS.get(), "橙色仙人球种子");
		this.add(FloralisItems.YELLOW_CACTUS_SEEDS.get(), "黄色仙人球种子");
		this.add(FloralisItems.LIME_CACTUS_SEEDS.get(), "黄绿色仙人球种子");
		this.add(FloralisItems.GREEN_CACTUS_SEEDS.get(), "绿色仙人球种子");
		this.add(FloralisItems.CYAN_CACTUS_SEEDS.get(), "青色仙人球种子");
		this.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), "淡蓝色仙人球种子");
		this.add(FloralisItems.BLUE_CACTUS_SEEDS.get(), "蓝色仙人球种子");
		this.add(FloralisItems.PURPLE_CACTUS_SEEDS.get(), "紫色仙人球种子");
		this.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), "品红色仙人球种子");
		this.add(FloralisItems.PINK_CACTUS_SEEDS.get(), "粉色仙人球种子");
		this.add(FloralisItems.WHITE_FLOWER_SEEDS.get(), "白色花朵种子");
		this.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), "淡灰色花朵种子");
		this.add(FloralisItems.GRAY_FLOWER_SEEDS.get(), "灰色花朵种子");
		this.add(FloralisItems.BLACK_FLOWER_SEEDS.get(), "黑色花朵种子");
		this.add(FloralisItems.BROWN_FLOWER_SEEDS.get(), "棕色花朵种子");
		this.add(FloralisItems.RED_FLOWER_SEEDS.get(), "红色花朵种子");
		this.add(FloralisItems.ORANGE_FLOWER_SEEDS.get(), "橙色花朵种子");
		this.add(FloralisItems.YELLOW_FLOWER_SEEDS.get(), "黄色花朵种子");
		this.add(FloralisItems.LIME_FLOWER_SEEDS.get(), "黄绿色花朵种子");
		this.add(FloralisItems.GREEN_FLOWER_SEEDS.get(), "绿色花朵种子");
		this.add(FloralisItems.CYAN_FLOWER_SEEDS.get(), "青色花朵种子");
		this.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), "淡蓝色花朵种子");
		this.add(FloralisItems.BLUE_FLOWER_SEEDS.get(), "蓝色花朵种子");
		this.add(FloralisItems.PURPLE_FLOWER_SEEDS.get(), "紫色花朵种子");
		this.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), "品红色花朵种子");
		this.add(FloralisItems.PINK_FLOWER_SEEDS.get(), "粉色花朵种子");
		this.add(FloralisItems.WHITE_PETALS.get(), "白色花瓣");
		this.add(FloralisItems.LIGHT_GRAY_PETALS.get(), "淡灰色花瓣");
		this.add(FloralisItems.GRAY_PETALS.get(), "灰色花瓣");
		this.add(FloralisItems.BLACK_PETALS.get(), "黑色花瓣");
		this.add(FloralisItems.BROWN_PETALS.get(), "棕色花瓣");
		this.add(FloralisItems.RED_PETALS.get(), "红色花瓣");
		this.add(FloralisItems.ORANGE_PETALS.get(), "橙色花瓣");
		this.add(FloralisItems.YELLOW_PETALS.get(), "黄色花瓣");
		this.add(FloralisItems.LIME_PETALS.get(), "黄绿色花瓣");
		this.add(FloralisItems.GREEN_PETALS.get(), "绿色花瓣");
		this.add(FloralisItems.CYAN_PETALS.get(), "青色花瓣");
		this.add(FloralisItems.LIGHT_BLUE_PETALS.get(), "淡蓝色花瓣");
		this.add(FloralisItems.BLUE_PETALS.get(), "蓝色花瓣");
		this.add(FloralisItems.PURPLE_PETALS.get(), "紫色花瓣");
		this.add(FloralisItems.MAGENTA_PETALS.get(), "品红色花瓣");
		this.add(FloralisItems.PINK_PETALS.get(), "粉色花瓣");
		this.add(FloralisItems.PLANT_FIBERS.get(), "纤维");

		this.add(FloralisBiomeTagsProvider.HAS_CACTUS, "Has Cactus");
		this.add(FloralisBiomeTagsProvider.HAS_FLOWER, "Has Flower");

		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add(FloralisItemTagsProvider.SEEDS_CACTUS, "Cactus Seeds");
		this.add(FloralisItemTagsProvider.SEEDS_FLOWER, "Flower Seeds");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add("tab" + "." + FloralisConstants.FLORALIS + "." + "item_group", "Floralis");

		this.add("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers", "可以像骨粉使用或用来堆肥");
	}

	@Override
	public String getName() {
		return "Chinese";
	}
}
