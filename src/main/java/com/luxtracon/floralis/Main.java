package com.luxtracon.floralis;

import com.luxtracon.floralis.compat.*;
import com.luxtracon.floralis.init.*;
import com.luxtracon.floralis.registry.*;
import com.luxtracon.floralis.tabs.*;
import com.luxtracon.floralis.utilities.*;

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

	private static boolean isForestryFarmingPresent;
	private static boolean isImmersiveEngineeringPresent;
	private static boolean isIndustrialForegoingPresent;
	private static boolean isThermalExpansionPresent;

	@EventHandler
	public static void onConstructionEvent(FMLConstructionEvent event)
	{
		isForestryFarmingPresent = Loader.isModLoaded("forestry");
		isImmersiveEngineeringPresent = Loader.isModLoaded("immersiveengineering");
		isIndustrialForegoingPresent = Loader.isModLoaded("industrialforegoing");
		isThermalExpansionPresent = Loader.isModLoaded("thermalexpansion");
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Config.init(event);

		InitBlock.init();
		InitCactus.init();
		InitCropFlower.init();
		InitCropCactus.init();
		InitFlower.init();
		InitItem.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if(isForestryFarmingPresent && Config.ffcompat)
		{
			ForestryFarming.init();
		}

		if(isImmersiveEngineeringPresent && Config.iecompat)
		{
			ImmersiveEngineering.init();
		}

		if(isIndustrialForegoingPresent && Config.ifcompat)
		{
			IndustrialForegoing.init();
		}

		if(isThermalExpansionPresent && Config.tecompat)
		{
			ThermalExpansion.init();
		}

		CreationRegistry.init();
		DictionaryRegistry.init();
		GeneratorRegistry.init();
		SmeltingRegistry.init();
		StructureRegistry.init();
		VillagerRegistry.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}