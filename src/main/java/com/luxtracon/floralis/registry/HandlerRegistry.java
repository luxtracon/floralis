package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.utility.Config;
import com.luxtracon.floralis.villages.CustomHandler;

import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class HandlerRegistry
{
    public static void init()
    {
        if(Config.spawnfields)
        {
            VillagerRegistry.instance().registerVillageCreationHandler(new CustomHandler());
        }
    }
}