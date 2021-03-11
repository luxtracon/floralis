package com.luxtracon.floralis.tabs;

import com.luxtracon.floralis.init.FlowerInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs
{
    public ModTab (String label)
    {
        super("floralis");
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon ()
    {
        return new ItemStack(FlowerInit.flowerPurple);
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}