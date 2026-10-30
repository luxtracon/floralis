package com.luxtracon.floralis.utilities;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config
{
    public static final String CATEGORY_WORLDGEN = "worldgen";

    private static final String[] COLORS =
    {
        "White", "Orange", "Magenta", "LightBlue", "Yellow",
        "Lime", "Pink", "Gray", "LightGray", "Cyan",
        "Purple", "Blue", "Brown", "Green", "Red", "Black"
    };

    public static Configuration configuration;

    public static int[] flowerTries = new int[16];
    public static int[] cactusTries = new int[16];

    public static boolean cosmeticblocks;
    public static boolean potload;
    public static boolean coloredclay;
    public static boolean cactitrades;
    public static boolean flowertrades;
    public static boolean ffcompat;
    public static boolean iecompat;
    public static boolean ifcompat;
    public static boolean tecompat;
    public static boolean naturalcacti;
    public static boolean naturalflowers;
    public static boolean villagecacti;
    public static boolean villageflowers;
    public static boolean cactidamage;

    public static void init(FMLPreInitializationEvent event)
    {
        configuration = new Configuration(event.getSuggestedConfigurationFile());

        syncConfig();
    }

    public static void syncConfig()
    {
        configuration.load();

        cosmeticblocks = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis cosmetic blocks", true, "Whether to load Floralis cosmetic blocks or not. Default: true").getBoolean(true);
        potload = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis flower pots", true, "Whether to load Floralis flower pots or not. Default: true").getBoolean(true);
        coloredclay = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis colored clay", true, "Whether to load Floralis colored clay or not. Default: true").getBoolean(true);
        cactitrades = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis tradeable cactiseeds", true, "Whether to load Floralis tradeable cactiseeds or not. Default: true").getBoolean(true);
        flowertrades = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis tradeable flowerseeds", true, "Whether to load Floralis tradeable flowerseeds or not. Default: true").getBoolean(true);
        ffcompat = configuration.get(Configuration.CATEGORY_GENERAL, "Load Forestry Farming compat", true, "Whether to load Floralis and Forestry Farming compat or not. Default: true").getBoolean(true);
        iecompat = configuration.get(Configuration.CATEGORY_GENERAL, "Load Immersive Engineering compat", true, "Whether to load Floralis and Immersive Engineering compat or not. Default: true").getBoolean(true);
        ifcompat = configuration.get(Configuration.CATEGORY_GENERAL, "Load Industrial Foregoing compat", true, "Whether to load Floralis and Industrial Foregoing compat or not. Default: true").getBoolean(true);
        tecompat = configuration.get(Configuration.CATEGORY_GENERAL, "Load Thermal Expansion compat", true, "Whether to load Floralis and Thermal Expansion compat or not. Default: true").getBoolean(true);
        naturalcacti = configuration.get(Configuration.CATEGORY_GENERAL, "Spawn Floralis natural cacti", true, "Whether to spawn Floralis natural cacti or not. Default: true").getBoolean(true);
        naturalflowers = configuration.get(Configuration.CATEGORY_GENERAL, "Spawn Floralis natural flowers", true, "Whether to spawn Floralis natural flowers or not. Default: true").getBoolean(true);
        villagecacti = configuration.get(Configuration.CATEGORY_GENERAL, "Spawn Floralis village cacti", true, "Whether to spawn Floralis village cacti or not. Default: true").getBoolean(true);
        villageflowers = configuration.get(Configuration.CATEGORY_GENERAL, "Spawn Floralis village flowers", true, "Whether to spawn Floralis village flowers or not. Default: true").getBoolean(true);
        cactidamage = configuration.get(Configuration.CATEGORY_GENERAL, "Toggle Floralis cacti damage", true, "Whether to take Floralis cacti damage or not. Default: true").getBoolean(true);

        for (int i = 0; i < COLORS.length; i++)
        {
            flowerTries[i] = configuration.getInt("flower" + COLORS[i] + "Tries", CATEGORY_WORLDGEN, 64, 0, 256, "The number of placement attempts for the natural generation of " + COLORS[i] + " flowers. Default: 64");
            cactusTries[i] = configuration.getInt("cactus" + COLORS[i] + "Tries", CATEGORY_WORLDGEN, 64, 0, 256, "The number of placement attempts for the natural generation of " + COLORS[i] + " cacti. Default: 64");
        }

        configuration.save();
    }
}