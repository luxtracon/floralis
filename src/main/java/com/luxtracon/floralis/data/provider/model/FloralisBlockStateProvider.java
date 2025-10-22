package com.luxtracon.floralis.data.provider.model;

import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisBlocks;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockStateProvider {

	public static void register(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockStateProvider.axis(pBlockModelGenerators);
		FloralisBlockStateProvider.block(pBlockModelGenerators);
		FloralisBlockStateProvider.crop(pBlockModelGenerators);
	}

	public static void axis(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockStateProvider.axis(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), pBlockModelGenerators);
	}

	public static void block(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockStateProvider.block(FloralisBlocks.WHITE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.GRAY_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BLACK_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BROWN_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.RED_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.ORANGE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.YELLOW_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIME_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.GREEN_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.CYAN_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BLUE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.PURPLE_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.PINK_DYE_BLOCK.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.WHITE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BLACK_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BROWN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.RED_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.ORANGE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.YELLOW_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIME_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.GREEN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.CYAN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.PURPLE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.MAGENTA_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.PINK_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.WHITE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BLACK_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BROWN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.RED_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.ORANGE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.YELLOW_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIME_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.GREEN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.CYAN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.PURPLE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.MAGENTA_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.PINK_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_WHITE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_GRAY_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_BLACK_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_BROWN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_RED_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_ORANGE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_YELLOW_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_LIME_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_GREEN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_CYAN_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_BLUE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_PURPLE_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_MAGENTA_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_PINK_CACTUS.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_WHITE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_GRAY_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_BLACK_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_BROWN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_RED_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_ORANGE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_YELLOW_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_LIME_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_GREEN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_CYAN_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_BLUE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_PURPLE_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_MAGENTA_FLOWER.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.block(FloralisBlocks.POTTED_PINK_FLOWER.get(), pBlockModelGenerators);
	}

	public static void crop(BlockModelGenerators pBlockModelGenerators) {
		FloralisBlockStateProvider.crop(FloralisBlocks.WHITE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.LIGHT_GRAY_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.GRAY_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.BLACK_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.BROWN_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.RED_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.ORANGE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.YELLOW_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.LIME_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.GREEN_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.CYAN_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.LIGHT_BLUE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.BLUE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.PURPLE_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.MAGENTA_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.PINK_CACTUS_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.WHITE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.LIGHT_GRAY_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.GRAY_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.BLACK_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.BROWN_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.RED_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.ORANGE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.YELLOW_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.LIME_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.GREEN_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.CYAN_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.LIGHT_BLUE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.BLUE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.PURPLE_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.MAGENTA_FLOWER_CROP.get(), pBlockModelGenerators);
		FloralisBlockStateProvider.crop(FloralisBlocks.PINK_FLOWER_CROP.get(), pBlockModelGenerators);
	}

	public static void axis(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		pBlockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(pBlock)
			.with(PropertyDispatch.initial(BlockStateProperties.AXIS)
				.select(Direction.Axis.X, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "horizontal")).with(BlockModelGenerators.Y_ROT_90).with(BlockModelGenerators.X_ROT_90)))
				.select(Direction.Axis.Y, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock))))
				.select(Direction.Axis.Z, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "horizontal")).with(BlockModelGenerators.X_ROT_90)))
			)
		);
	}

	public static void block(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		pBlockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(pBlock, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock)))));
	}

	public static void crop(Block pBlock, BlockModelGenerators pBlockModelGenerators) {
		pBlockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(pBlock)
			.with(PropertyDispatch.initial(FloralisBlockStateProperties.AGE)
				.select(0, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "0")), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "0")).with(BlockModelGenerators.Y_ROT_90), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "0")).with(BlockModelGenerators.Y_ROT_180), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "0")).with(BlockModelGenerators.Y_ROT_270)))
				.select(1, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "1")), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "1")).with(BlockModelGenerators.Y_ROT_90), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "1")).with(BlockModelGenerators.Y_ROT_180), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "1")).with(BlockModelGenerators.Y_ROT_270)))
				.select(2, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "2")), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "2")).with(BlockModelGenerators.Y_ROT_90), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "2")).with(BlockModelGenerators.Y_ROT_180), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "2")).with(BlockModelGenerators.Y_ROT_270)))
				.select(3, BlockModelGenerators.variants(BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "3")), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "3")).with(BlockModelGenerators.Y_ROT_90), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "3")).with(BlockModelGenerators.Y_ROT_180), BlockModelGenerators.plainModel(FloralisModelProvider.blockFile(pBlock, "3")).with(BlockModelGenerators.Y_ROT_270)))
			)
		);
	}
}
