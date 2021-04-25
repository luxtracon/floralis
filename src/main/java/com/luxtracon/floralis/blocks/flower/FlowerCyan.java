package com.luxtracon.floralis.blocks.flower;

import com.luxtracon.floralis.base.FlowerBase;
import com.luxtracon.floralis.init.FlowerInit;
import com.luxtracon.floralis.init.ItemInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import net.minecraftforge.common.IShearable;

import java.util.Arrays;
import java.util.List;

public class FlowerCyan extends FlowerBase implements IShearable
{
    public FlowerCyan(String name)
    {
        super(name);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(ItemInit.seedFlowerCyan, 2 + fortune));
        drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        return Arrays.asList(new ItemStack(FlowerInit.flowerCyan));
    }
}