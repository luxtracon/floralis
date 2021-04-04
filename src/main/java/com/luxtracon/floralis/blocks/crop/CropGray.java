package com.luxtracon.floralis.blocks.crop;

import com.luxtracon.floralis.base.BaseCrop;
import com.luxtracon.floralis.init.InitItem;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CropGray extends BaseCrop
{
    public CropGray(String name)
    {
        super(name);
    }

    @Override
    protected Item getSeed()
    {
        return InitItem.seedGray;
    }

    @Override
    protected Item getCrop()
    {
        return InitItem.petalGray;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        if (getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(this.getSeed(), 1));
        }

        else
        {
            drops.add(new ItemStack(this.getSeed(), 2 + fortune));
            drops.add(new ItemStack(this.getCrop(), 1 + fortune));
        }
    }
}