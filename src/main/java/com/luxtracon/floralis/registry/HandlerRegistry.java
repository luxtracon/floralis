package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.villages.CactusFieldHandler;
import com.luxtracon.floralis.villages.FlowerFieldHandler;

import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class HandlerRegistry
{
    public static void init()
    {
        if(Config.villagecacti)
        {
            VillagerRegistry.instance().registerVillageCreationHandler(new CactusFieldHandler());
        }

        if(Config.villageflowers)
        {
            VillagerRegistry.instance().registerVillageCreationHandler(new FlowerFieldHandler());
        }
    }
}