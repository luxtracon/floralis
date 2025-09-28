package com.luxtracon.floralis.data.provider.loot;

import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisItems;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import net.neoforged.neoforge.registries.DeferredHolder;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockLootSubProvider extends BlockLootSubProvider {
	public FloralisBlockLootSubProvider(HolderLookup.Provider pProvider) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pProvider);
	}

	@Override
	public void generate() {
		this.dropCrop();
		this.dropNone();
		this.dropPlant();
		this.dropPot();
		this.dropThis();
	}

	public void dropCrop() {
		this.dropCrop(FloralisBlocks.WHITE_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.WHITE_PETALS.get(), FloralisItems.WHITE_FLOWER.get(), FloralisItems.WHITE_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_GRAY_PETALS.get(), FloralisItems.LIGHT_GRAY_FLOWER.get(), FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.GRAY_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GRAY_PETALS.get(), FloralisItems.GRAY_FLOWER.get(), FloralisItems.GRAY_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.BLACK_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLACK_PETALS.get(), FloralisItems.BLACK_FLOWER.get(), FloralisItems.BLACK_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.BROWN_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BROWN_PETALS.get(), FloralisItems.BROWN_FLOWER.get(), FloralisItems.BROWN_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.RED_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.RED_PETALS.get(), FloralisItems.RED_FLOWER.get(), FloralisItems.RED_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.ORANGE_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.ORANGE_PETALS.get(), FloralisItems.ORANGE_FLOWER.get(), FloralisItems.ORANGE_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.YELLOW_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.YELLOW_PETALS.get(), FloralisItems.YELLOW_FLOWER.get(), FloralisItems.YELLOW_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.LIME_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIME_PETALS.get(), FloralisItems.LIME_FLOWER.get(), FloralisItems.LIME_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.GREEN_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GREEN_PETALS.get(), FloralisItems.GREEN_FLOWER.get(), FloralisItems.GREEN_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.CYAN_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.CYAN_PETALS.get(), FloralisItems.CYAN_FLOWER.get(), FloralisItems.CYAN_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_BLUE_PETALS.get(), FloralisItems.LIGHT_BLUE_FLOWER.get(), FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.BLUE_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLUE_PETALS.get(), FloralisItems.BLUE_FLOWER.get(), FloralisItems.BLUE_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.PURPLE_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PURPLE_PETALS.get(), FloralisItems.PURPLE_FLOWER.get(), FloralisItems.PURPLE_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.MAGENTA_PETALS.get(), FloralisItems.MAGENTA_FLOWER.get(), FloralisItems.MAGENTA_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.PINK_FLOWER_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PINK_PETALS.get(), FloralisItems.PINK_FLOWER.get(), FloralisItems.PINK_FLOWER_SEEDS.get());
		this.dropCrop(FloralisBlocks.WHITE_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.WHITE_PETALS.get(), FloralisItems.WHITE_CACTUS.get(), FloralisItems.WHITE_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_GRAY_PETALS.get(), FloralisItems.LIGHT_GRAY_CACTUS.get(), FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.GRAY_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GRAY_PETALS.get(), FloralisItems.GRAY_CACTUS.get(), FloralisItems.GRAY_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.BLACK_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLACK_PETALS.get(), FloralisItems.BLACK_CACTUS.get(), FloralisItems.BLACK_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.BROWN_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BROWN_PETALS.get(), FloralisItems.BROWN_CACTUS.get(), FloralisItems.BROWN_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.RED_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.RED_PETALS.get(), FloralisItems.RED_CACTUS.get(), FloralisItems.RED_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.ORANGE_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.ORANGE_PETALS.get(), FloralisItems.ORANGE_CACTUS.get(), FloralisItems.ORANGE_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.YELLOW_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.YELLOW_PETALS.get(), FloralisItems.YELLOW_CACTUS.get(), FloralisItems.YELLOW_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.LIME_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIME_PETALS.get(), FloralisItems.LIME_CACTUS.get(), FloralisItems.LIME_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.GREEN_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GREEN_PETALS.get(), FloralisItems.GREEN_CACTUS.get(), FloralisItems.GREEN_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.CYAN_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.CYAN_PETALS.get(), FloralisItems.CYAN_CACTUS.get(), FloralisItems.CYAN_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_BLUE_PETALS.get(), FloralisItems.LIGHT_BLUE_CACTUS.get(), FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.BLUE_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLUE_PETALS.get(), FloralisItems.BLUE_CACTUS.get(), FloralisItems.BLUE_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.PURPLE_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PURPLE_PETALS.get(), FloralisItems.PURPLE_CACTUS.get(), FloralisItems.PURPLE_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.MAGENTA_PETALS.get(), FloralisItems.MAGENTA_CACTUS.get(), FloralisItems.MAGENTA_CACTUS_SEEDS.get());
		this.dropCrop(FloralisBlocks.PINK_CACTUS_CROP.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PINK_PETALS.get(), FloralisItems.PINK_CACTUS.get(), FloralisItems.PINK_CACTUS_SEEDS.get());
	}

	public void dropNone() {
		this.dropNone(FloralisBlocks.CLOCHED_WHITE_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_LIGHT_GRAY_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_GRAY_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_BLACK_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_BROWN_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_RED_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_ORANGE_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_YELLOW_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_LIME_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_GREEN_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_CYAN_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_LIGHT_BLUE_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_BLUE_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_PURPLE_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_MAGENTA_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_PINK_FLOWER_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_WHITE_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_LIGHT_GRAY_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_GRAY_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_BLACK_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_BROWN_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_RED_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_ORANGE_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_YELLOW_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_LIME_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_GREEN_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_CYAN_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_LIGHT_BLUE_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_BLUE_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_PURPLE_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_MAGENTA_CACTUS_CROP.get());
		this.dropNone(FloralisBlocks.CLOCHED_PINK_CACTUS_CROP.get());
	}

	public void dropPlant() {
		this.dropPlant(FloralisBlocks.WHITE_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.WHITE_PETALS.get(), FloralisItems.WHITE_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_GRAY_PETALS.get(), FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.GRAY_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GRAY_PETALS.get(), FloralisItems.GRAY_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.BLACK_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLACK_PETALS.get(), FloralisItems.BLACK_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.BROWN_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BROWN_PETALS.get(), FloralisItems.BROWN_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.RED_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.RED_PETALS.get(), FloralisItems.RED_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.ORANGE_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.ORANGE_PETALS.get(), FloralisItems.ORANGE_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.YELLOW_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.YELLOW_PETALS.get(), FloralisItems.YELLOW_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.LIME_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIME_PETALS.get(), FloralisItems.LIME_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.GREEN_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GREEN_PETALS.get(), FloralisItems.GREEN_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.CYAN_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.CYAN_PETALS.get(), FloralisItems.CYAN_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_BLUE_PETALS.get(), FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.BLUE_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLUE_PETALS.get(), FloralisItems.BLUE_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.PURPLE_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PURPLE_PETALS.get(), FloralisItems.PURPLE_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.MAGENTA_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.MAGENTA_PETALS.get(), FloralisItems.MAGENTA_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.PINK_FLOWER.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PINK_PETALS.get(), FloralisItems.PINK_FLOWER_SEEDS.get());
		this.dropPlant(FloralisBlocks.WHITE_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.WHITE_PETALS.get(), FloralisItems.WHITE_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_GRAY_PETALS.get(), FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.GRAY_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GRAY_PETALS.get(), FloralisItems.GRAY_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.BLACK_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLACK_PETALS.get(), FloralisItems.BLACK_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.BROWN_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BROWN_PETALS.get(), FloralisItems.BROWN_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.RED_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.RED_PETALS.get(), FloralisItems.RED_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.ORANGE_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.ORANGE_PETALS.get(), FloralisItems.ORANGE_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.YELLOW_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.YELLOW_PETALS.get(), FloralisItems.YELLOW_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.LIME_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIME_PETALS.get(), FloralisItems.LIME_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.GREEN_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.GREEN_PETALS.get(), FloralisItems.GREEN_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.CYAN_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.CYAN_PETALS.get(), FloralisItems.CYAN_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.LIGHT_BLUE_PETALS.get(), FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.BLUE_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.BLUE_PETALS.get(), FloralisItems.BLUE_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.PURPLE_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PURPLE_PETALS.get(), FloralisItems.PURPLE_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.MAGENTA_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.MAGENTA_PETALS.get(), FloralisItems.MAGENTA_CACTUS_SEEDS.get());
		this.dropPlant(FloralisBlocks.PINK_CACTUS.get(), FloralisItems.PLANT_FIBERS.get(), FloralisItems.PINK_PETALS.get(), FloralisItems.PINK_CACTUS_SEEDS.get());
	}

	public void dropPot() {
		this.dropPot(FloralisBlocks.POTTED_WHITE_FLOWER.get(), FloralisItems.WHITE_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(), FloralisItems.LIGHT_GRAY_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_GRAY_FLOWER.get(), FloralisItems.GRAY_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_BLACK_FLOWER.get(), FloralisItems.BLACK_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_BROWN_FLOWER.get(), FloralisItems.BROWN_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_RED_FLOWER.get(), FloralisItems.RED_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_ORANGE_FLOWER.get(), FloralisItems.ORANGE_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_YELLOW_FLOWER.get(), FloralisItems.YELLOW_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_LIME_FLOWER.get(), FloralisItems.LIME_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_GREEN_FLOWER.get(), FloralisItems.GREEN_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_CYAN_FLOWER.get(), FloralisItems.CYAN_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(), FloralisItems.LIGHT_BLUE_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_BLUE_FLOWER.get(), FloralisItems.BLUE_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_PURPLE_FLOWER.get(), FloralisItems.PURPLE_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_MAGENTA_FLOWER.get(), FloralisItems.MAGENTA_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_PINK_FLOWER.get(), FloralisItems.PINK_FLOWER.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_WHITE_CACTUS.get(), FloralisItems.WHITE_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(), FloralisItems.LIGHT_GRAY_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_GRAY_CACTUS.get(), FloralisItems.GRAY_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_BLACK_CACTUS.get(), FloralisItems.BLACK_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_BROWN_CACTUS.get(), FloralisItems.BROWN_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_RED_CACTUS.get(), FloralisItems.RED_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_ORANGE_CACTUS.get(), FloralisItems.ORANGE_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_YELLOW_CACTUS.get(), FloralisItems.YELLOW_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_LIME_CACTUS.get(), FloralisItems.LIME_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_GREEN_CACTUS.get(), FloralisItems.GREEN_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_CYAN_CACTUS.get(), FloralisItems.CYAN_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(), FloralisItems.LIGHT_BLUE_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_BLUE_CACTUS.get(), FloralisItems.BLUE_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_PURPLE_CACTUS.get(), FloralisItems.PURPLE_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_MAGENTA_CACTUS.get(), FloralisItems.MAGENTA_CACTUS.get(), Items.FLOWER_POT);
		this.dropPot(FloralisBlocks.POTTED_PINK_CACTUS.get(), FloralisItems.PINK_CACTUS.get(), Items.FLOWER_POT);
	}

	public void dropThis() {
		this.dropThis(FloralisBlocks.WHITE_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.GRAY_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.BLACK_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.BROWN_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.RED_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.ORANGE_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.YELLOW_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.LIME_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.GREEN_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.CYAN_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.BLUE_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.PURPLE_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.MAGENTA_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.PINK_DYE_BLOCK.get());
		this.dropThis(FloralisBlocks.PLANT_FIBERS_BLOCK.get());
	}

	public void dropCrop(Block pBlock, Item pFibers, Item pPetals, Item pPlant, Item pSeeds) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPlant).when(this.shearsOrSilk()).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(this.shearsOrSilk()).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5)).invert()))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(this.noShearsOrSilk()).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5)).invert()))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pFibers).when(this.noShearsOrSilk()).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))).apply(ApplyBonusCount.addUniformBonusCount(this.enchantments().getOrThrow(Enchantments.FORTUNE), 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPetals).when(this.noShearsOrSilk()).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))).apply(ApplyBonusCount.addUniformBonusCount(this.enchantments().getOrThrow(Enchantments.FORTUNE), 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(this.noShearsOrSilk()).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))).apply(ApplyBonusCount.addUniformBonusCount(this.enchantments().getOrThrow(Enchantments.FORTUNE), 2)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));
	}

	public void dropNone(Block pBlock) {
		this.add(pBlock, LootTable.lootTable());
	}

	public void dropPlant(Block pBlock, Item pFibers, Item pPetals, Item pSeeds) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pBlock).when(this.shearsOrSilk()))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pFibers).when(this.noShearsOrSilk()).apply(ApplyBonusCount.addUniformBonusCount(this.enchantments().getOrThrow(Enchantments.FORTUNE), 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPetals).when(this.noShearsOrSilk()).apply(ApplyBonusCount.addUniformBonusCount(this.enchantments().getOrThrow(Enchantments.FORTUNE), 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(this.noShearsOrSilk()).apply(ApplyBonusCount.addUniformBonusCount(this.enchantments().getOrThrow(Enchantments.FORTUNE), 2)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));
	}

	public void dropPot(Block pBlock, Item pPlant, Item pPot) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPlant))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPot))));
	}

	public void dropThis(Block pBlock) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pBlock))));
	}

	public HolderLookup.RegistryLookup<Enchantment> enchantments() {
		return this.registries.lookupOrThrow(Registries.ENCHANTMENT);
	}

	public HolderLookup.RegistryLookup<Item> items() {
		return this.registries.lookupOrThrow(Registries.ITEM);
	}

	@Override
	public Iterable<Block> getKnownBlocks() {
		return FloralisBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::value).collect(Collectors.toList());
	}

	public LootItemCondition.Builder noShearsOrSilk() {
		return this.shearsOrSilk().invert();
	}

	public LootItemCondition.Builder shears() {
		return MatchTool.toolMatches(ItemPredicate.Builder.item().of(this.items(), Items.SHEARS));
	}

	public LootItemCondition.Builder shearsOrSilk() {
		return this.shears().or(this.silk());
	}

	public LootItemCondition.Builder silk() {
		var enchantmentPredicate = new EnchantmentPredicate(this.enchantments().getOrThrow(Enchantments.SILK_TOUCH), MinMaxBounds.Ints.atLeast(1));
		return MatchTool.toolMatches(ItemPredicate.Builder.item().withSubPredicate(ItemSubPredicates.ENCHANTMENTS, ItemEnchantmentsPredicate.enchantments(List.of(enchantmentPredicate))));
	}
}
