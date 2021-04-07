package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.utilities.Config;
import com.luxtracon.floralis.trades.petal.*;
import com.luxtracon.floralis.trades.seed.*;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class VillagerRegistry
{
    public static void init()
    {
        VillagerProfession farmer = ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));

        if(Config.loadtrades)
        {
            farmer.getCareer(0).addTrade(1, new SeedWhite());
            farmer.getCareer(0).addTrade(1, new PetalWhite());
            farmer.getCareer(0).addTrade(1, new SeedOrange());
            farmer.getCareer(0).addTrade(1, new PetalOrange());
            farmer.getCareer(0).addTrade(1, new SeedMagenta());
            farmer.getCareer(0).addTrade(1, new PetalMagenta());
            farmer.getCareer(0).addTrade(1, new SeedLightBlue());
            farmer.getCareer(0).addTrade(1, new PetalLightBlue());
            farmer.getCareer(0).addTrade(1, new SeedYellow());
            farmer.getCareer(0).addTrade(1, new PetalYellow());
            farmer.getCareer(0).addTrade(1, new SeedLime());
            farmer.getCareer(0).addTrade(1, new PetalLime());
            farmer.getCareer(0).addTrade(1, new SeedPink());
            farmer.getCareer(0).addTrade(1, new PetalPink());
            farmer.getCareer(0).addTrade(1, new SeedGray());
            farmer.getCareer(0).addTrade(1, new PetalGray());
            farmer.getCareer(0).addTrade(1, new SeedLightGray());
            farmer.getCareer(0).addTrade(1, new PetalLightGray());
            farmer.getCareer(0).addTrade(1, new SeedCyan());
            farmer.getCareer(0).addTrade(1, new PetalCyan());
            farmer.getCareer(0).addTrade(1, new SeedPurple());
            farmer.getCareer(0).addTrade(1, new PetalPurple());
            farmer.getCareer(0).addTrade(1, new SeedBlue());
            farmer.getCareer(0).addTrade(1, new PetalBlue());
            farmer.getCareer(0).addTrade(1, new SeedBrown());
            farmer.getCareer(0).addTrade(1, new PetalBrown());
            farmer.getCareer(0).addTrade(1, new SeedGreen());
            farmer.getCareer(0).addTrade(1, new PetalGreen());
            farmer.getCareer(0).addTrade(1, new SeedRed());
            farmer.getCareer(0).addTrade(1, new PetalRed());
            farmer.getCareer(0).addTrade(1, new SeedBlack());
            farmer.getCareer(0).addTrade(1, new PetalBlack());
        }
    }
}