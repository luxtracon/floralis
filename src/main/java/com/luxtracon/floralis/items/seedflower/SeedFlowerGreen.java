package com.luxtracon.floralis.items.seedflower;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.FlowerCropInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedFlowerGreen extends ItemSeeds
{
    public SeedFlowerGreen(String name)
    {
        super(FlowerCropInit.cropFlowerGreen, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }
}