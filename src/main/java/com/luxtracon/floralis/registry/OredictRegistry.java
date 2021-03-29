package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.init.InitItem;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OredictRegistry
{
    public static void init()
    {
        OreDictionary.registerOre("dyeBlack", new ItemStack(InitItem.dyeBlack));
        OreDictionary.registerOre("dyeBlue", new ItemStack(InitItem.dyeBlue));
        OreDictionary.registerOre("dyeBrown", new ItemStack(InitItem.dyeBrown));
        OreDictionary.registerOre("dyeCyan", new ItemStack(InitItem.dyeCyan));
        OreDictionary.registerOre("dyeGray", new ItemStack(InitItem.dyeGray));
        OreDictionary.registerOre("dyeGreen", new ItemStack(InitItem.dyeGreen));
        OreDictionary.registerOre("dyeLightBlue", new ItemStack(InitItem.dyeLightBlue));
        OreDictionary.registerOre("dyeLightGray", new ItemStack(InitItem.dyeLightGray));
        OreDictionary.registerOre("dyeLime", new ItemStack(InitItem.dyeLime));
        OreDictionary.registerOre("dyeMagenta", new ItemStack(InitItem.dyeMagenta));
        OreDictionary.registerOre("dyeOrange", new ItemStack(InitItem.dyeOrange));
        OreDictionary.registerOre("dyePink", new ItemStack(InitItem.dyePink));
        OreDictionary.registerOre("dyePurple", new ItemStack(InitItem.dyePurple));
        OreDictionary.registerOre("dyeRed", new ItemStack(InitItem.dyeRed));
        OreDictionary.registerOre("dyeWhite", new ItemStack(InitItem.dyeWhite));
        OreDictionary.registerOre("dyeYellow", new ItemStack(InitItem.dyeYellow));
    }
}
