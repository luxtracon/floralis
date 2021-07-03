package com.luxtracon.floralis.utilities;

import com.luxtracon.floralis.inits.*;

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
    public boolean hasSearchBar()
    {
        return true;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> itemStack)
    {
        List<Item> getItem = Arrays.asList
            (
                Item.getItemFromBlock(BlockInit.flowerWhite),
                Item.getItemFromBlock(BlockInit.flowerOrange),
                Item.getItemFromBlock(BlockInit.flowerMagenta),
                Item.getItemFromBlock(BlockInit.flowerLightBlue),
                Item.getItemFromBlock(BlockInit.flowerYellow),
                Item.getItemFromBlock(BlockInit.flowerLime),
                Item.getItemFromBlock(BlockInit.flowerPink),
                Item.getItemFromBlock(BlockInit.flowerGray),
                Item.getItemFromBlock(BlockInit.flowerLightGray),
                Item.getItemFromBlock(BlockInit.flowerCyan),
                Item.getItemFromBlock(BlockInit.flowerPurple),
                Item.getItemFromBlock(BlockInit.flowerBlue),
                Item.getItemFromBlock(BlockInit.flowerBrown),
                Item.getItemFromBlock(BlockInit.flowerGreen),
                Item.getItemFromBlock(BlockInit.flowerRed),
                Item.getItemFromBlock(BlockInit.flowerBlack),

                Item.getItemFromBlock(BlockInit.cactusWhite),
                Item.getItemFromBlock(BlockInit.cactusOrange),
                Item.getItemFromBlock(BlockInit.cactusMagenta),
                Item.getItemFromBlock(BlockInit.cactusLightBlue),
                Item.getItemFromBlock(BlockInit.cactusYellow),
                Item.getItemFromBlock(BlockInit.cactusLime),
                Item.getItemFromBlock(BlockInit.cactusPink),
                Item.getItemFromBlock(BlockInit.cactusGray),
                Item.getItemFromBlock(BlockInit.cactusLightGray),
                Item.getItemFromBlock(BlockInit.cactusCyan),
                Item.getItemFromBlock(BlockInit.cactusPurple),
                Item.getItemFromBlock(BlockInit.cactusBlue),
                Item.getItemFromBlock(BlockInit.cactusBrown),
                Item.getItemFromBlock(BlockInit.cactusGreen),
                Item.getItemFromBlock(BlockInit.cactusRed),
                Item.getItemFromBlock(BlockInit.cactusBlack),

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

                ItemInit.partsWhite,
                ItemInit.partsOrange,
                ItemInit.partsMagenta,
                ItemInit.partsLightBlue,
                ItemInit.partsYellow,
                ItemInit.partsLime,
                ItemInit.partsPink,
                ItemInit.partsGray,
                ItemInit.partsLightGray,
                ItemInit.partsCyan,
                ItemInit.partsPurple,
                ItemInit.partsBlue,
                ItemInit.partsBrown,
                ItemInit.partsGreen,
                ItemInit.partsRed,
                ItemInit.partsBlack,

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

                ItemInit.clayWhite,
                ItemInit.clayOrange,
                ItemInit.clayMagenta,
                ItemInit.clayLightBlue,
                ItemInit.clayYellow,
                ItemInit.clayLime,
                ItemInit.clayPink,
                ItemInit.clayGray,
                ItemInit.clayLightGray,
                ItemInit.clayCyan,
                ItemInit.clayPurple,
                ItemInit.clayBlue,
                ItemInit.clayBrown,
                ItemInit.clayGreen,
                ItemInit.clayRed,
                ItemInit.clayBlack,

                ItemInit.potUnfiredWhite,
                ItemInit.potUnfiredOrange,
                ItemInit.potUnfiredMagenta,
                ItemInit.potUnfiredLightBlue,
                ItemInit.potUnfiredYellow,
                ItemInit.potUnfiredLime,
                ItemInit.potUnfiredPink,
                ItemInit.potUnfiredGray,
                ItemInit.potUnfiredLightGray,
                ItemInit.potUnfiredCyan,
                ItemInit.potUnfiredPurple,
                ItemInit.potUnfiredBlue,
                ItemInit.potUnfiredBrown,
                ItemInit.potUnfiredGreen,
                ItemInit.potUnfiredRed,
                ItemInit.potUnfiredBlack,

                ItemInit.potFiredWhite,
                ItemInit.potFiredOrange,
                ItemInit.potFiredMagenta,
                ItemInit.potFiredLightBlue,
                ItemInit.potFiredYellow,
                ItemInit.potFiredLime,
                ItemInit.potFiredPink,
                ItemInit.potFiredGray,
                ItemInit.potFiredLightGray,
                ItemInit.potFiredCyan,
                ItemInit.potFiredPurple,
                ItemInit.potFiredBlue,
                ItemInit.potFiredBrown,
                ItemInit.potFiredGreen,
                ItemInit.potFiredRed,
                ItemInit.potFiredBlack,

                Item.getItemFromBlock(BlockInit.potFlowerWhite),
                Item.getItemFromBlock(BlockInit.potFlowerOrange),
                Item.getItemFromBlock(BlockInit.potFlowerMagenta),
                Item.getItemFromBlock(BlockInit.potFlowerLightBlue),
                Item.getItemFromBlock(BlockInit.potFlowerYellow),
                Item.getItemFromBlock(BlockInit.potFlowerLime),
                Item.getItemFromBlock(BlockInit.potFlowerPink),
                Item.getItemFromBlock(BlockInit.potFlowerGray),
                Item.getItemFromBlock(BlockInit.potFlowerLightGray),
                Item.getItemFromBlock(BlockInit.potFlowerCyan),
                Item.getItemFromBlock(BlockInit.potFlowerPurple),
                Item.getItemFromBlock(BlockInit.potFlowerBlue),
                Item.getItemFromBlock(BlockInit.potFlowerBrown),
                Item.getItemFromBlock(BlockInit.potFlowerGreen),
                Item.getItemFromBlock(BlockInit.potFlowerRed),
                Item.getItemFromBlock(BlockInit.potFlowerBlack),

                Item.getItemFromBlock(BlockInit.potCactusWhite),
                Item.getItemFromBlock(BlockInit.potCactusOrange),
                Item.getItemFromBlock(BlockInit.potCactusMagenta),
                Item.getItemFromBlock(BlockInit.potCactusLightBlue),
                Item.getItemFromBlock(BlockInit.potCactusYellow),
                Item.getItemFromBlock(BlockInit.potCactusLime),
                Item.getItemFromBlock(BlockInit.potCactusPink),
                Item.getItemFromBlock(BlockInit.potCactusGray),
                Item.getItemFromBlock(BlockInit.potCactusLightGray),
                Item.getItemFromBlock(BlockInit.potCactusCyan),
                Item.getItemFromBlock(BlockInit.potCactusPurple),
                Item.getItemFromBlock(BlockInit.potCactusBlue),
                Item.getItemFromBlock(BlockInit.potCactusBrown),
                Item.getItemFromBlock(BlockInit.potCactusGreen),
                Item.getItemFromBlock(BlockInit.potCactusRed),
                Item.getItemFromBlock(BlockInit.potCactusBlack),

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
                Item.getItemFromBlock(BlockInit.blockDyeBlack),

                Item.getItemFromBlock(BlockInit.blockClayWhite),
                Item.getItemFromBlock(BlockInit.blockClayOrange),
                Item.getItemFromBlock(BlockInit.blockClayMagenta),
                Item.getItemFromBlock(BlockInit.blockClayLightBlue),
                Item.getItemFromBlock(BlockInit.blockClayYellow),
                Item.getItemFromBlock(BlockInit.blockClayLime),
                Item.getItemFromBlock(BlockInit.blockClayPink),
                Item.getItemFromBlock(BlockInit.blockClayGray),
                Item.getItemFromBlock(BlockInit.blockClayLightGray),
                Item.getItemFromBlock(BlockInit.blockClayCyan),
                Item.getItemFromBlock(BlockInit.blockClayPurple),
                Item.getItemFromBlock(BlockInit.blockClayBlue),
                Item.getItemFromBlock(BlockInit.blockClayBrown),
                Item.getItemFromBlock(BlockInit.blockClayGreen),
                Item.getItemFromBlock(BlockInit.blockClayRed),
                Item.getItemFromBlock(BlockInit.blockClayBlack)
            );

        itemStack.clear();

        for (Item setItem : getItem)
        {
            itemStack.add(new ItemStack(setItem));
        }
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(BlockInit.flowerPurple);
    }
}