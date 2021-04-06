package com.luxtracon.floralis.tabs;

import com.luxtracon.floralis.init.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Arrays;
import java.util.List;

public class Tab extends CreativeTabs
{
    public Tab()
    {
        super("tab");
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(InitFlower.flowerPurple);
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> itemStack)
    {
        List<Item> getItem = Arrays.asList
            (
                Item.getItemFromBlock(InitFlower.flowerWhite),
                Item.getItemFromBlock(InitFlower.flowerOrange),
                Item.getItemFromBlock(InitFlower.flowerMagenta),
                Item.getItemFromBlock(InitFlower.flowerLightBlue),
                Item.getItemFromBlock(InitFlower.flowerYellow),
                Item.getItemFromBlock(InitFlower.flowerLime),
                Item.getItemFromBlock(InitFlower.flowerPink),
                Item.getItemFromBlock(InitFlower.flowerGray),
                Item.getItemFromBlock(InitFlower.flowerLightGray),
                Item.getItemFromBlock(InitFlower.flowerCyan),
                Item.getItemFromBlock(InitFlower.flowerPurple),
                Item.getItemFromBlock(InitFlower.flowerBlue),
                Item.getItemFromBlock(InitFlower.flowerBrown),
                Item.getItemFromBlock(InitFlower.flowerGreen),
                Item.getItemFromBlock(InitFlower.flowerRed),
                Item.getItemFromBlock(InitFlower.flowerBlack),

                InitItem.seedWhite,
                InitItem.seedOrange,
                InitItem.seedMagenta,
                InitItem.seedLightBlue,
                InitItem.seedYellow,
                InitItem.seedLime,
                InitItem.seedPink,
                InitItem.seedGray,
                InitItem.seedLightGray,
                InitItem.seedCyan,
                InitItem.seedPurple,
                InitItem.seedBlue,
                InitItem.seedBrown,
                InitItem.seedGreen,
                InitItem.seedRed,
                InitItem.seedBlack,

                InitItem.petalWhite,
                InitItem.petalOrange,
                InitItem.petalMagenta,
                InitItem.petalLightBlue,
                InitItem.petalYellow,
                InitItem.petalLime,
                InitItem.petalPink,
                InitItem.petalGray,
                InitItem.petalLightGray,
                InitItem.petalCyan,
                InitItem.petalPurple,
                InitItem.petalBlue,
                InitItem.petalBrown,
                InitItem.petalGreen,
                InitItem.petalRed,
                InitItem.petalBlack,

                InitItem.dyeWhite,
                InitItem.dyeOrange,
                InitItem.dyeMagenta,
                InitItem.dyeLightBlue,
                InitItem.dyeYellow,
                InitItem.dyeLime,
                InitItem.dyePink,
                InitItem.dyeGray,
                InitItem.dyeLightGray,
                InitItem.dyeCyan,
                InitItem.dyePurple,
                InitItem.dyeBlue,
                InitItem.dyeBrown,
                InitItem.dyeGreen,
                InitItem.dyeRed,
                InitItem.dyeBlack,

                Item.getItemFromBlock(InitBlock.blockDyeWhite),
                Item.getItemFromBlock(InitBlock.blockDyeOrange),
                Item.getItemFromBlock(InitBlock.blockDyeMagenta),
                Item.getItemFromBlock(InitBlock.blockDyeLightBlue),
                Item.getItemFromBlock(InitBlock.blockDyeYellow),
                Item.getItemFromBlock(InitBlock.blockDyeLime),
                Item.getItemFromBlock(InitBlock.blockDyePink),
                Item.getItemFromBlock(InitBlock.blockDyeGray),
                Item.getItemFromBlock(InitBlock.blockDyeLightGray),
                Item.getItemFromBlock(InitBlock.blockDyeCyan),
                Item.getItemFromBlock(InitBlock.blockDyePurple),
                Item.getItemFromBlock(InitBlock.blockDyeBlue),
                Item.getItemFromBlock(InitBlock.blockDyeBrown),
                Item.getItemFromBlock(InitBlock.blockDyeGreen),
                Item.getItemFromBlock(InitBlock.blockDyeRed),
                Item.getItemFromBlock(InitBlock.blockDyeBlack)
            );

        itemStack.clear();

        for (Item setItem : getItem)
        {
            itemStack.add(new ItemStack(setItem));
        }
    }
}