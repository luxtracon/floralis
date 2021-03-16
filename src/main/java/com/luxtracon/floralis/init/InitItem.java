package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.BaseItem;
import com.luxtracon.floralis.Reference;

import com.luxtracon.floralis.items.dye.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@EventBusSubscriber(modid=Reference.MODID)
public class InitItem
{
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

	public static Item dyeWhite;
	public static Item dyeOrange;
	public static Item dyeMagenta;
	public static Item dyeLightBlue;
	public static Item dyeYellow;
	public static Item dyeLime;
	public static Item dyePink;
	public static Item dyeGray;
	public static Item dyeLightGray;
	public static Item dyeCyan;
	public static Item dyePurple;
	public static Item dyeBlue;
	public static Item dyeBrown;
	public static Item dyeGreen;
	public static Item dyeRed;
	public static Item dyeBlack;
	
	public static void init()
	{
		seedWhite = new BaseItem("whiteseed");
		seedOrange = new BaseItem("orangeseed");
		seedMagenta = new BaseItem("magentaseed");
		seedLightBlue = new BaseItem("lightblueseed");
		seedYellow = new BaseItem("yellowseed");
		seedLime = new BaseItem("limeseed");
		seedPink = new BaseItem("pinkseed");
		seedGray = new BaseItem("grayseed");
		seedLightGray = new BaseItem("lightgrayseed");
		seedCyan = new BaseItem("cyanseed");
		seedPurple = new BaseItem("purpleseed");
		seedBlue = new BaseItem("blueseed");
		seedBrown = new BaseItem("brownseed");
		seedGreen = new BaseItem("greenseed");
		seedRed = new BaseItem("redseed");
		seedBlack = new BaseItem("blackseed");

		petalWhite = new BaseItem("whitepetal");
		petalOrange = new BaseItem("orangepetal");
		petalMagenta = new BaseItem("magentapetal");
		petalLightBlue = new BaseItem("lightbluepetal");
		petalYellow = new BaseItem("yellowpetal");
		petalLime = new BaseItem("limepetal");
		petalPink = new BaseItem("pinkpetal");
		petalGray = new BaseItem("graypetal");
		petalLightGray = new BaseItem("lightgraypetal");
		petalCyan = new BaseItem("cyanpetal");
		petalPurple = new BaseItem("purplepetal");
		petalBlue = new BaseItem("bluepetal");
		petalBrown = new BaseItem("brownpetal");
		petalGreen = new BaseItem("greenpetal");
		petalRed = new BaseItem("redpetal");
		petalBlack = new BaseItem("blackpetal");

		dyeWhite = new DyeWhite("whitedye");
		dyeOrange = new DyeOrange("orangedye");
		dyeMagenta = new DyeMagenta("magentadye");
		dyeLightBlue = new DyeLightBlue("lightbluedye");
		dyeYellow = new DyeYellow("yellowdye");
		dyeLime = new DyeLime("limedye");
		dyePink = new DyePink("pinkdye");
		dyeGray = new DyeGray("graydye");
		dyeLightGray = new DyeLightGray("lightgraydye");
		dyeCyan = new DyeCyan("cyandye");
		dyePurple = new DyePurple("purpledye");
		dyeBlue = new DyeBlue("bluedye");
		dyeBrown = new DyeBrown("browndye");
		dyeGreen = new DyeGreen("greendye");
		dyeRed = new DyeRed("reddye");
		dyeBlack = new DyeBlack("blackdye");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
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
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
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
	}
	
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
	}
}