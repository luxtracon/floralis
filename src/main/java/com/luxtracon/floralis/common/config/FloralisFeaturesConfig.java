package com.luxtracon.floralis.common.config;

import com.luxtracon.floralis.Floralis;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;

public class FloralisFeaturesConfig {
	public static IntValue RARITY_FLOWER;
	public static IntValue TRIES_FLOWER;
	public static IntValue SPREAD_FLOWER;
	public static IntValue RARITY_CACTUS;
	public static IntValue TRIES_CACTUS;
	public static IntValue SPREAD_CACTUS;

	public static void registerCommonConfig(Builder COMMON_BUILDER) {
		COMMON_BUILDER.comment("Feature settings").push("featureSettings");

		RARITY_FLOWER = COMMON_BUILDER
			.comment("Default: 256. Average distance between a patch of flowers of the same type.")
			.defineInRange("flowerRarity", 256, 0, Integer.MAX_VALUE);

		TRIES_FLOWER = COMMON_BUILDER
			.comment("Default: 64. Number of attempts to spawn a flower in a given area. Setting this to 0 disables natural spawning flowers.")
			.defineInRange("flowerTries", 64, 0, Integer.MAX_VALUE);

		SPREAD_FLOWER = COMMON_BUILDER
			.comment("Default: 4. Area in which flowers are tried to spawn.")
			.defineInRange("flowerSpread", 4, 0, Integer.MAX_VALUE);

		RARITY_CACTUS = COMMON_BUILDER
			.comment("Default: 256. Average distance between a patch of cacti of the same type.")
			.defineInRange("cactusRarity", 256, 0, Integer.MAX_VALUE);

		TRIES_CACTUS = COMMON_BUILDER
			.comment("Default: 64. Number of attempts to spawn a cactus in a given area. Setting this to 0 disables natural spawning cacti.")
			.defineInRange("cactusTries", 64, 0, Integer.MAX_VALUE);

		SPREAD_CACTUS = COMMON_BUILDER
			.comment("Default: 4. Area in which cacti are tried to spawn.")
			.defineInRange("cactusSpread", 4, 0, Integer.MAX_VALUE);

		COMMON_BUILDER.pop();
	}
}
