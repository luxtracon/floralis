package com.luxtracon.floralis.registry;

import com.luxtracon.floralis.init.ItemInit;

import net.minecraft.item.ItemStack;

import net.minecraftforge.oredict.OreDictionary;

public class DictionaryRegistry
{
    public static void init()
    {
        OreDictionary.registerOre("dyeBlack", new ItemStack(ItemInit.dyeBlack));
        OreDictionary.registerOre("dyeBlue", new ItemStack(ItemInit.dyeBlue));
        OreDictionary.registerOre("dyeBrown", new ItemStack(ItemInit.dyeBrown));
        OreDictionary.registerOre("dyeCyan", new ItemStack(ItemInit.dyeCyan));
        OreDictionary.registerOre("dyeGray", new ItemStack(ItemInit.dyeGray));
        OreDictionary.registerOre("dyeGreen", new ItemStack(ItemInit.dyeGreen));
        OreDictionary.registerOre("dyeLightBlue", new ItemStack(ItemInit.dyeLightBlue));
        OreDictionary.registerOre("dyeLightGray", new ItemStack(ItemInit.dyeLightGray));
        OreDictionary.registerOre("dyeLime", new ItemStack(ItemInit.dyeLime));
        OreDictionary.registerOre("dyeMagenta", new ItemStack(ItemInit.dyeMagenta));
        OreDictionary.registerOre("dyeOrange", new ItemStack(ItemInit.dyeOrange));
        OreDictionary.registerOre("dyePink", new ItemStack(ItemInit.dyePink));
        OreDictionary.registerOre("dyePurple", new ItemStack(ItemInit.dyePurple));
        OreDictionary.registerOre("dyeRed", new ItemStack(ItemInit.dyeRed));
        OreDictionary.registerOre("dyeWhite", new ItemStack(ItemInit.dyeWhite));
        OreDictionary.registerOre("dyeYellow", new ItemStack(ItemInit.dyeYellow));
    }
}
