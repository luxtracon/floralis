package com.luxtracon.floralis.init;

import com.luxtracon.floralis.utility.Config;
import com.luxtracon.floralis.utility.Reference;
import com.luxtracon.floralis.base.BaseBlock;

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
public class InitBlock
{
    public static Block blockDyeWhite;
    public static Block blockDyeOrange;
    public static Block blockDyeMagenta;
    public static Block blockDyeLightBlue;
    public static Block blockDyeYellow;
    public static Block blockDyeLime;
    public static Block blockDyePink;
    public static Block blockDyeGray;
    public static Block blockDyeLightGray;
    public static Block blockDyeCyan;
    public static Block blockDyePurple;
    public static Block blockDyeBlue;
    public static Block blockDyeBrown;
    public static Block blockDyeGreen;
    public static Block blockDyeRed;
    public static Block blockDyeBlack;

    public static void init()
    {
        blockDyeWhite = new BaseBlock("whitedyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeOrange = new BaseBlock("orangedyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeMagenta = new BaseBlock("magentadyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeLightBlue = new BaseBlock("lightbluedyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeYellow = new BaseBlock("yellowdyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeLime = new BaseBlock("limedyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyePink = new BaseBlock("pinkdyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeGray = new BaseBlock("graydyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeLightGray = new BaseBlock("lightgraydyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeCyan = new BaseBlock("cyandyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyePurple = new BaseBlock("purpledyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeBlue = new BaseBlock("bluedyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeBrown = new BaseBlock("browndyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeGreen = new BaseBlock("greendyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeRed = new BaseBlock("reddyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
        blockDyeBlack = new BaseBlock("blackdyeblock", Material.SAND, 0.5f, 2.5f, "shovel", 0);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        if(Config.loadcosmetic)
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
        }
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        if(Config.loadcosmetic)
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
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        if(Config.loadcosmetic)
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
        }
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}