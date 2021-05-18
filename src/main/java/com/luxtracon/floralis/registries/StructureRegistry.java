package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.villages.StructureFieldCactus;
import com.luxtracon.floralis.villages.StructureFieldFlower;

import net.minecraft.world.gen.structure.MapGenStructureIO;

public class StructureRegistry
{
    public static void init()
    {
        MapGenStructureIO.registerStructureComponent(StructureFieldCactus.class, "Cactus Field");
        MapGenStructureIO.registerStructureComponent(StructureFieldFlower.class, "Flower Field");
    }
}