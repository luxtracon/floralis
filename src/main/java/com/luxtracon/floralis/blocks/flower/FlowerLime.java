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

public class FlowerLime extends FlowerBase implements IShearable
{
    public FlowerLime(String name)
    {
        super(name);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(ItemInit.seedFlowerLime, 2 + fortune));
        drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        return Arrays.asList(new ItemStack(FlowerInit.flowerLime));
    }
}