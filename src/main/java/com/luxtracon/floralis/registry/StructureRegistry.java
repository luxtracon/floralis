package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.villages.CustomField;

import net.minecraft.world.gen.structure.MapGenStructureIO;

public class StructureRegistry
{
    public static void init()
    {
        MapGenStructureIO.registerStructureComponent(CustomField.class, "Floralis");
    }
}