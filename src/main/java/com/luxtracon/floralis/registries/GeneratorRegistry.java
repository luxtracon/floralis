package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.worldgen.*;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorRegistry
{
    public static void init()
    {
        if(Config.naturalcacti)
        {
            GameRegistry.registerWorldGenerator(new CactusWorldgen(), 0);
        }

        if(Config.naturalflowers)
        {
            GameRegistry.registerWorldGenerator(new FlowerWorldgen(), 0);
        }
    }
}