package com.luxtracon.floralis.proxy;

import com.google.common.collect.ImmutableMap;

import com.luxtracon.floralis.constant.FloralisConstant;
import com.luxtracon.floralis.config.FloralisConfig;
import com.luxtracon.floralis.registry.*;
import com.luxtracon.floralis.trade.EmeraldsForItemsTrade;
import com.luxtracon.floralis.trade.ItemsForEmeraldsTrade;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault

public class ClientProxy extends CommonProxy {
	public ClientProxy() {

	}

	@Override
	public void onCreativeModeTabRegister(CreativeModeTabEvent.Register pEvent) {
		pEvent.registerCreativeModeTab(new ResourceLocation(FloralisConstant.MODID, "floralis"), pBuilder -> pBuilder.withSearchBar().title(Component.translatable("tab." + FloralisConstant.MODID + ".item_group")).icon(() -> new ItemStack(FloralisItems.PURPLE_CACTUS.get())).displayItems((pSet, pOutput, pOperator) -> {
			pOutput.accept(FloralisItems.WHITE_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.GRAY_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.BLACK_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.BROWN_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.RED_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.ORANGE_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.YELLOW_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.LIME_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.GREEN_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.CYAN_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.BLUE_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.PURPLE_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.MAGENTA_DYE_BLOCK.get());
			pOutput.accept(FloralisItems.PINK_DYE_BLOCK.get());

			pOutput.accept(FloralisItems.PLANT_FIBERS_BLOCK.get());

			pOutput.accept(FloralisItems.WHITE_FLOWER.get());
			pOutput.accept(FloralisItems.LIGHT_GRAY_FLOWER.get());
			pOutput.accept(FloralisItems.GRAY_FLOWER.get());
			pOutput.accept(FloralisItems.BLACK_FLOWER.get());
			pOutput.accept(FloralisItems.BROWN_FLOWER.get());
			pOutput.accept(FloralisItems.RED_FLOWER.get());
			pOutput.accept(FloralisItems.ORANGE_FLOWER.get());
			pOutput.accept(FloralisItems.YELLOW_FLOWER.get());
			pOutput.accept(FloralisItems.LIME_FLOWER.get());
			pOutput.accept(FloralisItems.GREEN_FLOWER.get());
			pOutput.accept(FloralisItems.CYAN_FLOWER.get());
			pOutput.accept(FloralisItems.LIGHT_BLUE_FLOWER.get());
			pOutput.accept(FloralisItems.BLUE_FLOWER.get());
			pOutput.accept(FloralisItems.PURPLE_FLOWER.get());
			pOutput.accept(FloralisItems.MAGENTA_FLOWER.get());
			pOutput.accept(FloralisItems.PINK_FLOWER.get());

			pOutput.accept(FloralisItems.WHITE_CACTUS.get());
			pOutput.accept(FloralisItems.LIGHT_GRAY_CACTUS.get());
			pOutput.accept(FloralisItems.GRAY_CACTUS.get());
			pOutput.accept(FloralisItems.BLACK_CACTUS.get());
			pOutput.accept(FloralisItems.BROWN_CACTUS.get());
			pOutput.accept(FloralisItems.RED_CACTUS.get());
			pOutput.accept(FloralisItems.ORANGE_CACTUS.get());
			pOutput.accept(FloralisItems.YELLOW_CACTUS.get());
			pOutput.accept(FloralisItems.LIME_CACTUS.get());
			pOutput.accept(FloralisItems.GREEN_CACTUS.get());
			pOutput.accept(FloralisItems.CYAN_CACTUS.get());
			pOutput.accept(FloralisItems.LIGHT_BLUE_CACTUS.get());
			pOutput.accept(FloralisItems.BLUE_CACTUS.get());
			pOutput.accept(FloralisItems.PURPLE_CACTUS.get());
			pOutput.accept(FloralisItems.MAGENTA_CACTUS.get());
			pOutput.accept(FloralisItems.PINK_CACTUS.get());

			pOutput.accept(FloralisItems.WHITE_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.GRAY_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.BLACK_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.BROWN_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.RED_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.ORANGE_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.YELLOW_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.LIME_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.GREEN_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.CYAN_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.BLUE_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.PURPLE_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.MAGENTA_FLOWER_SEEDS.get());
			pOutput.accept(FloralisItems.PINK_FLOWER_SEEDS.get());

			pOutput.accept(FloralisItems.WHITE_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.GRAY_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.BLACK_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.BROWN_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.RED_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.ORANGE_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.YELLOW_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.LIME_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.GREEN_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.CYAN_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.BLUE_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.PURPLE_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.MAGENTA_CACTUS_SEEDS.get());
			pOutput.accept(FloralisItems.PINK_CACTUS_SEEDS.get());

			pOutput.accept(FloralisItems.WHITE_PETALS.get());
			pOutput.accept(FloralisItems.LIGHT_GRAY_PETALS.get());
			pOutput.accept(FloralisItems.GRAY_PETALS.get());
			pOutput.accept(FloralisItems.BLACK_PETALS.get());
			pOutput.accept(FloralisItems.BROWN_PETALS.get());
			pOutput.accept(FloralisItems.RED_PETALS.get());
			pOutput.accept(FloralisItems.ORANGE_PETALS.get());
			pOutput.accept(FloralisItems.YELLOW_PETALS.get());
			pOutput.accept(FloralisItems.LIME_PETALS.get());
			pOutput.accept(FloralisItems.GREEN_PETALS.get());
			pOutput.accept(FloralisItems.CYAN_PETALS.get());
			pOutput.accept(FloralisItems.LIGHT_BLUE_PETALS.get());
			pOutput.accept(FloralisItems.BLUE_PETALS.get());
			pOutput.accept(FloralisItems.PURPLE_PETALS.get());
			pOutput.accept(FloralisItems.MAGENTA_PETALS.get());
			pOutput.accept(FloralisItems.PINK_PETALS.get());

			pOutput.accept(FloralisItems.PLANT_FIBERS.get());
		}));
	}

