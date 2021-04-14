package com.luxtracon.floralis.blocks.cropcactus;

import com.luxtracon.floralis.base.CactusCropBase;
import com.luxtracon.floralis.init.ItemInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CropCactusCyan extends CactusCropBase
{
    public CropCactusCyan(String name)
    {
        super(name);
    }

    @Override
    protected Item getSeed()
    {
        return ItemInit.seedCactusCyan;
    }

    @Override
    protected Item getCrop()
    {
        return ItemInit.petalCyan;
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