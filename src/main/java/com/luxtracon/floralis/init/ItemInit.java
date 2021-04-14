package com.luxtracon.floralis.init;

import com.luxtracon.floralis.items.dye.*;
import com.luxtracon.floralis.items.petal.*;
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
public class ItemInit
{
	public static SeedFlowerWhite seedFlowerWhite;
	public static SeedFlowerOrange seedFlowerOrange;
	public static SeedFlowerMagenta seedFlowerMagenta;
	public static SeedFlowerLightBlue seedFlowerLightBlue;
	public static SeedFlowerYellow seedFlowerYellow;
	public static SeedFlowerLime seedFlowerLime;
	public static SeedFlowerPink seedFlowerPink;
	public static SeedFlowerGray seedFlowerGray;
	public static SeedFlowerLightGray seedFlowerLightGray;
	public static SeedFlowerCyan seedFlowerCyan;
	public static SeedFlowerPurple seedFlowerPurple;
	public static SeedFlowerBlue seedFlowerBlue;
	public static SeedFlowerBrown seedFlowerBrown;
	public static SeedFlowerGreen seedFlowerGreen;
	public static SeedFlowerRed seedFlowerRed;
	public static SeedFlowerBlack seedFlowerBlack;

	public static SeedCactusWhite seedCactusWhite;
	public static SeedCactusOrange seedCactusOrange;
	public static SeedCactusMagenta seedCactusMagenta;
	public static SeedCactusLightBlue seedCactusLightBlue;
	public static SeedCactusYellow seedCactusYellow;
	public static SeedCactusLime seedCactusLime;
	public static SeedCactusPink seedCactusPink;
	public static SeedCactusGray seedCactusGray;
	public static SeedCactusLightGray seedCactusLightGray;
	public static SeedCactusCyan seedCactusCyan;
	public static SeedCactusPurple seedCactusPurple;
	public static SeedCactusBlue seedCactusBlue;
	public static SeedCactusBrown seedCactusBrown;
	public static SeedCactusGreen seedCactusGreen;
	public static SeedCactusRed seedCactusRed;
	public static SeedCactusBlack seedCactusBlack;

	public static PetalWhite petalWhite;
	public static PetalOrange petalOrange;
	public static PetalMagenta petalMagenta;
	public static PetalLightBlue petalLightBlue;
	public static PetalYellow petalYellow;
	public static PetalLime petalLime;
	public static PetalPink petalPink;
	public static PetalGray petalGray;
	public static PetalLightGray petalLightGray;
	public static PetalCyan petalCyan;
	public static PetalPurple petalPurple;
	public static PetalBlue petalBlue;
	public static PetalBrown petalBrown;
	public static PetalGreen petalGreen;
	public static PetalRed petalRed;
	public static PetalBlack petalBlack;

	public static DyeWhite dyeWhite;
	public static DyeOrange dyeOrange;
	public static DyeMagenta dyeMagenta;
	public static DyeLightBlue dyeLightBlue;
	public static DyeYellow dyeYellow;
	public static DyeLime dyeLime;
	public static DyePink dyePink;
	public static DyeGray dyeGray;
	public static DyeLightGray dyeLightGray;
	public static DyeCyan dyeCyan;
	public static DyePurple dyePurple;
	public static DyeBlue dyeBlue;
	public static DyeBrown dyeBrown;
	public static DyeGreen dyeGreen;
	public static DyeRed dyeRed;
	public static DyeBlack dyeBlack;
	
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

		petalWhite = new PetalWhite("whitepetal");
		petalOrange = new PetalOrange("orangepetal");
		petalMagenta = new PetalMagenta("magentapetal");
		petalLightBlue = new PetalLightBlue("lightbluepetal");
		petalYellow = new PetalYellow("yellowpetal");
		petalLime = new PetalLime("limepetal");
		petalPink = new PetalPink("pinkpetal");
		petalGray = new PetalGray("graypetal");
		petalLightGray = new PetalLightGray("lightgraypetal");
		petalCyan = new PetalCyan("cyanpetal");
		petalPurple = new PetalPurple("purplepetal");
		petalBlue = new PetalBlue("bluepetal");
		petalBrown = new PetalBrown("brownpetal");
		petalGreen = new PetalGreen("greenpetal");
		petalRed = new PetalRed("redpetal");
		petalBlack = new PetalBlack("blackpetal");

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