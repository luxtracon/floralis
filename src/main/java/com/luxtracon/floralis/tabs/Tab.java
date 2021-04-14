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
        return new ItemStack(FlowerInit.flowerPurple);
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
                Item.getItemFromBlock(FlowerInit.flowerWhite),
                Item.getItemFromBlock(FlowerInit.flowerOrange),
                Item.getItemFromBlock(FlowerInit.flowerMagenta),
                Item.getItemFromBlock(FlowerInit.flowerLightBlue),
                Item.getItemFromBlock(FlowerInit.flowerYellow),
                Item.getItemFromBlock(FlowerInit.flowerLime),
                Item.getItemFromBlock(FlowerInit.flowerPink),
                Item.getItemFromBlock(FlowerInit.flowerGray),
                Item.getItemFromBlock(FlowerInit.flowerLightGray),
                Item.getItemFromBlock(FlowerInit.flowerCyan),
                Item.getItemFromBlock(FlowerInit.flowerPurple),
                Item.getItemFromBlock(FlowerInit.flowerBlue),
                Item.getItemFromBlock(FlowerInit.flowerBrown),
                Item.getItemFromBlock(FlowerInit.flowerGreen),
                Item.getItemFromBlock(FlowerInit.flowerRed),
                Item.getItemFromBlock(FlowerInit.flowerBlack),

                Item.getItemFromBlock(CactusInit.cactusWhite),
                Item.getItemFromBlock(CactusInit.cactusOrange),
                Item.getItemFromBlock(CactusInit.cactusMagenta),
                Item.getItemFromBlock(CactusInit.cactusLightBlue),
                Item.getItemFromBlock(CactusInit.cactusYellow),
                Item.getItemFromBlock(CactusInit.cactusLime),
                Item.getItemFromBlock(CactusInit.cactusPink),
                Item.getItemFromBlock(CactusInit.cactusGray),
                Item.getItemFromBlock(CactusInit.cactusLightGray),
                Item.getItemFromBlock(CactusInit.cactusCyan),
                Item.getItemFromBlock(CactusInit.cactusPurple),
                Item.getItemFromBlock(CactusInit.cactusBlue),
                Item.getItemFromBlock(CactusInit.cactusBrown),
                Item.getItemFromBlock(CactusInit.cactusGreen),
                Item.getItemFromBlock(CactusInit.cactusRed),
                Item.getItemFromBlock(CactusInit.cactusBlack),

                ItemInit.seedFlowerWhite,
                ItemInit.seedFlowerOrange,
                ItemInit.seedFlowerMagenta,
                ItemInit.seedFlowerLightBlue,
                ItemInit.seedFlowerYellow,
                ItemInit.seedFlowerLime,
                ItemInit.seedFlowerPink,
                ItemInit.seedFlowerGray,
                ItemInit.seedFlowerLightGray,
                ItemInit.seedFlowerCyan,
                ItemInit.seedFlowerPurple,
                ItemInit.seedFlowerBlue,
                ItemInit.seedFlowerBrown,
                ItemInit.seedFlowerGreen,
                ItemInit.seedFlowerRed,
                ItemInit.seedFlowerBlack,

                ItemInit.seedCactusWhite,
                ItemInit.seedCactusOrange,
                ItemInit.seedCactusMagenta,
                ItemInit.seedCactusLightBlue,
                ItemInit.seedCactusYellow,
                ItemInit.seedCactusLime,
                ItemInit.seedCactusPink,
                ItemInit.seedCactusGray,
                ItemInit.seedCactusLightGray,
                ItemInit.seedCactusCyan,
                ItemInit.seedCactusPurple,
                ItemInit.seedCactusBlue,
                ItemInit.seedCactusBrown,
                ItemInit.seedCactusGreen,
                ItemInit.seedCactusRed,
                ItemInit.seedCactusBlack,

                ItemInit.petalWhite,
                ItemInit.petalOrange,
                ItemInit.petalMagenta,
                ItemInit.petalLightBlue,
                ItemInit.petalYellow,
                ItemInit.petalLime,
                ItemInit.petalPink,
                ItemInit.petalGray,
                ItemInit.petalLightGray,
                ItemInit.petalCyan,
                ItemInit.petalPurple,
                ItemInit.petalBlue,
                ItemInit.petalBrown,
                ItemInit.petalGreen,
                ItemInit.petalRed,
                ItemInit.petalBlack,

                ItemInit.dyeWhite,
                ItemInit.dyeOrange,
                ItemInit.dyeMagenta,
                ItemInit.dyeLightBlue,
                ItemInit.dyeYellow,
                ItemInit.dyeLime,
                ItemInit.dyePink,
                ItemInit.dyeGray,
                ItemInit.dyeLightGray,
                ItemInit.dyeCyan,
                ItemInit.dyePurple,
                ItemInit.dyeBlue,
                ItemInit.dyeBrown,
                ItemInit.dyeGreen,
                ItemInit.dyeRed,
                ItemInit.dyeBlack,

                Item.getItemFromBlock(BlockInit.blockDyeWhite),
                Item.getItemFromBlock(BlockInit.blockDyeOrange),
                Item.getItemFromBlock(BlockInit.blockDyeMagenta),
                Item.getItemFromBlock(BlockInit.blockDyeLightBlue),
                Item.getItemFromBlock(BlockInit.blockDyeYellow),
                Item.getItemFromBlock(BlockInit.blockDyeLime),
                Item.getItemFromBlock(BlockInit.blockDyePink),
                Item.getItemFromBlock(BlockInit.blockDyeGray),
                Item.getItemFromBlock(BlockInit.blockDyeLightGray),
                Item.getItemFromBlock(BlockInit.blockDyeCyan),
                Item.getItemFromBlock(BlockInit.blockDyePurple),
                Item.getItemFromBlock(BlockInit.blockDyeBlue),
                Item.getItemFromBlock(BlockInit.blockDyeBrown),
                Item.getItemFromBlock(BlockInit.blockDyeGreen),
                Item.getItemFromBlock(BlockInit.blockDyeRed),
                Item.getItemFromBlock(BlockInit.blockDyeBlack)
            );

        itemStack.clear();

        for (Item setItem : getItem)
        {
            itemStack.add(new ItemStack(setItem));
        }
    }
}