package com.luxtracon.floralis.compat;

import blusunrize.immersiveengineering.api.ComparableItemStack;
import blusunrize.immersiveengineering.api.tool.BelljarHandler;

import com.luxtracon.floralis.init.*;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import java.util.HashSet;

public class ImmersiveEngineering
{
    private static IBlockState getStateBlackCrop(int age)
    {
        return InitCropFlower.cropFlowerBlack.getStateFromMeta(age);
    }

    private static IBlockState getStateBlueCrop(int age)
    {
        return InitCropFlower.cropFlowerBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateBrownCrop(int age)
    {
        return InitCropFlower.cropFlowerBrown.getStateFromMeta(age);
    }

    private static IBlockState getStateCyanCrop(int age)
    {
        return InitCropFlower.cropFlowerCyan.getStateFromMeta(age);
    }

    private static IBlockState getStateGrayCrop(int age)
    {
        return InitCropFlower.cropFlowerGray.getStateFromMeta(age);
    }

    private static IBlockState getStateGreenCrop(int age)
    {
        return InitCropFlower.cropFlowerGreen.getStateFromMeta(age);
    }

    private static IBlockState getStateLightBlueCrop(int age)
    {
        return InitCropFlower.cropFlowerLightBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateLightGrayCrop(int age)
    {
        return InitCropFlower.cropFlowerLightGray.getStateFromMeta(age);
    }

    private static IBlockState getStateLimeCrop(int age)
    {
        return InitCropFlower.cropFlowerLime.getStateFromMeta(age);
    }

    private static IBlockState getStateMagentaCrop(int age)
    {
        return InitCropFlower.cropFlowerMagenta.getStateFromMeta(age);
    }

    private static IBlockState getStateOrangeCrop(int age)
    {
        return InitCropFlower.cropFlowerOrange.getStateFromMeta(age);
    }

    private static IBlockState getStatePinkCrop(int age)
    {
        return InitCropFlower.cropFlowerPink.getStateFromMeta(age);
    }

    private static IBlockState getStatePurpleCrop(int age)
    {
        return InitCropFlower.cropFlowerPurple.getStateFromMeta(age);
    }

    private static IBlockState getStateRedCrop(int age)
    {
        return InitCropFlower.cropFlowerRed.getStateFromMeta(age);
    }

    private static IBlockState getStateWhiteCrop(int age)
    {
        return InitCropFlower.cropFlowerWhite.getStateFromMeta(age);
    }

    private static IBlockState getStateYellowCrop(int age)
    {
        return InitCropFlower.cropFlowerYellow.getStateFromMeta(age);
    }

    public static void init()
    {
        BelljarHandler.DefaultPlantHandler blackcrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateBlackCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler bluecrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateBlueCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler browncrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateBrownCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler cyancrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateCyanCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler graycrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateGrayCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler greencrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateGreenCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler lightbluecrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateLightBlueCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler lightgraycrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateLightGrayCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler limecrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateLimeCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler magentacrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateMagentaCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler orangecrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateOrangeCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler pinkcrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStatePinkCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler purplecrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStatePurpleCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler redcrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateRedCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler whitecrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateWhiteCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler yellowcrop = new BelljarHandler.DefaultPlantHandler()
        {
            private HashSet<ComparableItemStack> validSeeds = new HashSet<>();

            @Override
            protected HashSet<ComparableItemStack> getSeedSet()
            {
                return validSeeds;
            }

            @Override
            public IBlockState[] getRenderedPlant(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                int age = Math.min(5, Math.round(growth*5));

                return new IBlockState[]{getStateYellowCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.registerHandler(blackcrop);
        blackcrop.register(new ItemStack(InitItem.seedFlowerBlack), new ItemStack[]{new ItemStack(InitItem.petalBlack, 1), new ItemStack(InitItem.seedFlowerBlack, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerBlack.getDefaultState());

        BelljarHandler.registerHandler(bluecrop);
        bluecrop.register(new ItemStack(InitItem.seedFlowerBlue), new ItemStack[]{new ItemStack(InitItem.petalBlue, 1), new ItemStack(InitItem.seedFlowerBlue, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerBlue.getDefaultState());

        BelljarHandler.registerHandler(browncrop);
        browncrop.register(new ItemStack(InitItem.seedFlowerBrown), new ItemStack[]{new ItemStack(InitItem.petalBrown, 1), new ItemStack(InitItem.seedFlowerBrown, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerBrown.getDefaultState());

        BelljarHandler.registerHandler(cyancrop);
        cyancrop.register(new ItemStack(InitItem.seedFlowerCyan), new ItemStack[]{new ItemStack(InitItem.petalCyan, 1), new ItemStack(InitItem.seedFlowerCyan, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerCyan.getDefaultState());

        BelljarHandler.registerHandler(graycrop);
        graycrop.register(new ItemStack(InitItem.seedFlowerGray), new ItemStack[]{new ItemStack(InitItem.petalGray, 1), new ItemStack(InitItem.seedFlowerGray, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerGray.getDefaultState());

        BelljarHandler.registerHandler(greencrop);
        greencrop.register(new ItemStack(InitItem.seedFlowerGreen), new ItemStack[]{new ItemStack(InitItem.petalGreen, 1), new ItemStack(InitItem.seedFlowerGreen, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerGreen.getDefaultState());

        BelljarHandler.registerHandler(lightbluecrop);
        lightbluecrop.register(new ItemStack(InitItem.seedFlowerLightBlue), new ItemStack[]{new ItemStack(InitItem.petalLightBlue, 1), new ItemStack(InitItem.seedFlowerLightBlue, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerLightBlue.getDefaultState());

        BelljarHandler.registerHandler(lightgraycrop);
        lightgraycrop.register(new ItemStack(InitItem.seedFlowerLightGray), new ItemStack[]{new ItemStack(InitItem.petalLightGray, 1), new ItemStack(InitItem.seedFlowerLightGray, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerLightGray.getDefaultState());

        BelljarHandler.registerHandler(limecrop);
        limecrop.register(new ItemStack(InitItem.seedFlowerLime), new ItemStack[]{new ItemStack(InitItem.petalLime, 1), new ItemStack(InitItem.seedFlowerLime, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerLime.getDefaultState());

        BelljarHandler.registerHandler(magentacrop);
        magentacrop.register(new ItemStack(InitItem.seedFlowerMagenta), new ItemStack[]{new ItemStack(InitItem.petalMagenta, 1), new ItemStack(InitItem.seedFlowerMagenta, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerBlack.getDefaultState());

        BelljarHandler.registerHandler(orangecrop);
        orangecrop.register(new ItemStack(InitItem.seedFlowerOrange), new ItemStack[]{new ItemStack(InitItem.petalOrange, 1), new ItemStack(InitItem.seedFlowerOrange, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerOrange.getDefaultState());

        BelljarHandler.registerHandler(pinkcrop);
        pinkcrop.register(new ItemStack(InitItem.seedFlowerPink), new ItemStack[]{new ItemStack(InitItem.petalPink, 1), new ItemStack(InitItem.seedFlowerPink, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerPink.getDefaultState());

        BelljarHandler.registerHandler(purplecrop);
        purplecrop.register(new ItemStack(InitItem.seedFlowerPurple), new ItemStack[]{new ItemStack(InitItem.petalPurple, 1), new ItemStack(InitItem.seedFlowerPurple, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerPurple.getDefaultState());

        BelljarHandler.registerHandler(redcrop);
        redcrop.register(new ItemStack(InitItem.seedFlowerRed), new ItemStack[]{new ItemStack(InitItem.petalRed, 1), new ItemStack(InitItem.seedFlowerRed, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerRed.getDefaultState());

        BelljarHandler.registerHandler(whitecrop);
        whitecrop.register(new ItemStack(InitItem.seedFlowerWhite), new ItemStack[]{new ItemStack(InitItem.petalWhite, 1), new ItemStack(InitItem.seedFlowerWhite, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerWhite.getDefaultState());

        BelljarHandler.registerHandler(yellowcrop);
        yellowcrop.register(new ItemStack(InitItem.seedFlowerYellow), new ItemStack[]{new ItemStack(InitItem.petalYellow, 1), new ItemStack(InitItem.seedFlowerYellow, 1)}, new ItemStack(Blocks.DIRT), InitCropFlower.cropFlowerYellow.getDefaultState());
    }
}