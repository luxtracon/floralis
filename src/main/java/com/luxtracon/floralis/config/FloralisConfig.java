package com.luxtracon.floralis.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class FloralisConfig {
	public static ForgeConfigSpec.IntValue DESERT_FARM;
	public static ForgeConfigSpec.IntValue PLAINS_FARM;
	public static ForgeConfigSpec.IntValue SAVANNA_FARM;
	public static ForgeConfigSpec.IntValue SNOWY_FARM;
	public static ForgeConfigSpec.IntValue TAIGA_FARM;

	public static void registerClientConfig() {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, builder.build());
	}

	public static void registerCommonConfig() {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
		builder.comment("Structure settings").push("structureSettings");

		DESERT_FARM = builder.comment("Default: 64. Spawn rate for cactus farms in desert villages. 0 disables spawning cactus farms in desert villages.").defineInRange("desertFarms", 64, 0, 256);
		PLAINS_FARM = builder.comment("Default: 64. Spawn rate for flower farms in plains villages. 0 disables spawning flower farms in plains villages.").defineInRange("plainsFarms", 64, 0, 256);
		SAVANNA_FARM = builder.comment("Default: 64. Spawn rate for flower farms in savanna villages. 0 disables spawning flower farms in savanna villages.").defineInRange("savannaFarms", 64, 0, 256);
		SNOWY_FARM = builder.comment("Default: 64. Spawn rate for flower farms in snowy villages. 0 disables spawning flower farms in snowy villages.").defineInRange("snowyFarms", 64, 0, 256);
		TAIGA_FARM = builder.comment("Default: 64. Spawn rate for flower farms in taiga villages. 0 disables spawning flower farms in taiga villages.").defineInRange("taigaFarms", 64, 0, 256);

		builder.pop();
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, builder.build());
	}

	public static void registerServerConfig() {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, builder.build());
	}
}
