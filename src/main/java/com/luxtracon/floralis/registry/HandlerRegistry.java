package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.villages.CustomHandler;

import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class HandlerRegistry
{
    public static void init()
    {
        VillagerRegistry.instance().registerVillageCreationHandler(new CustomHandler());
    }
}