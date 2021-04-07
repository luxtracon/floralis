package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.villages.CustomCreation;

import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class CreationRegistry
{
    public static void init()
    {
        if(Config.spawnfields)
        {
            VillagerRegistry.instance().registerVillageCreationHandler(new CustomCreation());
        }
    }
}