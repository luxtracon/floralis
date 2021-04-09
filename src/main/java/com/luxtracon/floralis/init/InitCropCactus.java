package com.luxtracon.floralis.init;

import com.luxtracon.floralis.blocks.cropcactus.CropCactusWhite;
import com.luxtracon.floralis.utilities.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class InitCropCactus
{
    public static BlockCrops cropCactusWhite;

    public static void init()
    {
        cropCactusWhite = new CropCactusWhite("whitecactuscrop");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(cropCactusWhite);
    }
}