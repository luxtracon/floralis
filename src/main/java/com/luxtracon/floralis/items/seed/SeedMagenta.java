package com.luxtracon.floralis.items.seed;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.InitCrop;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedMagenta extends ItemSeeds
{
    public SeedMagenta(String name)
    {
        super(InitCrop.cropMagenta, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.FLORALISTAB);
    }
}