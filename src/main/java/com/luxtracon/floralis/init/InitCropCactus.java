package com.luxtracon.floralis.init;

import com.luxtracon.floralis.blocks.cropcactus.*;
import com.luxtracon.floralis.utilities.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class InitCropCactus
{
    public static BlockCrops cropCactusWhite;
    public static BlockCrops cropCactusOrange;
    public static BlockCrops cropCactusMagenta;
    public static BlockCrops cropCactusLightBlue;
    public static BlockCrops cropCactusYellow;
    public static BlockCrops cropCactusLime;
    public static BlockCrops cropCactusPink;
    public static BlockCrops cropCactusGray;
    public static BlockCrops cropCactusLightGray;
    public static BlockCrops cropCactusCyan;
    public static BlockCrops cropCactusPurple;
    public static BlockCrops cropCactusBlue;
    public static BlockCrops cropCactusBrown;
    public static BlockCrops cropCactusGreen;
    public static BlockCrops cropCactusRed;
    public static BlockCrops cropCactusBlack;

    public static void init()
    {
        cropCactusWhite = new CropCactusWhite("whitecactuscrop");
        cropCactusOrange = new CropCactusOrange("orangecactuscrop");
        cropCactusMagenta = new CropCactusMagenta("magentacactuscrop");
        cropCactusLightBlue = new CropCactusLightBlue("lightbluecactuscrop");
        cropCactusYellow = new CropCactusYellow("yellowcactuscrop");
        cropCactusLime = new CropCactusLime("limecactuscrop");
        cropCactusPink = new CropCactusPink("pinkcactuscrop");
        cropCactusGray = new CropCactusGray("graycactuscrop");
        cropCactusLightGray = new CropCactusLightGray("lightgraycactuscrop");
        cropCactusCyan = new CropCactusCyan("cyancactuscrop");
        cropCactusPurple = new CropCactusPurple("purplecactuscrop");
        cropCactusBlue = new CropCactusBlue("bluecactuscrop");
        cropCactusBrown = new CropCactusBrown("browncactuscrop");
        cropCactusGreen = new CropCactusGreen("greencactuscrop");
        cropCactusRed = new CropCactusRed("redcactuscrop");
        cropCactusBlack = new CropCactusBlack("blackcactuscrop");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cropCactusWhite);
        event.getRegistry().registerAll(cropCactusOrange);
        event.getRegistry().registerAll(cropCactusMagenta);
        event.getRegistry().registerAll(cropCactusLightBlue);
        event.getRegistry().registerAll(cropCactusYellow);
        event.getRegistry().registerAll(cropCactusLime);
        event.getRegistry().registerAll(cropCactusPink);
        event.getRegistry().registerAll(cropCactusGray);
        event.getRegistry().registerAll(cropCactusLightGray);
        event.getRegistry().registerAll(cropCactusCyan);
        event.getRegistry().registerAll(cropCactusPurple);
        event.getRegistry().registerAll(cropCactusBlue);
        event.getRegistry().registerAll(cropCactusBrown);
        event.getRegistry().registerAll(cropCactusGreen);
        event.getRegistry().registerAll(cropCactusRed);
        event.getRegistry().registerAll(cropCactusBlack);
    }
}