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
	public static Item dyePurple;
	static Item dyeBlue;
	static Item dyeBrown;
	static Item dyeGreen;
	static Item dyeRed;
	static Item dyeBlack;
	
	public static void init() {
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
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
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
	public static void registerRenders(ModelRegistryEvent event) {
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
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}