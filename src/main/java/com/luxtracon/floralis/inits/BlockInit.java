package com.luxtracon.floralis.inits;

import com.luxtracon.floralis.blocks.*;
import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@EventBusSubscriber(modid = Reference.MODID)
public class BlockInit
{
    public static BlockDyedDust blockDyeWhite;
    public static BlockDyedDust blockDyeOrange;
    public static BlockDyedDust blockDyeMagenta;
    public static BlockDyedDust blockDyeLightBlue;
    public static BlockDyedDust blockDyeYellow;
    public static BlockDyedDust blockDyeLime;
    public static BlockDyedDust blockDyePink;
    public static BlockDyedDust blockDyeGray;
    public static BlockDyedDust blockDyeLightGray;
    public static BlockDyedDust blockDyeCyan;
    public static BlockDyedDust blockDyePurple;
    public static BlockDyedDust blockDyeBlue;
    public static BlockDyedDust blockDyeBrown;
    public static BlockDyedDust blockDyeGreen;
    public static BlockDyedDust blockDyeRed;
    public static BlockDyedDust blockDyeBlack;

    public static BlockDyedClay blockClayWhite;
    public static BlockDyedClay blockClayOrange;
    public static BlockDyedClay blockClayMagenta;
    public static BlockDyedClay blockClayLightBlue;
    public static BlockDyedClay blockClayYellow;
    public static BlockDyedClay blockClayLime;
    public static BlockDyedClay blockClayPink;
    public static BlockDyedClay blockClayGray;
    public static BlockDyedClay blockClayLightGray;
    public static BlockDyedClay blockClayCyan;
    public static BlockDyedClay blockClayPurple;
    public static BlockDyedClay blockClayBlue;
    public static BlockDyedClay blockClayBrown;
    public static BlockDyedClay blockClayGreen;
    public static BlockDyedClay blockClayRed;
    public static BlockDyedClay blockClayBlack;

    public static BlockPlantFlower flowerWhite;
    public static BlockPlantFlower flowerOrange;
    public static BlockPlantFlower flowerMagenta;
    public static BlockPlantFlower flowerLightBlue;
    public static BlockPlantFlower flowerYellow;
    public static BlockPlantFlower flowerLime;
    public static BlockPlantFlower flowerPink;
    public static BlockPlantFlower flowerGray;
    public static BlockPlantFlower flowerLightGray;
    public static BlockPlantFlower flowerCyan;
    public static BlockPlantFlower flowerPurple;
    public static BlockPlantFlower flowerBlue;
    public static BlockPlantFlower flowerBrown;
    public static BlockPlantFlower flowerGreen;
    public static BlockPlantFlower flowerRed;
    public static BlockPlantFlower flowerBlack;

    public static BlockPlantCactus cactusWhite;
    public static BlockPlantCactus cactusOrange;
    public static BlockPlantCactus cactusMagenta;
    public static BlockPlantCactus cactusLightBlue;
    public static BlockPlantCactus cactusYellow;
    public static BlockPlantCactus cactusLime;
    public static BlockPlantCactus cactusPink;
    public static BlockPlantCactus cactusGray;
    public static BlockPlantCactus cactusLightGray;
    public static BlockPlantCactus cactusCyan;
    public static BlockPlantCactus cactusPurple;
    public static BlockPlantCactus cactusBlue;
    public static BlockPlantCactus cactusBrown;
    public static BlockPlantCactus cactusGreen;
    public static BlockPlantCactus cactusRed;
    public static BlockPlantCactus cactusBlack;

    public static BlockCropFlower cropFlowerWhite;
    public static BlockCropFlower cropFlowerOrange;
    public static BlockCropFlower cropFlowerMagenta;
    public static BlockCropFlower cropFlowerLightBlue;
    public static BlockCropFlower cropFlowerYellow;
    public static BlockCropFlower cropFlowerLime;
    public static BlockCropFlower cropFlowerPink;
    public static BlockCropFlower cropFlowerGray;
    public static BlockCropFlower cropFlowerLightGray;
    public static BlockCropFlower cropFlowerCyan;
    public static BlockCropFlower cropFlowerPurple;
    public static BlockCropFlower cropFlowerBlue;
    public static BlockCropFlower cropFlowerBrown;
    public static BlockCropFlower cropFlowerGreen;
    public static BlockCropFlower cropFlowerRed;
    public static BlockCropFlower cropFlowerBlack;

    public static BlockCropFlower cropFlowerGhostWhite;
    public static BlockCropFlower cropFlowerGhostOrange;
    public static BlockCropFlower cropFlowerGhostMagenta;
    public static BlockCropFlower cropFlowerGhostLightBlue;
    public static BlockCropFlower cropFlowerGhostYellow;
    public static BlockCropFlower cropFlowerGhostLime;
    public static BlockCropFlower cropFlowerGhostPink;
    public static BlockCropFlower cropFlowerGhostGray;
    public static BlockCropFlower cropFlowerGhostLightGray;
    public static BlockCropFlower cropFlowerGhostCyan;
    public static BlockCropFlower cropFlowerGhostPurple;
    public static BlockCropFlower cropFlowerGhostBlue;
    public static BlockCropFlower cropFlowerGhostBrown;
    public static BlockCropFlower cropFlowerGhostGreen;
    public static BlockCropFlower cropFlowerGhostRed;
    public static BlockCropFlower cropFlowerGhostBlack;

