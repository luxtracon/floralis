package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;

import net.minecraft.item.Item;

public class ItemPlantPetal extends Item
{
    public ItemPlantPetal(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }
}
