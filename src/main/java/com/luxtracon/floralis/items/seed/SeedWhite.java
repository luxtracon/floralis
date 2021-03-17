package com.luxtracon.floralis.items.seed;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.InitCrop;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedWhite extends ItemSeeds
{
    public SeedWhite(String name) {
        super(InitCrop.cropWhite, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }
}