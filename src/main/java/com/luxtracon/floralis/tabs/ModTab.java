package com.luxtracon.floralis.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs {
    private ItemStack tabIconItem;

    public ModTab(String name) {
        super(name);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon() {
        return tabIconItem;
    }

    public ItemStack getTabIconItem() {
        return tabIconItem;
    }

    public void setTabIconItem(ItemStack iconItem) {
        tabIconItem = iconItem;
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}
