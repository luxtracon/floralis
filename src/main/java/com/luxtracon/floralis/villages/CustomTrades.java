package com.luxtracon.floralis.villages;

import com.luxtracon.floralis.init.InitItem;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import java.util.Random;

public class CustomTrades implements EntityVillager.ITradeList
{
    @Override
    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
    {
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalBlack, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedBlack, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalBlue, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedBlue, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalBrown, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedBrown, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalCyan, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedCyan, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalGray, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedGray, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalGreen, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedGreen, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalLightBlue, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedLightBlue, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalLightGray, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedLightGray, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalLime, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedLime, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalMagenta, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedMagenta, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalOrange, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedOrange, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalPink, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedPink, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalPurple, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedPurple, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalRed, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedRed, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalWhite, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedWhite, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1), new ItemStack(InitItem.petalYellow, MathHelper.getInt(random, 8, 12), 0)));
        recipeList.add(new MerchantRecipe(new ItemStack(InitItem.seedYellow, MathHelper.getInt(random, 16, 24)), new ItemStack(Items.EMERALD, 1, 0)));
    }
}