package com.luxtracon.floralis;

import com.luxtracon.floralis.init.InitDyeblock;
import com.luxtracon.floralis.init.InitFlower;
import com.luxtracon.floralis.init.InitItem;
import com.luxtracon.floralis.tabs.Tab;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MODID, name=Reference.MODNAME, version=Reference.MODVERSION)
public class Main
{
	public static final CreativeTabs MODTAB = new Tab("floralis");

	@Instance
	public static Main instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		InitFlower.init();
		InitItem.init();
		InitDyeblock.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}