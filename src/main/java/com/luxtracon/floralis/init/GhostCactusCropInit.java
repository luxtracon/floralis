package com.luxtracon.floralis.init;

import com.luxtracon.floralis.Reference;
import com.luxtracon.floralis.base.GhostCactusCropBase;

import net.minecraft.block.Block;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class GhostCactusCropInit
{
    public static GhostCactusCropBase cropCactusGhostWhite;
    public static GhostCactusCropBase cropCactusGhostOrange;
    public static GhostCactusCropBase cropCactusGhostMagenta;
    public static GhostCactusCropBase cropCactusGhostLightBlue;
    public static GhostCactusCropBase cropCactusGhostYellow;
    public static GhostCactusCropBase cropCactusGhostLime;
    public static GhostCactusCropBase cropCactusGhostPink;
    public static GhostCactusCropBase cropCactusGhostGray;
    public static GhostCactusCropBase cropCactusGhostLightGray;
    public static GhostCactusCropBase cropCactusGhostCyan;
    public static GhostCactusCropBase cropCactusGhostPurple;
    public static GhostCactusCropBase cropCactusGhostBlue;
    public static GhostCactusCropBase cropCactusGhostBrown;
    public static GhostCactusCropBase cropCactusGhostGreen;
    public static GhostCactusCropBase cropCactusGhostRed;
    public static GhostCactusCropBase cropCactusGhostBlack;

    public static void init()
    {
        cropCactusGhostWhite = new GhostCactusCropBase("whiteghostcactuscrop");
        cropCactusGhostOrange = new GhostCactusCropBase("orangeghostcactuscrop");
        cropCactusGhostMagenta = new GhostCactusCropBase("magentaghostcactuscrop");
        cropCactusGhostLightBlue = new GhostCactusCropBase("lightblueghostcactuscrop");
        cropCactusGhostYellow = new GhostCactusCropBase("yellowghostcactuscrop");
        cropCactusGhostLime = new GhostCactusCropBase("limeghostcactuscrop");
        cropCactusGhostPink = new GhostCactusCropBase("pinkghostcactuscrop");
        cropCactusGhostGray = new GhostCactusCropBase("grayghostcactuscrop");
        cropCactusGhostLightGray = new GhostCactusCropBase("lightgrayghostcactuscrop");
        cropCactusGhostCyan = new GhostCactusCropBase("cyanghostcactuscrop");
        cropCactusGhostPurple = new GhostCactusCropBase("purpleghostcactuscrop");
        cropCactusGhostBlue = new GhostCactusCropBase("blueghostcactuscrop");
        cropCactusGhostBrown = new GhostCactusCropBase("brownghostcactuscrop");
        cropCactusGhostGreen = new GhostCactusCropBase("greenghostcactuscrop");
        cropCactusGhostRed = new GhostCactusCropBase("redghostcactuscrop");
        cropCactusGhostBlack = new GhostCactusCropBase("blackghostcactuscrop");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cropCactusGhostWhite);
        event.getRegistry().registerAll(cropCactusGhostOrange);
        event.getRegistry().registerAll(cropCactusGhostMagenta);
        event.getRegistry().registerAll(cropCactusGhostLightBlue);
        event.getRegistry().registerAll(cropCactusGhostYellow);
        event.getRegistry().registerAll(cropCactusGhostLime);
        event.getRegistry().registerAll(cropCactusGhostPink);
        event.getRegistry().registerAll(cropCactusGhostGray);
        event.getRegistry().registerAll(cropCactusGhostLightGray);
        event.getRegistry().registerAll(cropCactusGhostCyan);
        event.getRegistry().registerAll(cropCactusGhostPurple);
        event.getRegistry().registerAll(cropCactusGhostBlue);
        event.getRegistry().registerAll(cropCactusGhostBrown);
        event.getRegistry().registerAll(cropCactusGhostGreen);
        event.getRegistry().registerAll(cropCactusGhostRed);
        event.getRegistry().registerAll(cropCactusGhostBlack);
    }
}