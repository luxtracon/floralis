package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.trades.dye.*;
import com.luxtracon.floralis.trades.petal.*;
import com.luxtracon.floralis.trades.seedcactus.*;
import com.luxtracon.floralis.trades.seedflower.*;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class TradesRegistry
{
    public static void init()
    {
        VillagerProfession farmer = ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));

        if(Config.cactitrades)
        {
            farmer.getCareer(0).addTrade(1, new SeedCactusWhite());
            farmer.getCareer(0).addTrade(1, new SeedCactusOrange());
            farmer.getCareer(0).addTrade(1, new SeedCactusMagenta());
            farmer.getCareer(0).addTrade(1, new SeedCactusLightBlue());
            farmer.getCareer(0).addTrade(1, new SeedCactusYellow());
            farmer.getCareer(0).addTrade(1, new SeedCactusLime());
            farmer.getCareer(0).addTrade(1, new SeedCactusPink());
            farmer.getCareer(0).addTrade(1, new SeedCactusGray());
            farmer.getCareer(0).addTrade(1, new SeedCactusLightGray());
            farmer.getCareer(0).addTrade(1, new SeedCactusCyan());
            farmer.getCareer(0).addTrade(1, new SeedCactusPurple());
            farmer.getCareer(0).addTrade(1, new SeedCactusBlue());
            farmer.getCareer(0).addTrade(1, new SeedCactusBrown());
            farmer.getCareer(0).addTrade(1, new SeedCactusGreen());
            farmer.getCareer(0).addTrade(1, new SeedCactusRed());
            farmer.getCareer(0).addTrade(1, new SeedCactusBlack());
        }

        if(Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new SeedFlowerWhite());
            farmer.getCareer(0).addTrade(1, new SeedFlowerOrange());
            farmer.getCareer(0).addTrade(1, new SeedFlowerMagenta());
            farmer.getCareer(0).addTrade(1, new SeedFlowerLightBlue());
            farmer.getCareer(0).addTrade(1, new SeedFlowerYellow());
            farmer.getCareer(0).addTrade(1, new SeedFlowerLime());
            farmer.getCareer(0).addTrade(1, new SeedFlowerPink());
            farmer.getCareer(0).addTrade(1, new SeedFlowerGray());
            farmer.getCareer(0).addTrade(1, new SeedFlowerLightGray());
            farmer.getCareer(0).addTrade(1, new SeedFlowerCyan());
            farmer.getCareer(0).addTrade(1, new SeedFlowerPurple());
            farmer.getCareer(0).addTrade(1, new SeedFlowerBlue());
            farmer.getCareer(0).addTrade(1, new SeedFlowerBrown());
            farmer.getCareer(0).addTrade(1, new SeedFlowerGreen());
            farmer.getCareer(0).addTrade(1, new SeedFlowerRed());
            farmer.getCareer(0).addTrade(1, new SeedFlowerBlack());
        }

        if(Config.cactitrades || Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new PetalWhite());
            farmer.getCareer(0).addTrade(1, new PetalOrange());
            farmer.getCareer(0).addTrade(1, new PetalMagenta());
            farmer.getCareer(0).addTrade(1, new PetalLightBlue());
            farmer.getCareer(0).addTrade(1, new PetalYellow());
            farmer.getCareer(0).addTrade(1, new PetalLime());
            farmer.getCareer(0).addTrade(1, new PetalPink());
            farmer.getCareer(0).addTrade(1, new PetalGray());
            farmer.getCareer(0).addTrade(1, new PetalLightGray());
            farmer.getCareer(0).addTrade(1, new PetalCyan());
            farmer.getCareer(0).addTrade(1, new PetalPurple());
            farmer.getCareer(0).addTrade(1, new PetalBlue());
            farmer.getCareer(0).addTrade(1, new PetalBrown());
            farmer.getCareer(0).addTrade(1, new PetalGreen());
            farmer.getCareer(0).addTrade(1, new PetalRed());
            farmer.getCareer(0).addTrade(1, new PetalBlack());
        }

        if(Config.cactitrades || Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new DyeWhite());
            farmer.getCareer(0).addTrade(1, new DyeOrange());
            farmer.getCareer(0).addTrade(1, new DyeMagenta());
            farmer.getCareer(0).addTrade(1, new DyeLightBlue());
            farmer.getCareer(0).addTrade(1, new DyeYellow());
            farmer.getCareer(0).addTrade(1, new DyeLime());
            farmer.getCareer(0).addTrade(1, new DyePink());
            farmer.getCareer(0).addTrade(1, new DyeGray());
            farmer.getCareer(0).addTrade(1, new DyeLightGray());
            farmer.getCareer(0).addTrade(1, new DyeCyan());
            farmer.getCareer(0).addTrade(1, new DyePurple());
            farmer.getCareer(0).addTrade(1, new DyeBlue());
            farmer.getCareer(0).addTrade(1, new DyeBrown());
            farmer.getCareer(0).addTrade(1, new DyeGreen());
            farmer.getCareer(0).addTrade(1, new DyeRed());
            farmer.getCareer(0).addTrade(1, new DyeBlack());
        }
    }
}