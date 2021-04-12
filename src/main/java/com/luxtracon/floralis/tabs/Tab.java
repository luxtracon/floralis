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

                Item.getItemFromBlock(InitCactus.cactusWhite),
                Item.getItemFromBlock(InitCactus.cactusOrange),
                Item.getItemFromBlock(InitCactus.cactusMagenta),
                Item.getItemFromBlock(InitCactus.cactusLightBlue),
                Item.getItemFromBlock(InitCactus.cactusYellow),
                Item.getItemFromBlock(InitCactus.cactusLime),
                Item.getItemFromBlock(InitCactus.cactusPink),
                Item.getItemFromBlock(InitCactus.cactusGray),
                Item.getItemFromBlock(InitCactus.cactusLightGray),
                Item.getItemFromBlock(InitCactus.cactusCyan),
                Item.getItemFromBlock(InitCactus.cactusPurple),
                Item.getItemFromBlock(InitCactus.cactusBlue),
                Item.getItemFromBlock(InitCactus.cactusBrown),
                Item.getItemFromBlock(InitCactus.cactusGreen),
                Item.getItemFromBlock(InitCactus.cactusRed),
                Item.getItemFromBlock(InitCactus.cactusBlack),

                InitItem.seedFlowerWhite,
                InitItem.seedFlowerOrange,
                InitItem.seedFlowerMagenta,
                InitItem.seedFlowerLightBlue,
                InitItem.seedFlowerYellow,
                InitItem.seedFlowerLime,
                InitItem.seedFlowerPink,
                InitItem.seedFlowerGray,
                InitItem.seedFlowerLightGray,
                InitItem.seedFlowerCyan,
                InitItem.seedFlowerPurple,
                InitItem.seedFlowerBlue,
                InitItem.seedFlowerBrown,
                InitItem.seedFlowerGreen,
                InitItem.seedFlowerRed,
                InitItem.seedFlowerBlack,

                InitItem.seedCactusWhite,
                InitItem.seedCactusOrange,
                InitItem.seedCactusMagenta,
                InitItem.seedCactusLightBlue,
                InitItem.seedCactusYellow,
                InitItem.seedCactusLime,
                InitItem.seedCactusPink,
                InitItem.seedCactusGray,
                InitItem.seedCactusLightGray,
                InitItem.seedCactusCyan,
                InitItem.seedCactusPurple,
                InitItem.seedCactusBlue,
                InitItem.seedCactusBrown,
                InitItem.seedCactusGreen,
                InitItem.seedCactusRed,
                InitItem.seedCactusBlack,

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