package com.luxtracon.floralis.util;

import com.luxtracon.floralis.init.InitItem;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry
{
    public static void init()
    {
        GameRegistry.addSmelting(InitItem.petalBlack, new ItemStack(InitItem.dyeBlack), 0.2F);
        GameRegistry.addSmelting(InitItem.petalBlue, new ItemStack(InitItem.dyeBlue), 0.2F);
        GameRegistry.addSmelting(InitItem.petalBrown, new ItemStack(InitItem.dyeBrown), 0.2F);
        GameRegistry.addSmelting(InitItem.petalCyan, new ItemStack(InitItem.dyeCyan), 0.2F);
        GameRegistry.addSmelting(InitItem.petalGray, new ItemStack(InitItem.dyeGray), 0.2F);
        GameRegistry.addSmelting(InitItem.petalGreen, new ItemStack(InitItem.dyeGreen), 0.2F);
        GameRegistry.addSmelting(InitItem.petalLightBlue, new ItemStack(InitItem.dyeLightBlue), 0.2F);
        GameRegistry.addSmelting(InitItem.petalLightGray, new ItemStack(InitItem.dyeLightGray), 0.2F);
        GameRegistry.addSmelting(InitItem.petalLime, new ItemStack(InitItem.dyeLime), 0.2F);
        GameRegistry.addSmelting(InitItem.petalMagenta, new ItemStack(InitItem.dyeMagenta), 0.2F);
        GameRegistry.addSmelting(InitItem.petalOrange, new ItemStack(InitItem.dyeOrange), 0.2F);
        GameRegistry.addSmelting(InitItem.petalPink, new ItemStack(InitItem.dyePink), 0.2F);
        GameRegistry.addSmelting(InitItem.petalPurple, new ItemStack(InitItem.dyePurple), 0.2F);
        GameRegistry.addSmelting(InitItem.petalRed, new ItemStack(InitItem.dyeRed), 0.2F);
        GameRegistry.addSmelting(InitItem.petalWhite, new ItemStack(InitItem.dyeWhite), 0.2F);
        GameRegistry.addSmelting(InitItem.petalYellow, new ItemStack(InitItem.dyeYellow), 0.2F);
    }
}
