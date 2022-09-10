package com.luxtracon.floralis.client.proxy;

import com.luxtracon.floralis.common.proxy.CommonProxy;
import com.luxtracon.floralis.common.registry.FloralisBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("deprecation")

public class ClientProxy extends CommonProxy {
	public ClientProxy() {

	}

	@Override
	public void loadComplete() {
		// BLOCK COLOR
		blockColor(FloralisBlocks.WHITE_FLOWER.get());
		blockColor(FloralisBlocks.ORANGE_FLOWER.get());
		blockColor(FloralisBlocks.MAGENTA_FLOWER.get());
		blockColor(FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		blockColor(FloralisBlocks.YELLOW_FLOWER.get());
		blockColor(FloralisBlocks.LIME_FLOWER.get());
		blockColor(FloralisBlocks.PINK_FLOWER.get());
		blockColor(FloralisBlocks.GRAY_FLOWER.get());
		blockColor(FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		blockColor(FloralisBlocks.CYAN_FLOWER.get());
		blockColor(FloralisBlocks.PURPLE_FLOWER.get());
		blockColor(FloralisBlocks.BLUE_FLOWER.get());
		blockColor(FloralisBlocks.BROWN_FLOWER.get());
		blockColor(FloralisBlocks.GREEN_FLOWER.get());
		blockColor(FloralisBlocks.RED_FLOWER.get());
		blockColor(FloralisBlocks.BLACK_FLOWER.get());
		blockColor(FloralisBlocks.WHITE_CACTUS.get());
		blockColor(FloralisBlocks.ORANGE_CACTUS.get());
		blockColor(FloralisBlocks.MAGENTA_CACTUS.get());
		blockColor(FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		blockColor(FloralisBlocks.YELLOW_CACTUS.get());
		blockColor(FloralisBlocks.LIME_CACTUS.get());
		blockColor(FloralisBlocks.PINK_CACTUS.get());
		blockColor(FloralisBlocks.GRAY_CACTUS.get());
		blockColor(FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		blockColor(FloralisBlocks.CYAN_CACTUS.get());
		blockColor(FloralisBlocks.PURPLE_CACTUS.get());
		blockColor(FloralisBlocks.BLUE_CACTUS.get());
		blockColor(FloralisBlocks.BROWN_CACTUS.get());
		blockColor(FloralisBlocks.GREEN_CACTUS.get());
		blockColor(FloralisBlocks.RED_CACTUS.get());
		blockColor(FloralisBlocks.BLACK_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_WHITE_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_LIME_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_PINK_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_GRAY_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_CYAN_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_BLUE_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_BROWN_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_GREEN_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_RED_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_BLACK_FLOWER.get());
		blockColor(FloralisBlocks.POTTED_WHITE_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_LIME_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_PINK_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_GRAY_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_CYAN_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_BLUE_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_BROWN_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_GREEN_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_RED_CACTUS.get());
		blockColor(FloralisBlocks.POTTED_BLACK_CACTUS.get());
		blockColor(FloralisBlocks.WHITE_FLOWER_CROP.get());
		blockColor(FloralisBlocks.ORANGE_FLOWER_CROP.get());
		blockColor(FloralisBlocks.MAGENTA_FLOWER_CROP.get());
		blockColor(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get());
		blockColor(FloralisBlocks.YELLOW_FLOWER_CROP.get());
		blockColor(FloralisBlocks.LIME_FLOWER_CROP.get());
		blockColor(FloralisBlocks.PINK_FLOWER_CROP.get());
		blockColor(FloralisBlocks.GRAY_FLOWER_CROP.get());
		blockColor(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get());
		blockColor(FloralisBlocks.CYAN_FLOWER_CROP.get());
		blockColor(FloralisBlocks.PURPLE_FLOWER_CROP.get());
		blockColor(FloralisBlocks.BLUE_FLOWER_CROP.get());
		blockColor(FloralisBlocks.BROWN_FLOWER_CROP.get());
		blockColor(FloralisBlocks.GREEN_FLOWER_CROP.get());
		blockColor(FloralisBlocks.RED_FLOWER_CROP.get());
		blockColor(FloralisBlocks.BLACK_FLOWER_CROP.get());
		blockColor(FloralisBlocks.WHITE_CACTUS_CROP.get());
		blockColor(FloralisBlocks.ORANGE_CACTUS_CROP.get());
		blockColor(FloralisBlocks.MAGENTA_CACTUS_CROP.get());
		blockColor(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get());
		blockColor(FloralisBlocks.YELLOW_CACTUS_CROP.get());
		blockColor(FloralisBlocks.LIME_CACTUS_CROP.get());
		blockColor(FloralisBlocks.PINK_CACTUS_CROP.get());
		blockColor(FloralisBlocks.GRAY_CACTUS_CROP.get());
		blockColor(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get());
		blockColor(FloralisBlocks.CYAN_CACTUS_CROP.get());
		blockColor(FloralisBlocks.PURPLE_CACTUS_CROP.get());
		blockColor(FloralisBlocks.BLUE_CACTUS_CROP.get());
		blockColor(FloralisBlocks.BROWN_CACTUS_CROP.get());
		blockColor(FloralisBlocks.GREEN_CACTUS_CROP.get());
		blockColor(FloralisBlocks.RED_CACTUS_CROP.get());
		blockColor(FloralisBlocks.BLACK_CACTUS_CROP.get());

		// RENDER CUTOUT
		renderCutout(FloralisBlocks.WHITE_FLOWER.get());
		renderCutout(FloralisBlocks.ORANGE_FLOWER.get());
		renderCutout(FloralisBlocks.MAGENTA_FLOWER.get());
		renderCutout(FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		renderCutout(FloralisBlocks.YELLOW_FLOWER.get());
		renderCutout(FloralisBlocks.LIME_FLOWER.get());
		renderCutout(FloralisBlocks.PINK_FLOWER.get());
		renderCutout(FloralisBlocks.GRAY_FLOWER.get());
		renderCutout(FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		renderCutout(FloralisBlocks.CYAN_FLOWER.get());
		renderCutout(FloralisBlocks.PURPLE_FLOWER.get());
		renderCutout(FloralisBlocks.BLUE_FLOWER.get());
		renderCutout(FloralisBlocks.BROWN_FLOWER.get());
		renderCutout(FloralisBlocks.GREEN_FLOWER.get());
		renderCutout(FloralisBlocks.RED_FLOWER.get());
		renderCutout(FloralisBlocks.BLACK_FLOWER.get());
		renderCutout(FloralisBlocks.WHITE_CACTUS.get());
		renderCutout(FloralisBlocks.ORANGE_CACTUS.get());
		renderCutout(FloralisBlocks.MAGENTA_CACTUS.get());
		renderCutout(FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		renderCutout(FloralisBlocks.YELLOW_CACTUS.get());
		renderCutout(FloralisBlocks.LIME_CACTUS.get());
		renderCutout(FloralisBlocks.PINK_CACTUS.get());
		renderCutout(FloralisBlocks.GRAY_CACTUS.get());
		renderCutout(FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		renderCutout(FloralisBlocks.CYAN_CACTUS.get());
		renderCutout(FloralisBlocks.PURPLE_CACTUS.get());
		renderCutout(FloralisBlocks.BLUE_CACTUS.get());
		renderCutout(FloralisBlocks.BROWN_CACTUS.get());
		renderCutout(FloralisBlocks.GREEN_CACTUS.get());
		renderCutout(FloralisBlocks.RED_CACTUS.get());
		renderCutout(FloralisBlocks.BLACK_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_WHITE_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_LIME_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_PINK_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_GRAY_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_CYAN_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_BLUE_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_BROWN_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_GREEN_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_RED_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_BLACK_FLOWER.get());
		renderCutout(FloralisBlocks.POTTED_WHITE_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_LIME_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_PINK_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_GRAY_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_CYAN_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_BLUE_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_BROWN_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_GREEN_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_RED_CACTUS.get());
		renderCutout(FloralisBlocks.POTTED_BLACK_CACTUS.get());
		renderCutout(FloralisBlocks.WHITE_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.ORANGE_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.MAGENTA_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.YELLOW_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.LIME_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.PINK_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.GRAY_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.CYAN_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.PURPLE_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.BLUE_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.BROWN_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.GREEN_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.RED_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.BLACK_FLOWER_CROP.get());
		renderCutout(FloralisBlocks.WHITE_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.ORANGE_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.MAGENTA_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.YELLOW_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.LIME_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.PINK_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.GRAY_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.CYAN_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.PURPLE_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.BLUE_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.BROWN_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.GREEN_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.RED_CACTUS_CROP.get());
		renderCutout(FloralisBlocks.BLACK_CACTUS_CROP.get());
	}

	public void blockColor(Block pBlock) {
		Minecraft.getInstance().getBlockColors().register((pState, pLevel, pPos, pTintIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : GrassColor.get(0.5D, 1.0D), pBlock);
	}

	public void renderCutout(Block pBlock) {
		ItemBlockRenderTypes.setRenderLayer(pBlock, RenderType.cutout());
	}
}