	@Override
	public void onFMLCommonSetup(FMLCommonSetupEvent pEvent) {
		pEvent.enqueueWork(FloralisCompostables::setup);
		pEvent.enqueueWork(FloralisFlammables::setup);
		pEvent.enqueueWork(FloralisPottables::setup);
	}

	@Override
	public void onFMLLoadComplete(FMLLoadCompleteEvent pEvent) {
		this.blockColor(FloralisBlocks.WHITE_FLOWER.get());
		this.blockColor(FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		this.blockColor(FloralisBlocks.GRAY_FLOWER.get());
		this.blockColor(FloralisBlocks.BLACK_FLOWER.get());
		this.blockColor(FloralisBlocks.BROWN_FLOWER.get());
		this.blockColor(FloralisBlocks.RED_FLOWER.get());
		this.blockColor(FloralisBlocks.ORANGE_FLOWER.get());
		this.blockColor(FloralisBlocks.YELLOW_FLOWER.get());
		this.blockColor(FloralisBlocks.LIME_FLOWER.get());
		this.blockColor(FloralisBlocks.GREEN_FLOWER.get());
		this.blockColor(FloralisBlocks.CYAN_FLOWER.get());
		this.blockColor(FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		this.blockColor(FloralisBlocks.BLUE_FLOWER.get());
		this.blockColor(FloralisBlocks.PURPLE_FLOWER.get());
		this.blockColor(FloralisBlocks.MAGENTA_FLOWER.get());
		this.blockColor(FloralisBlocks.PINK_FLOWER.get());

		this.blockColor(FloralisBlocks.WHITE_CACTUS.get());
		this.blockColor(FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		this.blockColor(FloralisBlocks.GRAY_CACTUS.get());
		this.blockColor(FloralisBlocks.BLACK_CACTUS.get());
		this.blockColor(FloralisBlocks.BROWN_CACTUS.get());
		this.blockColor(FloralisBlocks.RED_CACTUS.get());
		this.blockColor(FloralisBlocks.ORANGE_CACTUS.get());
		this.blockColor(FloralisBlocks.YELLOW_CACTUS.get());
		this.blockColor(FloralisBlocks.LIME_CACTUS.get());
		this.blockColor(FloralisBlocks.GREEN_CACTUS.get());
		this.blockColor(FloralisBlocks.CYAN_CACTUS.get());
		this.blockColor(FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		this.blockColor(FloralisBlocks.BLUE_CACTUS.get());
		this.blockColor(FloralisBlocks.PURPLE_CACTUS.get());
		this.blockColor(FloralisBlocks.MAGENTA_CACTUS.get());
		this.blockColor(FloralisBlocks.PINK_CACTUS.get());

		this.blockColor(FloralisBlocks.POTTED_WHITE_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_GRAY_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_BLACK_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_BROWN_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_RED_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_LIME_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_GREEN_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_CYAN_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_BLUE_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		this.blockColor(FloralisBlocks.POTTED_PINK_FLOWER.get());

		this.blockColor(FloralisBlocks.POTTED_WHITE_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_GRAY_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_BLACK_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_BROWN_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_RED_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_LIME_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_GREEN_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_CYAN_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_BLUE_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		this.blockColor(FloralisBlocks.POTTED_PINK_CACTUS.get());

		this.blockColor(FloralisBlocks.WHITE_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.GRAY_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.BLACK_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.BROWN_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.RED_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.ORANGE_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.YELLOW_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.LIME_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.GREEN_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.CYAN_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.BLUE_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.PURPLE_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.MAGENTA_FLOWER_CROP.get());
		this.blockColor(FloralisBlocks.PINK_FLOWER_CROP.get());

		this.blockColor(FloralisBlocks.WHITE_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.GRAY_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.BLACK_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.BROWN_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.RED_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.ORANGE_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.YELLOW_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.LIME_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.GREEN_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.CYAN_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.BLUE_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.PURPLE_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.MAGENTA_CACTUS_CROP.get());
		this.blockColor(FloralisBlocks.PINK_CACTUS_CROP.get());
	}

	@Override
	public void onServerAboutToStart(ServerAboutToStartEvent pEvent) {
		Registry<StructureProcessorList> structureProcessorList = pEvent.getServer().registryAccess().registry(Registries.PROCESSOR_LIST).orElseThrow();
		Registry<StructureTemplatePool> structureTemplatePool = pEvent.getServer().registryAccess().registry(Registries.TEMPLATE_POOL).orElseThrow();

		this.addPieceToPool(structureProcessorList, structureTemplatePool, "floralis:village/desert/houses/farm", new ResourceLocation("minecraft:village/desert/houses"), FloralisConfig.DESERT_FARM.get());
		this.addPieceToPool(structureProcessorList, structureTemplatePool, "floralis:village/plains/houses/farm", new ResourceLocation("minecraft:village/plains/houses"), FloralisConfig.PLAINS_FARM.get());
		this.addPieceToPool(structureProcessorList, structureTemplatePool, "floralis:village/savanna/houses/farm", new ResourceLocation("minecraft:village/savanna/houses"), FloralisConfig.SAVANNA_FARM.get());
		this.addPieceToPool(structureProcessorList, structureTemplatePool, "floralis:village/snowy/houses/farm", new ResourceLocation("minecraft:village/snowy/houses"), FloralisConfig.SNOWY_FARM.get());
		this.addPieceToPool(structureProcessorList, structureTemplatePool, "floralis:village/taiga/houses/farm", new ResourceLocation("minecraft:village/taiga/houses"), FloralisConfig.TAIGA_FARM.get());
	}

	@Override
	public void onVillagerTrades(VillagerTradesEvent pEvent) {
		if (pEvent.getType() == VillagerProfession.FARMER) {
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.WHITE_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.LIGHT_GRAY_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.GRAY_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.BLACK_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.BROWN_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.RED_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.ORANGE_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.YELLOW_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.LIME_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.GREEN_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.CYAN_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.LIGHT_BLUE_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.BLUE_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.PURPLE_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.MAGENTA_PETALS.get())));
			pEvent.getTrades().get(1).add(new ItemsForEmeraldsTrade(new ItemStack(FloralisItems.PINK_PETALS.get())));

			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.WHITE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.WHITE_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.GRAY_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.GRAY_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BLACK_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BLACK_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BROWN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BROWN_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.RED_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.RED_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.ORANGE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.ORANGE_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.YELLOW_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.YELLOW_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIME_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIME_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.GREEN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.GREEN_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.CYAN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.CYAN_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BLUE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BLUE_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.PURPLE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.PURPLE_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.MAGENTA_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).build()));
			pEvent.getTrades().get(1).add(new EmeraldsForItemsTrade(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.PINK_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.PINK_FLOWER_SEEDS.get()).build()));
		}
	}

	public void blockColor(Block pBlock) {
		Minecraft.getInstance().getBlockColors().register((pState, pLevel, pPos, pIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : GrassColor.get(0.5D, 1.0D), pBlock);
	}
}
