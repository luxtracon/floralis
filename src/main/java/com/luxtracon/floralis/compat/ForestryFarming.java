package com.luxtracon.floralis.compat;

import com.luxtracon.floralis.base.BaseCropFlower;
import com.luxtracon.floralis.init.InitCropFlower;
import com.luxtracon.floralis.init.InitItem;

import forestry.api.core.ForestryAPI;
import forestry.api.farming.IFarmRegistry;
import forestry.farming.logic.ForestryFarmIdentifier;
import forestry.farming.logic.farmables.FarmableAgingCrop;

import net.minecraft.item.ItemStack;

public class ForestryFarming
{
    public static void init()
    {
        IFarmRegistry registry = ForestryAPI.farmRegistry;

        registry.registerFarmables
            (
                ForestryFarmIdentifier.CROPS,

                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerWhite), InitCropFlower.cropFlowerWhite, new ItemStack(InitItem.petalWhite), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerOrange), InitCropFlower.cropFlowerOrange, new ItemStack(InitItem.petalOrange), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerMagenta), InitCropFlower.cropFlowerMagenta, new ItemStack(InitItem.petalMagenta), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerLightBlue), InitCropFlower.cropFlowerLightBlue, new ItemStack(InitItem.petalLightBlue), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerYellow), InitCropFlower.cropFlowerYellow, new ItemStack(InitItem.petalYellow), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerLime), InitCropFlower.cropFlowerLime, new ItemStack(InitItem.petalLime), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerPink), InitCropFlower.cropFlowerPink, new ItemStack(InitItem.petalPink), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerGray), InitCropFlower.cropFlowerGray, new ItemStack(InitItem.petalGray), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerLightGray), InitCropFlower.cropFlowerLightGray, new ItemStack(InitItem.petalLightGray), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerCyan), InitCropFlower.cropFlowerCyan, new ItemStack(InitItem.petalCyan), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerPurple), InitCropFlower.cropFlowerPurple, new ItemStack(InitItem.petalPurple), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerBlue), InitCropFlower.cropFlowerBlue, new ItemStack(InitItem.petalBlue), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerBrown), InitCropFlower.cropFlowerBrown, new ItemStack(InitItem.petalBrown), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerGreen), InitCropFlower.cropFlowerGreen, new ItemStack(InitItem.petalGreen), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerRed), InitCropFlower.cropFlowerRed, new ItemStack(InitItem.petalRed), BaseCropFlower.AGE, 5, 0),
                    new FarmableAgingCrop(new ItemStack(InitItem.seedFlowerBlack), InitCropFlower.cropFlowerBlack, new ItemStack(InitItem.petalBlack), BaseCropFlower.AGE, 5, 0)
            );
    }
}
