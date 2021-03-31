package com.luxtracon.floralis;

import com.luxtracon.floralis.init.*;
import com.luxtracon.floralis.registry.*;
import com.luxtracon.floralis.tabs.*;
import com.luxtracon.floralis.utility.*;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class Main
{
	public static final CreativeTabs MODTAB = new Tab();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Config.init(event);

		InitFlower.init();
		InitCrop.init();
		InitItem.init();
		InitBlock.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		DictionaryRegistry.init();
		GeneratorRegistry.init();
		HandlerRegistry.init();
		SmeltingRegistry.init();
		StructureRegistry.init();
		VillagerRegistry.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}