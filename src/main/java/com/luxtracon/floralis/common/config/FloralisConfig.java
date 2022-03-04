package com.luxtracon.floralis.common.config;

import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig.Type;

public class FloralisConfig {
	public static void register() {
		registerCommonConfigs();
	}

	private static void registerCommonConfigs() {
		Builder COMMON_BUILDER = new Builder();
		FloralisFeaturesConfig.registerCommonConfig(COMMON_BUILDER);
		FloralisStructuresConfig.registerCommonConfig(COMMON_BUILDER);
		ModLoadingContext.get().registerConfig(Type.COMMON, COMMON_BUILDER.build());
	}
}
