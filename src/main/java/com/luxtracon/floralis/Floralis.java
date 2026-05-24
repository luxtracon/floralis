package com.luxtracon.floralis;

import com.luxtracon.floralis.common.registry.*;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

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
		Floralis.registerSetups(pEvent);
	}

	public static void registerRegistries(IEventBus pBus) {
		FloralisBlocks.BLOCKS.register(pBus);
		FloralisCreativeModeTabs.CREATIVE_MODE_TABS.register(pBus);
		FloralisItems.ITEMS.register(pBus);
	}

	public static void registerSetups(FMLCommonSetupEvent pEvent) {
		pEvent.enqueueWork(FloralisFlammables::setup);
		pEvent.enqueueWork(FloralisPottables::setup);
	}
}
