package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.ItemBase;
import com.luxtracon.floralis.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid=Reference.MODID)
public class ItemInit
{

	static Item	dyeWhite;
	static Item dyeOrange;
	static Item dyeMagenta;
	static Item dyeLightBlue;
	static Item dyeYellow;
	static Item dyeLime;
	static Item dyePink;
	static Item dyeGray;
	static Item dyeLightGray;
	static Item dyeCyan;
	static Item dyePurple;
	static Item dyeBlue;
	static Item dyeBrown;
	static Item dyeGreen;
	static Item dyeRed;
	static Item dyeBlack;

	public static Item petalWhite;
	public static Item petalOrange;
	public static Item petalMagenta;
	public static Item petalLightBlue;
	public static Item petalYellow;
	public static Item petalLime;
	public static Item petalPink;
	public static Item petalGray;
	public static Item petalLightGray;
	public static Item petalCyan;
	public static Item petalPurple;
	public static Item petalBlue;
	public static Item petalBrown;
	public static Item petalGreen;
	public static Item petalRed;
	public static Item petalBlack;

	public static Item seedWhite;
	public static Item seedOrange;
	public static Item seedMagenta;
	public static Item seedLightBlue;
	public static Item seedYellow;
	public static Item seedLime;
	public static Item seedPink;
	public static Item seedGray;
	public static Item seedLightGray;
	public static Item seedCyan;
	public static Item seedPurple;
	public static Item seedBlue;
	public static Item seedBrown;
	public static Item seedGreen;
	public static Item seedRed;
	public static Item seedBlack;
	
