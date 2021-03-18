package com.luxtracon.floralis;

import com.luxtracon.floralis.init.*;
import com.luxtracon.floralis.util.*;
import com.luxtracon.floralis.tabs.Tab;
import com.luxtracon.floralis.world.CustomWorldgen;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		InitCrop.init();
		InitItem.init();
		InitBlock.init();

		GameRegistry.registerWorldGenerator(new CustomWorldgen(), 0);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		RecipeRegistry.init();
		OredictRegistry.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}