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

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION, dependencies = Reference.MODDEPENDENCIES)
public class Main
{
	public static final CreativeTabs MODTAB = new Tab();

	private static boolean isForestryPresent;
	private static boolean isImmersiveEngineeringPresent;
	private static boolean isIndustrialForegoingPresent;
	private static boolean isThermalExpansionPresent;


	@EventHandler
	public static void onConstructionEvent(FMLConstructionEvent event)
	{
		isForestryPresent = Loader.isModLoaded("forestry");
		isImmersiveEngineeringPresent = Loader.isModLoaded("immersiveengineering");
		isIndustrialForegoingPresent = Loader.isModLoaded("industrialforegoing");
		isThermalExpansionPresent = Loader.isModLoaded("thermalexpansion");
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
		if(isForestryPresent)
		{
			Forestry.init();
		}

		if(isImmersiveEngineeringPresent)
		{
			ImmersiveEngineering.init();
		}

		if(isIndustrialForegoingPresent)
		{
			IndustrialForegoing.init();
		}

		if(isThermalExpansionPresent)
		{
			ThermalExpansion.init();
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