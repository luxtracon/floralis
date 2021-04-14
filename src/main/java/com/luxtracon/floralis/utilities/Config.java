package com.luxtracon.floralis.utilities;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config
{
    public static Configuration configuration;

    public static boolean cosmeticblocks;
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

        configuration.save();
    }
}