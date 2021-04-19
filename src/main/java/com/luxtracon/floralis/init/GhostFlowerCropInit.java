package com.luxtracon.floralis.init;

import com.luxtracon.floralis.Reference;
import com.luxtracon.floralis.base.GhostFlowerCropBase;

import net.minecraft.block.Block;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class GhostFlowerCropInit
{
    public static GhostFlowerCropBase cropFlowerGhostWhite;
    public static GhostFlowerCropBase cropFlowerGhostOrange;
    public static GhostFlowerCropBase cropFlowerGhostMagenta;
    public static GhostFlowerCropBase cropFlowerGhostLightBlue;
    public static GhostFlowerCropBase cropFlowerGhostYellow;
    public static GhostFlowerCropBase cropFlowerGhostLime;
    public static GhostFlowerCropBase cropFlowerGhostPink;
    public static GhostFlowerCropBase cropFlowerGhostGray;
    public static GhostFlowerCropBase cropFlowerGhostLightGray;
    public static GhostFlowerCropBase cropFlowerGhostCyan;
    public static GhostFlowerCropBase cropFlowerGhostPurple;
    public static GhostFlowerCropBase cropFlowerGhostBlue;
    public static GhostFlowerCropBase cropFlowerGhostBrown;
    public static GhostFlowerCropBase cropFlowerGhostGreen;
    public static GhostFlowerCropBase cropFlowerGhostRed;
    public static GhostFlowerCropBase cropFlowerGhostBlack;

    public static void init()
    {
        cropFlowerGhostWhite = new GhostFlowerCropBase("whiteghostcrop");
        cropFlowerGhostOrange = new GhostFlowerCropBase("orangeghostcrop");
        cropFlowerGhostMagenta = new GhostFlowerCropBase("magentaghostcrop");
        cropFlowerGhostLightBlue = new GhostFlowerCropBase("lightblueghostcrop");
        cropFlowerGhostYellow = new GhostFlowerCropBase("yellowghostcrop");
        cropFlowerGhostLime = new GhostFlowerCropBase("limeghostcrop");
        cropFlowerGhostPink = new GhostFlowerCropBase("pinkghostcrop");
        cropFlowerGhostGray = new GhostFlowerCropBase("grayghostcrop");
        cropFlowerGhostLightGray = new GhostFlowerCropBase("lightgrayghostcrop");
        cropFlowerGhostCyan = new GhostFlowerCropBase("cyanghostcrop");
        cropFlowerGhostPurple = new GhostFlowerCropBase("purpleghostcrop");
        cropFlowerGhostBlue = new GhostFlowerCropBase("blueghostcrop");
        cropFlowerGhostBrown = new GhostFlowerCropBase("brownghostcrop");
        cropFlowerGhostGreen = new GhostFlowerCropBase("greenghostcrop");
        cropFlowerGhostRed = new GhostFlowerCropBase("redghostcrop");
        cropFlowerGhostBlack = new GhostFlowerCropBase("blackghostcrop");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cropFlowerGhostWhite);
        event.getRegistry().registerAll(cropFlowerGhostOrange);
        event.getRegistry().registerAll(cropFlowerGhostMagenta);
        event.getRegistry().registerAll(cropFlowerGhostLightBlue);
        event.getRegistry().registerAll(cropFlowerGhostYellow);
        event.getRegistry().registerAll(cropFlowerGhostLime);
        event.getRegistry().registerAll(cropFlowerGhostPink);
        event.getRegistry().registerAll(cropFlowerGhostGray);
        event.getRegistry().registerAll(cropFlowerGhostLightGray);
        event.getRegistry().registerAll(cropFlowerGhostCyan);
        event.getRegistry().registerAll(cropFlowerGhostPurple);
        event.getRegistry().registerAll(cropFlowerGhostBlue);
        event.getRegistry().registerAll(cropFlowerGhostBrown);
        event.getRegistry().registerAll(cropFlowerGhostGreen);
        event.getRegistry().registerAll(cropFlowerGhostRed);
        event.getRegistry().registerAll(cropFlowerGhostBlack);
    }
}