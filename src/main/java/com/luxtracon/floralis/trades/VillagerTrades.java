package com.luxtracon.floralis.trades;

import com.luxtracon.floralis.inits.ItemInit;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

import java.util.Random;

public class VillagerTrades
{
    public static void init()
    {
        VillagerProfession farmer = ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));

        if(Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerWhite));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerOrange));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerMagenta));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerLightBlue));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerYellow));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerLime));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerPink));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerGray));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerLightGray));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerCyan));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerPurple));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerBlue));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerBrown));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerGreen));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerRed));
            farmer.getCareer(0).addTrade(1, new TradeSeedFlower(ItemInit.seedFlowerBlack));
        }

        if(Config.cactitrades)
        {
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusWhite));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusOrange));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusMagenta));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusLightBlue));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusYellow));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusLime));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusPink));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusGray));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusLightGray));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusCyan));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusPurple));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusBlue));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusBrown));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusGreen));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusRed));
            farmer.getCareer(0).addTrade(1, new TradeSeedCactus(ItemInit.seedCactusBlack));
        }

        if(Config.cactitrades || Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsWhite));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsOrange));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsMagenta));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsLightBlue));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsYellow));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsLime));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsPink));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsGray));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsLightGray));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsCyan));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsPurple));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsBlue));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsBrown));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsGreen));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsRed));
            farmer.getCareer(0).addTrade(1, new TradeParts(ItemInit.partsBlack));
        }

        if(Config.cactitrades || Config.flowertrades)
        {
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalWhite));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalOrange));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalMagenta));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalLightBlue));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalYellow));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalLime));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalPink));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalGray));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalLightGray));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalCyan));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalPurple));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalBlue));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalBrown));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalGreen));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalRed));
            farmer.getCareer(0).addTrade(1, new TradePetal(ItemInit.petalBlack));
        }
    }

    private static class TradeSeedFlower implements EntityVillager.ITradeList
    {
        private final Item seed;

        TradeSeedFlower(Item seed)
        {
            this.seed = seed;
        }

        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            recipeList.add(new MerchantRecipe(new ItemStack(this.seed, 16), new ItemStack(Items.EMERALD, 1)));
        }
    }

    private static class TradeSeedCactus implements EntityVillager.ITradeList
    {
        private final Item seed;

        TradeSeedCactus(Item seed)
        {
            this.seed = seed;
        }

        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            recipeList.add(new MerchantRecipe(new ItemStack(this.seed, 16), new ItemStack(Items.EMERALD, 1)));
        }
    }

    private static class TradeParts implements EntityVillager.ITradeList
    {
        private final Item parts;

        TradeParts(Item parts)
        {
            this.parts = parts;
        }

        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 1), new ItemStack(this.parts, 8)));
        }
    }

    private static class TradePetal implements EntityVillager.ITradeList
    {
        private final Item petal;

        TradePetal(Item petal)
        {
            this.petal = petal;
        }

        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 1), new ItemStack(this.petal, 8)));
        }
    }
}