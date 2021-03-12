package com.luxtracon.floralis.init;

import com.luxtracon.floralis.Reference;
import com.luxtracon.floralis.flower.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@EventBusSubscriber(modid= Reference.MODID)
public class InitFlower
{
    static BlockBush flowerWhite;
    static BlockBush flowerOrange;
    static BlockBush flowerMagenta;
    static BlockBush flowerLightBlue;
    static BlockBush flowerYellow;
    static BlockBush flowerLime;
    static BlockBush flowerPink;
    static BlockBush flowerGray;
    static BlockBush flowerLightGray;
    static BlockBush flowerCyan;
    public static BlockBush flowerPurple;
    static BlockBush flowerBlue;
    static BlockBush flowerBrown;
    static BlockBush flowerGreen;
    static BlockBush flowerRed;
    static BlockBush flowerBlack;

    public static void init()
    {
        flowerWhite = new FlowerWhite("whiteflower");
        flowerOrange = new FlowerOrange("orangeflower");
        flowerMagenta = new FlowerMagenta("magentaflower");
        flowerLightBlue = new FlowerLightBlue("lightblueflower");
        flowerYellow = new FlowerYellow("yellowflower");
        flowerLime = new FlowerLime("limeflower");
        flowerPink = new FlowerPink("pinkflower");
        flowerGray = new FlowerGray("grayflower");
        flowerLightGray = new FlowerLightGray("lightgrayflower");
        flowerCyan = new FlowerCyan("cyanflower");
        flowerPurple = new FlowerPurple("purpleflower");
        flowerBlue = new FlowerBlue("blueflower");
        flowerBrown = new FlowerBrown("brownflower");
        flowerGreen = new FlowerGreen("greenflower");
        flowerRed = new FlowerRed("redflower");
        flowerBlack = new FlowerBlack("blackflower");
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
    }

    public static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}