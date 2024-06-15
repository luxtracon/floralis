package com.luxtracon.floralis;

import com.luxtracon.floralis.registry.*;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("unused")

@ParametersAreNonnullByDefault

@Mod(FloralisConstants.FLORALIS)
public class Floralis {
	public Floralis(IEventBus pBus) {
		pBus.addListener(this::onFMLCommonSetup);

		FloralisBlocks.BLOCKS.register(pBus);
		FloralisCreativeModeTabs.CREATIVE_MODE_TABS.register(pBus);
		FloralisItems.ITEMS.register(pBus);
	}

	public void onFMLCommonSetup(FMLCommonSetupEvent pEvent) {
		pEvent.enqueueWork(FloralisPottables::setup);
	}
}
