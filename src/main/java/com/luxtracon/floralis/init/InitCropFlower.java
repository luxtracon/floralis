package com.luxtracon.floralis.init;

import com.luxtracon.floralis.utilities.Reference;
import com.luxtracon.floralis.blocks.cropflower.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class InitCropFlower
{
    public static BlockCrops cropFlowerWhite;
    public static BlockCrops cropFlowerOrange;
    public static BlockCrops cropFlowerMagenta;
    public static BlockCrops cropFlowerLightBlue;
    public static BlockCrops cropFlowerYellow;
    public static BlockCrops cropFlowerLime;
    public static BlockCrops cropFlowerPink;
    public static BlockCrops cropFlowerGray;
    public static BlockCrops cropFlowerLightGray;
    public static BlockCrops cropFlowerCyan;
    public static BlockCrops cropFlowerPurple;
    public static BlockCrops cropFlowerBlue;
    public static BlockCrops cropFlowerBrown;
    public static BlockCrops cropFlowerGreen;
    public static BlockCrops cropFlowerRed;
    public static BlockCrops cropFlowerBlack;

    public static void init()
    {
        cropFlowerWhite = new CropFlowerWhite("whitecrop");
        cropFlowerOrange = new CropFlowerOrange("orangecrop");
        cropFlowerMagenta = new CropFlowerMagenta("magentacrop");
        cropFlowerLightBlue = new CropFlowerLightBlue("lightbluecrop");
        cropFlowerYellow = new CropFlowerYellow("yellowcrop");
        cropFlowerLime = new CropFlowerLime("limecrop");
        cropFlowerPink = new CropFlowerPink("pinkcrop");
        cropFlowerGray = new CropFlowerGray("graycrop");
        cropFlowerLightGray = new CropFlowerLightGray("lightgraycrop");
        cropFlowerCyan = new CropFlowerCyan("cyancrop");
        cropFlowerPurple = new CropFlowerPurple("purplecrop");
        cropFlowerBlue = new CropFlowerBlue("bluecrop");
        cropFlowerBrown = new CropFlowerBrown("browncrop");
        cropFlowerGreen = new CropFlowerGreen("greencrop");
        cropFlowerRed = new CropFlowerRed("redcrop");
        cropFlowerBlack = new CropFlowerBlack("blackcrop");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cropFlowerWhite);
        event.getRegistry().registerAll(cropFlowerOrange);
        event.getRegistry().registerAll(cropFlowerMagenta);
        event.getRegistry().registerAll(cropFlowerLightBlue);
        event.getRegistry().registerAll(cropFlowerYellow);
        event.getRegistry().registerAll(cropFlowerLime);
        event.getRegistry().registerAll(cropFlowerPink);
        event.getRegistry().registerAll(cropFlowerGray);
        event.getRegistry().registerAll(cropFlowerLightGray);
        event.getRegistry().registerAll(cropFlowerCyan);
        event.getRegistry().registerAll(cropFlowerPurple);
        event.getRegistry().registerAll(cropFlowerBlue);
        event.getRegistry().registerAll(cropFlowerBrown);
        event.getRegistry().registerAll(cropFlowerGreen);
        event.getRegistry().registerAll(cropFlowerRed);
        event.getRegistry().registerAll(cropFlowerBlack);
    }
}