    public static BlockCropCactus cropCactusWhite;
    public static BlockCropCactus cropCactusOrange;
    public static BlockCropCactus cropCactusMagenta;
    public static BlockCropCactus cropCactusLightBlue;
    public static BlockCropCactus cropCactusYellow;
    public static BlockCropCactus cropCactusLime;
    public static BlockCropCactus cropCactusPink;
    public static BlockCropCactus cropCactusGray;
    public static BlockCropCactus cropCactusLightGray;
    public static BlockCropCactus cropCactusCyan;
    public static BlockCropCactus cropCactusPurple;
    public static BlockCropCactus cropCactusBlue;
    public static BlockCropCactus cropCactusBrown;
    public static BlockCropCactus cropCactusGreen;
    public static BlockCropCactus cropCactusRed;
    public static BlockCropCactus cropCactusBlack;

    public static BlockCropCactus cropCactusGhostWhite;
    public static BlockCropCactus cropCactusGhostOrange;
    public static BlockCropCactus cropCactusGhostMagenta;
    public static BlockCropCactus cropCactusGhostLightBlue;
    public static BlockCropCactus cropCactusGhostYellow;
    public static BlockCropCactus cropCactusGhostLime;
    public static BlockCropCactus cropCactusGhostPink;
    public static BlockCropCactus cropCactusGhostGray;
    public static BlockCropCactus cropCactusGhostLightGray;
    public static BlockCropCactus cropCactusGhostCyan;
    public static BlockCropCactus cropCactusGhostPurple;
    public static BlockCropCactus cropCactusGhostBlue;
    public static BlockCropCactus cropCactusGhostBrown;
    public static BlockCropCactus cropCactusGhostGreen;
    public static BlockCropCactus cropCactusGhostRed;
    public static BlockCropCactus cropCactusGhostBlack;

    public static BlockPotFlower potFlowerWhite;
    public static BlockPotFlower potFlowerOrange;
    public static BlockPotFlower potFlowerMagenta;
    public static BlockPotFlower potFlowerLightBlue;
    public static BlockPotFlower potFlowerYellow;
    public static BlockPotFlower potFlowerLime;
    public static BlockPotFlower potFlowerPink;
    public static BlockPotFlower potFlowerGray;
    public static BlockPotFlower potFlowerLightGray;
    public static BlockPotFlower potFlowerCyan;
    public static BlockPotFlower potFlowerPurple;
    public static BlockPotFlower potFlowerBlue;
    public static BlockPotFlower potFlowerBrown;
    public static BlockPotFlower potFlowerGreen;
    public static BlockPotFlower potFlowerRed;
    public static BlockPotFlower potFlowerBlack;

    public static BlockPotCactus potCactusWhite;
    public static BlockPotCactus potCactusOrange;
    public static BlockPotCactus potCactusMagenta;
    public static BlockPotCactus potCactusLightBlue;
    public static BlockPotCactus potCactusYellow;
    public static BlockPotCactus potCactusLime;
    public static BlockPotCactus potCactusPink;
    public static BlockPotCactus potCactusGray;
    public static BlockPotCactus potCactusLightGray;
    public static BlockPotCactus potCactusCyan;
    public static BlockPotCactus potCactusPurple;
    public static BlockPotCactus potCactusBlue;
    public static BlockPotCactus potCactusBrown;
    public static BlockPotCactus potCactusGreen;
    public static BlockPotCactus potCactusRed;
    public static BlockPotCactus potCactusBlack;

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

