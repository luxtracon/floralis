package com.luxtracon.floralis.data.provider.tags;

import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;

import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisItemTagsProvider extends ItemTagsProvider {
	public static final TagKey<Item> BIOREACTOR = FloralisItemTagsProvider.industrialforegoingKey("bioreactor");

	public FloralisItemTagsProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider, CompletableFuture<TagLookup<Block>> pTags, String pId, ExistingFileHelper pExistingFileHelper) {
		super(pPackOutput, pProvider, pTags, pId, pExistingFileHelper);
	}

	@Override
	public void addTags(HolderLookup.Provider pProvider) {
		this.tag(ItemTags.SMALL_FLOWERS)
			.add(FloralisItems.WHITE_FLOWER.get())
			.add(FloralisItems.LIGHT_GRAY_FLOWER.get())
			.add(FloralisItems.GRAY_FLOWER.get())
			.add(FloralisItems.BLACK_FLOWER.get())
			.add(FloralisItems.BROWN_FLOWER.get())
			.add(FloralisItems.RED_FLOWER.get())
			.add(FloralisItems.ORANGE_FLOWER.get())
			.add(FloralisItems.YELLOW_FLOWER.get())
			.add(FloralisItems.LIME_FLOWER.get())
			.add(FloralisItems.GREEN_FLOWER.get())
			.add(FloralisItems.CYAN_FLOWER.get())
			.add(FloralisItems.LIGHT_BLUE_FLOWER.get())
			.add(FloralisItems.BLUE_FLOWER.get())
			.add(FloralisItems.PURPLE_FLOWER.get())
			.add(FloralisItems.MAGENTA_FLOWER.get())
			.add(FloralisItems.PINK_FLOWER.get())
			.add(FloralisItems.WHITE_CACTUS.get())
			.add(FloralisItems.LIGHT_GRAY_CACTUS.get())
			.add(FloralisItems.GRAY_CACTUS.get())
			.add(FloralisItems.BLACK_CACTUS.get())
			.add(FloralisItems.BROWN_CACTUS.get())
			.add(FloralisItems.RED_CACTUS.get())
			.add(FloralisItems.ORANGE_CACTUS.get())
			.add(FloralisItems.YELLOW_CACTUS.get())
			.add(FloralisItems.LIME_CACTUS.get())
			.add(FloralisItems.GREEN_CACTUS.get())
			.add(FloralisItems.CYAN_CACTUS.get())
			.add(FloralisItems.LIGHT_BLUE_CACTUS.get())
			.add(FloralisItems.BLUE_CACTUS.get())
			.add(FloralisItems.PURPLE_CACTUS.get())
			.add(FloralisItems.MAGENTA_CACTUS.get())
			.add(FloralisItems.PINK_CACTUS.get());

		this.tag(ItemTags.VILLAGER_PICKS_UP)
			.add(FloralisItems.WHITE_PETALS.get())
			.add(FloralisItems.LIGHT_GRAY_PETALS.get())
			.add(FloralisItems.GRAY_PETALS.get())
			.add(FloralisItems.BLACK_PETALS.get())
			.add(FloralisItems.BROWN_PETALS.get())
			.add(FloralisItems.RED_PETALS.get())
			.add(FloralisItems.ORANGE_PETALS.get())
			.add(FloralisItems.YELLOW_PETALS.get())
			.add(FloralisItems.LIME_PETALS.get())
			.add(FloralisItems.GREEN_PETALS.get())
			.add(FloralisItems.CYAN_PETALS.get())
			.add(FloralisItems.LIGHT_BLUE_PETALS.get())
			.add(FloralisItems.BLUE_PETALS.get())
			.add(FloralisItems.PURPLE_PETALS.get())
			.add(FloralisItems.MAGENTA_PETALS.get())
			.add(FloralisItems.PINK_PETALS.get())
			.add(FloralisItems.PLANT_FIBERS.get());

		this.tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
			.add(FloralisItems.WHITE_FLOWER_SEEDS.get())
			.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get())
			.add(FloralisItems.GRAY_FLOWER_SEEDS.get())
			.add(FloralisItems.BLACK_FLOWER_SEEDS.get())
			.add(FloralisItems.BROWN_FLOWER_SEEDS.get())
			.add(FloralisItems.RED_FLOWER_SEEDS.get())
			.add(FloralisItems.ORANGE_FLOWER_SEEDS.get())
			.add(FloralisItems.YELLOW_FLOWER_SEEDS.get())
			.add(FloralisItems.LIME_FLOWER_SEEDS.get())
			.add(FloralisItems.GREEN_FLOWER_SEEDS.get())
			.add(FloralisItems.CYAN_FLOWER_SEEDS.get())
			.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get())
			.add(FloralisItems.BLUE_FLOWER_SEEDS.get())
			.add(FloralisItems.PURPLE_FLOWER_SEEDS.get())
			.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get())
			.add(FloralisItems.PINK_FLOWER_SEEDS.get())
			.add(FloralisItems.WHITE_CACTUS_SEEDS.get())
			.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get())
			.add(FloralisItems.GRAY_CACTUS_SEEDS.get())
			.add(FloralisItems.BLACK_CACTUS_SEEDS.get())
			.add(FloralisItems.BROWN_CACTUS_SEEDS.get())
			.add(FloralisItems.RED_CACTUS_SEEDS.get())
			.add(FloralisItems.ORANGE_CACTUS_SEEDS.get())
			.add(FloralisItems.YELLOW_CACTUS_SEEDS.get())
			.add(FloralisItems.LIME_CACTUS_SEEDS.get())
			.add(FloralisItems.GREEN_CACTUS_SEEDS.get())
			.add(FloralisItems.CYAN_CACTUS_SEEDS.get())
			.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get())
			.add(FloralisItems.BLUE_CACTUS_SEEDS.get())
			.add(FloralisItems.PURPLE_CACTUS_SEEDS.get())
			.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get())
			.add(FloralisItems.PINK_CACTUS_SEEDS.get());

		this.tag(Tags.Items.FERTILIZERS)
			.add(FloralisItems.PLANT_FIBERS.get());

		this.tag(Tags.Items.SEEDS)
			.add(FloralisItems.WHITE_FLOWER_SEEDS.get())
			.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get())
			.add(FloralisItems.GRAY_FLOWER_SEEDS.get())
			.add(FloralisItems.BLACK_FLOWER_SEEDS.get())
			.add(FloralisItems.BROWN_FLOWER_SEEDS.get())
			.add(FloralisItems.RED_FLOWER_SEEDS.get())
			.add(FloralisItems.ORANGE_FLOWER_SEEDS.get())
			.add(FloralisItems.YELLOW_FLOWER_SEEDS.get())
			.add(FloralisItems.LIME_FLOWER_SEEDS.get())
			.add(FloralisItems.GREEN_FLOWER_SEEDS.get())
			.add(FloralisItems.CYAN_FLOWER_SEEDS.get())
			.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get())
			.add(FloralisItems.BLUE_FLOWER_SEEDS.get())
			.add(FloralisItems.PURPLE_FLOWER_SEEDS.get())
			.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get())
			.add(FloralisItems.PINK_FLOWER_SEEDS.get())
			.add(FloralisItems.WHITE_CACTUS_SEEDS.get())
			.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get())
			.add(FloralisItems.GRAY_CACTUS_SEEDS.get())
			.add(FloralisItems.BLACK_CACTUS_SEEDS.get())
			.add(FloralisItems.BROWN_CACTUS_SEEDS.get())
			.add(FloralisItems.RED_CACTUS_SEEDS.get())
			.add(FloralisItems.ORANGE_CACTUS_SEEDS.get())
			.add(FloralisItems.YELLOW_CACTUS_SEEDS.get())
			.add(FloralisItems.LIME_CACTUS_SEEDS.get())
			.add(FloralisItems.GREEN_CACTUS_SEEDS.get())
			.add(FloralisItems.CYAN_CACTUS_SEEDS.get())
			.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get())
			.add(FloralisItems.BLUE_CACTUS_SEEDS.get())
			.add(FloralisItems.PURPLE_CACTUS_SEEDS.get())
			.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get())
			.add(FloralisItems.PINK_CACTUS_SEEDS.get());

		this.tag(Tags.Items.STORAGE_BLOCKS)
			.add(FloralisItems.WHITE_DYE_BLOCK.get())
			.add(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get())
			.add(FloralisItems.GRAY_DYE_BLOCK.get())
			.add(FloralisItems.BLACK_DYE_BLOCK.get())
			.add(FloralisItems.BROWN_DYE_BLOCK.get())
			.add(FloralisItems.RED_DYE_BLOCK.get())
			.add(FloralisItems.ORANGE_DYE_BLOCK.get())
			.add(FloralisItems.YELLOW_DYE_BLOCK.get())
			.add(FloralisItems.LIME_DYE_BLOCK.get())
			.add(FloralisItems.GREEN_DYE_BLOCK.get())
			.add(FloralisItems.CYAN_DYE_BLOCK.get())
			.add(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get())
			.add(FloralisItems.BLUE_DYE_BLOCK.get())
			.add(FloralisItems.PURPLE_DYE_BLOCK.get())
			.add(FloralisItems.MAGENTA_DYE_BLOCK.get())
			.add(FloralisItems.PINK_DYE_BLOCK.get())
			.add(FloralisItems.PLANT_FIBERS_BLOCK.get());

		this.tag(FloralisItemTagsProvider.BIOREACTOR)
			.add(FloralisItems.WHITE_PETALS.get())
			.add(FloralisItems.LIGHT_GRAY_PETALS.get())
			.add(FloralisItems.GRAY_PETALS.get())
			.add(FloralisItems.BLACK_PETALS.get())
			.add(FloralisItems.BROWN_PETALS.get())
			.add(FloralisItems.RED_PETALS.get())
			.add(FloralisItems.ORANGE_PETALS.get())
			.add(FloralisItems.YELLOW_PETALS.get())
			.add(FloralisItems.LIME_PETALS.get())
			.add(FloralisItems.GREEN_PETALS.get())
			.add(FloralisItems.CYAN_PETALS.get())
			.add(FloralisItems.LIGHT_BLUE_PETALS.get())
			.add(FloralisItems.BLUE_PETALS.get())
			.add(FloralisItems.PURPLE_PETALS.get())
			.add(FloralisItems.MAGENTA_PETALS.get())
			.add(FloralisItems.PINK_PETALS.get())
			.add(FloralisItems.PLANT_FIBERS.get());
	}

	@Override
	public String getName() {
		return "Item Tags";
	}

	public static TagKey<Item> cKey(String pName) {
		return FloralisItemTagsProvider.createKey(FloralisConstants.C + ":" + pName);
	}

	public static TagKey<Item> floralisKey(String pName) {
		return FloralisItemTagsProvider.createKey(FloralisConstants.FLORALIS + ":" + pName);
	}

	public static TagKey<Item> industrialforegoingKey(String pName) {
		return FloralisItemTagsProvider.createKey(FloralisConstants.INDUSTRIALFOREGOING + ":" + pName);
	}

	public static TagKey<Item> neoforgeKey(String pName) {
		return FloralisItemTagsProvider.createKey(FloralisConstants.NEOFORGE + ":" + pName);
	}

	public static TagKey<Item> createKey(String pName) {
		return TagKey.create(Registries.ITEM, ResourceLocation.parse(pName));
	}
}
