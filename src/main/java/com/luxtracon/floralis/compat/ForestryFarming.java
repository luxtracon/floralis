package com.luxtracon.floralis.compat;

import com.luxtracon.floralis.base.CactusCropBase;
import com.luxtracon.floralis.base.FlowerCropBase;
import com.luxtracon.floralis.init.CactusCropInit;
import com.luxtracon.floralis.init.FlowerCropInit;
import com.luxtracon.floralis.init.ItemInit;

import forestry.api.core.ForestryAPI;
import forestry.farming.logic.ForestryFarmIdentifier;
import forestry.farming.logic.farmables.FarmableAgingCrop;

import net.minecraft.item.ItemStack;

public class ForestryFarming
{
    public static void init()
    {
        ForestryAPI.farmRegistry.registerFarmables
        (
            ForestryFarmIdentifier.CROPS,

            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerWhite), FlowerCropInit.cropFlowerWhite, new ItemStack(ItemInit.petalWhite), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerOrange), FlowerCropInit.cropFlowerOrange, new ItemStack(ItemInit.petalOrange), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerMagenta), FlowerCropInit.cropFlowerMagenta, new ItemStack(ItemInit.petalMagenta), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerLightBlue), FlowerCropInit.cropFlowerLightBlue, new ItemStack(ItemInit.petalLightBlue), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerYellow), FlowerCropInit.cropFlowerYellow, new ItemStack(ItemInit.petalYellow), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerLime), FlowerCropInit.cropFlowerLime, new ItemStack(ItemInit.petalLime), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerPink), FlowerCropInit.cropFlowerPink, new ItemStack(ItemInit.petalPink), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerGray), FlowerCropInit.cropFlowerGray, new ItemStack(ItemInit.petalGray), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerLightGray), FlowerCropInit.cropFlowerLightGray, new ItemStack(ItemInit.petalLightGray), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerCyan), FlowerCropInit.cropFlowerCyan, new ItemStack(ItemInit.petalCyan), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerPurple), FlowerCropInit.cropFlowerPurple, new ItemStack(ItemInit.petalPurple), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerBlue), FlowerCropInit.cropFlowerBlue, new ItemStack(ItemInit.petalBlue), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerBrown), FlowerCropInit.cropFlowerBrown, new ItemStack(ItemInit.petalBrown), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerGreen), FlowerCropInit.cropFlowerGreen, new ItemStack(ItemInit.petalGreen), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerRed), FlowerCropInit.cropFlowerRed, new ItemStack(ItemInit.petalRed), FlowerCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerBlack), FlowerCropInit.cropFlowerBlack, new ItemStack(ItemInit.petalBlack), FlowerCropBase.AGE, 5, 0)
        );

        ForestryAPI.farmRegistry.registerFarmables
        (
            ForestryFarmIdentifier.SUCCULENTES,

            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusWhite), CactusCropInit.cropCactusWhite, new ItemStack(ItemInit.petalWhite), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusOrange), CactusCropInit.cropCactusOrange, new ItemStack(ItemInit.petalOrange), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusMagenta), CactusCropInit.cropCactusMagenta, new ItemStack(ItemInit.petalMagenta), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusLightBlue), CactusCropInit.cropCactusLightBlue, new ItemStack(ItemInit.petalLightBlue), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusYellow), CactusCropInit.cropCactusYellow, new ItemStack(ItemInit.petalYellow), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusLime), CactusCropInit.cropCactusLime, new ItemStack(ItemInit.petalLime), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusPink), CactusCropInit.cropCactusPink, new ItemStack(ItemInit.petalPink), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusGray), CactusCropInit.cropCactusGray, new ItemStack(ItemInit.petalGray), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusLightGray), CactusCropInit.cropCactusLightGray, new ItemStack(ItemInit.petalLightGray), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusCyan), CactusCropInit.cropCactusCyan, new ItemStack(ItemInit.petalCyan), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusPurple), CactusCropInit.cropCactusPurple, new ItemStack(ItemInit.petalPurple), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusBlue), CactusCropInit.cropCactusBlue, new ItemStack(ItemInit.petalBlue), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusBrown), CactusCropInit.cropCactusBrown, new ItemStack(ItemInit.petalBrown), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusGreen), CactusCropInit.cropCactusGreen, new ItemStack(ItemInit.petalGreen), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusRed), CactusCropInit.cropCactusRed, new ItemStack(ItemInit.petalRed), CactusCropBase.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusBlack), CactusCropInit.cropCactusBlack, new ItemStack(ItemInit.petalBlack), CactusCropBase.AGE, 5, 0)
        );
    }
}