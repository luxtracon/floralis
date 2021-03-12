package com.luxtracon.floralis;

import com.luxtracon.floralis.init.BlockInit;
import com.luxtracon.floralis.init.FlowerInit;
import com.luxtracon.floralis.init.ItemInit;

import com.luxtracon.floralis.tabs.ModTab;
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
	public static final CreativeTabs MODTAB = new ModTab("floralis");

	@Instance
	public static Main instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BlockInit.init();
		ItemInit.init();
		FlowerInit.init();
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