package com.luxtracon.floralis.data.loot;

import com.luxtracon.floralis.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisItems;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.advancements.critereon.*;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
@MethodsReturnNonnullByDefault

public class FloralisBlockLoot extends BlockLootSubProvider {
	public static final EnchantmentPredicate SILK_TOUCH = new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1));

	public static final LootItemCondition.Builder SILK = MatchTool.toolMatches(ItemPredicate.Builder.item().withSubPredicate(ItemSubPredicates.ENCHANTMENTS, ItemEnchantmentsPredicate.enchantments(List.of(FloralisBlockLoot.SILK_TOUCH))));
	public static final LootItemCondition.Builder NO_SILK = FloralisBlockLoot.SILK.invert();
	public static final LootItemCondition.Builder SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));
	public static final LootItemCondition.Builder NO_SHEARS = FloralisBlockLoot.SHEARS.invert();
	public static final LootItemCondition.Builder SILK_OR_SHEARS = FloralisBlockLoot.SHEARS.or(FloralisBlockLoot.SILK);
	public static final LootItemCondition.Builder NO_SILK_OR_SHEARS = FloralisBlockLoot.SILK_OR_SHEARS.invert();

	public FloralisBlockLoot() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	public void generate() {
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

		this.dropSeed(FloralisBlocks.WHITE_FLOWER.get(), FloralisItems.WHITE_FLOWER_SEEDS.get(), FloralisItems.WHITE_PETALS.get());
		this.dropSeed(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), FloralisItems.LIGHT_GRAY_PETALS.get());
		this.dropSeed(FloralisBlocks.GRAY_FLOWER.get(), FloralisItems.GRAY_FLOWER_SEEDS.get(), FloralisItems.GRAY_PETALS.get());
		this.dropSeed(FloralisBlocks.BLACK_FLOWER.get(), FloralisItems.BLACK_FLOWER_SEEDS.get(), FloralisItems.BLACK_PETALS.get());
		this.dropSeed(FloralisBlocks.BROWN_FLOWER.get(), FloralisItems.BROWN_FLOWER_SEEDS.get(), FloralisItems.BROWN_PETALS.get());
		this.dropSeed(FloralisBlocks.RED_FLOWER.get(), FloralisItems.RED_FLOWER_SEEDS.get(), FloralisItems.RED_PETALS.get());
		this.dropSeed(FloralisBlocks.ORANGE_FLOWER.get(), FloralisItems.ORANGE_FLOWER_SEEDS.get(), FloralisItems.ORANGE_PETALS.get());
		this.dropSeed(FloralisBlocks.YELLOW_FLOWER.get(), FloralisItems.YELLOW_FLOWER_SEEDS.get(), FloralisItems.YELLOW_PETALS.get());
		this.dropSeed(FloralisBlocks.LIME_FLOWER.get(), FloralisItems.LIME_FLOWER_SEEDS.get(), FloralisItems.LIME_PETALS.get());
		this.dropSeed(FloralisBlocks.GREEN_FLOWER.get(), FloralisItems.GREEN_FLOWER_SEEDS.get(), FloralisItems.GREEN_PETALS.get());
		this.dropSeed(FloralisBlocks.CYAN_FLOWER.get(), FloralisItems.CYAN_FLOWER_SEEDS.get(), FloralisItems.CYAN_PETALS.get());
		this.dropSeed(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), FloralisItems.LIGHT_BLUE_PETALS.get());
		this.dropSeed(FloralisBlocks.BLUE_FLOWER.get(), FloralisItems.BLUE_FLOWER_SEEDS.get(), FloralisItems.BLUE_PETALS.get());
		this.dropSeed(FloralisBlocks.PURPLE_FLOWER.get(), FloralisItems.PURPLE_FLOWER_SEEDS.get(), FloralisItems.PURPLE_PETALS.get());
		this.dropSeed(FloralisBlocks.MAGENTA_FLOWER.get(), FloralisItems.MAGENTA_FLOWER_SEEDS.get(), FloralisItems.MAGENTA_PETALS.get());
		this.dropSeed(FloralisBlocks.PINK_FLOWER.get(), FloralisItems.PINK_FLOWER_SEEDS.get(), FloralisItems.PINK_PETALS.get());

		this.dropSeed(FloralisBlocks.WHITE_CACTUS.get(), FloralisItems.WHITE_CACTUS_SEEDS.get(), FloralisItems.WHITE_PETALS.get());
		this.dropSeed(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), FloralisItems.LIGHT_GRAY_PETALS.get());
		this.dropSeed(FloralisBlocks.GRAY_CACTUS.get(), FloralisItems.GRAY_CACTUS_SEEDS.get(), FloralisItems.GRAY_PETALS.get());
		this.dropSeed(FloralisBlocks.BLACK_CACTUS.get(), FloralisItems.BLACK_CACTUS_SEEDS.get(), FloralisItems.BLACK_PETALS.get());
		this.dropSeed(FloralisBlocks.BROWN_CACTUS.get(), FloralisItems.BROWN_CACTUS_SEEDS.get(), FloralisItems.BROWN_PETALS.get());
		this.dropSeed(FloralisBlocks.RED_CACTUS.get(), FloralisItems.RED_CACTUS_SEEDS.get(), FloralisItems.RED_PETALS.get());
		this.dropSeed(FloralisBlocks.ORANGE_CACTUS.get(), FloralisItems.ORANGE_CACTUS_SEEDS.get(), FloralisItems.ORANGE_PETALS.get());
		this.dropSeed(FloralisBlocks.YELLOW_CACTUS.get(), FloralisItems.YELLOW_CACTUS_SEEDS.get(), FloralisItems.YELLOW_PETALS.get());
		this.dropSeed(FloralisBlocks.LIME_CACTUS.get(), FloralisItems.LIME_CACTUS_SEEDS.get(), FloralisItems.LIME_PETALS.get());
		this.dropSeed(FloralisBlocks.GREEN_CACTUS.get(), FloralisItems.GREEN_CACTUS_SEEDS.get(), FloralisItems.GREEN_PETALS.get());
		this.dropSeed(FloralisBlocks.CYAN_CACTUS.get(), FloralisItems.CYAN_CACTUS_SEEDS.get(), FloralisItems.CYAN_PETALS.get());
		this.dropSeed(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), FloralisItems.LIGHT_BLUE_PETALS.get());
		this.dropSeed(FloralisBlocks.BLUE_CACTUS.get(), FloralisItems.BLUE_CACTUS_SEEDS.get(), FloralisItems.BLUE_PETALS.get());
		this.dropSeed(FloralisBlocks.PURPLE_CACTUS.get(), FloralisItems.PURPLE_CACTUS_SEEDS.get(), FloralisItems.PURPLE_PETALS.get());
		this.dropSeed(FloralisBlocks.MAGENTA_CACTUS.get(), FloralisItems.MAGENTA_CACTUS_SEEDS.get(), FloralisItems.MAGENTA_PETALS.get());
		this.dropSeed(FloralisBlocks.PINK_CACTUS.get(), FloralisItems.PINK_CACTUS_SEEDS.get(), FloralisItems.PINK_PETALS.get());

		this.dropCrop(FloralisBlocks.WHITE_FLOWER_CROP.get(), FloralisItems.WHITE_FLOWER.get(), FloralisItems.WHITE_FLOWER_SEEDS.get(), FloralisItems.WHITE_PETALS.get());
		this.dropCrop(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), FloralisItems.LIGHT_GRAY_FLOWER.get(), FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), FloralisItems.LIGHT_GRAY_PETALS.get());
		this.dropCrop(FloralisBlocks.GRAY_FLOWER_CROP.get(), FloralisItems.GRAY_FLOWER.get(), FloralisItems.GRAY_FLOWER_SEEDS.get(), FloralisItems.GRAY_PETALS.get());
		this.dropCrop(FloralisBlocks.BLACK_FLOWER_CROP.get(), FloralisItems.BLACK_FLOWER.get(), FloralisItems.BLACK_FLOWER_SEEDS.get(), FloralisItems.BLACK_PETALS.get());
		this.dropCrop(FloralisBlocks.BROWN_FLOWER_CROP.get(), FloralisItems.BROWN_FLOWER.get(), FloralisItems.BROWN_FLOWER_SEEDS.get(), FloralisItems.BROWN_PETALS.get());
		this.dropCrop(FloralisBlocks.RED_FLOWER_CROP.get(), FloralisItems.RED_FLOWER.get(), FloralisItems.RED_FLOWER_SEEDS.get(), FloralisItems.RED_PETALS.get());
		this.dropCrop(FloralisBlocks.ORANGE_FLOWER_CROP.get(), FloralisItems.ORANGE_FLOWER.get(), FloralisItems.ORANGE_FLOWER_SEEDS.get(), FloralisItems.ORANGE_PETALS.get());
		this.dropCrop(FloralisBlocks.YELLOW_FLOWER_CROP.get(), FloralisItems.YELLOW_FLOWER.get(), FloralisItems.YELLOW_FLOWER_SEEDS.get(), FloralisItems.YELLOW_PETALS.get());
		this.dropCrop(FloralisBlocks.LIME_FLOWER_CROP.get(), FloralisItems.LIME_FLOWER.get(), FloralisItems.LIME_FLOWER_SEEDS.get(), FloralisItems.LIME_PETALS.get());
		this.dropCrop(FloralisBlocks.GREEN_FLOWER_CROP.get(), FloralisItems.GREEN_FLOWER.get(), FloralisItems.GREEN_FLOWER_SEEDS.get(), FloralisItems.GREEN_PETALS.get());
		this.dropCrop(FloralisBlocks.CYAN_FLOWER_CROP.get(), FloralisItems.CYAN_FLOWER.get(), FloralisItems.CYAN_FLOWER_SEEDS.get(), FloralisItems.CYAN_PETALS.get());
		this.dropCrop(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), FloralisItems.LIGHT_BLUE_FLOWER.get(), FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), FloralisItems.LIGHT_BLUE_PETALS.get());
		this.dropCrop(FloralisBlocks.BLUE_FLOWER_CROP.get(), FloralisItems.BLUE_FLOWER.get(), FloralisItems.BLUE_FLOWER_SEEDS.get(), FloralisItems.BLUE_PETALS.get());
		this.dropCrop(FloralisBlocks.PURPLE_FLOWER_CROP.get(), FloralisItems.PURPLE_FLOWER.get(), FloralisItems.PURPLE_FLOWER_SEEDS.get(), FloralisItems.PURPLE_PETALS.get());
		this.dropCrop(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), FloralisItems.MAGENTA_FLOWER.get(), FloralisItems.MAGENTA_FLOWER_SEEDS.get(), FloralisItems.MAGENTA_PETALS.get());
		this.dropCrop(FloralisBlocks.PINK_FLOWER_CROP.get(), FloralisItems.PINK_FLOWER.get(), FloralisItems.PINK_FLOWER_SEEDS.get(), FloralisItems.PINK_PETALS.get());

		this.dropCrop(FloralisBlocks.WHITE_CACTUS_CROP.get(), FloralisItems.WHITE_CACTUS.get(), FloralisItems.WHITE_CACTUS_SEEDS.get(), FloralisItems.WHITE_PETALS.get());
		this.dropCrop(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), FloralisItems.LIGHT_GRAY_CACTUS.get(), FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), FloralisItems.LIGHT_GRAY_PETALS.get());
		this.dropCrop(FloralisBlocks.GRAY_CACTUS_CROP.get(), FloralisItems.GRAY_CACTUS.get(), FloralisItems.GRAY_CACTUS_SEEDS.get(), FloralisItems.GRAY_PETALS.get());
		this.dropCrop(FloralisBlocks.BLACK_CACTUS_CROP.get(), FloralisItems.BLACK_CACTUS.get(), FloralisItems.BLACK_CACTUS_SEEDS.get(), FloralisItems.BLACK_PETALS.get());
		this.dropCrop(FloralisBlocks.BROWN_CACTUS_CROP.get(), FloralisItems.BROWN_CACTUS.get(), FloralisItems.BROWN_CACTUS_SEEDS.get(), FloralisItems.BROWN_PETALS.get());
		this.dropCrop(FloralisBlocks.RED_CACTUS_CROP.get(), FloralisItems.RED_CACTUS.get(), FloralisItems.RED_CACTUS_SEEDS.get(), FloralisItems.RED_PETALS.get());
		this.dropCrop(FloralisBlocks.ORANGE_CACTUS_CROP.get(), FloralisItems.ORANGE_CACTUS.get(), FloralisItems.ORANGE_CACTUS_SEEDS.get(), FloralisItems.ORANGE_PETALS.get());
		this.dropCrop(FloralisBlocks.YELLOW_CACTUS_CROP.get(), FloralisItems.YELLOW_CACTUS.get(), FloralisItems.YELLOW_CACTUS_SEEDS.get(), FloralisItems.YELLOW_PETALS.get());
		this.dropCrop(FloralisBlocks.LIME_CACTUS_CROP.get(), FloralisItems.LIME_CACTUS.get(), FloralisItems.LIME_CACTUS_SEEDS.get(), FloralisItems.LIME_PETALS.get());
		this.dropCrop(FloralisBlocks.GREEN_CACTUS_CROP.get(), FloralisItems.GREEN_CACTUS.get(), FloralisItems.GREEN_CACTUS_SEEDS.get(), FloralisItems.GREEN_PETALS.get());
		this.dropCrop(FloralisBlocks.CYAN_CACTUS_CROP.get(), FloralisItems.CYAN_CACTUS.get(), FloralisItems.CYAN_CACTUS_SEEDS.get(), FloralisItems.CYAN_PETALS.get());
		this.dropCrop(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), FloralisItems.LIGHT_BLUE_CACTUS.get(), FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), FloralisItems.LIGHT_BLUE_PETALS.get());
		this.dropCrop(FloralisBlocks.BLUE_CACTUS_CROP.get(), FloralisItems.BLUE_CACTUS.get(), FloralisItems.BLUE_CACTUS_SEEDS.get(), FloralisItems.BLUE_PETALS.get());
		this.dropCrop(FloralisBlocks.PURPLE_CACTUS_CROP.get(), FloralisItems.PURPLE_CACTUS.get(), FloralisItems.PURPLE_CACTUS_SEEDS.get(), FloralisItems.PURPLE_PETALS.get());
		this.dropCrop(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), FloralisItems.MAGENTA_CACTUS.get(), FloralisItems.MAGENTA_CACTUS_SEEDS.get(), FloralisItems.MAGENTA_PETALS.get());
		this.dropCrop(FloralisBlocks.PINK_CACTUS_CROP.get(), FloralisItems.PINK_CACTUS.get(), FloralisItems.PINK_CACTUS_SEEDS.get(), FloralisItems.PINK_PETALS.get());

		this.dropPots(FloralisBlocks.POTTED_WHITE_FLOWER.get(), FloralisItems.WHITE_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(), FloralisItems.LIGHT_GRAY_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_GRAY_FLOWER.get(), FloralisItems.GRAY_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_BLACK_FLOWER.get(), FloralisItems.BLACK_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_BROWN_FLOWER.get(), FloralisItems.BROWN_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_RED_FLOWER.get(), FloralisItems.RED_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_ORANGE_FLOWER.get(), FloralisItems.ORANGE_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_YELLOW_FLOWER.get(), FloralisItems.YELLOW_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_LIME_FLOWER.get(), FloralisItems.LIME_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_GREEN_FLOWER.get(), FloralisItems.GREEN_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_CYAN_FLOWER.get(), FloralisItems.CYAN_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(), FloralisItems.LIGHT_BLUE_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_BLUE_FLOWER.get(), FloralisItems.BLUE_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_PURPLE_FLOWER.get(), FloralisItems.PURPLE_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_MAGENTA_FLOWER.get(), FloralisItems.MAGENTA_FLOWER.get());
		this.dropPots(FloralisBlocks.POTTED_PINK_FLOWER.get(), FloralisItems.PINK_FLOWER.get());

		this.dropPots(FloralisBlocks.POTTED_WHITE_CACTUS.get(), FloralisItems.WHITE_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(), FloralisItems.LIGHT_GRAY_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_GRAY_CACTUS.get(), FloralisItems.GRAY_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_BLACK_CACTUS.get(), FloralisItems.BLACK_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_BROWN_CACTUS.get(), FloralisItems.BROWN_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_RED_CACTUS.get(), FloralisItems.RED_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_ORANGE_CACTUS.get(), FloralisItems.ORANGE_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_YELLOW_CACTUS.get(), FloralisItems.YELLOW_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_LIME_CACTUS.get(), FloralisItems.LIME_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_GREEN_CACTUS.get(), FloralisItems.GREEN_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_CYAN_CACTUS.get(), FloralisItems.CYAN_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(), FloralisItems.LIGHT_BLUE_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_BLUE_CACTUS.get(), FloralisItems.BLUE_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_PURPLE_CACTUS.get(), FloralisItems.PURPLE_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_MAGENTA_CACTUS.get(), FloralisItems.MAGENTA_CACTUS.get());
		this.dropPots(FloralisBlocks.POTTED_PINK_CACTUS.get(), FloralisItems.PINK_CACTUS.get());

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

	public void dropThis(Block pBlock) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pBlock))));
	}

	public void dropSeed(Block pBlock, Item pSeeds, Item pPetals) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pBlock).when(FloralisBlockLoot.SILK_OR_SHEARS))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.FORTUNE, 2)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPetals).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.FORTUNE, 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(FloralisItems.PLANT_FIBERS.get()).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.FORTUNE, 2)))));
	}

	public void dropCrop(Block pBlock, Item pItem, Item pSeeds, Item pPetals) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pItem).when(FloralisBlockLoot.SILK_OR_SHEARS).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(FloralisBlockLoot.SILK_OR_SHEARS).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5)).invert()))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.FORTUNE, 2)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pPetals).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.FORTUNE, 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(FloralisItems.PLANT_FIBERS.get()).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.FORTUNE, 2)))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(pSeeds).when(FloralisBlockLoot.NO_SILK_OR_SHEARS).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FloralisBlockStateProperties.AGE, 5)).invert()))));
	}

	public void dropPots(Block pBlock, Item pItem) {
		this.add(pBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(pItem))).withPool(LootPool.lootPool().add(LootItem.lootTableItem(Blocks.FLOWER_POT))));
	}

	public void dropNone(Block pBlock) {
		this.add(pBlock, LootTable.lootTable());
	}

	@Override
	public Iterable<Block> getKnownBlocks() {
		return FloralisBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::value).collect(Collectors.toList());
	}
}
