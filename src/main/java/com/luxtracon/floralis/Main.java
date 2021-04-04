package com.luxtracon.floralis;

import com.luxtracon.floralis.compat.*;
import com.luxtracon.floralis.init.*;
import com.luxtracon.floralis.registry.*;
import com.luxtracon.floralis.tabs.*;
import com.luxtracon.floralis.utility.*;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION, dependencies = "after:immersiveengineering")
public class Main
{
	public static final CreativeTabs FLORALISTAB = new TabFloralis();
	public static final CreativeTabs COSMETICTAB = new TabCosmetic();

	private static boolean isImmersiveEngineeringPresent;

	@EventHandler
	public static void onConstructionEvent(FMLConstructionEvent event)
	{
		isImmersiveEngineeringPresent = Loader.isModLoaded("immersiveengineering");
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Config.init(event);

		InitBlock.init();
		InitCrop.init();
		InitFlower.init();
		InitItem.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if(isImmersiveEngineeringPresent)
		{
			ImmersiveEngineering.init();
		}

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