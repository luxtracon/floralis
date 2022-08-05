package com.luxtracon.floralis.common.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class FloralisConfig {
	public static ForgeConfigSpec SPEC;

	public static void register() {
		registerCommonConfigs();
	}

	private static void registerCommonConfigs() {
		ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
		FloralisFeaturesConfig.registerCommonConfig(COMMON_BUILDER);
		FloralisStructuresConfig.registerCommonConfig(COMMON_BUILDER);
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_BUILDER.build());
		SPEC = COMMON_BUILDER.build();
	}
}
