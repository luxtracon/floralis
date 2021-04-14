package com.luxtracon.floralis.items.seedflower;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.FlowerCropInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedFlowerYellow extends ItemSeeds
{
    public SeedFlowerYellow(String name)
    {
        super(FlowerCropInit.cropFlowerYellow, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }
}