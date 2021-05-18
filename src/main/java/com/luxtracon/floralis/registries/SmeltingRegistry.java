package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.inits.ItemInit;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRegistry
{
    public static void init()
    {
        GameRegistry.addSmelting(ItemInit.petalBlack, new ItemStack(ItemInit.dyeBlack), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalBlue, new ItemStack(ItemInit.dyeBlue), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalBrown, new ItemStack(ItemInit.dyeBrown), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalCyan, new ItemStack(ItemInit.dyeCyan), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalGray, new ItemStack(ItemInit.dyeGray), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalGreen, new ItemStack(ItemInit.dyeGreen), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalLightBlue, new ItemStack(ItemInit.dyeLightBlue), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalLightGray, new ItemStack(ItemInit.dyeLightGray), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalLime, new ItemStack(ItemInit.dyeLime), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalMagenta, new ItemStack(ItemInit.dyeMagenta), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalOrange, new ItemStack(ItemInit.dyeOrange), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalPink, new ItemStack(ItemInit.dyePink), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalPurple, new ItemStack(ItemInit.dyePurple), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalRed, new ItemStack(ItemInit.dyeRed), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalWhite, new ItemStack(ItemInit.dyeWhite), 0.2F);
        GameRegistry.addSmelting(ItemInit.petalYellow, new ItemStack(ItemInit.dyeYellow), 0.2F);

        GameRegistry.addSmelting(ItemInit.potUnfiredBlack, new ItemStack(ItemInit.potFiredBlack), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredBlue, new ItemStack(ItemInit.potFiredBlue), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredBrown, new ItemStack(ItemInit.potFiredBrown), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredCyan, new ItemStack(ItemInit.potFiredCyan), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredGray, new ItemStack(ItemInit.potFiredGray), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredGreen, new ItemStack(ItemInit.potFiredGreen), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredLightBlue, new ItemStack(ItemInit.potFiredLightBlue), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredLightGray, new ItemStack(ItemInit.potFiredLightGray), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredLime, new ItemStack(ItemInit.potFiredLime), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredMagenta, new ItemStack(ItemInit.potFiredMagenta), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredOrange, new ItemStack(ItemInit.potFiredOrange), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredPink, new ItemStack(ItemInit.potFiredPink), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredPurple, new ItemStack(ItemInit.potFiredPurple), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredRed, new ItemStack(ItemInit.potFiredRed), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredWhite, new ItemStack(ItemInit.potFiredWhite), 0.2F);
        GameRegistry.addSmelting(ItemInit.potUnfiredYellow, new ItemStack(ItemInit.potFiredYellow), 0.2F);
    }
}
