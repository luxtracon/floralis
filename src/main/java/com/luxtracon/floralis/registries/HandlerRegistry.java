package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.villages.HandlerFieldCactus;
import com.luxtracon.floralis.villages.HandlerFieldFlower;

import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class HandlerRegistry
{
    public static void init()
    {
        if(Config.villagecacti)
        {
            VillagerRegistry.instance().registerVillageCreationHandler(new HandlerFieldCactus());
        }

        if(Config.villageflowers)
        {
            VillagerRegistry.instance().registerVillageCreationHandler(new HandlerFieldFlower());
        }
    }
}