package com.luxtracon.floralis.init;

import com.luxtracon.floralis.base.ItemBase;
import com.luxtracon.floralis.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid=Reference.MODID)
public class ItemInit {

	static Item dyeBlack;
	static Item dyeRed;
	static Item dyeGreen;
	static Item dyeBrown;
	static Item dyeBlue;
	static Item dyePurple;
	static Item dyeCyan;
	static Item dyeLightGray;
	static Item dyeGray;
	static Item dyePink;
	static Item dyeLime;
	static Item dyeYellow;
	static Item dyeLightBlue;
	static Item dyeMagenta;
	static Item dyeOrange;
	static Item	dyeWhite;
	
	public static void init() {
		dyeBlack = new ItemBase("blackdye");
		dyeRed = new ItemBase("reddye");
		dyeGreen = new ItemBase ("greendye");
		dyeBrown = new ItemBase ("browndye");
		dyeBlue = new ItemBase("bluedye");
		dyePurple = new ItemBase("purpledye");
		dyeCyan = new ItemBase ("cyandye");
		dyeLightGray = new ItemBase("lightgraydye");
		dyeGray = new ItemBase("graydye");
		dyePink = new ItemBase ("pinkdye");
		dyeLime = new ItemBase ("limedye");
		dyeYellow = new ItemBase("yellowdye");
		dyeLightBlue = new ItemBase("lightbluedye");
		dyeMagenta = new ItemBase ("magentadye");
		dyeOrange = new ItemBase("orangedye");
		dyeWhite = new ItemBase ("whitedye");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(dyeBlack, dyeRed, dyeGreen, dyeBrown, dyeBlue, dyePurple, dyeCyan, dyeLightGray, dyeGray, dyePink, dyeLime, dyeYellow, dyeLightBlue, dyeMagenta, dyeOrange, dyeWhite);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(dyeBlack);
		registerRender(dyeRed);
		registerRender(dyeGreen);
		registerRender(dyeBrown);
		registerRender(dyeBlue);
		registerRender(dyePurple);
		registerRender(dyeCyan);
		registerRender(dyeLightGray);
		registerRender(dyeGray);
		registerRender(dyePink);
		registerRender(dyeLime);
		registerRender(dyeYellow);
		registerRender(dyeLightBlue);
		registerRender(dyeMagenta);
		registerRender(dyeOrange);
		registerRender(dyeWhite);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
