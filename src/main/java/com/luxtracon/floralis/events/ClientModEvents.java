package com.luxtracon.floralis.events;

import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstants;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;

@SuppressWarnings("deprecation, unused")

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = FloralisConstants.FLORALIS, value = Dist.CLIENT)
public class ClientModEvents {

	@SubscribeEvent
	public static void onFMLLoadComplete(FMLLoadCompleteEvent pEvent) {
		ClientModEvents.blockColor(FloralisBlocks.WHITE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.GRAY_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.BLACK_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.BROWN_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.RED_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.ORANGE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.YELLOW_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.LIME_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.GREEN_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.CYAN_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.BLUE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.PURPLE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.MAGENTA_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.PINK_FLOWER.get());

		ClientModEvents.blockColor(FloralisBlocks.WHITE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.GRAY_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.BLACK_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.BROWN_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.RED_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.ORANGE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.YELLOW_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.LIME_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.GREEN_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.CYAN_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.BLUE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.PURPLE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.MAGENTA_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.PINK_CACTUS.get());

		ClientModEvents.blockColor(FloralisBlocks.POTTED_WHITE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_GRAY_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_BLACK_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_BROWN_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_RED_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_LIME_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_GREEN_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_CYAN_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_BLUE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_PINK_FLOWER.get());

		ClientModEvents.blockColor(FloralisBlocks.POTTED_WHITE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_GRAY_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_BLACK_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_BROWN_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_RED_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_LIME_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_GREEN_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_CYAN_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_BLUE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		ClientModEvents.blockColor(FloralisBlocks.POTTED_PINK_CACTUS.get());

		ClientModEvents.blockColor(FloralisBlocks.WHITE_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.GRAY_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.BLACK_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.BROWN_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.RED_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.ORANGE_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.YELLOW_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.LIME_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.GREEN_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.CYAN_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.BLUE_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.PURPLE_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.MAGENTA_FLOWER_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.PINK_FLOWER_CROP.get());

		ClientModEvents.blockColor(FloralisBlocks.WHITE_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.GRAY_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.BLACK_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.BROWN_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.RED_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.ORANGE_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.YELLOW_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.LIME_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.GREEN_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.CYAN_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.BLUE_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.PURPLE_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.MAGENTA_CACTUS_CROP.get());
		ClientModEvents.blockColor(FloralisBlocks.PINK_CACTUS_CROP.get());
	}

	public static void blockColor(Block pBlock) {
		Minecraft.getInstance().getBlockColors().register((pState, pLevel, pPos, pIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : GrassColor.get(0.5D, 1.0D), pBlock);
	}
}
