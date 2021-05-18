package com.luxtracon.floralis.compats;

import com.luxtracon.floralis.blocks.BlockCropCactus;
import com.luxtracon.floralis.blocks.BlockCropFlower;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;

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

            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerWhite), BlockInit.cropFlowerWhite, new ItemStack[]{new ItemStack(ItemInit.petalWhite), new ItemStack(ItemInit.partsWhite)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerOrange), BlockInit.cropFlowerOrange, new ItemStack[]{new ItemStack(ItemInit.petalOrange), new ItemStack(ItemInit.partsOrange)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerMagenta), BlockInit.cropFlowerMagenta, new ItemStack[]{new ItemStack(ItemInit.petalMagenta), new ItemStack(ItemInit.partsMagenta)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerLightBlue), BlockInit.cropFlowerLightBlue, new ItemStack[]{new ItemStack(ItemInit.petalLightBlue), new ItemStack(ItemInit.partsLightBlue)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerYellow), BlockInit.cropFlowerYellow, new ItemStack[]{new ItemStack(ItemInit.petalYellow), new ItemStack(ItemInit.partsYellow)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerLime), BlockInit.cropFlowerLime, new ItemStack[]{new ItemStack(ItemInit.petalLime), new ItemStack(ItemInit.partsLime)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerPink), BlockInit.cropFlowerPink, new ItemStack[]{new ItemStack(ItemInit.petalPink), new ItemStack(ItemInit.partsPink)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerGray), BlockInit.cropFlowerGray, new ItemStack[]{new ItemStack(ItemInit.petalGray), new ItemStack(ItemInit.partsGray)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerLightGray), BlockInit.cropFlowerLightGray, new ItemStack[]{new ItemStack(ItemInit.petalLightGray), new ItemStack(ItemInit.partsLightGray)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerCyan), BlockInit.cropFlowerCyan, new ItemStack[]{new ItemStack(ItemInit.petalCyan), new ItemStack(ItemInit.partsCyan)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerPurple), BlockInit.cropFlowerPurple, new ItemStack[]{new ItemStack(ItemInit.petalPurple), new ItemStack(ItemInit.partsPurple)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerBlue), BlockInit.cropFlowerBlue, new ItemStack[]{new ItemStack(ItemInit.petalBlue), new ItemStack(ItemInit.partsBlue)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerBrown), BlockInit.cropFlowerBrown, new ItemStack[]{new ItemStack(ItemInit.petalBrown), new ItemStack(ItemInit.partsBrown)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerGreen), BlockInit.cropFlowerGreen, new ItemStack[]{new ItemStack(ItemInit.petalGreen), new ItemStack(ItemInit.partsGreen)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerRed), BlockInit.cropFlowerRed, new ItemStack[]{new ItemStack(ItemInit.petalRed), new ItemStack(ItemInit.partsRed)}, BlockCropFlower.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedFlowerBlack), BlockInit.cropFlowerBlack, new ItemStack[]{new ItemStack(ItemInit.petalBlack), new ItemStack(ItemInit.partsBlack)}, BlockCropFlower.AGE, 5, 0)
        );

        ForestryAPI.farmRegistry.registerFarmables
        (
            ForestryFarmIdentifier.SUCCULENTES,

            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusWhite), BlockInit.cropCactusWhite, new ItemStack[]{new ItemStack(ItemInit.petalWhite), new ItemStack(ItemInit.partsWhite)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusOrange), BlockInit.cropCactusOrange, new ItemStack[]{new ItemStack(ItemInit.petalOrange), new ItemStack(ItemInit.partsOrange)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusMagenta), BlockInit.cropCactusMagenta, new ItemStack[]{new ItemStack(ItemInit.petalMagenta), new ItemStack(ItemInit.partsMagenta)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusLightBlue), BlockInit.cropCactusLightBlue, new ItemStack[]{new ItemStack(ItemInit.petalLightBlue), new ItemStack(ItemInit.partsLightBlue)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusYellow), BlockInit.cropCactusYellow, new ItemStack[]{new ItemStack(ItemInit.petalYellow), new ItemStack(ItemInit.partsYellow)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusLime), BlockInit.cropCactusLime, new ItemStack[]{new ItemStack(ItemInit.petalLime), new ItemStack(ItemInit.partsLime)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusPink), BlockInit.cropCactusPink, new ItemStack[]{new ItemStack(ItemInit.petalPink), new ItemStack(ItemInit.partsPink)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusGray), BlockInit.cropCactusGray, new ItemStack[]{new ItemStack(ItemInit.petalGray), new ItemStack(ItemInit.partsGray)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusLightGray), BlockInit.cropCactusLightGray, new ItemStack[]{new ItemStack(ItemInit.petalLightGray), new ItemStack(ItemInit.partsLightGray)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusCyan), BlockInit.cropCactusCyan, new ItemStack[]{new ItemStack(ItemInit.petalCyan), new ItemStack(ItemInit.partsCyan)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusPurple), BlockInit.cropCactusPurple, new ItemStack[]{new ItemStack(ItemInit.petalPurple), new ItemStack(ItemInit.partsPurple)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusBlue), BlockInit.cropCactusBlue, new ItemStack[]{new ItemStack(ItemInit.petalBlue), new ItemStack(ItemInit.partsBlue)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusBrown), BlockInit.cropCactusBrown, new ItemStack[]{new ItemStack(ItemInit.petalBrown), new ItemStack(ItemInit.partsBrown)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusGreen), BlockInit.cropCactusGreen, new ItemStack[]{new ItemStack(ItemInit.petalGreen), new ItemStack(ItemInit.partsGreen)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusRed), BlockInit.cropCactusRed, new ItemStack[]{new ItemStack(ItemInit.petalRed), new ItemStack(ItemInit.partsRed)}, BlockCropCactus.AGE, 5, 0),
            new FarmableAgingCrop(new ItemStack(ItemInit.seedCactusBlack), BlockInit.cropCactusBlack, new ItemStack[]{new ItemStack(ItemInit.petalBlack), new ItemStack(ItemInit.partsBlack)}, BlockCropCactus.AGE, 5, 0)
        );
    }
}