    public static void init()
    {
        flowerWhite = new BlockPlantFlower("whiteflower");
        flowerOrange = new BlockPlantFlower("orangeflower");
        flowerMagenta = new BlockPlantFlower("magentaflower");
        flowerLightBlue = new BlockPlantFlower("lightblueflower");
        flowerYellow = new BlockPlantFlower("yellowflower");
        flowerLime = new BlockPlantFlower("limeflower");
        flowerPink = new BlockPlantFlower("pinkflower");
        flowerGray = new BlockPlantFlower("grayflower");
        flowerLightGray = new BlockPlantFlower("lightgrayflower");
        flowerCyan = new BlockPlantFlower("cyanflower");
        flowerPurple = new BlockPlantFlower("purpleflower");
        flowerBlue = new BlockPlantFlower("blueflower");
        flowerBrown = new BlockPlantFlower("brownflower");
        flowerGreen = new BlockPlantFlower("greenflower");
        flowerRed = new BlockPlantFlower("redflower");
        flowerBlack = new BlockPlantFlower("blackflower");

        cactusWhite = new BlockPlantCactus("whitecactus", Material.CACTUS);
        cactusOrange = new BlockPlantCactus("orangecactus", Material.CACTUS);
        cactusMagenta = new BlockPlantCactus("magentacactus", Material.CACTUS);
        cactusLightBlue = new BlockPlantCactus("lightbluecactus", Material.CACTUS);
        cactusYellow = new BlockPlantCactus("yellowcactus", Material.CACTUS);
        cactusLime = new BlockPlantCactus("limecactus", Material.CACTUS);
        cactusPink = new BlockPlantCactus("pinkcactus", Material.CACTUS);
        cactusGray = new BlockPlantCactus("graycactus", Material.CACTUS);
        cactusLightGray = new BlockPlantCactus("lightgraycactus", Material.CACTUS);
        cactusCyan = new BlockPlantCactus("cyancactus", Material.CACTUS);
        cactusPurple = new BlockPlantCactus("purplecactus", Material.CACTUS);
        cactusBlue = new BlockPlantCactus("bluecactus", Material.CACTUS);
        cactusBrown = new BlockPlantCactus("browncactus", Material.CACTUS);
        cactusGreen = new BlockPlantCactus("greencactus", Material.CACTUS);
        cactusRed = new BlockPlantCactus("redcactus", Material.CACTUS);
        cactusBlack = new BlockPlantCactus("blackcactus", Material.CACTUS);

        cropFlowerWhite = new BlockCropFlower("whitecrop");
        cropFlowerOrange = new BlockCropFlower("orangecrop");
        cropFlowerMagenta = new BlockCropFlower("magentacrop");
        cropFlowerLightBlue = new BlockCropFlower("lightbluecrop");
        cropFlowerYellow = new BlockCropFlower("yellowcrop");
        cropFlowerLime = new BlockCropFlower("limecrop");
        cropFlowerPink = new BlockCropFlower("pinkcrop");
        cropFlowerGray = new BlockCropFlower("graycrop");
        cropFlowerLightGray = new BlockCropFlower("lightgraycrop");
        cropFlowerCyan = new BlockCropFlower("cyancrop");
        cropFlowerPurple = new BlockCropFlower("purplecrop");
        cropFlowerBlue = new BlockCropFlower("bluecrop");
        cropFlowerBrown = new BlockCropFlower("browncrop");
        cropFlowerGreen = new BlockCropFlower("greencrop");
        cropFlowerRed = new BlockCropFlower("redcrop");
        cropFlowerBlack = new BlockCropFlower("blackcrop");

        cropCactusWhite = new BlockCropCactus("whitecactuscrop");
        cropCactusOrange = new BlockCropCactus("orangecactuscrop");
        cropCactusMagenta = new BlockCropCactus("magentacactuscrop");
        cropCactusLightBlue = new BlockCropCactus("lightbluecactuscrop");
        cropCactusYellow = new BlockCropCactus("yellowcactuscrop");
        cropCactusLime = new BlockCropCactus("limecactuscrop");
        cropCactusPink = new BlockCropCactus("pinkcactuscrop");
        cropCactusGray = new BlockCropCactus("graycactuscrop");
        cropCactusLightGray = new BlockCropCactus("lightgraycactuscrop");
        cropCactusCyan = new BlockCropCactus("cyancactuscrop");
        cropCactusPurple = new BlockCropCactus("purplecactuscrop");
        cropCactusBlue = new BlockCropCactus("bluecactuscrop");
        cropCactusBrown = new BlockCropCactus("browncactuscrop");
        cropCactusGreen = new BlockCropCactus("greencactuscrop");
        cropCactusRed = new BlockCropCactus("redcactuscrop");
        cropCactusBlack = new BlockCropCactus("blackcactuscrop");

        cropFlowerGhostWhite = new BlockCropFlower("whiteghostcrop");
        cropFlowerGhostOrange = new BlockCropFlower("orangeghostcrop");
        cropFlowerGhostMagenta = new BlockCropFlower("magentaghostcrop");
        cropFlowerGhostLightBlue = new BlockCropFlower("lightblueghostcrop");
        cropFlowerGhostYellow = new BlockCropFlower("yellowghostcrop");
        cropFlowerGhostLime = new BlockCropFlower("limeghostcrop");
        cropFlowerGhostPink = new BlockCropFlower("pinkghostcrop");
        cropFlowerGhostGray = new BlockCropFlower("grayghostcrop");
        cropFlowerGhostLightGray = new BlockCropFlower("lightgrayghostcrop");
        cropFlowerGhostCyan = new BlockCropFlower("cyanghostcrop");
        cropFlowerGhostPurple = new BlockCropFlower("purpleghostcrop");
        cropFlowerGhostBlue = new BlockCropFlower("blueghostcrop");
        cropFlowerGhostBrown = new BlockCropFlower("brownghostcrop");
        cropFlowerGhostGreen = new BlockCropFlower("greenghostcrop");
        cropFlowerGhostRed = new BlockCropFlower("redghostcrop");
        cropFlowerGhostBlack = new BlockCropFlower("blackghostcrop");

        cropCactusGhostWhite = new BlockCropCactus("whiteghostcactuscrop");
        cropCactusGhostOrange = new BlockCropCactus("orangeghostcactuscrop");
        cropCactusGhostMagenta = new BlockCropCactus("magentaghostcactuscrop");
        cropCactusGhostLightBlue = new BlockCropCactus("lightblueghostcactuscrop");
        cropCactusGhostYellow = new BlockCropCactus("yellowghostcactuscrop");
        cropCactusGhostLime = new BlockCropCactus("limeghostcactuscrop");
        cropCactusGhostPink = new BlockCropCactus("pinkghostcactuscrop");
        cropCactusGhostGray = new BlockCropCactus("grayghostcactuscrop");
        cropCactusGhostLightGray = new BlockCropCactus("lightgrayghostcactuscrop");
        cropCactusGhostCyan = new BlockCropCactus("cyanghostcactuscrop");
        cropCactusGhostPurple = new BlockCropCactus("purpleghostcactuscrop");
        cropCactusGhostBlue = new BlockCropCactus("blueghostcactuscrop");
        cropCactusGhostBrown = new BlockCropCactus("brownghostcactuscrop");
        cropCactusGhostGreen = new BlockCropCactus("greenghostcactuscrop");
        cropCactusGhostRed = new BlockCropCactus("redghostcactuscrop");
        cropCactusGhostBlack = new BlockCropCactus("blackghostcactuscrop");

        potFlowerWhite = new BlockPotFlower("whiteflowerpot", Material.CLAY);
        potFlowerOrange = new BlockPotFlower("orangeflowerpot", Material.CLAY);
        potFlowerMagenta = new BlockPotFlower("magentaflowerpot", Material.CLAY);
        potFlowerLightBlue = new BlockPotFlower("lightblueflowerpot", Material.CLAY);
        potFlowerYellow = new BlockPotFlower("yellowflowerpot", Material.CLAY);
        potFlowerLime = new BlockPotFlower("limeflowerpot", Material.CLAY);
        potFlowerPink = new BlockPotFlower("pinkflowerpot", Material.CLAY);
        potFlowerGray = new BlockPotFlower("grayflowerpot", Material.CLAY);
        potFlowerLightGray = new BlockPotFlower("lightgrayflowerpot", Material.CLAY);
        potFlowerCyan = new BlockPotFlower("cyanflowerpot", Material.CLAY);
        potFlowerPurple = new BlockPotFlower("purpleflowerpot", Material.CLAY);
        potFlowerBlue = new BlockPotFlower("blueflowerpot", Material.CLAY);
        potFlowerBrown = new BlockPotFlower("brownflowerpot", Material.CLAY);
        potFlowerGreen = new BlockPotFlower("greenflowerpot", Material.CLAY);
        potFlowerRed = new BlockPotFlower("redflowerpot", Material.CLAY);
        potFlowerBlack = new BlockPotFlower("blackflowerpot", Material.CLAY);

        potCactusWhite = new BlockPotCactus("whitecactuspot", Material.CLAY);
        potCactusOrange = new BlockPotCactus("orangecactuspot", Material.CLAY);
        potCactusMagenta = new BlockPotCactus("magentacactuspot", Material.CLAY);
        potCactusLightBlue = new BlockPotCactus("lightbluecactuspot", Material.CLAY);
        potCactusYellow = new BlockPotCactus("yellowcactuspot", Material.CLAY);
        potCactusLime = new BlockPotCactus("limecactuspot", Material.CLAY);
        potCactusPink = new BlockPotCactus("pinkcactuspot", Material.CLAY);
        potCactusGray = new BlockPotCactus("graycactuspot", Material.CLAY);
        potCactusLightGray = new BlockPotCactus("lightgraycactuspot", Material.CLAY);
        potCactusCyan = new BlockPotCactus("cyancactuspot", Material.CLAY);
        potCactusPurple = new BlockPotCactus("purplecactuspot", Material.CLAY);
        potCactusBlue = new BlockPotCactus("bluecactuspot", Material.CLAY);
        potCactusBrown = new BlockPotCactus("browncactuspot", Material.CLAY);
        potCactusGreen = new BlockPotCactus("greencactuspot", Material.CLAY);
        potCactusRed = new BlockPotCactus("redcactuspot", Material.CLAY);
        potCactusBlack = new BlockPotCactus("blackcactuspot", Material.CLAY);

        blockDyeWhite = new BlockDyedDust("whitedyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeOrange = new BlockDyedDust("orangedyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeMagenta = new BlockDyedDust("magentadyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeLightBlue = new BlockDyedDust("lightbluedyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeYellow = new BlockDyedDust("yellowdyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeLime = new BlockDyedDust("limedyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyePink = new BlockDyedDust("pinkdyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeGray = new BlockDyedDust("graydyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeLightGray = new BlockDyedDust("lightgraydyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeCyan = new BlockDyedDust("cyandyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyePurple = new BlockDyedDust("purpledyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeBlue = new BlockDyedDust("bluedyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeBrown = new BlockDyedDust("browndyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeGreen = new BlockDyedDust("greendyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeRed = new BlockDyedDust("reddyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);
        blockDyeBlack = new BlockDyedDust("blackdyeblock", Material.SAND, 0.5F, 0.5F, "shovel", 0);

        blockClayWhite = new BlockDyedClay("whiteclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayOrange = new BlockDyedClay("orangeclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayMagenta = new BlockDyedClay("magentaclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayLightBlue = new BlockDyedClay("lightblueclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayYellow = new BlockDyedClay("yellowclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayLime = new BlockDyedClay("limeclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayPink = new BlockDyedClay("pinkclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayGray = new BlockDyedClay("grayclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayLightGray = new BlockDyedClay("lightgrayclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayCyan = new BlockDyedClay("cyanclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayPurple = new BlockDyedClay("purpleclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayBlue = new BlockDyedClay("blueclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayBrown = new BlockDyedClay("brownclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayGreen = new BlockDyedClay("greenclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayRed = new BlockDyedClay("redclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
        blockClayBlack = new BlockDyedClay("blackclayblock", Material.CLAY, 0.6F, 0.6F, "shovel", 0);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(flowerWhite);
        event.getRegistry().registerAll(flowerOrange);
        event.getRegistry().registerAll(flowerMagenta);
        event.getRegistry().registerAll(flowerLightBlue);
        event.getRegistry().registerAll(flowerYellow);
        event.getRegistry().registerAll(flowerLime);
        event.getRegistry().registerAll(flowerPink);
        event.getRegistry().registerAll(flowerGray);
        event.getRegistry().registerAll(flowerLightGray);
        event.getRegistry().registerAll(flowerCyan);
        event.getRegistry().registerAll(flowerPurple);
        event.getRegistry().registerAll(flowerBlue);
        event.getRegistry().registerAll(flowerBrown);
        event.getRegistry().registerAll(flowerGreen);
        event.getRegistry().registerAll(flowerRed);
        event.getRegistry().registerAll(flowerBlack);

        event.getRegistry().registerAll(cactusWhite);
        event.getRegistry().registerAll(cactusOrange);
        event.getRegistry().registerAll(cactusMagenta);
        event.getRegistry().registerAll(cactusLightBlue);
        event.getRegistry().registerAll(cactusYellow);
        event.getRegistry().registerAll(cactusLime);
        event.getRegistry().registerAll(cactusPink);
        event.getRegistry().registerAll(cactusGray);
        event.getRegistry().registerAll(cactusLightGray);
        event.getRegistry().registerAll(cactusCyan);
        event.getRegistry().registerAll(cactusPurple);
        event.getRegistry().registerAll(cactusBlue);
        event.getRegistry().registerAll(cactusBrown);
        event.getRegistry().registerAll(cactusGreen);
        event.getRegistry().registerAll(cactusRed);
        event.getRegistry().registerAll(cactusBlack);

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

        event.getRegistry().registerAll(potFlowerWhite);
        event.getRegistry().registerAll(potFlowerOrange);
        event.getRegistry().registerAll(potFlowerMagenta);
        event.getRegistry().registerAll(potFlowerLightBlue);
        event.getRegistry().registerAll(potFlowerYellow);
        event.getRegistry().registerAll(potFlowerLime);
        event.getRegistry().registerAll(potFlowerPink);
        event.getRegistry().registerAll(potFlowerGray);
        event.getRegistry().registerAll(potFlowerLightGray);
        event.getRegistry().registerAll(potFlowerCyan);
        event.getRegistry().registerAll(potFlowerPurple);
        event.getRegistry().registerAll(potFlowerBlue);
        event.getRegistry().registerAll(potFlowerBrown);
        event.getRegistry().registerAll(potFlowerGreen);
        event.getRegistry().registerAll(potFlowerRed);
        event.getRegistry().registerAll(potFlowerBlack);

        event.getRegistry().registerAll(potCactusWhite);
        event.getRegistry().registerAll(potCactusOrange);
        event.getRegistry().registerAll(potCactusMagenta);
        event.getRegistry().registerAll(potCactusLightBlue);
        event.getRegistry().registerAll(potCactusYellow);
        event.getRegistry().registerAll(potCactusLime);
        event.getRegistry().registerAll(potCactusPink);
        event.getRegistry().registerAll(potCactusGray);
        event.getRegistry().registerAll(potCactusLightGray);
        event.getRegistry().registerAll(potCactusCyan);
        event.getRegistry().registerAll(potCactusPurple);
        event.getRegistry().registerAll(potCactusBlue);
        event.getRegistry().registerAll(potCactusBrown);
        event.getRegistry().registerAll(potCactusGreen);
        event.getRegistry().registerAll(potCactusRed);
        event.getRegistry().registerAll(potCactusBlack);

        if(Config.cosmeticblocks)
        {
            event.getRegistry().registerAll(blockDyeWhite);
            event.getRegistry().registerAll(blockDyeOrange);
            event.getRegistry().registerAll(blockDyeMagenta);
            event.getRegistry().registerAll(blockDyeLightBlue);
            event.getRegistry().registerAll(blockDyeYellow);
            event.getRegistry().registerAll(blockDyeLime);
            event.getRegistry().registerAll(blockDyePink);
            event.getRegistry().registerAll(blockDyeGray);
            event.getRegistry().registerAll(blockDyeLightGray);
            event.getRegistry().registerAll(blockDyeCyan);
            event.getRegistry().registerAll(blockDyePurple);
            event.getRegistry().registerAll(blockDyeBlue);
            event.getRegistry().registerAll(blockDyeBrown);
            event.getRegistry().registerAll(blockDyeGreen);
            event.getRegistry().registerAll(blockDyeRed);
            event.getRegistry().registerAll(blockDyeBlack);

            event.getRegistry().registerAll(blockClayWhite);
            event.getRegistry().registerAll(blockClayOrange);
            event.getRegistry().registerAll(blockClayMagenta);
            event.getRegistry().registerAll(blockClayLightBlue);
            event.getRegistry().registerAll(blockClayYellow);
            event.getRegistry().registerAll(blockClayLime);
            event.getRegistry().registerAll(blockClayPink);
            event.getRegistry().registerAll(blockClayGray);
            event.getRegistry().registerAll(blockClayLightGray);
            event.getRegistry().registerAll(blockClayCyan);
            event.getRegistry().registerAll(blockClayPurple);
            event.getRegistry().registerAll(blockClayBlue);
            event.getRegistry().registerAll(blockClayBrown);
            event.getRegistry().registerAll(blockClayGreen);
            event.getRegistry().registerAll(blockClayRed);
            event.getRegistry().registerAll(blockClayBlack);
        }
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(new ItemBlock(flowerWhite).setRegistryName(Objects.requireNonNull(flowerWhite.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerOrange).setRegistryName(Objects.requireNonNull(flowerOrange.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerMagenta).setRegistryName(Objects.requireNonNull(flowerMagenta.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerLightBlue).setRegistryName(Objects.requireNonNull(flowerLightBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerYellow).setRegistryName(Objects.requireNonNull(flowerYellow.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerLime).setRegistryName(Objects.requireNonNull(flowerLime.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerPink).setRegistryName(Objects.requireNonNull(flowerPink.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerGray).setRegistryName(Objects.requireNonNull(flowerGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerLightGray).setRegistryName(Objects.requireNonNull(flowerLightGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerCyan).setRegistryName(Objects.requireNonNull(flowerCyan.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerPurple).setRegistryName(Objects.requireNonNull(flowerPurple.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerBlue).setRegistryName(Objects.requireNonNull(flowerBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerBrown).setRegistryName(Objects.requireNonNull(flowerBrown.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerGreen).setRegistryName(Objects.requireNonNull(flowerGreen.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerRed).setRegistryName(Objects.requireNonNull(flowerRed.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(flowerBlack).setRegistryName(Objects.requireNonNull(flowerBlack.getRegistryName())));

        event.getRegistry().registerAll(new ItemBlock(cactusWhite).setRegistryName(Objects.requireNonNull(cactusWhite.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusOrange).setRegistryName(Objects.requireNonNull(cactusOrange.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusMagenta).setRegistryName(Objects.requireNonNull(cactusMagenta.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusLightBlue).setRegistryName(Objects.requireNonNull(cactusLightBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusYellow).setRegistryName(Objects.requireNonNull(cactusYellow.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusLime).setRegistryName(Objects.requireNonNull(cactusLime.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusPink).setRegistryName(Objects.requireNonNull(cactusPink.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusGray).setRegistryName(Objects.requireNonNull(cactusGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusLightGray).setRegistryName(Objects.requireNonNull(cactusLightGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusCyan).setRegistryName(Objects.requireNonNull(cactusCyan.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusPurple).setRegistryName(Objects.requireNonNull(cactusPurple.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusBlue).setRegistryName(Objects.requireNonNull(cactusBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusBrown).setRegistryName(Objects.requireNonNull(cactusBrown.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusGreen).setRegistryName(Objects.requireNonNull(cactusGreen.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusRed).setRegistryName(Objects.requireNonNull(cactusRed.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(cactusBlack).setRegistryName(Objects.requireNonNull(cactusBlack.getRegistryName())));

        event.getRegistry().registerAll(new ItemBlock(potFlowerWhite).setRegistryName(Objects.requireNonNull(potFlowerWhite.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerOrange).setRegistryName(Objects.requireNonNull(potFlowerOrange.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerMagenta).setRegistryName(Objects.requireNonNull(potFlowerMagenta.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerLightBlue).setRegistryName(Objects.requireNonNull(potFlowerLightBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerYellow).setRegistryName(Objects.requireNonNull(potFlowerYellow.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerLime).setRegistryName(Objects.requireNonNull(potFlowerLime.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerPink).setRegistryName(Objects.requireNonNull(potFlowerPink.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerGray).setRegistryName(Objects.requireNonNull(potFlowerGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerLightGray).setRegistryName(Objects.requireNonNull(potFlowerLightGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerCyan).setRegistryName(Objects.requireNonNull(potFlowerCyan.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerPurple).setRegistryName(Objects.requireNonNull(potFlowerPurple.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerBlue).setRegistryName(Objects.requireNonNull(potFlowerBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerBrown).setRegistryName(Objects.requireNonNull(potFlowerBrown.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerGreen).setRegistryName(Objects.requireNonNull(potFlowerGreen.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerRed).setRegistryName(Objects.requireNonNull(potFlowerRed.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potFlowerBlack).setRegistryName(Objects.requireNonNull(potFlowerBlack.getRegistryName())));

        event.getRegistry().registerAll(new ItemBlock(potCactusWhite).setRegistryName(Objects.requireNonNull(potCactusWhite.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusOrange).setRegistryName(Objects.requireNonNull(potCactusOrange.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusMagenta).setRegistryName(Objects.requireNonNull(potCactusMagenta.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusLightBlue).setRegistryName(Objects.requireNonNull(potCactusLightBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusYellow).setRegistryName(Objects.requireNonNull(potCactusYellow.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusLime).setRegistryName(Objects.requireNonNull(potCactusLime.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusPink).setRegistryName(Objects.requireNonNull(potCactusPink.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusGray).setRegistryName(Objects.requireNonNull(potCactusGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusLightGray).setRegistryName(Objects.requireNonNull(potCactusLightGray.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusCyan).setRegistryName(Objects.requireNonNull(potCactusCyan.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusPurple).setRegistryName(Objects.requireNonNull(potCactusPurple.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusBlue).setRegistryName(Objects.requireNonNull(potCactusBlue.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusBrown).setRegistryName(Objects.requireNonNull(potCactusBrown.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusGreen).setRegistryName(Objects.requireNonNull(potCactusGreen.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusRed).setRegistryName(Objects.requireNonNull(potCactusRed.getRegistryName())));
        event.getRegistry().registerAll(new ItemBlock(potCactusBlack).setRegistryName(Objects.requireNonNull(potCactusBlack.getRegistryName())));

        if(Config.cosmeticblocks)
        {
            event.getRegistry().registerAll(new ItemBlock(blockDyeWhite).setRegistryName(Objects.requireNonNull(blockDyeWhite.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeOrange).setRegistryName(Objects.requireNonNull(blockDyeOrange.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeMagenta).setRegistryName(Objects.requireNonNull(blockDyeMagenta.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeLightBlue).setRegistryName(Objects.requireNonNull(blockDyeLightBlue.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeYellow).setRegistryName(Objects.requireNonNull(blockDyeYellow.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeLime).setRegistryName(Objects.requireNonNull(blockDyeLime.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyePink).setRegistryName(Objects.requireNonNull(blockDyePink.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeGray).setRegistryName(Objects.requireNonNull(blockDyeGray.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeLightGray).setRegistryName(Objects.requireNonNull(blockDyeLightGray.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeCyan).setRegistryName(Objects.requireNonNull(blockDyeCyan.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyePurple).setRegistryName(Objects.requireNonNull(blockDyePurple.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeBlue).setRegistryName(Objects.requireNonNull(blockDyeBlue.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeBrown).setRegistryName(Objects.requireNonNull(blockDyeBrown.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeGreen).setRegistryName(Objects.requireNonNull(blockDyeGreen.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeRed).setRegistryName(Objects.requireNonNull(blockDyeRed.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockDyeBlack).setRegistryName(Objects.requireNonNull(blockDyeBlack.getRegistryName())));

            event.getRegistry().registerAll(new ItemBlock(blockClayWhite).setRegistryName(Objects.requireNonNull(blockClayWhite.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayOrange).setRegistryName(Objects.requireNonNull(blockClayOrange.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayMagenta).setRegistryName(Objects.requireNonNull(blockClayMagenta.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayLightBlue).setRegistryName(Objects.requireNonNull(blockClayLightBlue.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayYellow).setRegistryName(Objects.requireNonNull(blockClayYellow.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayLime).setRegistryName(Objects.requireNonNull(blockClayLime.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayPink).setRegistryName(Objects.requireNonNull(blockClayPink.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayGray).setRegistryName(Objects.requireNonNull(blockClayGray.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayLightGray).setRegistryName(Objects.requireNonNull(blockClayLightGray.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayCyan).setRegistryName(Objects.requireNonNull(blockClayCyan.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayPurple).setRegistryName(Objects.requireNonNull(blockClayPurple.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayBlue).setRegistryName(Objects.requireNonNull(blockClayBlue.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayBrown).setRegistryName(Objects.requireNonNull(blockClayBrown.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayGreen).setRegistryName(Objects.requireNonNull(blockClayGreen.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayRed).setRegistryName(Objects.requireNonNull(blockClayRed.getRegistryName())));
            event.getRegistry().registerAll(new ItemBlock(blockClayBlack).setRegistryName(Objects.requireNonNull(blockClayBlack.getRegistryName())));
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(Item.getItemFromBlock(flowerWhite));
        registerRender(Item.getItemFromBlock(flowerOrange));
        registerRender(Item.getItemFromBlock(flowerMagenta));
        registerRender(Item.getItemFromBlock(flowerLightBlue));
        registerRender(Item.getItemFromBlock(flowerYellow));
        registerRender(Item.getItemFromBlock(flowerLime));
        registerRender(Item.getItemFromBlock(flowerPink));
        registerRender(Item.getItemFromBlock(flowerGray));
        registerRender(Item.getItemFromBlock(flowerLightGray));
        registerRender(Item.getItemFromBlock(flowerCyan));
        registerRender(Item.getItemFromBlock(flowerPurple));
        registerRender(Item.getItemFromBlock(flowerBlue));
        registerRender(Item.getItemFromBlock(flowerBrown));
        registerRender(Item.getItemFromBlock(flowerGreen));
        registerRender(Item.getItemFromBlock(flowerRed));
        registerRender(Item.getItemFromBlock(flowerBlack));

        registerRender(Item.getItemFromBlock(cactusWhite));
        registerRender(Item.getItemFromBlock(cactusOrange));
        registerRender(Item.getItemFromBlock(cactusMagenta));
        registerRender(Item.getItemFromBlock(cactusLightBlue));
        registerRender(Item.getItemFromBlock(cactusYellow));
        registerRender(Item.getItemFromBlock(cactusLime));
        registerRender(Item.getItemFromBlock(cactusPink));
        registerRender(Item.getItemFromBlock(cactusGray));
        registerRender(Item.getItemFromBlock(cactusLightGray));
        registerRender(Item.getItemFromBlock(cactusCyan));
        registerRender(Item.getItemFromBlock(cactusPurple));
        registerRender(Item.getItemFromBlock(cactusBlue));
        registerRender(Item.getItemFromBlock(cactusBrown));
        registerRender(Item.getItemFromBlock(cactusGreen));
        registerRender(Item.getItemFromBlock(cactusRed));
        registerRender(Item.getItemFromBlock(cactusBlack));

        registerRender(Item.getItemFromBlock(potFlowerWhite));
        registerRender(Item.getItemFromBlock(potFlowerOrange));
        registerRender(Item.getItemFromBlock(potFlowerMagenta));
        registerRender(Item.getItemFromBlock(potFlowerLightBlue));
        registerRender(Item.getItemFromBlock(potFlowerYellow));
        registerRender(Item.getItemFromBlock(potFlowerLime));
        registerRender(Item.getItemFromBlock(potFlowerPink));
        registerRender(Item.getItemFromBlock(potFlowerGray));
        registerRender(Item.getItemFromBlock(potFlowerLightGray));
        registerRender(Item.getItemFromBlock(potFlowerCyan));
        registerRender(Item.getItemFromBlock(potFlowerPurple));
        registerRender(Item.getItemFromBlock(potFlowerBlue));
        registerRender(Item.getItemFromBlock(potFlowerBrown));
        registerRender(Item.getItemFromBlock(potFlowerGreen));
        registerRender(Item.getItemFromBlock(potFlowerRed));
        registerRender(Item.getItemFromBlock(potFlowerBlack));

        registerRender(Item.getItemFromBlock(potCactusWhite));
        registerRender(Item.getItemFromBlock(potCactusOrange));
        registerRender(Item.getItemFromBlock(potCactusMagenta));
        registerRender(Item.getItemFromBlock(potCactusLightBlue));
        registerRender(Item.getItemFromBlock(potCactusYellow));
        registerRender(Item.getItemFromBlock(potCactusLime));
        registerRender(Item.getItemFromBlock(potCactusPink));
        registerRender(Item.getItemFromBlock(potCactusGray));
        registerRender(Item.getItemFromBlock(potCactusLightGray));
        registerRender(Item.getItemFromBlock(potCactusCyan));
        registerRender(Item.getItemFromBlock(potCactusPurple));
        registerRender(Item.getItemFromBlock(potCactusBlue));
        registerRender(Item.getItemFromBlock(potCactusBrown));
        registerRender(Item.getItemFromBlock(potCactusGreen));
        registerRender(Item.getItemFromBlock(potCactusRed));
        registerRender(Item.getItemFromBlock(potCactusBlack));

        if(Config.cosmeticblocks)
        {
            registerRender(Item.getItemFromBlock(blockDyeWhite));
            registerRender(Item.getItemFromBlock(blockDyeOrange));
            registerRender(Item.getItemFromBlock(blockDyeMagenta));
            registerRender(Item.getItemFromBlock(blockDyeLightBlue));
            registerRender(Item.getItemFromBlock(blockDyeYellow));
            registerRender(Item.getItemFromBlock(blockDyeLime));
            registerRender(Item.getItemFromBlock(blockDyePink));
            registerRender(Item.getItemFromBlock(blockDyeGray));
            registerRender(Item.getItemFromBlock(blockDyeLightGray));
            registerRender(Item.getItemFromBlock(blockDyeCyan));
            registerRender(Item.getItemFromBlock(blockDyePurple));
            registerRender(Item.getItemFromBlock(blockDyeBlue));
            registerRender(Item.getItemFromBlock(blockDyeBrown));
            registerRender(Item.getItemFromBlock(blockDyeGreen));
            registerRender(Item.getItemFromBlock(blockDyeRed));
            registerRender(Item.getItemFromBlock(blockDyeBlack));

            registerRender(Item.getItemFromBlock(blockClayWhite));
            registerRender(Item.getItemFromBlock(blockClayOrange));
            registerRender(Item.getItemFromBlock(blockClayMagenta));
            registerRender(Item.getItemFromBlock(blockClayLightBlue));
            registerRender(Item.getItemFromBlock(blockClayYellow));
            registerRender(Item.getItemFromBlock(blockClayLime));
            registerRender(Item.getItemFromBlock(blockClayPink));
            registerRender(Item.getItemFromBlock(blockClayGray));
            registerRender(Item.getItemFromBlock(blockClayLightGray));
            registerRender(Item.getItemFromBlock(blockClayCyan));
            registerRender(Item.getItemFromBlock(blockClayPurple));
            registerRender(Item.getItemFromBlock(blockClayBlue));
            registerRender(Item.getItemFromBlock(blockClayBrown));
            registerRender(Item.getItemFromBlock(blockClayGreen));
            registerRender(Item.getItemFromBlock(blockClayRed));
            registerRender(Item.getItemFromBlock(blockClayBlack));
        }
    }
}