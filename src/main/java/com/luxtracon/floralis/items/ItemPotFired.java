package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;

import net.minecraft.item.Item;

public class ItemPotFired extends Item
{
	public ItemPotFired(String name)
	{
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(Main.MODTAB);
	}
}