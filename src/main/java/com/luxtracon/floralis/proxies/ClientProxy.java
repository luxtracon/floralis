package com.luxtracon.floralis.proxies;

import com.luxtracon.floralis.init.CactusCropInit;
import com.luxtracon.floralis.init.CactusInit;
import com.luxtracon.floralis.init.FlowerCropInit;
import com.luxtracon.floralis.init.FlowerInit;
import com.luxtracon.floralis.utilities.BlockColor;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy
{

    @Override
    public void init()
    {
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerInit.flowerYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusInit.cactusYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, FlowerCropInit.cropFlowerYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, CactusCropInit.cropCactusYellow);
    }
}