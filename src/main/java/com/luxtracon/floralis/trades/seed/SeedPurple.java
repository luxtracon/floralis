package com.luxtracon.floralis.trades.seed;

import com.luxtracon.floralis.init.InitItem;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class SeedPurple implements EntityVillager.ITradeList
{
    @Override
    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
    {
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedPurple, 16), new ItemStack(Items.EMERALD, 1)));
    }
}