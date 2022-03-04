package com.luxtracon.floralis;

import com.luxtracon.floralis.client.proxy.ClientProxy;
import com.luxtracon.floralis.common.config.FloralisConfig;
import com.luxtracon.floralis.common.events.FloralisBiomeLoading;
import com.luxtracon.floralis.common.proxy.CommonProxy;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.common.registry.FloralisCompostables;
import com.luxtracon.floralis.common.registry.FloralisFlammables;
import com.luxtracon.floralis.common.registry.FloralisPottables;
import com.luxtracon.floralis.common.world.structure.FloralisStructures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod("floralis")
public class Floralis {
	public static CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	public static final String MODID = "floralis";

	public Floralis() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		FloralisConfig.register();
		FloralisStructures.register();

		eventBus.addListener(this::onCommonSetupEvent);
		eventBus.addListener(this::loadComplete);

		FloralisBlocks.BLOCKS.register(eventBus);
		FloralisItems.ITEMS.register(eventBus);

		MinecraftForge.EVENT_BUS.register(Floralis.class);
		MinecraftForge.EVENT_BUS.register(FloralisBiomeLoading.class);
	}

	public void onCommonSetupEvent(@Nonnull FMLCommonSetupEvent event) {
		event.enqueueWork(FloralisCompostables::setup);
		event.enqueueWork(FloralisFlammables::setup);
		event.enqueueWork(FloralisPottables::setup);
	}

	private void loadComplete(final FMLLoadCompleteEvent event) {
		proxy.loadComplete();
	}
}
