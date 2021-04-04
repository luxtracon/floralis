package com.luxtracon.floralis.utility;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config
{
    public static File file;
    public static Configuration configuration;

    public static boolean spawnfields;
    public static boolean spawnflowers;
    public static boolean loadcosmetic;
    public static boolean loadtrades;

    public static void init(FMLPreInitializationEvent event)
    {
        file = event.getSuggestedConfigurationFile();

        configuration = new Configuration(file);

        syncConfig();
    }

    public static void syncConfig()
    {
        configuration.load();

        spawnfields = configuration.get(Configuration.CATEGORY_GENERAL, "Spawn Floralis village fields", true, "Whether to spawn Floralis village fields or not. Default: true").getBoolean(true);
        spawnflowers = configuration.get(Configuration.CATEGORY_GENERAL, "Spawn Floralis natural flowers", true, "Whether to spawn Floralis natural flowers or not. Default: true").getBoolean(true);
        loadcosmetic = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis cosmetic blocks", true, "Whether to load Floralis cosmetic blocks or not. Default: true").getBoolean(true);
        loadtrades = configuration.get(Configuration.CATEGORY_GENERAL, "Load Floralis villager trades", true, "Whether to load Floralis villager trades or not. Default: true").getBoolean(true);

        configuration.save();
    }
}