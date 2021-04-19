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
    private static IBlockState getStateBlackFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostBlack.getStateFromMeta(age);
    }

    private static IBlockState getStateBlueFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateBrownFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostBrown.getStateFromMeta(age);
    }

    private static IBlockState getStateCyanFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostCyan.getStateFromMeta(age);
    }

    private static IBlockState getStateGrayFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostGray.getStateFromMeta(age);
    }

    private static IBlockState getStateGreenFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostGreen.getStateFromMeta(age);
    }

    private static IBlockState getStateLightBlueFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostLightBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateLightGrayFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostLightGray.getStateFromMeta(age);
    }

    private static IBlockState getStateLimeFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostLime.getStateFromMeta(age);
    }

    private static IBlockState getStateMagentaFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostMagenta.getStateFromMeta(age);
    }

    private static IBlockState getStateOrangeFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostOrange.getStateFromMeta(age);
    }

    private static IBlockState getStatePinkFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostPink.getStateFromMeta(age);
    }

    private static IBlockState getStatePurpleFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostPurple.getStateFromMeta(age);
    }

    private static IBlockState getStateRedFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostRed.getStateFromMeta(age);
    }

    private static IBlockState getStateWhiteFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostWhite.getStateFromMeta(age);
    }

    private static IBlockState getStateYellowFlower(int age)
    {
        return GhostFlowerCropInit.cropFlowerGhostYellow.getStateFromMeta(age);
    }

    private static IBlockState getStateBlackCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostBlack.getStateFromMeta(age);
    }

    private static IBlockState getStateBlueCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateBrownCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostBrown.getStateFromMeta(age);
    }

    private static IBlockState getStateCyanCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostCyan.getStateFromMeta(age);
    }

    private static IBlockState getStateGrayCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostGray.getStateFromMeta(age);
    }

    private static IBlockState getStateGreenCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostGreen.getStateFromMeta(age);
    }

    private static IBlockState getStateLightBlueCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostLightBlue.getStateFromMeta(age);
    }

    private static IBlockState getStateLightGrayCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostLightGray.getStateFromMeta(age);
    }

    private static IBlockState getStateLimeCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostLime.getStateFromMeta(age);
    }

    private static IBlockState getStateMagentaCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostMagenta.getStateFromMeta(age);
    }

    private static IBlockState getStateOrangeCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostOrange.getStateFromMeta(age);
    }

    private static IBlockState getStatePinkCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostPink.getStateFromMeta(age);
    }

    private static IBlockState getStatePurpleCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostPurple.getStateFromMeta(age);
    }

    private static IBlockState getStateRedCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostRed.getStateFromMeta(age);
    }

    private static IBlockState getStateWhiteCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostWhite.getStateFromMeta(age);
    }

    private static IBlockState getStateYellowCactus(int age)
    {
        return GhostCactusCropInit.cropCactusGhostYellow.getStateFromMeta(age);
    }

    public static void init()
    {
        BelljarHandler.DefaultPlantHandler blackflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateBlackFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler blueflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateBlueFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler brownflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateBrownFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler cyanflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateCyanFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler grayflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateGrayFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler greenflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateGreenFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler lightblueflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateLightBlueFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler lightgrayflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateLightGrayFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler limeflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateLimeFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler magentaflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateMagentaFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler orangeflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateOrangeFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler pinkflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStatePinkFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler purpleflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStatePurpleFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler redflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateRedFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler whiteflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateWhiteFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler yellowflower = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateYellowFlower(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler blackcactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateBlackCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler bluecactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateBlueCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler browncactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateBrownCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler cyancactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateCyanCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler graycactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateGrayCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler greencactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateGreenCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler lightbluecactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateLightBlueCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler lightgraycactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateLightGrayCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler limecactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateLimeCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler magentacactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateMagentaCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler orangecactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateOrangeCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler pinkcactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStatePinkCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler purplecactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStatePurpleCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler redcactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateRedCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler whitecactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateWhiteCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.DefaultPlantHandler yellowcactus = new BelljarHandler.DefaultPlantHandler()
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

                return new IBlockState[]{getStateYellowCactus(age)};
            }

            @Override
            public float getRenderSize(ItemStack seed, ItemStack soil, float growth, TileEntity tile)
            {
                return 1.0f;
            }
        };

        BelljarHandler.registerHandler(blackflower);
        blackflower.register(new ItemStack(ItemInit.seedFlowerBlack), new ItemStack[]{new ItemStack(ItemInit.petalBlack, 1), new ItemStack(ItemInit.seedFlowerBlack, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostBlack.getDefaultState());

        BelljarHandler.registerHandler(blueflower);
        blueflower.register(new ItemStack(ItemInit.seedFlowerBlue), new ItemStack[]{new ItemStack(ItemInit.petalBlue, 1), new ItemStack(ItemInit.seedFlowerBlue, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostBlue.getDefaultState());

        BelljarHandler.registerHandler(brownflower);
        brownflower.register(new ItemStack(ItemInit.seedFlowerBrown), new ItemStack[]{new ItemStack(ItemInit.petalBrown, 1), new ItemStack(ItemInit.seedFlowerBrown, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostBrown.getDefaultState());

        BelljarHandler.registerHandler(cyanflower);
        cyanflower.register(new ItemStack(ItemInit.seedFlowerCyan), new ItemStack[]{new ItemStack(ItemInit.petalCyan, 1), new ItemStack(ItemInit.seedFlowerCyan, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostCyan.getDefaultState());

        BelljarHandler.registerHandler(grayflower);
        grayflower.register(new ItemStack(ItemInit.seedFlowerGray), new ItemStack[]{new ItemStack(ItemInit.petalGray, 1), new ItemStack(ItemInit.seedFlowerGray, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostGray.getDefaultState());

        BelljarHandler.registerHandler(greenflower);
        greenflower.register(new ItemStack(ItemInit.seedFlowerGreen), new ItemStack[]{new ItemStack(ItemInit.petalGreen, 1), new ItemStack(ItemInit.seedFlowerGreen, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostGreen.getDefaultState());

        BelljarHandler.registerHandler(lightblueflower);
        lightblueflower.register(new ItemStack(ItemInit.seedFlowerLightBlue), new ItemStack[]{new ItemStack(ItemInit.petalLightBlue, 1), new ItemStack(ItemInit.seedFlowerLightBlue, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostLightBlue.getDefaultState());

        BelljarHandler.registerHandler(lightgrayflower);
        lightgrayflower.register(new ItemStack(ItemInit.seedFlowerLightGray), new ItemStack[]{new ItemStack(ItemInit.petalLightGray, 1), new ItemStack(ItemInit.seedFlowerLightGray, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostLightGray.getDefaultState());

        BelljarHandler.registerHandler(limeflower);
        limeflower.register(new ItemStack(ItemInit.seedFlowerLime), new ItemStack[]{new ItemStack(ItemInit.petalLime, 1), new ItemStack(ItemInit.seedFlowerLime, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostLime.getDefaultState());

        BelljarHandler.registerHandler(magentaflower);
        magentaflower.register(new ItemStack(ItemInit.seedFlowerMagenta), new ItemStack[]{new ItemStack(ItemInit.petalMagenta, 1), new ItemStack(ItemInit.seedFlowerMagenta, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostMagenta.getDefaultState());

        BelljarHandler.registerHandler(orangeflower);
        orangeflower.register(new ItemStack(ItemInit.seedFlowerOrange), new ItemStack[]{new ItemStack(ItemInit.petalOrange, 1), new ItemStack(ItemInit.seedFlowerOrange, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostOrange.getDefaultState());

        BelljarHandler.registerHandler(pinkflower);
        pinkflower.register(new ItemStack(ItemInit.seedFlowerPink), new ItemStack[]{new ItemStack(ItemInit.petalPink, 1), new ItemStack(ItemInit.seedFlowerPink, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostPink.getDefaultState());

        BelljarHandler.registerHandler(purpleflower);
        purpleflower.register(new ItemStack(ItemInit.seedFlowerPurple), new ItemStack[]{new ItemStack(ItemInit.petalPurple, 1), new ItemStack(ItemInit.seedFlowerPurple, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostPurple.getDefaultState());

        BelljarHandler.registerHandler(redflower);
        redflower.register(new ItemStack(ItemInit.seedFlowerRed), new ItemStack[]{new ItemStack(ItemInit.petalRed, 1), new ItemStack(ItemInit.seedFlowerRed, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostRed.getDefaultState());

        BelljarHandler.registerHandler(whiteflower);
        whiteflower.register(new ItemStack(ItemInit.seedFlowerWhite), new ItemStack[]{new ItemStack(ItemInit.petalWhite, 1), new ItemStack(ItemInit.seedFlowerWhite, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostWhite.getDefaultState());

        BelljarHandler.registerHandler(yellowflower);
        yellowflower.register(new ItemStack(ItemInit.seedFlowerYellow), new ItemStack[]{new ItemStack(ItemInit.petalYellow, 1), new ItemStack(ItemInit.seedFlowerYellow, 1)}, new ItemStack(Blocks.DIRT), GhostFlowerCropInit.cropFlowerGhostYellow.getDefaultState());

        BelljarHandler.registerHandler(blackcactus);
        blackcactus.register(new ItemStack(ItemInit.seedCactusBlack), new ItemStack[]{new ItemStack(ItemInit.petalBlack, 1), new ItemStack(ItemInit.seedCactusBlack, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostBlack.getDefaultState());

        BelljarHandler.registerHandler(bluecactus);
        bluecactus.register(new ItemStack(ItemInit.seedCactusBlue), new ItemStack[]{new ItemStack(ItemInit.petalBlue, 1), new ItemStack(ItemInit.seedCactusBlue, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostBlue.getDefaultState());

        BelljarHandler.registerHandler(browncactus);
        browncactus.register(new ItemStack(ItemInit.seedCactusBrown), new ItemStack[]{new ItemStack(ItemInit.petalBrown, 1), new ItemStack(ItemInit.seedCactusBrown, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostBrown.getDefaultState());

        BelljarHandler.registerHandler(cyancactus);
        cyancactus.register(new ItemStack(ItemInit.seedCactusCyan), new ItemStack[]{new ItemStack(ItemInit.petalCyan, 1), new ItemStack(ItemInit.seedCactusCyan, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostCyan.getDefaultState());

        BelljarHandler.registerHandler(graycactus);
        graycactus.register(new ItemStack(ItemInit.seedCactusGray), new ItemStack[]{new ItemStack(ItemInit.petalGray, 1), new ItemStack(ItemInit.seedCactusGray, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostGray.getDefaultState());

        BelljarHandler.registerHandler(greencactus);
        greencactus.register(new ItemStack(ItemInit.seedCactusGreen), new ItemStack[]{new ItemStack(ItemInit.petalGreen, 1), new ItemStack(ItemInit.seedCactusGreen, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostGreen.getDefaultState());

        BelljarHandler.registerHandler(lightbluecactus);
        lightbluecactus.register(new ItemStack(ItemInit.seedCactusLightBlue), new ItemStack[]{new ItemStack(ItemInit.petalLightBlue, 1), new ItemStack(ItemInit.seedCactusLightBlue, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostLightBlue.getDefaultState());

        BelljarHandler.registerHandler(lightgraycactus);
        lightgraycactus.register(new ItemStack(ItemInit.seedCactusLightGray), new ItemStack[]{new ItemStack(ItemInit.petalLightGray, 1), new ItemStack(ItemInit.seedCactusLightGray, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostLightGray.getDefaultState());

        BelljarHandler.registerHandler(limecactus);
        limecactus.register(new ItemStack(ItemInit.seedCactusLime), new ItemStack[]{new ItemStack(ItemInit.petalLime, 1), new ItemStack(ItemInit.seedCactusLime, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostLime.getDefaultState());

        BelljarHandler.registerHandler(magentacactus);
        magentacactus.register(new ItemStack(ItemInit.seedCactusMagenta), new ItemStack[]{new ItemStack(ItemInit.petalMagenta, 1), new ItemStack(ItemInit.seedCactusMagenta, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostMagenta.getDefaultState());

        BelljarHandler.registerHandler(orangecactus);
        orangecactus.register(new ItemStack(ItemInit.seedCactusOrange), new ItemStack[]{new ItemStack(ItemInit.petalOrange, 1), new ItemStack(ItemInit.seedCactusOrange, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostOrange.getDefaultState());

        BelljarHandler.registerHandler(pinkcactus);
        pinkcactus.register(new ItemStack(ItemInit.seedCactusPink), new ItemStack[]{new ItemStack(ItemInit.petalPink, 1), new ItemStack(ItemInit.seedCactusPink, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostPink.getDefaultState());

        BelljarHandler.registerHandler(purplecactus);
        purplecactus.register(new ItemStack(ItemInit.seedCactusPurple), new ItemStack[]{new ItemStack(ItemInit.petalPurple, 1), new ItemStack(ItemInit.seedCactusPurple, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostPurple.getDefaultState());

        BelljarHandler.registerHandler(redcactus);
        redcactus.register(new ItemStack(ItemInit.seedCactusRed), new ItemStack[]{new ItemStack(ItemInit.petalRed, 1), new ItemStack(ItemInit.seedCactusRed, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostRed.getDefaultState());

        BelljarHandler.registerHandler(whitecactus);
        whitecactus.register(new ItemStack(ItemInit.seedCactusWhite), new ItemStack[]{new ItemStack(ItemInit.petalWhite, 1), new ItemStack(ItemInit.seedCactusWhite, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostWhite.getDefaultState());

        BelljarHandler.registerHandler(yellowcactus);
        yellowcactus.register(new ItemStack(ItemInit.seedCactusYellow), new ItemStack[]{new ItemStack(ItemInit.petalYellow, 1), new ItemStack(ItemInit.seedCactusYellow, 1)}, new ItemStack(Blocks.SAND), GhostCactusCropInit.cropCactusGhostYellow.getDefaultState());
    }
}