package com.luxtracon.floralis.items.seed;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.InitCrop;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedPink extends ItemSeeds
{
    public SeedPink(String name)
    {
        super(InitCrop.cropPink, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.FLORALISTAB);
    }
}