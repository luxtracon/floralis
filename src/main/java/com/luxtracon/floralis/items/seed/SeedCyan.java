package com.luxtracon.floralis.items.seed;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.InitCrop;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SeedCyan extends ItemSeeds
{
    public SeedCyan(String name) {
        super(InitCrop.cropCyan, Blocks.FARMLAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }
}