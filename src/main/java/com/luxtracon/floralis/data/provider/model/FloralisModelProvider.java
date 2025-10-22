package com.luxtracon.floralis.data.provider.model;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisModelProvider extends ModelProvider {
	public FloralisModelProvider(PackOutput pPackOutput, String pId) {
		super(pPackOutput, pId);
	}

	@Override
	public void registerModels(BlockModelGenerators pBlockModelGenerators, ItemModelGenerators pItemModelGenerators) {
		FloralisBlockModelProvider.register(pBlockModelGenerators);
		FloralisBlockStateProvider.register(pBlockModelGenerators);
		FloralisItemModelProvider.register(pItemModelGenerators);
		FloralisItemStateProvider.register(pItemModelGenerators);
	}

	public static ResourceLocation blockFile(Block pBlock, String pSuffix, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + FloralisModelProvider.blockName(pBlock).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB) + "_" + pSuffix);
	}

	public static ResourceLocation blockFile(Block pBlock, String pSuffix, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + FloralisModelProvider.blockName(pBlock).replace(pSource, pTarget) + "_" + pSuffix);
	}

	public static ResourceLocation blockFile(Block pBlock, String pSuffix) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + FloralisModelProvider.blockName(pBlock) + "_" + pSuffix);
	}

	public static ResourceLocation blockFile(Block pBlock, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + FloralisModelProvider.blockName(pBlock).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB));
	}

	public static ResourceLocation blockFile(Block pBlock, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + FloralisModelProvider.blockName(pBlock).replace(pSource, pTarget));
	}

	public static ResourceLocation blockFile(Block pBlock) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + FloralisModelProvider.blockName(pBlock));
	}

	public static ResourceLocation blockFile(String pPrefix, Block pBlock, String pSuffix, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + pPrefix + "_" + FloralisModelProvider.blockName(pBlock).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB) + "_" + pSuffix);
	}

	public static ResourceLocation blockFile(String pPrefix, Block pBlock, String pSuffix, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + pPrefix + "_" + FloralisModelProvider.blockName(pBlock).replace(pSource, pTarget) + "_" + pSuffix);
	}

	public static ResourceLocation blockFile(String pPrefix, Block pBlock, String pSuffix) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + pPrefix + "_" + FloralisModelProvider.blockName(pBlock) + "_" + pSuffix);
	}

	public static ResourceLocation blockFile(String pPrefix, Block pBlock, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + pPrefix + "_" + FloralisModelProvider.blockName(pBlock).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB));
	}

	public static ResourceLocation blockFile(String pPrefix, Block pBlock, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + pPrefix + "_" + FloralisModelProvider.blockName(pBlock).replace(pSource, pTarget));
	}

	public static ResourceLocation blockFile(String pPrefix, Block pBlock) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.blockId(pBlock), "block" + "/" + pPrefix + "_" + FloralisModelProvider.blockName(pBlock));
	}

	public static ResourceLocation blockFile(String pId, String pFile, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(pId, "block" + "/" + pFile.replace(pSourceA, pTargetA).replace(pSourceB, pTargetB));
	}

	public static ResourceLocation blockFile(String pId, String pFile, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(pId, "block" + "/" + pFile.replace(pSource, pTarget));
	}

	public static ResourceLocation blockFile(String pId, String pFile) {
		return ResourceLocation.fromNamespaceAndPath(pId, "block" + "/" + pFile);
	}

	public static ResourceLocation itemFile(Item pItem, String pSuffix, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + FloralisModelProvider.itemName(pItem).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB) + "_" + pSuffix);
	}

	public static ResourceLocation itemFile(Item pItem, String pSuffix, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + FloralisModelProvider.itemName(pItem).replace(pSource, pTarget) + "_" + pSuffix);
	}

	public static ResourceLocation itemFile(Item pItem, String pSuffix) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + FloralisModelProvider.itemName(pItem) + "_" + pSuffix);
	}

	public static ResourceLocation itemFile(Item pItem, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + FloralisModelProvider.itemName(pItem).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB));
	}

	public static ResourceLocation itemFile(Item pItem, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + FloralisModelProvider.itemName(pItem).replace(pSource, pTarget));
	}

	public static ResourceLocation itemFile(Item pItem) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + FloralisModelProvider.itemName(pItem));
	}

	public static ResourceLocation itemFile(String pPrefix, Item pItem, String pSuffix, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + pPrefix + "_" + FloralisModelProvider.itemName(pItem).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB) + "_" + pSuffix);
	}

	public static ResourceLocation itemFile(String pPrefix, Item pItem, String pSuffix, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + pPrefix + "_" + FloralisModelProvider.itemName(pItem).replace(pSource, pTarget) + "_" + pSuffix);
	}

	public static ResourceLocation itemFile(String pPrefix, Item pItem, String pSuffix) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + pPrefix + "_" + FloralisModelProvider.itemName(pItem) + "_" + pSuffix);
	}

	public static ResourceLocation itemFile(String pPrefix, Item pItem, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + pPrefix + "_" + FloralisModelProvider.itemName(pItem).replace(pSourceA, pTargetA).replace(pSourceB, pTargetB));
	}

	public static ResourceLocation itemFile(String pPrefix, Item pItem, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + pPrefix + "_" + FloralisModelProvider.itemName(pItem).replace(pSource, pTarget));
	}

	public static ResourceLocation itemFile(String pPrefix, Item pItem) {
		return ResourceLocation.fromNamespaceAndPath(FloralisModelProvider.itemId(pItem), "item" + "/" + pPrefix + "_" + FloralisModelProvider.itemName(pItem));
	}

	public static ResourceLocation itemFile(String pId, String pFile, String pSourceA, String pTargetA, String pSourceB, String pTargetB) {
		return ResourceLocation.fromNamespaceAndPath(pId, "item" + "/" + pFile.replace(pSourceA, pTargetA).replace(pSourceB, pTargetB));
	}

	public static ResourceLocation itemFile(String pId, String pFile, String pSource, String pTarget) {
		return ResourceLocation.fromNamespaceAndPath(pId, "item" + "/" + pFile.replace(pSource, pTarget));
	}

	public static ResourceLocation itemFile(String pId, String pFile) {
		return ResourceLocation.fromNamespaceAndPath(pId, "item" + "/" + pFile);
	}

	public static String blockId(Block pBlock) {
		return BuiltInRegistries.BLOCK.getKey(pBlock).getNamespace();
	}

	public static String blockName(Block pBlock) {
		return BuiltInRegistries.BLOCK.getKey(pBlock).getPath();
	}

	public static String itemId(Item pItem) {
		return BuiltInRegistries.ITEM.getKey(pItem).getNamespace();
	}

	public static String itemName(Item pItem) {
		return BuiltInRegistries.ITEM.getKey(pItem).getPath();
	}

	@Override
	public String getName() {
		return "Model Definitions";
	}
}
