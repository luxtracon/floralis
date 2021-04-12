package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.BaseItem;
import com.luxtracon.floralis.items.dye.*;
import com.luxtracon.floralis.items.seedflower.*;
import com.luxtracon.floralis.items.seedcactus.*;
import com.luxtracon.floralis.utilities.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

@EventBusSubscriber(modid = Reference.MODID)
public class InitItem
{
	public static Item seedFlowerWhite;
	public static Item seedFlowerOrange;
	public static Item seedFlowerMagenta;
	public static Item seedFlowerLightBlue;
	public static Item seedFlowerYellow;
	public static Item seedFlowerLime;
	public static Item seedFlowerPink;
	public static Item seedFlowerGray;
	public static Item seedFlowerLightGray;
	public static Item seedFlowerCyan;
	public static Item seedFlowerPurple;
	public static Item seedFlowerBlue;
	public static Item seedFlowerBrown;
	public static Item seedFlowerGreen;
	public static Item seedFlowerRed;
	public static Item seedFlowerBlack;

	public static Item seedCactusWhite;
	public static Item seedCactusOrange;
	public static Item seedCactusMagenta;
	public static Item seedCactusLightBlue;
	public static Item seedCactusYellow;
	public static Item seedCactusLime;
	public static Item seedCactusPink;
	public static Item seedCactusGray;
	public static Item seedCactusLightGray;
	public static Item seedCactusCyan;
	public static Item seedCactusPurple;
	public static Item seedCactusBlue;
	public static Item seedCactusBrown;
	public static Item seedCactusGreen;
	public static Item seedCactusRed;
	public static Item seedCactusBlack;

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
		seedFlowerWhite = new SeedFlowerWhite("whiteseed");
		seedFlowerOrange = new SeedFlowerOrange("orangeseed");
		seedFlowerMagenta = new SeedFlowerMagenta("magentaseed");
		seedFlowerLightBlue = new SeedFlowerLightBlue("lightblueseed");
		seedFlowerYellow = new SeedFlowerYellow("yellowseed");
		seedFlowerLime = new SeedFlowerLime("limeseed");
		seedFlowerPink = new SeedFlowerPink("pinkseed");
		seedFlowerGray = new SeedFlowerGray("grayseed");
		seedFlowerLightGray = new SeedFlowerLightGray("lightgrayseed");
		seedFlowerCyan = new SeedFlowerCyan("cyanseed");
		seedFlowerPurple = new SeedFlowerPurple("purpleseed");
		seedFlowerBlue = new SeedFlowerBlue("blueseed");
		seedFlowerBrown = new SeedFlowerBrown("brownseed");
		seedFlowerGreen = new SeedFlowerGreen("greenseed");
		seedFlowerRed = new SeedFlowerRed("redseed");
		seedFlowerBlack = new SeedFlowerBlack("blackseed");

		seedCactusWhite = new SeedCactusWhite("whitecactusseed");
		seedCactusOrange = new SeedCactusOrange("orangecactusseed");
		seedCactusMagenta = new SeedCactusMagenta("magentacactusseed");
		seedCactusLightBlue = new SeedCactusLightBlue("lightbluecactusseed");
		seedCactusYellow = new SeedCactusYellow("yellowcactusseed");
		seedCactusLime = new SeedCactusLime("limecactusseed");
		seedCactusPink = new SeedCactusPink("pinkcactusseed");
		seedCactusGray = new SeedCactusGray("graycactusseed");
		seedCactusLightGray = new SeedCactusLightGray("lightgraycactusseed");
		seedCactusCyan = new SeedCactusCyan("cyancactusseed");
		seedCactusPurple = new SeedCactusPurple("purplecactusseed");
		seedCactusBlue = new SeedCactusBlue("bluecactusseed");
		seedCactusBrown = new SeedCactusBrown("browncactusseed");
		seedCactusGreen = new SeedCactusGreen("greencactusseed");
		seedCactusRed = new SeedCactusRed("redcactusseed");
		seedCactusBlack = new SeedCactusBlack("blackcactusseed");

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
		event.getRegistry().registerAll(seedFlowerWhite);
		event.getRegistry().registerAll(seedFlowerOrange);
		event.getRegistry().registerAll(seedFlowerMagenta);
		event.getRegistry().registerAll(seedFlowerLightBlue);
		event.getRegistry().registerAll(seedFlowerYellow);
		event.getRegistry().registerAll(seedFlowerLime);
		event.getRegistry().registerAll(seedFlowerPink);
		event.getRegistry().registerAll(seedFlowerGray);
		event.getRegistry().registerAll(seedFlowerLightGray);
		event.getRegistry().registerAll(seedFlowerCyan);
		event.getRegistry().registerAll(seedFlowerPurple);
		event.getRegistry().registerAll(seedFlowerBlue);
		event.getRegistry().registerAll(seedFlowerBrown);
		event.getRegistry().registerAll(seedFlowerGreen);
		event.getRegistry().registerAll(seedFlowerRed);
		event.getRegistry().registerAll(seedFlowerBlack);

		event.getRegistry().registerAll(seedCactusWhite);
		event.getRegistry().registerAll(seedCactusOrange);
		event.getRegistry().registerAll(seedCactusMagenta);
		event.getRegistry().registerAll(seedCactusLightBlue);
		event.getRegistry().registerAll(seedCactusYellow);
		event.getRegistry().registerAll(seedCactusLime);
		event.getRegistry().registerAll(seedCactusPink);
		event.getRegistry().registerAll(seedCactusGray);
		event.getRegistry().registerAll(seedCactusLightGray);
		event.getRegistry().registerAll(seedCactusCyan);
		event.getRegistry().registerAll(seedCactusPurple);
		event.getRegistry().registerAll(seedCactusBlue);
		event.getRegistry().registerAll(seedCactusBrown);
		event.getRegistry().registerAll(seedCactusGreen);
		event.getRegistry().registerAll(seedCactusRed);
		event.getRegistry().registerAll(seedCactusBlack);

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
		registerRender(seedFlowerWhite);
		registerRender(seedFlowerOrange);
		registerRender(seedFlowerMagenta);
		registerRender(seedFlowerLightBlue);
		registerRender(seedFlowerYellow);
		registerRender(seedFlowerLime);
		registerRender(seedFlowerPink);
		registerRender(seedFlowerGray);
		registerRender(seedFlowerLightGray);
		registerRender(seedFlowerCyan);
		registerRender(seedFlowerPurple);
		registerRender(seedFlowerBlue);
		registerRender(seedFlowerBrown);
		registerRender(seedFlowerGreen);
		registerRender(seedFlowerRed);
		registerRender(seedFlowerBlack);

		registerRender(seedCactusWhite);
		registerRender(seedCactusOrange);
		registerRender(seedCactusMagenta);
		registerRender(seedCactusLightBlue);
		registerRender(seedCactusYellow);
		registerRender(seedCactusLime);
		registerRender(seedCactusPink);
		registerRender(seedCactusGray);
		registerRender(seedCactusLightGray);
		registerRender(seedCactusCyan);
		registerRender(seedCactusPurple);
		registerRender(seedCactusBlue);
		registerRender(seedCactusBrown);
		registerRender(seedCactusGreen);
		registerRender(seedCactusRed);
		registerRender(seedCactusBlack);

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