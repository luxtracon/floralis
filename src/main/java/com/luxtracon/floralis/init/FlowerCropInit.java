package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.FlowerCropBase;
import com.luxtracon.floralis.blocks.cropflower.*;
import com.luxtracon.floralis.Reference;

import net.minecraft.block.Block;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class FlowerCropInit
{
    public static FlowerCropBase cropFlowerWhite;
    public static FlowerCropBase cropFlowerOrange;
    public static FlowerCropBase cropFlowerMagenta;
    public static FlowerCropBase cropFlowerLightBlue;
    public static FlowerCropBase cropFlowerYellow;
    public static FlowerCropBase cropFlowerLime;
    public static FlowerCropBase cropFlowerPink;
    public static FlowerCropBase cropFlowerGray;
    public static FlowerCropBase cropFlowerLightGray;
    public static FlowerCropBase cropFlowerCyan;
    public static FlowerCropBase cropFlowerPurple;
    public static FlowerCropBase cropFlowerBlue;
    public static FlowerCropBase cropFlowerBrown;
    public static FlowerCropBase cropFlowerGreen;
    public static FlowerCropBase cropFlowerRed;
    public static FlowerCropBase cropFlowerBlack;

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