package com.luxtracon.floralis.registries;

import com.luxtracon.floralis.inits.ItemInit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraftforge.oredict.OreDictionary;

public class DictionaryRegistry
{
    private static final String[] COLORS = {
        "Black", "Blue", "Brown", "Cyan", "Gray", "Green",
        "LightBlue", "LightGray", "Lime", "Magenta", "Orange",
        "Pink", "Purple", "Red", "White", "Yellow"
    };

    public static void init()
    {
        Item[] parts = {
            ItemInit.partsBlack, ItemInit.partsBlue, ItemInit.partsBrown, ItemInit.partsCyan,
            ItemInit.partsGray, ItemInit.partsGreen, ItemInit.partsLightBlue, ItemInit.partsLightGray,
            ItemInit.partsLime, ItemInit.partsMagenta, ItemInit.partsOrange, ItemInit.partsPink,
            ItemInit.partsPurple, ItemInit.partsRed, ItemInit.partsWhite, ItemInit.partsYellow
        };

        for (Item part : parts)
        {
            OreDictionary.registerOre("fertilizer", new ItemStack(part));
        }

        Item[] dyes = {
            ItemInit.dyeBlack, ItemInit.dyeBlue, ItemInit.dyeBrown, ItemInit.dyeCyan,
            ItemInit.dyeGray, ItemInit.dyeGreen, ItemInit.dyeLightBlue, ItemInit.dyeLightGray,
            ItemInit.dyeLime, ItemInit.dyeMagenta, ItemInit.dyeOrange, ItemInit.dyePink,
            ItemInit.dyePurple, ItemInit.dyeRed, ItemInit.dyeWhite, ItemInit.dyeYellow
        };

        for (int i = 0; i < COLORS.length; i++)
        {
            OreDictionary.registerOre("dye" + COLORS[i], new ItemStack(dyes[i]));
        }

        Item[] flowerSeeds = {
            ItemInit.seedFlowerBlack, ItemInit.seedFlowerBlue, ItemInit.seedFlowerBrown, ItemInit.seedFlowerCyan,
            ItemInit.seedFlowerGray, ItemInit.seedFlowerGreen, ItemInit.seedFlowerLightBlue, ItemInit.seedFlowerLightGray,
            ItemInit.seedFlowerLime, ItemInit.seedFlowerMagenta, ItemInit.seedFlowerOrange, ItemInit.seedFlowerPink,
            ItemInit.seedFlowerPurple, ItemInit.seedFlowerRed, ItemInit.seedFlowerWhite, ItemInit.seedFlowerYellow
        };

        for (int i = 0; i < COLORS.length; i++)
        {
            String color = COLORS[i];
            Item item = flowerSeeds[i];

            OreDictionary.registerOre("seedFlower" + color, new ItemStack(item));
            OreDictionary.registerOre("seedsFlower" + color, new ItemStack(item));
            OreDictionary.registerOre("listAllSeedFlower" + color, new ItemStack(item));
            OreDictionary.registerOre("listAllseedFlower" + color, new ItemStack(item));
        }

        Item[] cactusSeeds = {
            ItemInit.seedCactusBlack, ItemInit.seedCactusBlue, ItemInit.seedCactusBrown, ItemInit.seedCactusCyan,
            ItemInit.seedCactusGray, ItemInit.seedCactusGreen, ItemInit.seedCactusLightBlue, ItemInit.seedCactusLightGray,
            ItemInit.seedCactusLime, ItemInit.seedCactusMagenta, ItemInit.seedCactusOrange, ItemInit.seedCactusPink,
            ItemInit.seedCactusPurple, ItemInit.seedCactusRed, ItemInit.seedCactusWhite, ItemInit.seedCactusYellow
        };

        for (int i = 0; i < COLORS.length; i++)
        {
            String color = COLORS[i];
            Item item = cactusSeeds[i];

            OreDictionary.registerOre("seedCactus" + color, new ItemStack(item));
            OreDictionary.registerOre("seedsCactus" + color, new ItemStack(item));
            OreDictionary.registerOre("listAllSeedCactus" + color, new ItemStack(item));
            OreDictionary.registerOre("listAllseedCactus" + color, new ItemStack(item));
        }
    }
}