package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;

import net.minecraft.item.Item;

public class ItemDyedClay extends Item
{
	public ItemDyedClay(String name)
	{
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(Main.MODTAB);
	}
}