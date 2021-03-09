package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	public ItemBase(String name) {
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(Main.MODTAB);
	}	
}