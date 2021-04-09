package com.luxtracon.floralis.compat;

import blusunrize.immersiveengineering.api.ComparableItemStack;
import blusunrize.immersiveengineering.api.tool.BelljarHandler;

import com.luxtracon.floralis.init.InitCrop;
import com.luxtracon.floralis.init.InitCropCactus;
import com.luxtracon.floralis.init.InitItem;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import java.util.HashSet;

public class ImmersiveEngineering
{
    private static IBlockState getStateBlackCrop(int age)
    {
        return InitCrop.cropBlack.getStateFromMeta(age);
    }

    private static IBlockState getStateBlueCrop(int age)
    {
        return InitCrop.cropBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateBrownCrop(int age)
    {
        return InitCrop.cropBrown.getStateFromMeta(age);
    }

    private static IBlockState getStateCyanCrop(int age)
    {
        return InitCrop.cropCyan.getStateFromMeta(age);
    }

    private static IBlockState getStateGrayCrop(int age)
    {
        return InitCrop.cropGray.getStateFromMeta(age);
    }

    private static IBlockState getStateGreenCrop(int age)
    {
        return InitCrop.cropGreen.getStateFromMeta(age);
    }

    private static IBlockState getStateLightBlueCrop(int age)
    {
        return InitCrop.cropLightBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateLightGrayCrop(int age)
    {
        return InitCrop.cropLightGray.getStateFromMeta(age);
    }

    private static IBlockState getStateLimeCrop(int age)
    {
        return InitCrop.cropLime.getStateFromMeta(age);
    }

    private static IBlockState getStateMagentaCrop(int age)
    {
        return InitCrop.cropMagenta.getStateFromMeta(age);
    }

    private static IBlockState getStateOrangeCrop(int age)
    {
        return InitCrop.cropOrange.getStateFromMeta(age);
    }

    private static IBlockState getStatePinkCrop(int age)
    {
        return InitCrop.cropPink.getStateFromMeta(age);
    }

    private static IBlockState getStatePurpleCrop(int age)
    {
        return InitCrop.cropPurple.getStateFromMeta(age);
    }

    private static IBlockState getStateRedCrop(int age)
    {
        return InitCrop.cropRed.getStateFromMeta(age);
    }

    private static IBlockState getStateWhiteCrop(int age)
    {
        return InitCrop.cropWhite.getStateFromMeta(age);
    }

    private static IBlockState getStateYellowCrop(int age)
    {
        return InitCrop.cropYellow.getStateFromMeta(age);
    }



    private static IBlockState getStateWhiteCactusCrop(int age)
    {
        return InitCropCactus.cropCactusWhite.getStateFromMeta(age);
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


        BelljarHandler.DefaultPlantHandler whitecactuscrop = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateWhiteCactusCrop(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.registerHandler(blackcrop);
        blackcrop.register(new ItemStack(InitItem.seedBlack), new ItemStack[]{new ItemStack(InitItem.petalBlack, 1), new ItemStack(InitItem.seedBlack, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropBlack.getDefaultState());

        BelljarHandler.registerHandler(bluecrop);
        bluecrop.register(new ItemStack(InitItem.seedBlue), new ItemStack[]{new ItemStack(InitItem.petalBlue, 1), new ItemStack(InitItem.seedBlue, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropBlue.getDefaultState());

        BelljarHandler.registerHandler(browncrop);
        browncrop.register(new ItemStack(InitItem.seedBrown), new ItemStack[]{new ItemStack(InitItem.petalBrown, 1), new ItemStack(InitItem.seedBrown, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropBrown.getDefaultState());

        BelljarHandler.registerHandler(cyancrop);
        cyancrop.register(new ItemStack(InitItem.seedCyan), new ItemStack[]{new ItemStack(InitItem.petalCyan, 1), new ItemStack(InitItem.seedCyan, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropCyan.getDefaultState());

        BelljarHandler.registerHandler(graycrop);
        graycrop.register(new ItemStack(InitItem.seedGray), new ItemStack[]{new ItemStack(InitItem.petalGray, 1), new ItemStack(InitItem.seedGray, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropGray.getDefaultState());

        BelljarHandler.registerHandler(greencrop);
        greencrop.register(new ItemStack(InitItem.seedGreen), new ItemStack[]{new ItemStack(InitItem.petalGreen, 1), new ItemStack(InitItem.seedGreen, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropGreen.getDefaultState());

        BelljarHandler.registerHandler(lightbluecrop);
        lightbluecrop.register(new ItemStack(InitItem.seedLightBlue), new ItemStack[]{new ItemStack(InitItem.petalLightBlue, 1), new ItemStack(InitItem.seedLightBlue, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropLightBlue.getDefaultState());

        BelljarHandler.registerHandler(lightgraycrop);
        lightgraycrop.register(new ItemStack(InitItem.seedLightGray), new ItemStack[]{new ItemStack(InitItem.petalLightGray, 1), new ItemStack(InitItem.seedLightGray, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropLightGray.getDefaultState());

        BelljarHandler.registerHandler(limecrop);
        limecrop.register(new ItemStack(InitItem.seedLime), new ItemStack[]{new ItemStack(InitItem.petalLime, 1), new ItemStack(InitItem.seedLime, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropLime.getDefaultState());

        BelljarHandler.registerHandler(magentacrop);
        magentacrop.register(new ItemStack(InitItem.seedMagenta), new ItemStack[]{new ItemStack(InitItem.petalMagenta, 1), new ItemStack(InitItem.seedMagenta, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropMagenta.getDefaultState());

        BelljarHandler.registerHandler(orangecrop);
        orangecrop.register(new ItemStack(InitItem.seedOrange), new ItemStack[]{new ItemStack(InitItem.petalOrange, 1), new ItemStack(InitItem.seedOrange, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropOrange.getDefaultState());

        BelljarHandler.registerHandler(pinkcrop);
        pinkcrop.register(new ItemStack(InitItem.seedPink), new ItemStack[]{new ItemStack(InitItem.petalPink, 1), new ItemStack(InitItem.seedPink, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropPink.getDefaultState());

        BelljarHandler.registerHandler(purplecrop);
        purplecrop.register(new ItemStack(InitItem.seedPurple), new ItemStack[]{new ItemStack(InitItem.petalPurple, 1), new ItemStack(InitItem.seedPurple, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropPurple.getDefaultState());

        BelljarHandler.registerHandler(redcrop);
        redcrop.register(new ItemStack(InitItem.seedRed), new ItemStack[]{new ItemStack(InitItem.petalRed, 1), new ItemStack(InitItem.seedRed, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropRed.getDefaultState());

        BelljarHandler.registerHandler(whitecrop);
        whitecrop.register(new ItemStack(InitItem.seedWhite), new ItemStack[]{new ItemStack(InitItem.petalWhite, 1), new ItemStack(InitItem.seedWhite, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropWhite.getDefaultState());

        BelljarHandler.registerHandler(yellowcrop);
        yellowcrop.register(new ItemStack(InitItem.seedYellow), new ItemStack[]{new ItemStack(InitItem.petalYellow, 1), new ItemStack(InitItem.seedYellow, 1)}, new ItemStack(Blocks.DIRT), InitCrop.cropYellow.getDefaultState());



        BelljarHandler.registerHandler(whitecactuscrop);
        whitecactuscrop.register(new ItemStack(InitItem.seedCactusWhite), new ItemStack[]{new ItemStack(InitItem.petalWhite, 1), new ItemStack(InitItem.seedWhite, 1)}, new ItemStack(Blocks.DIRT), InitCropCactus.cropCactusWhite.getDefaultState());

    }
}