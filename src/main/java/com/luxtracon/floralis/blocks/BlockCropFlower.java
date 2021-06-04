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
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCropFlower extends BlockCrops
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);

    private static final AxisAlignedBB[] AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.3125D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.4375D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.5625D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.6875D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.8125D, 0.7235D), new AxisAlignedBB(0.2765D, -0.0625D, 0.2765D, 0.7235D, 0.9375D, 0.7235D)};

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

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return 300;
    }

    @Override
    protected int getAge(IBlockState state)
    {
        return state.getValue(this.getAgeProperty()).intValue();
    }

    @Override
    public int getMaxAge()
    {
        return 5;
    }

    @Override
    protected int getBonemealAgeIncrease(World world)
    {
        return MathHelper.getInt(world.rand, 1, 3);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        if(state.getBlock() == BlockInit.cropFlowerBlack && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBlack, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerBlack)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBlack, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlack, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlack, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerBlue && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBlue, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerBlue)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlue, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerBrown && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBrown, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerBrown)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBrown, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBrown, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBrown, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerCyan && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerCyan, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerCyan)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerCyan, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsCyan, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerGray && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerGray, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerGray)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGray, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerGreen && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerGreen, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerGreen)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerGreen, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGreen, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGreen, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerLightBlue && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLightBlue, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerLightBlue)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLightBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightBlue, 1 + fortune));}

        if(state.getBlock() == BlockInit.cropFlowerLightGray && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLightGray, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerLightGray)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLightGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightGray, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerLime && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLime, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerLime)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLime, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLime, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerMagenta && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerMagenta, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerMagenta)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerMagenta, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalMagenta, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsMagenta, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerOrange && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerOrange, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerOrange)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerOrange, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalOrange, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsOrange, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerPink && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerPink, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerPink)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerPink, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPink, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPink, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerPurple && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerPurple, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerPurple)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerPurple, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPurple, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPurple, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerRed && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerRed, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerRed)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerRed, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalRed, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsRed, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerWhite && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerWhite, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerWhite)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerWhite, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsWhite, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropFlowerYellow && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedFlowerYellow, 1));
        }

        else if(state.getBlock() == BlockInit.cropFlowerYellow)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerYellow, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalYellow, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsYellow, 1 + fortune));
        }
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB[state.getValue(this.getAgeProperty()).intValue()];
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, AGE);
    }

    @Override
    protected PropertyInteger getAgeProperty()
    {
        return AGE;
    }

    @Override
    public ItemStack getItem(World world, BlockPos pos, IBlockState state)
    {
        if(state.getBlock() == BlockInit.cropFlowerBlack)
        {
            return new ItemStack(ItemInit.seedFlowerBlack);
        }

        else if(state.getBlock() == BlockInit.cropFlowerBlue)
        {
            return new ItemStack(ItemInit.seedFlowerBlue);
        }

        else if(state.getBlock() == BlockInit.cropFlowerBrown)
        {
            return new ItemStack(ItemInit.seedFlowerBrown);
        }

        else if(state.getBlock() == BlockInit.cropFlowerCyan)
        {
            return new ItemStack(ItemInit.seedFlowerCyan);
        }

        else if(state.getBlock() == BlockInit.cropFlowerGray)
        {
            return new ItemStack(ItemInit.seedFlowerGray);
        }

        else if(state.getBlock() == BlockInit.cropFlowerGreen)
        {
            return new ItemStack(ItemInit.seedFlowerGreen);
        }

        else if(state.getBlock() == BlockInit.cropFlowerLightBlue)
        {
            return new ItemStack(ItemInit.seedFlowerLightBlue);
        }

        else if(state.getBlock() == BlockInit.cropFlowerLightGray)
        {
            return new ItemStack(ItemInit.seedFlowerLightGray);
        }

        else if(state.getBlock() == BlockInit.cropFlowerLime)
        {
            return new ItemStack(ItemInit.seedFlowerLime);
        }

        else if(state.getBlock() == BlockInit.cropFlowerMagenta)
        {
            return new ItemStack(ItemInit.seedFlowerMagenta);
        }

        else if(state.getBlock() == BlockInit.cropFlowerOrange)
        {
            return new ItemStack(ItemInit.seedFlowerOrange);
        }

        else if(state.getBlock() == BlockInit.cropFlowerPink)
        {
            return new ItemStack(ItemInit.seedFlowerPink);
        }

        else if(state.getBlock() == BlockInit.cropFlowerPurple)
        {
            return new ItemStack(ItemInit.seedFlowerPurple);
        }

        else if(state.getBlock() == BlockInit.cropFlowerRed)
        {
            return new ItemStack(ItemInit.seedFlowerRed);
        }

        else if(state.getBlock() == BlockInit.cropFlowerWhite)
        {
            return new ItemStack(ItemInit.seedFlowerWhite);
        }

        else if(state.getBlock() == BlockInit.cropFlowerYellow)
        {
            return new ItemStack(ItemInit.seedFlowerYellow);
        }

        return null;
    }
}