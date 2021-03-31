package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.utility.Config;
import com.luxtracon.floralis.villages.CustomTrades;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class VillagerRegistry
{
    public static void init()
    {
        VillagerProfession farmer = ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));
        if (Config.loadtrades)
        {
            farmer.getCareer(0).addTrade(1, new CustomTrades());
        }
    }
}
