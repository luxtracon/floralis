package com.luxtracon.floralis.proxies;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.utilities.BlockColor;
import com.luxtracon.floralis.utilities.TileEntityPlantPot;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void init()
    {
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.flowerYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cactusYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropFlowerYellow);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusBlack);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusBrown);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusCyan);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusGreen);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusLightBlue);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusLightGray);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusLime);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusMagenta);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusOrange);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusPink);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusPurple);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusRed);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusWhite);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(BlockColor.blockColor, BlockInit.cropCactusYellow);

        GameRegistry.registerTileEntity(TileEntityPlantPot.class, new ResourceLocation(Main.MODID, "pot"));
    }
}