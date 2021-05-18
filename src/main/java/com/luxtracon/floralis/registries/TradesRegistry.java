package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.trades.*;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class TradesRegistry
{
    public static void init()
    {
        VillagerProfession farmer = ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));

        if(Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerWhite());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerOrange());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerMagenta());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerLightBlue());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerYellow());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerLime());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerPink());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerGray());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerLightGray());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerCyan());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerPurple());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerBlue());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerBrown());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerGreen());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerRed());
            farmer.getCareer(0).addTrade(1, new TradeSeedFlowerBlack());
        }

        if(Config.cactitrades)
        {
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusWhite());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusOrange());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusMagenta());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusLightBlue());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusYellow());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusLime());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusPink());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusGray());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusLightGray());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusCyan());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusPurple());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusBlue());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusBrown());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusGreen());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusRed());
            farmer.getCareer(0).addTrade(1, new TradeSeedCactusBlack());
        }

        if(Config.cactitrades || Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new TradePartsWhite());
            farmer.getCareer(0).addTrade(1, new TradePartsOrange());
            farmer.getCareer(0).addTrade(1, new TradePartsMagenta());
            farmer.getCareer(0).addTrade(1, new TradePartsLightBlue());
            farmer.getCareer(0).addTrade(1, new TradePartsYellow());
            farmer.getCareer(0).addTrade(1, new TradePartsLime());
            farmer.getCareer(0).addTrade(1, new TradePartsPink());
            farmer.getCareer(0).addTrade(1, new TradePartsGray());
            farmer.getCareer(0).addTrade(1, new TradePartsLightGray());
            farmer.getCareer(0).addTrade(1, new TradePartsCyan());
            farmer.getCareer(0).addTrade(1, new TradePartsPurple());
            farmer.getCareer(0).addTrade(1, new TradePartsBlue());
            farmer.getCareer(0).addTrade(1, new TradePartsBrown());
            farmer.getCareer(0).addTrade(1, new TradePartsGreen());
            farmer.getCareer(0).addTrade(1, new TradePartsRed());
            farmer.getCareer(0).addTrade(1, new TradePartsBlack());
        }

        if(Config.cactitrades || Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new TradePetalWhite());
            farmer.getCareer(0).addTrade(1, new TradePetalOrange());
            farmer.getCareer(0).addTrade(1, new TradePetalMagenta());
            farmer.getCareer(0).addTrade(1, new TradePetalLightBlue());
            farmer.getCareer(0).addTrade(1, new TradePetalYellow());
            farmer.getCareer(0).addTrade(1, new TradePetalLime());
            farmer.getCareer(0).addTrade(1, new TradePetalPink());
            farmer.getCareer(0).addTrade(1, new TradePetalGray());
            farmer.getCareer(0).addTrade(1, new TradePetalLightGray());
            farmer.getCareer(0).addTrade(1, new TradePetalCyan());
            farmer.getCareer(0).addTrade(1, new TradePetalPurple());
            farmer.getCareer(0).addTrade(1, new TradePetalBlue());
            farmer.getCareer(0).addTrade(1, new TradePetalBrown());
            farmer.getCareer(0).addTrade(1, new TradePetalGreen());
            farmer.getCareer(0).addTrade(1, new TradePetalRed());
            farmer.getCareer(0).addTrade(1, new TradePetalBlack());
        }
    }
}