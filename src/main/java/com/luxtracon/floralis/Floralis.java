package com.luxtracon.floralis;

import com.luxtracon.floralis.config.FloralisConfig;
import com.luxtracon.floralis.proxy.ClientProxy;
import com.luxtracon.floralis.proxy.CommonProxy;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisConstants;
import com.luxtracon.floralis.registry.FloralisCreativeModeTabs;
import com.luxtracon.floralis.registry.FloralisItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")

@Mod(FloralisConstants.FLORALIS)
public class Floralis {
	public Floralis(@Nonnull IEventBus pBus) {
		pBus.addListener(ClientProxy::onCreativeModeTabRegister);
		pBus.addListener(CommonProxy::onFMLCommonSetup);
		pBus.addListener(CommonProxy::onGatherData);

		FloralisConfig.registerClientConfig();
		FloralisConfig.registerCommonConfig();
		FloralisConfig.registerServerConfig();

		FloralisBlocks.BLOCKS.register(pBus);
		FloralisCreativeModeTabs.CREATIVE_MODE_TABS.register(pBus);
		FloralisItems.ITEMS.register(pBus);
	}
}
