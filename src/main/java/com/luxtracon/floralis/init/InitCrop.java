package com.luxtracon.floralis.init;

import com.luxtracon.floralis.Reference;
import com.luxtracon.floralis.blocks.crop.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class InitCrop
{
    public static BlockCrops cropWhite;
    public static BlockCrops cropOrange;
    public static BlockCrops cropMagenta;
    public static BlockCrops cropLightBlue;
    public static BlockCrops cropYellow;
    public static BlockCrops cropLime;
    public static BlockCrops cropPink;
    public static BlockCrops cropGray;
    public static BlockCrops cropLightGray;
    public static BlockCrops cropCyan;
    public static BlockCrops cropPurple;
    public static BlockCrops cropBlue;
    public static BlockCrops cropBrown;
    public static BlockCrops cropGreen;
    public static BlockCrops cropRed;
    public static BlockCrops cropBlack;

    public static void init()
    {
        cropWhite = new CropWhite("whitecrop");
        cropOrange = new CropOrange("orangecrop");
        cropMagenta = new CropMagenta("magentacrop");
        cropLightBlue = new CropLightBlue("lightbluecrop");
        cropYellow = new CropYellow("yellowcrop");
        cropLime = new CropLime("limecrop");
        cropPink = new CropPink("pinkcrop");
        cropGray = new CropGray("graycrop");
        cropLightGray = new CropLightGray("lightgraycrop");
        cropCyan = new CropCyan("cyancrop");
        cropPurple = new CropPurple("purplecrop");
        cropBlue = new CropBlue("bluecrop");
        cropBrown = new CropBrown("browncrop");
        cropGreen = new CropGreen("greencrop");
        cropRed = new CropRed("redcrop");
        cropBlack = new CropBlack("blackcrop");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cropWhite);
        event.getRegistry().registerAll(cropOrange);
        event.getRegistry().registerAll(cropMagenta);
        event.getRegistry().registerAll(cropLightBlue);
        event.getRegistry().registerAll(cropYellow);
        event.getRegistry().registerAll(cropLime);
        event.getRegistry().registerAll(cropPink);
        event.getRegistry().registerAll(cropGray);
        event.getRegistry().registerAll(cropLightGray);
        event.getRegistry().registerAll(cropCyan);
        event.getRegistry().registerAll(cropPurple);
        event.getRegistry().registerAll(cropBlue);
        event.getRegistry().registerAll(cropBrown);
        event.getRegistry().registerAll(cropGreen);
        event.getRegistry().registerAll(cropRed);
        event.getRegistry().registerAll(cropBlack);
    }
}