package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;

import net.minecraft.item.Item;

public class ItemPotUnfired extends Item
{
	public ItemPotUnfired(String name)
	{
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(Main.MODTAB);
	}
}