package com.luxtracon.floralis.client.proxy;

import com.luxtracon.floralis.common.proxy.CommonProxy;
import com.luxtracon.floralis.common.registry.FloralisBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.GrassColor;

@SuppressWarnings("deprecation")

public class ClientProxy extends CommonProxy {
	public ClientProxy() {

	}

	@Override
	public void loadComplete() {
		BlockColors blockColors = Minecraft.getInstance().getBlockColors();

		blockColors.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null && pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : GrassColor.get(0.5, 1.0),
			FloralisBlocks.WHITE_FLOWER.get(),
			FloralisBlocks.ORANGE_FLOWER.get(),
			FloralisBlocks.MAGENTA_FLOWER.get(),
			FloralisBlocks.LIGHT_BLUE_FLOWER.get(),
			FloralisBlocks.YELLOW_FLOWER.get(),
			FloralisBlocks.LIME_FLOWER.get(),
			FloralisBlocks.PINK_FLOWER.get(),
			FloralisBlocks.GRAY_FLOWER.get(),
			FloralisBlocks.LIGHT_GRAY_FLOWER.get(),
			FloralisBlocks.CYAN_FLOWER.get(),
			FloralisBlocks.PURPLE_FLOWER.get(),
			FloralisBlocks.BLUE_FLOWER.get(),
			FloralisBlocks.BROWN_FLOWER.get(),
			FloralisBlocks.GREEN_FLOWER.get(),
			FloralisBlocks.RED_FLOWER.get(),
			FloralisBlocks.BLACK_FLOWER.get(),

			FloralisBlocks.WHITE_CACTUS.get(),
			FloralisBlocks.ORANGE_CACTUS.get(),
			FloralisBlocks.MAGENTA_CACTUS.get(),
			FloralisBlocks.LIGHT_BLUE_CACTUS.get(),
			FloralisBlocks.YELLOW_CACTUS.get(),
			FloralisBlocks.LIME_CACTUS.get(),
			FloralisBlocks.PINK_CACTUS.get(),
			FloralisBlocks.GRAY_CACTUS.get(),
			FloralisBlocks.LIGHT_GRAY_CACTUS.get(),
			FloralisBlocks.CYAN_CACTUS.get(),
			FloralisBlocks.PURPLE_CACTUS.get(),
			FloralisBlocks.BLUE_CACTUS.get(),
			FloralisBlocks.BROWN_CACTUS.get(),
			FloralisBlocks.GREEN_CACTUS.get(),
			FloralisBlocks.RED_CACTUS.get(),
			FloralisBlocks.BLACK_CACTUS.get(),

			FloralisBlocks.POTTED_WHITE_FLOWER.get(),
			FloralisBlocks.POTTED_ORANGE_FLOWER.get(),
			FloralisBlocks.POTTED_MAGENTA_FLOWER.get(),
			FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(),
			FloralisBlocks.POTTED_YELLOW_FLOWER.get(),
			FloralisBlocks.POTTED_LIME_FLOWER.get(),
			FloralisBlocks.POTTED_PINK_FLOWER.get(),
			FloralisBlocks.POTTED_GRAY_FLOWER.get(),
			FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(),
			FloralisBlocks.POTTED_CYAN_FLOWER.get(),
			FloralisBlocks.POTTED_PURPLE_FLOWER.get(),
			FloralisBlocks.POTTED_BLUE_FLOWER.get(),
			FloralisBlocks.POTTED_BROWN_FLOWER.get(),
			FloralisBlocks.POTTED_GREEN_FLOWER.get(),
			FloralisBlocks.POTTED_RED_FLOWER.get(),
			FloralisBlocks.POTTED_BLACK_FLOWER.get(),

			FloralisBlocks.POTTED_WHITE_CACTUS.get(),
			FloralisBlocks.POTTED_ORANGE_CACTUS.get(),
			FloralisBlocks.POTTED_MAGENTA_CACTUS.get(),
			FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(),
			FloralisBlocks.POTTED_YELLOW_CACTUS.get(),
			FloralisBlocks.POTTED_LIME_CACTUS.get(),
			FloralisBlocks.POTTED_PINK_CACTUS.get(),
			FloralisBlocks.POTTED_GRAY_CACTUS.get(),
			FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(),
			FloralisBlocks.POTTED_CYAN_CACTUS.get(),
			FloralisBlocks.POTTED_PURPLE_CACTUS.get(),
			FloralisBlocks.POTTED_BLUE_CACTUS.get(),
			FloralisBlocks.POTTED_BROWN_CACTUS.get(),
			FloralisBlocks.POTTED_GREEN_CACTUS.get(),
			FloralisBlocks.POTTED_RED_CACTUS.get(),
			FloralisBlocks.POTTED_BLACK_CACTUS.get(),

			FloralisBlocks.WHITE_FLOWER_CROP.get(),
			FloralisBlocks.ORANGE_FLOWER_CROP.get(),
			FloralisBlocks.MAGENTA_FLOWER_CROP.get(),
			FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(),
			FloralisBlocks.YELLOW_FLOWER_CROP.get(),
			FloralisBlocks.LIME_FLOWER_CROP.get(),
			FloralisBlocks.PINK_FLOWER_CROP.get(),
			FloralisBlocks.GRAY_FLOWER_CROP.get(),
			FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(),
			FloralisBlocks.CYAN_FLOWER_CROP.get(),
			FloralisBlocks.PURPLE_FLOWER_CROP.get(),
			FloralisBlocks.BLUE_FLOWER_CROP.get(),
			FloralisBlocks.BROWN_FLOWER_CROP.get(),
			FloralisBlocks.GREEN_FLOWER_CROP.get(),
			FloralisBlocks.RED_FLOWER_CROP.get(),
			FloralisBlocks.BLACK_FLOWER_CROP.get(),

			FloralisBlocks.WHITE_CACTUS_CROP.get(),
			FloralisBlocks.ORANGE_CACTUS_CROP.get(),
			FloralisBlocks.MAGENTA_CACTUS_CROP.get(),
			FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(),
			FloralisBlocks.YELLOW_CACTUS_CROP.get(),
			FloralisBlocks.LIME_CACTUS_CROP.get(),
			FloralisBlocks.PINK_CACTUS_CROP.get(),
			FloralisBlocks.GRAY_CACTUS_CROP.get(),
			FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(),
			FloralisBlocks.CYAN_CACTUS_CROP.get(),
			FloralisBlocks.PURPLE_CACTUS_CROP.get(),
			FloralisBlocks.BLUE_CACTUS_CROP.get(),
			FloralisBlocks.BROWN_CACTUS_CROP.get(),
			FloralisBlocks.GREEN_CACTUS_CROP.get(),
			FloralisBlocks.RED_CACTUS_CROP.get(),
			FloralisBlocks.BLACK_CACTUS_CROP.get());

		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.WHITE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.ORANGE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.MAGENTA_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.YELLOW_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIME_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PINK_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GRAY_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.CYAN_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PURPLE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLUE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BROWN_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GREEN_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.RED_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLACK_FLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.WHITE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.ORANGE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.MAGENTA_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.YELLOW_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIME_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PINK_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GRAY_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.CYAN_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PURPLE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLUE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BROWN_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GREEN_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.RED_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLACK_CACTUS.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_WHITE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_ORANGE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_MAGENTA_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_YELLOW_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_LIME_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_PINK_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_GRAY_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_CYAN_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_PURPLE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_BLUE_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_BROWN_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_GREEN_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_RED_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_BLACK_FLOWER.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_WHITE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_ORANGE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_MAGENTA_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_YELLOW_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_LIME_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_PINK_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_GRAY_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_CYAN_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_PURPLE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_BLUE_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_BROWN_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_GREEN_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_RED_CACTUS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.POTTED_BLACK_CACTUS.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.WHITE_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.ORANGE_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.YELLOW_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIME_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PINK_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GRAY_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.CYAN_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PURPLE_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLUE_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BROWN_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GREEN_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.RED_FLOWER_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLACK_FLOWER_CROP.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.WHITE_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.ORANGE_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.YELLOW_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIME_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PINK_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GRAY_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.CYAN_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.PURPLE_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLUE_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BROWN_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.GREEN_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.RED_CACTUS_CROP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(FloralisBlocks.BLACK_CACTUS_CROP.get(), RenderType.cutout());
	}
}
