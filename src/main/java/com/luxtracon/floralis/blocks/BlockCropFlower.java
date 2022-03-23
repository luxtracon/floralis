package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.IShearable;

import java.util.Collections;
import java.util.List;

public class BlockCropFlower extends BlockCrops implements IShearable
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);

    public static final AxisAlignedBB[] AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.3125D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.4375D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.5625D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.6875D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.8125D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.9375D, 0.7235D)};

    public BlockCropFlower(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(SoundType.PLANT);
    }

    @Override
    public boolean canBlockStay(World world, BlockPos pos, IBlockState state)
    {
        return (world.getLight(pos) >= 8 || world.canSeeSky(pos)) && world.getBlockState(pos.down()).getBlock() == Blocks.FARMLAND;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean canSilkHarvest()
    {
        return true;
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    @Override
    public int getAge(IBlockState state)
    {
        return state.getValue(this.getAgeProperty());
    }

    @Override
    public int getMaxAge()
    {
        return 5;
    }

    @Override
    public int getBonemealAgeIncrease(World world)
    {
        return MathHelper.getInt(world.rand, 1, 3);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        if(getAge(state) < getMaxAge())
        {
            if(state.getBlock() == BlockInit.cropFlowerBlack)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerBlack));
            }

            if(state.getBlock() == BlockInit.cropFlowerBlue)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerBlue));
            }

            if(state.getBlock() == BlockInit.cropFlowerBrown)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerBrown));
            }

            if(state.getBlock() == BlockInit.cropFlowerCyan)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerCyan));
            }

            if(state.getBlock() == BlockInit.cropFlowerGray)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerGray));
            }

            if(state.getBlock() == BlockInit.cropFlowerGreen)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerGreen));
            }

            if(state.getBlock() == BlockInit.cropFlowerLightBlue)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerLightBlue));
            }

            if(state.getBlock() == BlockInit.cropFlowerLightGray)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerLightGray));
            }

            if(state.getBlock() == BlockInit.cropFlowerLime)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerLime));
            }

            if(state.getBlock() == BlockInit.cropFlowerMagenta)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerMagenta));
            }

            if(state.getBlock() == BlockInit.cropFlowerOrange)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerOrange));
            }

            if(state.getBlock() == BlockInit.cropFlowerPink)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerPink));
            }

            if(state.getBlock() == BlockInit.cropFlowerPurple)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerPurple));
            }

            if(state.getBlock() == BlockInit.cropFlowerRed)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerRed));
            }

            if(state.getBlock() == BlockInit.cropFlowerWhite)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerWhite));
            }

            if(state.getBlock() == BlockInit.cropFlowerYellow)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerYellow));
            }
        }

        else
        {
            if(state.getBlock() == BlockInit.cropFlowerBlack)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerBlack, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalBlack, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsBlack, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerBlue)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerBlue, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalBlue, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsBlue, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerBrown)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerBrown, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalBrown, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsBrown, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerCyan)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerCyan, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsCyan, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerGray)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerGray, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalGray, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsGray, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerGreen)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerGreen, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalGreen, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsGreen, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerLightBlue)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerLightBlue, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsLightBlue, 1 + fortune));}

            if(state.getBlock() == BlockInit.cropFlowerLightGray)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerLightGray, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalLightGray, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsLightGray, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerLime)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerLime, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsLime, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerMagenta)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerMagenta, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalMagenta, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsMagenta, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerOrange)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerOrange, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalOrange, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsOrange, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerPink)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerPink, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalPink, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsPink, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerPurple)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerPurple, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalPurple, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsPurple, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerRed)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerRed, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalRed, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsRed, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerWhite)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerWhite, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsWhite, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropFlowerYellow)
            {
                drops.add(new ItemStack(ItemInit.seedFlowerYellow, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalYellow, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsYellow, 1 + fortune));
            }
        }
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB[state.getValue(this.getAgeProperty())];
    }

    @Override
    public BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, AGE);
    }

    @Override
    public ItemStack getItem(World world, BlockPos pos, IBlockState state)
    {
        if(state.getBlock() == BlockInit.cropFlowerBlack)
        {
            return new ItemStack(ItemInit.seedFlowerBlack);
        }

        if(state.getBlock() == BlockInit.cropFlowerBlue)
        {
            return new ItemStack(ItemInit.seedFlowerBlue);
        }

        if(state.getBlock() == BlockInit.cropFlowerBrown)
        {
            return new ItemStack(ItemInit.seedFlowerBrown);
        }

        if(state.getBlock() == BlockInit.cropFlowerCyan)
        {
            return new ItemStack(ItemInit.seedFlowerCyan);
        }

        if(state.getBlock() == BlockInit.cropFlowerGray)
        {
            return new ItemStack(ItemInit.seedFlowerGray);
        }

        if(state.getBlock() == BlockInit.cropFlowerGreen)
        {
            return new ItemStack(ItemInit.seedFlowerGreen);
        }

        if(state.getBlock() == BlockInit.cropFlowerLightBlue)
        {
            return new ItemStack(ItemInit.seedFlowerLightBlue);
        }

        if(state.getBlock() == BlockInit.cropFlowerLightGray)
        {
            return new ItemStack(ItemInit.seedFlowerLightGray);
        }

        if(state.getBlock() == BlockInit.cropFlowerLime)
        {
            return new ItemStack(ItemInit.seedFlowerLime);
        }

        if(state.getBlock() == BlockInit.cropFlowerMagenta)
        {
            return new ItemStack(ItemInit.seedFlowerMagenta);
        }

        if(state.getBlock() == BlockInit.cropFlowerOrange)
        {
            return new ItemStack(ItemInit.seedFlowerOrange);
        }

        if(state.getBlock() == BlockInit.cropFlowerPink)
        {
            return new ItemStack(ItemInit.seedFlowerPink);
        }

        if(state.getBlock() == BlockInit.cropFlowerPurple)
        {
            return new ItemStack(ItemInit.seedFlowerPurple);
        }

        if(state.getBlock() == BlockInit.cropFlowerRed)
        {
            return new ItemStack(ItemInit.seedFlowerRed);
        }

        if(state.getBlock() == BlockInit.cropFlowerWhite)
        {
            return new ItemStack(ItemInit.seedFlowerWhite);
        }

        if(state.getBlock() == BlockInit.cropFlowerYellow)
        {
            return new ItemStack(ItemInit.seedFlowerYellow);
        }

        return null;
    }
    
    @Override
    public ItemStack getSilkTouchDrop(IBlockState state)
    {
        if(getAge(state) == getMaxAge())
        {
            if(state.getBlock() == BlockInit.cropFlowerBlack)
            {
                return new ItemStack(BlockInit.flowerBlack);
            }

            if(state.getBlock() == BlockInit.cropFlowerBlue)
            {
                return new ItemStack(BlockInit.flowerBlue);
            }

            if(state.getBlock() == BlockInit.cropFlowerBrown)
            {
                return new ItemStack(BlockInit.flowerBrown);
            }

            if(state.getBlock() == BlockInit.cropFlowerCyan)
            {
                return new ItemStack(BlockInit.flowerCyan);
            }

            if(state.getBlock() == BlockInit.cropFlowerGray)
            {
                return new ItemStack(BlockInit.flowerGray);
            }

            if(state.getBlock() == BlockInit.cropFlowerGreen)
            {
                return new ItemStack(BlockInit.flowerGreen);
            }

            if(state.getBlock() == BlockInit.cropFlowerLightBlue)
            {
                return new ItemStack(BlockInit.flowerLightBlue);
            }

            if(state.getBlock() == BlockInit.cropFlowerLightGray)
            {
                return new ItemStack(BlockInit.flowerLightGray);
            }

            if(state.getBlock() == BlockInit.cropFlowerLime)
            {
                return new ItemStack(BlockInit.flowerLime);
            }

            if(state.getBlock() == BlockInit.cropFlowerMagenta)
            {
                return new ItemStack(BlockInit.flowerMagenta);
            }

            if(state.getBlock() == BlockInit.cropFlowerOrange)
            {
                return new ItemStack(BlockInit.flowerOrange);
            }

            if(state.getBlock() == BlockInit.cropFlowerPink)
            {
                return new ItemStack(BlockInit.flowerPink);
            }

            if(state.getBlock() == BlockInit.cropFlowerPurple)
            {
                return new ItemStack(BlockInit.flowerPurple);
            }

            if(state.getBlock() == BlockInit.cropFlowerRed)
            {
                return new ItemStack(BlockInit.flowerRed);
            }

            if(state.getBlock() == BlockInit.cropFlowerWhite)
            {
                return new ItemStack(BlockInit.flowerWhite);
            }

            if(state.getBlock() == BlockInit.cropFlowerYellow)
            {
                return new ItemStack(BlockInit.flowerYellow);
            }
        }

        else
        {
            if(state.getBlock() == BlockInit.cropFlowerBlack)
            {
                return new ItemStack(ItemInit.seedFlowerBlack);
            }

            if(state.getBlock() == BlockInit.cropFlowerBlue)
            {
                return new ItemStack(ItemInit.seedFlowerBlue);
            }

            if(state.getBlock() == BlockInit.cropFlowerBrown)
            {
                return new ItemStack(ItemInit.seedFlowerBrown);
            }

            if(state.getBlock() == BlockInit.cropFlowerCyan)
            {
                return new ItemStack(ItemInit.seedFlowerCyan);
            }

            if(state.getBlock() == BlockInit.cropFlowerGray)
            {
                return new ItemStack(ItemInit.seedFlowerGray);
            }

            if(state.getBlock() == BlockInit.cropFlowerGreen)
            {
                return new ItemStack(ItemInit.seedFlowerGreen);
            }

            if(state.getBlock() == BlockInit.cropFlowerLightBlue)
            {
                return new ItemStack(ItemInit.seedFlowerLightBlue);
            }

            if(state.getBlock() == BlockInit.cropFlowerLightGray)
            {
                return new ItemStack(ItemInit.seedFlowerLightGray);
            }

            if(state.getBlock() == BlockInit.cropFlowerLime)
            {
                return new ItemStack(ItemInit.seedFlowerLime);
            }

            if(state.getBlock() == BlockInit.cropFlowerMagenta)
            {
                return new ItemStack(ItemInit.seedFlowerMagenta);
            }

            if(state.getBlock() == BlockInit.cropFlowerOrange)
            {
                return new ItemStack(ItemInit.seedFlowerOrange);
            }

            if(state.getBlock() == BlockInit.cropFlowerPink)
            {
                return new ItemStack(ItemInit.seedFlowerPink);
            }

            if(state.getBlock() == BlockInit.cropFlowerPurple)
            {
                return new ItemStack(ItemInit.seedFlowerPurple);
            }

            if(state.getBlock() == BlockInit.cropFlowerRed)
            {
                return new ItemStack(ItemInit.seedFlowerRed);
            }

            if(state.getBlock() == BlockInit.cropFlowerWhite)
            {
                return new ItemStack(ItemInit.seedFlowerWhite);
            }

            if(state.getBlock() == BlockInit.cropFlowerYellow)
            {
                return new ItemStack(ItemInit.seedFlowerYellow);
            }
        }

        return new ItemStack(Blocks.AIR);
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);

        if(getAge(state) == getMaxAge())
        {
            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerBlack)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerBlack));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerBlue)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerBrown)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerBrown));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerCyan)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerCyan));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerGray)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerGreen)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerGreen));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerLightBlue)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerLightBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerLightGray)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerLightGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerLime)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerLime));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerMagenta)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerMagenta));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerOrange)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerOrange));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerPink)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerPink));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerPurple)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerPurple));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerRed)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerRed));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerWhite)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerWhite));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerYellow)
            {
                return Collections.singletonList(new ItemStack(BlockInit.flowerYellow));
            }
        }

        else
        {
            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerBlack)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerBlack));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerBlue)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerBrown)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerBrown));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerCyan)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerCyan));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerGray)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerGreen)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerGreen));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerLightBlue)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerLightBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerLightGray)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerLightGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerLime)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerLime));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerMagenta)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerMagenta));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerOrange)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerOrange));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerPink)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerPink));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerPurple)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerPurple));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerRed)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerRed));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerWhite)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerWhite));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropFlowerYellow)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedFlowerYellow));
            }
        }

        return Collections.singletonList(new ItemStack(Blocks.AIR));
    }

    @Override
    public PropertyInteger getAgeProperty()
    {
        return AGE;
    }
}