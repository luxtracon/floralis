package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.CactusBase;
import com.luxtracon.floralis.blocks.cactus.*;
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
public class CactusInit
{
    public static CactusBase cactusWhite;
    public static CactusBase cactusOrange;
    public static CactusBase cactusMagenta;
    public static CactusBase cactusLightBlue;
    public static CactusBase cactusYellow;
    public static CactusBase cactusLime;
    public static CactusBase cactusPink;
    public static CactusBase cactusGray;
    public static CactusBase cactusLightGray;
    public static CactusBase cactusCyan;
    public static CactusBase cactusPurple;
    public static CactusBase cactusBlue;
    public static CactusBase cactusBrown;
    public static CactusBase cactusGreen;
    public static CactusBase cactusRed;
    public static CactusBase cactusBlack;

    public static void init()
    {
        cactusWhite = new CactusWhite("whitecactus", Material.CACTUS);
        cactusOrange = new CactusOrange("orangecactus", Material.CACTUS);
        cactusMagenta = new CactusMagenta("magentacactus", Material.CACTUS);
        cactusLightBlue = new CactusLightBlue("lightbluecactus", Material.CACTUS);
        cactusYellow = new CactusYellow("yellowcactus", Material.CACTUS);
        cactusLime = new CactusLime("limecactus", Material.CACTUS);
        cactusPink = new CactusPink("pinkcactus", Material.CACTUS);
        cactusGray = new CactusGray("graycactus", Material.CACTUS);
        cactusLightGray = new CactusLightGray("lightgraycactus", Material.CACTUS);
        cactusCyan = new CactusCyan("cyancactus", Material.CACTUS);
        cactusPurple = new CactusPurple("purplecactus", Material.CACTUS);
        cactusBlue = new CactusBlue("bluecactus", Material.CACTUS);
        cactusBrown = new CactusBrown("browncactus", Material.CACTUS);
        cactusGreen = new CactusGreen("greencactus", Material.CACTUS);
        cactusRed = new CactusRed("redcactus", Material.CACTUS);
        cactusBlack = new CactusBlack("blackcactus", Material.CACTUS);
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