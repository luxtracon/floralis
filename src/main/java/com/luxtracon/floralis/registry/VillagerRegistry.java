package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.villages.CustomTrades;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class VillagerRegistry
{
    public static void init()
    {
        net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession farmer = ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));
        farmer.getCareer(0).addTrade(1, new CustomTrades());
    }
}
