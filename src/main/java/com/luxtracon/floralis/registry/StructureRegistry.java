package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.villages.CactusFieldStructure;
import com.luxtracon.floralis.villages.FlowerFieldStructure;

import net.minecraft.world.gen.structure.MapGenStructureIO;

public class StructureRegistry
{
    public static void init()
    {
        MapGenStructureIO.registerStructureComponent(CactusFieldStructure.class, "Cactus Field");
        MapGenStructureIO.registerStructureComponent(FlowerFieldStructure.class, "Flower Field");
    }
}