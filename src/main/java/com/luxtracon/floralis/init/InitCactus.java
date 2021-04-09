package com.luxtracon.floralis.init;

import com.luxtracon.floralis.blocks.cactus.CactusWhite;
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

    public static void init()
    {
        cactusWhite = new CactusWhite("whitecactus", Material.CACTUS, 0.4f, 0.4f);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cactusWhite);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(new ItemBlock(cactusWhite).setRegistryName(Objects.requireNonNull(cactusWhite.getRegistryName())));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(Item.getItemFromBlock(cactusWhite));
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}