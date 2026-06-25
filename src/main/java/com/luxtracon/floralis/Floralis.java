package com.luxtracon.floralis;

import com.luxtracon.floralis.common.registry.*;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import org.jspecify.annotations.NullMarked;

@SuppressWarnings("unused")

@NullMarked

@Mod(FloralisConstants.FLORALIS)
public class Floralis {
	public Floralis(IEventBus pBus) {
		Floralis.addListeners(pBus);
		Floralis.registerRegistries(pBus);
	}

	public static void addListeners(IEventBus pBus) {
		pBus.addListener(Floralis::onFMLCommonSetup);
	}

	public static void onFMLCommonSetup(FMLCommonSetupEvent pEvent) {
		pEvent.enqueueWork(FloralisPottables::setup);
	}

	public static void registerRegistries(IEventBus pBus) {
		FloralisBlocks.BLOCKS.register(pBus);
		FloralisCreativeModeTabs.CREATIVE_MODE_TABS.register(pBus);
		FloralisItems.ITEMS.register(pBus);
	}
}
