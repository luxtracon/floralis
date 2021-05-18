package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.worldgens.*;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorRegistry
{
    public static void init()
    {
        if(Config.naturalcacti)
        {
            GameRegistry.registerWorldGenerator(new WorldgenCactus(), 0);
        }

        if(Config.naturalflowers)
        {
            GameRegistry.registerWorldGenerator(new WorldgenFlower(), 0);
        }
    }
}