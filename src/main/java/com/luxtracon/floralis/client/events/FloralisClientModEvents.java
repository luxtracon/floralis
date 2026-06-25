package com.luxtracon.floralis.client.events;

import com.luxtracon.floralis.client.tint.FloralisBlockTintSource;
import com.luxtracon.floralis.client.tint.FloralisPottedBlockTintSource;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;

import java.util.List;

import net.minecraft.client.color.block.BlockTintSource;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import org.jspecify.annotations.NullMarked;

@SuppressWarnings("unused")

@NullMarked

@EventBusSubscriber(modid = FloralisConstants.FLORALIS, value = Dist.CLIENT)
public class FloralisClientModEvents {

	@SubscribeEvent
	public static void onRegisterColorHandlers(RegisterColorHandlersEvent.BlockTintSources pEvent) {
		FloralisClientModEvents.blockTintSource(pEvent);
		FloralisClientModEvents.pottedBlockTintSource(pEvent);
	}

	public static void blockTintSource(RegisterColorHandlersEvent.BlockTintSources pEvent) {
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PLANT_FIBERS_BLOCK.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.WHITE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GRAY_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLACK_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BROWN_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.RED_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.ORANGE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.YELLOW_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIME_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GREEN_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.CYAN_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLUE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PURPLE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.MAGENTA_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PINK_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.WHITE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GRAY_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLACK_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BROWN_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.RED_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.ORANGE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.YELLOW_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIME_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GREEN_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.CYAN_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLUE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PURPLE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.MAGENTA_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PINK_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.WHITE_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GRAY_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLACK_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BROWN_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.RED_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.ORANGE_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.YELLOW_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIME_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GREEN_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.CYAN_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLUE_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PURPLE_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.MAGENTA_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PINK_CACTUS_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.WHITE_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GRAY_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLACK_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BROWN_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.RED_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.ORANGE_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.YELLOW_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIME_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.GREEN_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.CYAN_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.BLUE_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PURPLE_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.MAGENTA_FLOWER_CROP.get());
		pEvent.register(List.of(FloralisClientModEvents.blockTintSource()), FloralisBlocks.PINK_FLOWER_CROP.get());
	}

	public static void pottedBlockTintSource(RegisterColorHandlersEvent.BlockTintSources pEvent) {
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_WHITE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_GRAY_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_BLACK_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_BROWN_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_RED_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_LIME_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_GREEN_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_CYAN_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_BLUE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_PINK_CACTUS.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_WHITE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_GRAY_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_BLACK_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_BROWN_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_RED_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_LIME_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_GREEN_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_CYAN_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_BLUE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		pEvent.register(List.of(FloralisClientModEvents.pottedBlockTintSource()), FloralisBlocks.POTTED_PINK_FLOWER.get());
	}

	public static BlockTintSource blockTintSource() {
		return new FloralisBlockTintSource();
	}

	public static BlockTintSource pottedBlockTintSource() {
		return new FloralisPottedBlockTintSource();
	}
}
