package com.luxtracon.floralis;

import com.luxtracon.floralis.proxy.ClientProxy;
import com.luxtracon.floralis.proxy.CommonProxy;
import com.luxtracon.floralis.registry.*;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.DistExecutor;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

@SuppressWarnings("unused")

@Mod(FloralisConstant.ID)
public class Floralis {
	public CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);

	public Floralis() {
		var eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		eventBus.addListener(this::onCreativeModeTabRegister);
		eventBus.addListener(this::onFMLCommonSetup);
		eventBus.addListener(this::onFMLLoadComplete);

		FloralisConfig.registerClientConfig();
		FloralisConfig.registerCommonConfig();
		FloralisConfig.registerServerConfig();

		FloralisBlocks.BLOCKS.register(eventBus);
		FloralisCreativeModeTabs.CREATIVE_MODE_TABS.register(eventBus);
		FloralisItems.ITEMS.register(eventBus);

		NeoForge.EVENT_BUS.register(this);
	}

	public void onCreativeModeTabRegister(BuildCreativeModeTabContentsEvent pEvent) {
		this.proxy.onCreativeModeTabRegister(pEvent);
	}

	public void onFMLCommonSetup(FMLCommonSetupEvent pEvent) {
		this.proxy.onFMLCommonSetup(pEvent);
	}

	public void onFMLLoadComplete(FMLLoadCompleteEvent pEvent) {
		this.proxy.onFMLLoadComplete(pEvent);
	}

	@SubscribeEvent
	public void onServerAboutToStart(ServerAboutToStartEvent pEvent) {
		this.proxy.onServerAboutToStart(pEvent);
	}

	@SubscribeEvent
	public void onVillagerTrades(VillagerTradesEvent pEvent) {
		this.proxy.onVillagerTrades(pEvent);
	}
}
