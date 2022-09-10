package com.luxtracon.floralis;

import com.luxtracon.floralis.client.proxy.ClientProxy;
import com.luxtracon.floralis.common.config.FloralisConfig;
import com.luxtracon.floralis.common.proxy.CommonProxy;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.common.registry.FloralisCompostables;
import com.luxtracon.floralis.common.registry.FloralisFlammables;
import com.luxtracon.floralis.common.registry.FloralisPottables;
import com.luxtracon.floralis.common.world.feature.FloralisPlacedFeatures;
import com.luxtracon.floralis.common.world.modifier.FloralisBiomeModifiers;
import com.luxtracon.floralis.common.world.structure.FloralisStructures;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

@Mod("floralis")
public class Floralis {
	public static CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	public static final String MODID = "floralis";

	public Floralis() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		eventBus.addListener(this::onCommonSetupEvent);
		eventBus.addListener(this::loadComplete);

		FloralisConfig.register();
		FloralisStructures.register();

		FloralisBiomeModifiers.register(eventBus);
		FloralisPlacedFeatures.register(eventBus);

		FloralisBlocks.BLOCKS.register(eventBus);
		FloralisItems.ITEMS.register(eventBus);

		MinecraftForge.EVENT_BUS.register(Floralis.class);
	}

	public void onCommonSetupEvent(FMLCommonSetupEvent pEvent) {
		pEvent.enqueueWork(FloralisCompostables::setup);
		pEvent.enqueueWork(FloralisFlammables::setup);
		pEvent.enqueueWork(FloralisPottables::setup);
	}

	public void loadComplete(final FMLLoadCompleteEvent pEvent) {
		proxy.loadComplete();
	}
}
