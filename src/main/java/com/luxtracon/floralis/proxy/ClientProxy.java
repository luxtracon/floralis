package com.luxtracon.floralis.proxy;

import com.luxtracon.floralis.constant.FloralisConstant;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;

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
		pEvent.registerCreativeModeTab(new ResourceLocation(FloralisConstant.MODID, "floralis"), pBuilder -> pBuilder.withSearchBar().title(Component.translatable("tab." + FloralisConstant.MODID + ".item_group")).icon(() -> new ItemStack(FloralisItems.PURPLE_CACTUS.get())).displayItems((pParameters, pOperator) -> {
			pOperator.accept(FloralisItems.WHITE_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.GRAY_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.BLACK_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.BROWN_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.RED_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.ORANGE_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.YELLOW_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.LIME_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.GREEN_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.CYAN_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.BLUE_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.PURPLE_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.MAGENTA_DYE_BLOCK.get());
			pOperator.accept(FloralisItems.PINK_DYE_BLOCK.get());

			pOperator.accept(FloralisItems.PLANT_FIBERS_BLOCK.get());

			pOperator.accept(FloralisItems.WHITE_FLOWER.get());
			pOperator.accept(FloralisItems.LIGHT_GRAY_FLOWER.get());
			pOperator.accept(FloralisItems.GRAY_FLOWER.get());
			pOperator.accept(FloralisItems.BLACK_FLOWER.get());
			pOperator.accept(FloralisItems.BROWN_FLOWER.get());
			pOperator.accept(FloralisItems.RED_FLOWER.get());
			pOperator.accept(FloralisItems.ORANGE_FLOWER.get());
			pOperator.accept(FloralisItems.YELLOW_FLOWER.get());
			pOperator.accept(FloralisItems.LIME_FLOWER.get());
			pOperator.accept(FloralisItems.GREEN_FLOWER.get());
			pOperator.accept(FloralisItems.CYAN_FLOWER.get());
			pOperator.accept(FloralisItems.LIGHT_BLUE_FLOWER.get());
			pOperator.accept(FloralisItems.BLUE_FLOWER.get());
			pOperator.accept(FloralisItems.PURPLE_FLOWER.get());
			pOperator.accept(FloralisItems.MAGENTA_FLOWER.get());
			pOperator.accept(FloralisItems.PINK_FLOWER.get());

			pOperator.accept(FloralisItems.WHITE_CACTUS.get());
			pOperator.accept(FloralisItems.LIGHT_GRAY_CACTUS.get());
			pOperator.accept(FloralisItems.GRAY_CACTUS.get());
			pOperator.accept(FloralisItems.BLACK_CACTUS.get());
			pOperator.accept(FloralisItems.BROWN_CACTUS.get());
			pOperator.accept(FloralisItems.RED_CACTUS.get());
			pOperator.accept(FloralisItems.ORANGE_CACTUS.get());
			pOperator.accept(FloralisItems.YELLOW_CACTUS.get());
			pOperator.accept(FloralisItems.LIME_CACTUS.get());
			pOperator.accept(FloralisItems.GREEN_CACTUS.get());
			pOperator.accept(FloralisItems.CYAN_CACTUS.get());
			pOperator.accept(FloralisItems.LIGHT_BLUE_CACTUS.get());
			pOperator.accept(FloralisItems.BLUE_CACTUS.get());
			pOperator.accept(FloralisItems.PURPLE_CACTUS.get());
			pOperator.accept(FloralisItems.MAGENTA_CACTUS.get());
			pOperator.accept(FloralisItems.PINK_CACTUS.get());

			pOperator.accept(FloralisItems.WHITE_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.GRAY_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.BLACK_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.BROWN_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.RED_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.ORANGE_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.YELLOW_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.LIME_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.GREEN_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.CYAN_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.BLUE_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.PURPLE_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.MAGENTA_FLOWER_SEEDS.get());
			pOperator.accept(FloralisItems.PINK_FLOWER_SEEDS.get());

			pOperator.accept(FloralisItems.WHITE_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.GRAY_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.BLACK_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.BROWN_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.RED_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.ORANGE_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.YELLOW_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.LIME_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.GREEN_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.CYAN_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.BLUE_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.PURPLE_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.MAGENTA_CACTUS_SEEDS.get());
			pOperator.accept(FloralisItems.PINK_CACTUS_SEEDS.get());

			pOperator.accept(FloralisItems.WHITE_PETALS.get());
			pOperator.accept(FloralisItems.LIGHT_GRAY_PETALS.get());
			pOperator.accept(FloralisItems.GRAY_PETALS.get());
			pOperator.accept(FloralisItems.BLACK_PETALS.get());
			pOperator.accept(FloralisItems.BROWN_PETALS.get());
			pOperator.accept(FloralisItems.RED_PETALS.get());
			pOperator.accept(FloralisItems.ORANGE_PETALS.get());
			pOperator.accept(FloralisItems.YELLOW_PETALS.get());
			pOperator.accept(FloralisItems.LIME_PETALS.get());
			pOperator.accept(FloralisItems.GREEN_PETALS.get());
			pOperator.accept(FloralisItems.CYAN_PETALS.get());
			pOperator.accept(FloralisItems.LIGHT_BLUE_PETALS.get());
			pOperator.accept(FloralisItems.BLUE_PETALS.get());
			pOperator.accept(FloralisItems.PURPLE_PETALS.get());
			pOperator.accept(FloralisItems.MAGENTA_PETALS.get());
			pOperator.accept(FloralisItems.PINK_PETALS.get());

			pOperator.accept(FloralisItems.PLANT_FIBERS.get());
		}));
	}

	@Override
	public void onFMLCommonSetup(FMLCommonSetupEvent pEvent) {
		super.onFMLCommonSetup(pEvent);
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
		super.onServerAboutToStart(pEvent);
	}

	@Override
	public void onVillagerTrades(VillagerTradesEvent pEvent) {
		super.onVillagerTrades(pEvent);
	}

	public void blockColor(Block pBlock) {
		Minecraft.getInstance().getBlockColors().register((pState, pLevel, pPos, pIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : GrassColor.get(0.5D, 1.0D), pBlock);
	}
}
