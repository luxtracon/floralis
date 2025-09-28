package com.luxtracon.floralis.data.provider.tags;

import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;

import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockTagsProvider extends BlockTagsProvider {
	public FloralisBlockTagsProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider, String pId, ExistingFileHelper pExistingFileHelper) {
		super(pPackOutput, pProvider, pId, pExistingFileHelper);
	}

	@Override
	public void addTags(HolderLookup.Provider pProvider) {
		this.tag(BlockTags.CROPS)
			.add(FloralisBlocks.WHITE_FLOWER_CROP.get())
			.add(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get())
			.add(FloralisBlocks.GRAY_FLOWER_CROP.get())
			.add(FloralisBlocks.BLACK_FLOWER_CROP.get())
			.add(FloralisBlocks.BROWN_FLOWER_CROP.get())
			.add(FloralisBlocks.RED_FLOWER_CROP.get())
			.add(FloralisBlocks.ORANGE_FLOWER_CROP.get())
			.add(FloralisBlocks.YELLOW_FLOWER_CROP.get())
			.add(FloralisBlocks.LIME_FLOWER_CROP.get())
			.add(FloralisBlocks.GREEN_FLOWER_CROP.get())
			.add(FloralisBlocks.CYAN_FLOWER_CROP.get())
			.add(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get())
			.add(FloralisBlocks.BLUE_FLOWER_CROP.get())
			.add(FloralisBlocks.PURPLE_FLOWER_CROP.get())
			.add(FloralisBlocks.MAGENTA_FLOWER_CROP.get())
			.add(FloralisBlocks.PINK_FLOWER_CROP.get())
			.add(FloralisBlocks.WHITE_CACTUS_CROP.get())
			.add(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get())
			.add(FloralisBlocks.GRAY_CACTUS_CROP.get())
			.add(FloralisBlocks.BLACK_CACTUS_CROP.get())
			.add(FloralisBlocks.BROWN_CACTUS_CROP.get())
			.add(FloralisBlocks.RED_CACTUS_CROP.get())
			.add(FloralisBlocks.ORANGE_CACTUS_CROP.get())
			.add(FloralisBlocks.YELLOW_CACTUS_CROP.get())
			.add(FloralisBlocks.LIME_CACTUS_CROP.get())
			.add(FloralisBlocks.GREEN_CACTUS_CROP.get())
			.add(FloralisBlocks.CYAN_CACTUS_CROP.get())
			.add(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get())
			.add(FloralisBlocks.BLUE_CACTUS_CROP.get())
			.add(FloralisBlocks.PURPLE_CACTUS_CROP.get())
			.add(FloralisBlocks.MAGENTA_CACTUS_CROP.get())
			.add(FloralisBlocks.PINK_CACTUS_CROP.get());

		this.tag(BlockTags.FLOWER_POTS)
			.add(FloralisBlocks.POTTED_WHITE_FLOWER.get())
			.add(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get())
			.add(FloralisBlocks.POTTED_GRAY_FLOWER.get())
			.add(FloralisBlocks.POTTED_BLACK_FLOWER.get())
			.add(FloralisBlocks.POTTED_BROWN_FLOWER.get())
			.add(FloralisBlocks.POTTED_RED_FLOWER.get())
			.add(FloralisBlocks.POTTED_ORANGE_FLOWER.get())
			.add(FloralisBlocks.POTTED_YELLOW_FLOWER.get())
			.add(FloralisBlocks.POTTED_LIME_FLOWER.get())
			.add(FloralisBlocks.POTTED_GREEN_FLOWER.get())
			.add(FloralisBlocks.POTTED_CYAN_FLOWER.get())
			.add(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get())
			.add(FloralisBlocks.POTTED_BLUE_FLOWER.get())
			.add(FloralisBlocks.POTTED_PURPLE_FLOWER.get())
			.add(FloralisBlocks.POTTED_MAGENTA_FLOWER.get())
			.add(FloralisBlocks.POTTED_PINK_FLOWER.get())
			.add(FloralisBlocks.POTTED_WHITE_CACTUS.get())
			.add(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get())
			.add(FloralisBlocks.POTTED_GRAY_CACTUS.get())
			.add(FloralisBlocks.POTTED_BLACK_CACTUS.get())
			.add(FloralisBlocks.POTTED_BROWN_CACTUS.get())
			.add(FloralisBlocks.POTTED_RED_CACTUS.get())
			.add(FloralisBlocks.POTTED_ORANGE_CACTUS.get())
			.add(FloralisBlocks.POTTED_YELLOW_CACTUS.get())
			.add(FloralisBlocks.POTTED_LIME_CACTUS.get())
			.add(FloralisBlocks.POTTED_GREEN_CACTUS.get())
			.add(FloralisBlocks.POTTED_CYAN_CACTUS.get())
			.add(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get())
			.add(FloralisBlocks.POTTED_BLUE_CACTUS.get())
			.add(FloralisBlocks.POTTED_PURPLE_CACTUS.get())
			.add(FloralisBlocks.POTTED_MAGENTA_CACTUS.get())
			.add(FloralisBlocks.POTTED_PINK_CACTUS.get());

		this.tag(BlockTags.MINEABLE_WITH_HOE)
			.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get());

		this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
			.add(FloralisBlocks.WHITE_DYE_BLOCK.get())
			.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get())
			.add(FloralisBlocks.GRAY_DYE_BLOCK.get())
			.add(FloralisBlocks.BLACK_DYE_BLOCK.get())
			.add(FloralisBlocks.BROWN_DYE_BLOCK.get())
			.add(FloralisBlocks.RED_DYE_BLOCK.get())
			.add(FloralisBlocks.ORANGE_DYE_BLOCK.get())
			.add(FloralisBlocks.YELLOW_DYE_BLOCK.get())
			.add(FloralisBlocks.LIME_DYE_BLOCK.get())
			.add(FloralisBlocks.GREEN_DYE_BLOCK.get())
			.add(FloralisBlocks.CYAN_DYE_BLOCK.get())
			.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get())
			.add(FloralisBlocks.BLUE_DYE_BLOCK.get())
			.add(FloralisBlocks.PURPLE_DYE_BLOCK.get())
			.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get())
			.add(FloralisBlocks.PINK_DYE_BLOCK.get());

		this.tag(BlockTags.SMALL_FLOWERS)
			.add(FloralisBlocks.WHITE_FLOWER.get())
			.add(FloralisBlocks.LIGHT_GRAY_FLOWER.get())
			.add(FloralisBlocks.GRAY_FLOWER.get())
			.add(FloralisBlocks.BLACK_FLOWER.get())
			.add(FloralisBlocks.BROWN_FLOWER.get())
			.add(FloralisBlocks.RED_FLOWER.get())
			.add(FloralisBlocks.ORANGE_FLOWER.get())
			.add(FloralisBlocks.YELLOW_FLOWER.get())
			.add(FloralisBlocks.LIME_FLOWER.get())
			.add(FloralisBlocks.GREEN_FLOWER.get())
			.add(FloralisBlocks.CYAN_FLOWER.get())
			.add(FloralisBlocks.LIGHT_BLUE_FLOWER.get())
			.add(FloralisBlocks.BLUE_FLOWER.get())
			.add(FloralisBlocks.PURPLE_FLOWER.get())
			.add(FloralisBlocks.MAGENTA_FLOWER.get())
			.add(FloralisBlocks.PINK_FLOWER.get())
			.add(FloralisBlocks.WHITE_CACTUS.get())
			.add(FloralisBlocks.LIGHT_GRAY_CACTUS.get())
			.add(FloralisBlocks.GRAY_CACTUS.get())
			.add(FloralisBlocks.BLACK_CACTUS.get())
			.add(FloralisBlocks.BROWN_CACTUS.get())
			.add(FloralisBlocks.RED_CACTUS.get())
			.add(FloralisBlocks.ORANGE_CACTUS.get())
			.add(FloralisBlocks.YELLOW_CACTUS.get())
			.add(FloralisBlocks.LIME_CACTUS.get())
			.add(FloralisBlocks.GREEN_CACTUS.get())
			.add(FloralisBlocks.CYAN_CACTUS.get())
			.add(FloralisBlocks.LIGHT_BLUE_CACTUS.get())
			.add(FloralisBlocks.BLUE_CACTUS.get())
			.add(FloralisBlocks.PURPLE_CACTUS.get())
			.add(FloralisBlocks.MAGENTA_CACTUS.get())
			.add(FloralisBlocks.PINK_CACTUS.get());

		this.tag(Tags.Blocks.STORAGE_BLOCKS)
			.add(FloralisBlocks.WHITE_DYE_BLOCK.get())
			.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get())
			.add(FloralisBlocks.GRAY_DYE_BLOCK.get())
			.add(FloralisBlocks.BLACK_DYE_BLOCK.get())
			.add(FloralisBlocks.BROWN_DYE_BLOCK.get())
			.add(FloralisBlocks.RED_DYE_BLOCK.get())
			.add(FloralisBlocks.ORANGE_DYE_BLOCK.get())
			.add(FloralisBlocks.YELLOW_DYE_BLOCK.get())
			.add(FloralisBlocks.LIME_DYE_BLOCK.get())
			.add(FloralisBlocks.GREEN_DYE_BLOCK.get())
			.add(FloralisBlocks.CYAN_DYE_BLOCK.get())
			.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get())
			.add(FloralisBlocks.BLUE_DYE_BLOCK.get())
			.add(FloralisBlocks.PURPLE_DYE_BLOCK.get())
			.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get())
			.add(FloralisBlocks.PINK_DYE_BLOCK.get())
			.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get());
	}

	@Override
	public String getName() {
		return "Block Tags";
	}

	public static TagKey<Block> cKey(String pName) {
		return FloralisBlockTagsProvider.createKey(FloralisConstants.C + ":" + pName);
	}

	public static TagKey<Block> floralisKey(String pName) {
		return FloralisBlockTagsProvider.createKey(FloralisConstants.FLORALIS + ":" + pName);
	}

	public static TagKey<Block> industrialforegoingKey(String pName) {
		return FloralisBlockTagsProvider.createKey(FloralisConstants.INDUSTRIALFOREGOING + ":" + pName);
	}

	public static TagKey<Block> neoforgeKey(String pName) {
		return FloralisBlockTagsProvider.createKey(FloralisConstants.NEOFORGE + ":" + pName);
	}

	public static TagKey<Block> createKey(String pName) {
		return TagKey.create(Registries.BLOCK, ResourceLocation.parse(pName));
	}
}
