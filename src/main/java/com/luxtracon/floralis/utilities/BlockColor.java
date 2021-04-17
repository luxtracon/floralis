package com.luxtracon.floralis.utilities;

import com.luxtracon.floralis.init.CactusCropInit;
import com.luxtracon.floralis.init.CactusInit;
import com.luxtracon.floralis.init.FlowerCropInit;
import com.luxtracon.floralis.init.FlowerInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockColor implements IBlockColor
{
    public static final IBlockColor blockColor = new BlockColor();

    @Override
    public int colorMultiplier(IBlockState state, IBlockAccess world, BlockPos pos, int tint)
    {
        return world.getBiome(pos).getGrassColorAtPos(pos);
    }

    public static void init()
    {
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerInit.flowerYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusInit.cactusYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, FlowerCropInit.cropFlowerYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(blockColor, CactusCropInit.cropCactusYellow);
    }
}