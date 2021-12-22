package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.villages.StructureFieldCactus;
import com.luxtracon.floralis.villages.StructureFieldFlower;

import net.minecraft.world.gen.structure.MapGenStructureIO;

public class StructureRegistry
{
    public static void init()
    {
        MapGenStructureIO.registerStructureComponent(StructureFieldCactus.class, Main.MODID + ".cactusField");
        MapGenStructureIO.registerStructureComponent(StructureFieldFlower.class, Main.MODID + ".flowerField");
    }
}