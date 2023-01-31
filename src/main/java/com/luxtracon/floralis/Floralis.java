package com.luxtracon.floralis;

import com.luxtracon.floralis.constant.FloralisConstant;
import com.luxtracon.floralis.proxy.ClientProxy;
import com.luxtracon.floralis.config.FloralisConfig;
import com.luxtracon.floralis.proxy.CommonProxy;
import com.luxtracon.floralis.registry.FloralisBlocks;
import com.luxtracon.floralis.registry.FloralisItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")

@Mod(FloralisConstant.MODID)
public class Floralis {
	public CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);

	public Floralis() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		eventBus.addListener(this::onCreativeModeTabRegister);
		eventBus.addListener(this::onFMLCommonSetup);
		eventBus.addListener(this::onFMLLoadComplete);

		FloralisConfig.registerClientConfig();
		FloralisConfig.registerCommonConfig();
		FloralisConfig.registerServerConfig();

		FloralisBlocks.BLOCKS.register(eventBus);
		FloralisItems.ITEMS.register(eventBus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	public void onCreativeModeTabRegister(CreativeModeTabEvent.Register pEvent) {
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
