package com.luxtracon.floralis.data.provider.model;

import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisTextureSlots;
import com.luxtracon.floralis.data.model.*;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisBlockModelProvider {

	public static void register(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.provider(pBlockModelGenerators);
		FloralisBlockModelProvider.template(pBlockModelGenerators);
	}

	public static void provider(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.cactusBush(pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(pBlockModelGenerators);
		FloralisBlockModelProvider.plantFibersBlock(pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(pBlockModelGenerators);
	}

	public static void template(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.cactusBushModel(pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCropModel(pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlockModel(pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBushModel(pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCropModel(pBlockModelGenerators);
		FloralisBlockModelProvider.plantFibersBlockModel(pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactusModel(pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlowerModel(pBlockModelGenerators);
	}

	public static void cactusBush(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.WHITE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.BLACK_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.BROWN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.RED_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.ORANGE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.YELLOW_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.LIME_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.GREEN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.CYAN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.PURPLE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.MAGENTA_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusBush(FloralisBlocks.PINK_CACTUS.get(), pBlockModelGenerators);
	}

	public static void cactusCrop(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.WHITE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.GRAY_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.BLACK_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.BROWN_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.RED_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.ORANGE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.YELLOW_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.LIME_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.GREEN_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.CYAN_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.BLUE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.PURPLE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.cactusCrop(FloralisBlocks.PINK_CACTUS_CROP.get(), pBlockModelGenerators);
	}

	public static void dyeBlock(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.WHITE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.GRAY_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.BLACK_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.BROWN_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.RED_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.ORANGE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.YELLOW_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.LIME_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.GREEN_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.CYAN_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.BLUE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.PURPLE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.dyeBlock(FloralisBlocks.PINK_DYE_BLOCK.get(), pBlockModelGenerators);
	}

	public static void flowerBush(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.WHITE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.BLACK_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.BROWN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.RED_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.ORANGE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.YELLOW_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.LIME_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.GREEN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.CYAN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.PURPLE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.MAGENTA_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerBush(FloralisBlocks.PINK_FLOWER.get(), pBlockModelGenerators);
	}

	public static void flowerCrop(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.WHITE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.GRAY_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.BLACK_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.BROWN_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.RED_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.ORANGE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.YELLOW_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.LIME_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.GREEN_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.CYAN_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.BLUE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.PURPLE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.flowerCrop(FloralisBlocks.PINK_FLOWER_CROP.get(), pBlockModelGenerators);
	}

	public static void plantFibersBlock(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.plantFibersBlock(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), pBlockModelGenerators);
	}

	public static void pottedCactus(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_WHITE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_BLACK_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_BROWN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_RED_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_ORANGE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_YELLOW_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_LIME_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_GREEN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_CYAN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_PURPLE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_MAGENTA_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedCactus(FloralisBlocks.POTTED_PINK_CACTUS.get(), pBlockModelGenerators);
	}

	public static void pottedFlower(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_WHITE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_BLACK_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_BROWN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_RED_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_ORANGE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_YELLOW_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_LIME_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_GREEN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_CYAN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_PURPLE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_MAGENTA_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockModelProvider.pottedFlower(FloralisBlocks.POTTED_PINK_FLOWER.get(), pBlockModelGenerators);
	}

	public static void cactusBush(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_bush")).build()
			.create(FloralisModelProvider.blockFile(pBlock), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock)))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
	}

	public static void cactusCrop(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_0")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "0"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_1")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "1"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_2")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "2"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_3")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "3"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
	}

	public static void dyeBlock(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_dye_block")).build()
			.create(FloralisModelProvider.blockFile(pBlock), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock)))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(pBlock))), pBlockModelGenerators.modelOutput);
	}

	public static void flowerBush(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_bush")).build()
			.create(FloralisModelProvider.blockFile(pBlock), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock)))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
	}

	public static void flowerCrop(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_0")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "0"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_1")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "1"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_2")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "2"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_3")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "3"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "_crop", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
	}

	public static void plantFibersBlock(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_plant_fibers_block")).build()
			.create(FloralisModelProvider.blockFile(pBlock), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock)))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_plant_fibers_block_horizontal")).build()
			.create(FloralisModelProvider.blockFile(pBlock, "horizontal"), new TextureMapping()
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock)))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "particle"))), pBlockModelGenerators.modelOutput);
	}

	public static void pottedCactus(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_potted_cactus")).build()
			.create(FloralisModelProvider.blockFile(pBlock), new TextureMapping()
				.putForced(FloralisTextureSlots.DIRT, new Material(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "dirt")))
				.putForced(FloralisTextureSlots.FLOWER_POT, new Material(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "flower_pot")))
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "potted_", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "flower_pot"))), pBlockModelGenerators.modelOutput);
	}

	public static void pottedFlower(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_potted_flower")).build()
			.create(FloralisModelProvider.blockFile(pBlock), new TextureMapping()
				.putForced(FloralisTextureSlots.DIRT, new Material(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "dirt")))
				.putForced(FloralisTextureSlots.FLOWER_POT, new Material(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "flower_pot")))
				.putForced(FloralisTextureSlots.TEXTURE, new Material(FloralisModelProvider.blockFile(pBlock, "potted_", "")))
				.putForced(FloralisTextureSlots.PARTICLE, new Material(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "flower_pot"))), pBlockModelGenerators.modelOutput);
	}

	public static void cactusBushModel(BlockModelGenerators pBlockModelGenerators) {
		CactusBushModel.template().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_bush"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void cactusCropModel(BlockModelGenerators pBlockModelGenerators) {
		CactusCropModel.template0().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_0"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		CactusCropModel.template1().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_1"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		CactusCropModel.template2().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_2"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		CactusCropModel.template3().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_cactus_crop_3"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void dyeBlockModel(BlockModelGenerators pBlockModelGenerators) {
		DyeBlockModel.template().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_dye_block"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void flowerBushModel(BlockModelGenerators pBlockModelGenerators) {
		FlowerBushModel.template().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_bush"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void flowerCropModel(BlockModelGenerators pBlockModelGenerators) {
		FlowerCropModel.template0().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_0"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		FlowerCropModel.template1().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_1"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		FlowerCropModel.template2().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_2"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		FlowerCropModel.template3().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_flower_crop_3"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void plantFibersBlockModel(BlockModelGenerators pBlockModelGenerators) {
		PlantFibersBlockModel.template().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_plant_fibers_block"), new TextureMapping(), pBlockModelGenerators.modelOutput);
		PlantFibersBlockModel.templateHorizontal().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_plant_fibers_block_horizontal"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void pottedCactusModel(BlockModelGenerators pBlockModelGenerators) {
		PottedCactusModel.template().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_potted_cactus"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}

	public static void pottedFlowerModel(BlockModelGenerators pBlockModelGenerators) {
		PottedFlowerModel.template().create(FloralisModelProvider.blockFile(FloralisConstants.FLORALIS, "template_potted_flower"), new TextureMapping(), pBlockModelGenerators.modelOutput);
	}
}
