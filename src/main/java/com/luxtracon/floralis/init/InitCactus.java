package com.luxtracon.floralis.init;

import com.luxtracon.floralis.blocks.cactus.*;
import com.luxtracon.floralis.utilities.Reference;

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
public class InitCactus
{
    public static Block cactusWhite;
    public static Block cactusOrange;
    public static Block cactusMagenta;
    public static Block cactusLightBlue;
    public static Block cactusYellow;
    public static Block cactusLime;
    public static Block cactusPink;
    public static Block cactusGray;
    public static Block cactusLightGray;
    public static Block cactusCyan;
    public static Block cactusPurple;
    public static Block cactusBlue;
    public static Block cactusBrown;
    public static Block cactusGreen;
    public static Block cactusRed;
    public static Block cactusBlack;

    public static void init()
    {
        cactusWhite = new CactusWhite("whitecactus", Material.CACTUS, 0.4f, 0.4f);
        cactusOrange = new CactusOrange("orangecactus", Material.CACTUS, 0.4f, 0.4f);
        cactusMagenta = new CactusMagenta("magentacactus", Material.CACTUS, 0.4f, 0.4f);
        cactusLightBlue = new CactusLightBlue("lightbluecactus", Material.CACTUS, 0.4f, 0.4f);
        cactusYellow = new CactusYellow("yellowcactus", Material.CACTUS, 0.4f, 0.4f);
        cactusLime = new CactusLime("limecactus", Material.CACTUS, 0.4f, 0.4f);
        cactusPink = new CactusPink("pinkcactus", Material.CACTUS, 0.4f, 0.4f);
        cactusGray = new CactusGray("graycactus", Material.CACTUS, 0.4f, 0.4f);
        cactusLightGray = new CactusLightGray("lightgraycactus", Material.CACTUS, 0.4f, 0.4f);
        cactusCyan = new CactusCyan("cyancactus", Material.CACTUS, 0.4f, 0.4f);
        cactusPurple = new CactusPurple("purplecactus", Material.CACTUS, 0.4f, 0.4f);
        cactusBlue = new CactusBlue("bluecactus", Material.CACTUS, 0.4f, 0.4f);
        cactusBrown = new CactusBrown("browncactus", Material.CACTUS, 0.4f, 0.4f);
        cactusGreen = new CactusGreen("greencactus", Material.CACTUS, 0.4f, 0.4f);
        cactusRed = new CactusRed("redcactus", Material.CACTUS, 0.4f, 0.4f);
        cactusBlack = new CactusBlack("blackcactus", Material.CACTUS, 0.4f, 0.4f);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
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
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
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
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
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
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}