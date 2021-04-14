package com.luxtracon.floralis.items.seedflower;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.FlowerCropInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedFlowerBlack extends ItemSeeds
{
    public SeedFlowerBlack(String name)
    {
        super(FlowerCropInit.cropFlowerBlack, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }
}