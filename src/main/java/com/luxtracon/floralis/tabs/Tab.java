package com.luxtracon.floralis.tabs;

import com.luxtracon.floralis.init.InitFlower;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tab extends CreativeTabs
{
    public Tab()
    {
        super("floralis");
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(InitFlower.flowerPurple);
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}