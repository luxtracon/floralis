package com.luxtracon.floralis.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class FloralisStructuresConfig {
	public static ForgeConfigSpec.BooleanValue PLAINS_FIELD;
	public static ForgeConfigSpec.BooleanValue SNOWY_FIELD;
	public static ForgeConfigSpec.BooleanValue SAVANNA_FIELD;
	public static ForgeConfigSpec.BooleanValue DESERT_FIELD;
	public static ForgeConfigSpec.BooleanValue TAIGA_FIELD;

	public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
		COMMON_BUILDER.comment("Structure settings").push("structureSettings");

		PLAINS_FIELD = COMMON_BUILDER
			.comment("Default: true. Whether fields should generate in plains type villages.")
			.define("plainsField", true);

		SNOWY_FIELD = COMMON_BUILDER
				.comment("Default: true. Whether fields should generate in snowy type villages.")
				.define("snowyField", true);

		SAVANNA_FIELD = COMMON_BUILDER
				.comment("Default: true. Whether fields should generate in savanna type villages.")
				.define("savannaField", true);

		DESERT_FIELD = COMMON_BUILDER
				.comment("Default: true. Whether fields should generate in desert type villages.")
				.define("desertField", true);

		TAIGA_FIELD = COMMON_BUILDER
				.comment("Default: true. Whether fields should generate in taiga type villages.")
				.define("taigaField", true);

		COMMON_BUILDER.pop();
	}
}
