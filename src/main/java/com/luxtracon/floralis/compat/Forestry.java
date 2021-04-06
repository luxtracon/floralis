package com.luxtracon.floralis.compat;

import com.luxtracon.floralis.base.BaseCrop;
import com.luxtracon.floralis.init.InitCrop;
import com.luxtracon.floralis.init.InitItem;

import forestry.api.core.ForestryAPI;
import forestry.api.farming.IFarmRegistry;
import forestry.farming.logic.ForestryFarmIdentifier;
import forestry.farming.logic.farmables.FarmableAgingCrop;

import net.minecraft.item.ItemStack;

public class Forestry
{
    public static void init()
    {
        IFarmRegistry registry = ForestryAPI.farmRegistry;

        registry.registerFarmables
            (
                ForestryFarmIdentifier.CROPS,

                    new FarmableAgingCrop(new ItemStack(InitItem.seedWhite), InitCrop.cropWhite, new ItemStack(InitItem.petalWhite), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedOrange), InitCrop.cropOrange, new ItemStack(InitItem.petalOrange), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedMagenta), InitCrop.cropMagenta, new ItemStack(InitItem.petalMagenta), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedLightBlue), InitCrop.cropLightBlue, new ItemStack(InitItem.petalLightBlue), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedYellow), InitCrop.cropYellow, new ItemStack(InitItem.petalYellow), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedLime), InitCrop.cropLime, new ItemStack(InitItem.petalLime), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedPink), InitCrop.cropPink, new ItemStack(InitItem.petalPink), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedGray), InitCrop.cropGray, new ItemStack(InitItem.petalGray), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedLightGray), InitCrop.cropLightGray, new ItemStack(InitItem.petalLightGray), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedCyan), InitCrop.cropCyan, new ItemStack(InitItem.petalCyan), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedPurple), InitCrop.cropPurple, new ItemStack(InitItem.petalPurple), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedBlue), InitCrop.cropBlue, new ItemStack(InitItem.petalBlue), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedBrown), InitCrop.cropBrown, new ItemStack(InitItem.petalBrown), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedGreen), InitCrop.cropGreen, new ItemStack(InitItem.petalGreen), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedRed), InitCrop.cropRed, new ItemStack(InitItem.petalRed), BaseCrop.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedBlack), InitCrop.cropBlack, new ItemStack(InitItem.petalBlack), BaseCrop.AGE, 5, 0)
            );
    }
}