	public static void init()
	{
		dyeWhite = new ItemBase ("whitedye");
		dyeOrange = new ItemBase("orangedye");
		dyeMagenta = new ItemBase ("magentadye");
		dyeLightBlue = new ItemBase("lightbluedye");
		dyeYellow = new ItemBase("yellowdye");
		dyeLime = new ItemBase ("limedye");
		dyePink = new ItemBase ("pinkdye");
		dyeGray = new ItemBase("graydye");
		dyeLightGray = new ItemBase("lightgraydye");
		dyeCyan = new ItemBase ("cyandye");
		dyePurple = new ItemBase("purpledye");
		dyeBlue = new ItemBase("bluedye");
		dyeBrown = new ItemBase ("browndye");
		dyeGreen = new ItemBase ("greendye");
		dyeRed = new ItemBase("reddye");
		dyeBlack = new ItemBase("blackdye");

		petalWhite = new ItemBase("whitepetal");
		petalOrange = new ItemBase("orangepetal");
		petalMagenta = new ItemBase("magentapetal");
		petalLightBlue = new ItemBase("lightbluepetal");
		petalYellow = new ItemBase("yellowpetal");
		petalLime = new ItemBase("limepetal");
		petalPink = new ItemBase("pinkpetal");
		petalGray = new ItemBase("graypetal");
		petalLightGray = new ItemBase("lightgraypetal");
		petalCyan = new ItemBase("cyanpetal");
		petalPurple = new ItemBase("purplepetal");
		petalBlue = new ItemBase("bluepetal");
		petalBrown = new ItemBase("brownpetal");
		petalGreen = new ItemBase("greenpetal");
		petalRed = new ItemBase("redpetal");
		petalBlack = new ItemBase("blackpetal");

		seedWhite = new ItemBase("whiteseed");
		seedOrange = new ItemBase("orangeseed");
		seedMagenta = new ItemBase("magentaseed");
		seedLightBlue = new ItemBase("lightblueseed");
		seedYellow = new ItemBase("yellowseed");
		seedLime = new ItemBase("limeseed");
		seedPink = new ItemBase("pinkseed");
		seedGray = new ItemBase("grayseed");
		seedLightGray = new ItemBase("lightgrayseed");
		seedCyan = new ItemBase("cyanseed");
		seedPurple = new ItemBase("purpleseed");
		seedBlue = new ItemBase("blueseed");
		seedBrown = new ItemBase("brownseed");
		seedGreen = new ItemBase("greenseed");
		seedRed = new ItemBase("redseed");
		seedBlack = new ItemBase("blackseed");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(dyeWhite);
		event.getRegistry().registerAll(dyeOrange);
		event.getRegistry().registerAll(dyeMagenta);
		event.getRegistry().registerAll(dyeLightBlue);
		event.getRegistry().registerAll(dyeYellow);
		event.getRegistry().registerAll(dyeLime);
		event.getRegistry().registerAll(dyePink);
		event.getRegistry().registerAll(dyeGray);
		event.getRegistry().registerAll(dyeLightGray);
		event.getRegistry().registerAll(dyeCyan);
		event.getRegistry().registerAll(dyePurple);
		event.getRegistry().registerAll(dyeBlue);
		event.getRegistry().registerAll(dyeBrown);
		event.getRegistry().registerAll(dyeGreen);
		event.getRegistry().registerAll(dyeRed);
		event.getRegistry().registerAll(dyeBlack);

		event.getRegistry().registerAll(petalWhite);
		event.getRegistry().registerAll(petalOrange);
		event.getRegistry().registerAll(petalMagenta);
		event.getRegistry().registerAll(petalLightBlue);
		event.getRegistry().registerAll(petalYellow);
		event.getRegistry().registerAll(petalLime);
		event.getRegistry().registerAll(petalPink);
		event.getRegistry().registerAll(petalGray);
		event.getRegistry().registerAll(petalLightGray);
		event.getRegistry().registerAll(petalCyan);
		event.getRegistry().registerAll(petalPurple);
		event.getRegistry().registerAll(petalBlue);
		event.getRegistry().registerAll(petalBrown);
		event.getRegistry().registerAll(petalGreen);
		event.getRegistry().registerAll(petalRed);
		event.getRegistry().registerAll(petalBlack);

		event.getRegistry().registerAll(seedWhite);
		event.getRegistry().registerAll(seedOrange);
		event.getRegistry().registerAll(seedMagenta);
		event.getRegistry().registerAll(seedLightBlue);
		event.getRegistry().registerAll(seedYellow);
		event.getRegistry().registerAll(seedLime);
		event.getRegistry().registerAll(seedPink);
		event.getRegistry().registerAll(seedGray);
		event.getRegistry().registerAll(seedLightGray);
		event.getRegistry().registerAll(seedCyan);
		event.getRegistry().registerAll(seedPurple);
		event.getRegistry().registerAll(seedBlue);
		event.getRegistry().registerAll(seedBrown);
		event.getRegistry().registerAll(seedGreen);
		event.getRegistry().registerAll(seedRed);
		event.getRegistry().registerAll(seedBlack);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		registerRender(dyeWhite);
		registerRender(dyeOrange);
		registerRender(dyeMagenta);
		registerRender(dyeLightBlue);
		registerRender(dyeYellow);
		registerRender(dyeLime);
		registerRender(dyePink);
		registerRender(dyeGray);
		registerRender(dyeLightGray);
		registerRender(dyeCyan);
		registerRender(dyePurple);
		registerRender(dyeBlue);
		registerRender(dyeBrown);
		registerRender(dyeGreen);
		registerRender(dyeRed);
		registerRender(dyeBlack);

		registerRender(petalWhite);
		registerRender(petalOrange);
		registerRender(petalMagenta);
		registerRender(petalLightBlue);
		registerRender(petalYellow);
		registerRender(petalLime);
		registerRender(petalPink);
		registerRender(petalGray);
		registerRender(petalLightGray);
		registerRender(petalCyan);
		registerRender(petalPurple);
		registerRender(petalBlue);
		registerRender(petalBrown);
		registerRender(petalGreen);
		registerRender(petalRed);
		registerRender(petalBlack);

		registerRender(seedWhite);
		registerRender(seedOrange);
		registerRender(seedMagenta);
		registerRender(seedLightBlue);
		registerRender(seedYellow);
		registerRender(seedLime);
		registerRender(seedPink);
		registerRender(seedGray);
		registerRender(seedLightGray);
		registerRender(seedCyan);
		registerRender(seedPurple);
		registerRender(seedBlue);
		registerRender(seedBrown);
		registerRender(seedGreen);
		registerRender(seedRed);
		registerRender(seedBlack);
	}
	
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}