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
        cropFlowerWhite = new CropFlowerWhite("whiteflowercrop");
        cropFlowerOrange = new CropFlowerOrange("orangeflowercrop");
        cropFlowerMagenta = new CropFlowerMagenta("magentaflowercrop");
        cropFlowerLightBlue = new CropFlowerLightBlue("lightblueflowercrop");
        cropFlowerYellow = new CropFlowerYellow("yellowflowercrop");
        cropFlowerLime = new CropFlowerLime("limeflowercrop");
        cropFlowerPink = new CropFlowerPink("pinkflowercrop");
        cropFlowerGray = new CropFlowerGray("grayflowercrop");
        cropFlowerLightGray = new CropFlowerLightGray("lightgrayflowercrop");
        cropFlowerCyan = new CropFlowerCyan("cyanflowercrop");
        cropFlowerPurple = new CropFlowerPurple("purpleflowercrop");
        cropFlowerBlue = new CropFlowerBlue("blueflowercrop");
        cropFlowerBrown = new CropFlowerBrown("brownflowercrop");
        cropFlowerGreen = new CropFlowerGreen("greenflowercrop");
        cropFlowerRed = new CropFlowerRed("redflowercrop");
        cropFlowerBlack = new CropFlowerBlack("blackflowercrop");
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