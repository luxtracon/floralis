package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;

import net.minecraft.item.Item;

public class BaseItem extends Item
{
	public BaseItem(String name)
	{
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(Main.MODTAB);
	}
}