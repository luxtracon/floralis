package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.CactusCropBase;
import com.luxtracon.floralis.blocks.cropcactus.*;
import com.luxtracon.floralis.Reference;

import net.minecraft.block.Block;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class CactusCropInit
{
    public static CactusCropBase cropCactusWhite;
    public static CactusCropBase cropCactusOrange;
    public static CactusCropBase cropCactusMagenta;
    public static CactusCropBase cropCactusLightBlue;
    public static CactusCropBase cropCactusYellow;
    public static CactusCropBase cropCactusLime;
    public static CactusCropBase cropCactusPink;
    public static CactusCropBase cropCactusGray;
    public static CactusCropBase cropCactusLightGray;
    public static CactusCropBase cropCactusCyan;
    public static CactusCropBase cropCactusPurple;
    public static CactusCropBase cropCactusBlue;
    public static CactusCropBase cropCactusBrown;
    public static CactusCropBase cropCactusGreen;
    public static CactusCropBase cropCactusRed;
    public static CactusCropBase cropCactusBlack;

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