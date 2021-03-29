package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.worldgen.CustomWorldgen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorRegistry
{
    public static void init()
    {
        GameRegistry.registerWorldGenerator(new CustomWorldgen(), 0);
    }
}