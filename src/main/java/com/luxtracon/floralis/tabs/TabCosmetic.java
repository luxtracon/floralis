package com.luxtracon.floralis.tabs;

import com.luxtracon.floralis.init.InitBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabCosmetic extends CreativeTabs
{
    public TabCosmetic()
    {
        super("cosmetictab");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(InitBlock.blockDyePurple);
    }
}
