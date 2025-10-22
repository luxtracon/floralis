package com.luxtracon.floralis.client.events;

import com.luxtracon.floralis.client.extensions.ClientBlockExtensions;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisColors;
import com.luxtracon.floralis.common.registry.FloralisConstants;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

@EventBusSubscriber(modid = FloralisConstants.FLORALIS, value = Dist.CLIENT)
public class FloralisClientModEvents {

	@SubscribeEvent
	public static void onRegisterClientExtensions(RegisterClientExtensionsEvent pEvent) {
		pEvent.registerBlock(new ClientBlockExtensions(), FloralisBlocks.POTTED_WHITE_CACTUS.get(), FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(), FloralisBlocks.POTTED_GRAY_CACTUS.get(), FloralisBlocks.POTTED_BLACK_CACTUS.get(), FloralisBlocks.POTTED_BROWN_CACTUS.get(), FloralisBlocks.POTTED_RED_CACTUS.get(), FloralisBlocks.POTTED_ORANGE_CACTUS.get(), FloralisBlocks.POTTED_YELLOW_CACTUS.get(), FloralisBlocks.POTTED_LIME_CACTUS.get(), FloralisBlocks.POTTED_GREEN_CACTUS.get(), FloralisBlocks.POTTED_CYAN_CACTUS.get(), FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(), FloralisBlocks.POTTED_BLUE_CACTUS.get(), FloralisBlocks.POTTED_PURPLE_CACTUS.get(), FloralisBlocks.POTTED_MAGENTA_CACTUS.get(), FloralisBlocks.POTTED_PINK_CACTUS.get(), FloralisBlocks.POTTED_WHITE_FLOWER.get(), FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(), FloralisBlocks.POTTED_GRAY_FLOWER.get(), FloralisBlocks.POTTED_BLACK_FLOWER.get(), FloralisBlocks.POTTED_BROWN_FLOWER.get(), FloralisBlocks.POTTED_RED_FLOWER.get(), FloralisBlocks.POTTED_ORANGE_FLOWER.get(), FloralisBlocks.POTTED_YELLOW_FLOWER.get(), FloralisBlocks.POTTED_LIME_FLOWER.get(), FloralisBlocks.POTTED_GREEN_FLOWER.get(), FloralisBlocks.POTTED_CYAN_FLOWER.get(), FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(), FloralisBlocks.POTTED_BLUE_FLOWER.get(), FloralisBlocks.POTTED_PURPLE_FLOWER.get(), FloralisBlocks.POTTED_MAGENTA_FLOWER.get(), FloralisBlocks.POTTED_PINK_FLOWER.get());
	}

	@SubscribeEvent
	public static void onRegisterColorHandlers(RegisterColorHandlersEvent.Block pEvent) {
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PLANT_FIBERS_BLOCK.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.WHITE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GRAY_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLACK_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BROWN_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.RED_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.ORANGE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.YELLOW_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIME_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GREEN_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.CYAN_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLUE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PURPLE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.MAGENTA_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PINK_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.WHITE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GRAY_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLACK_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BROWN_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.RED_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.ORANGE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.YELLOW_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIME_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GREEN_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.CYAN_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLUE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PURPLE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.MAGENTA_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PINK_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.WHITE_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GRAY_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLACK_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BROWN_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.RED_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.ORANGE_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.YELLOW_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIME_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GREEN_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.CYAN_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLUE_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PURPLE_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.MAGENTA_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PINK_CACTUS_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.WHITE_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GRAY_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLACK_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BROWN_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.RED_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.ORANGE_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.YELLOW_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIME_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.GREEN_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.CYAN_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.BLUE_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PURPLE_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.MAGENTA_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.PINK_FLOWER_CROP.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_WHITE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_GRAY_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_BLACK_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_BROWN_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_RED_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_LIME_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_GREEN_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_CYAN_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_BLUE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_PINK_CACTUS.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_WHITE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_GRAY_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_BLACK_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_BROWN_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_RED_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_LIME_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_GREEN_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_CYAN_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_BLUE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		pEvent.register(FloralisClientModEvents.blockColor(), FloralisBlocks.POTTED_PINK_FLOWER.get());
	}

	public static BlockColor blockColor() {
		return (blockState, blockAndTintGetter, blockPos, i) -> blockAndTintGetter != null && blockPos != null ? BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos) : FloralisColors.TINT;
	}
}
