package com.luxtracon.floralis.blocks.flower;

import com.luxtracon.floralis.base.BaseFlower;
import com.luxtracon.floralis.init.InitFlower;
import com.luxtracon.floralis.init.InitItem;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

import java.util.List;

public class FlowerGreen extends BaseFlower implements IShearable
{
    public FlowerGreen(String name)
    {
        super(name);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(InitItem.petalGreen, RANDOM.nextInt(2) + 1 + fortune));
        drops.add(new ItemStack(InitItem.seedGreen, RANDOM.nextInt(2) + 1 + fortune));
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        return java.util.Arrays.asList(new ItemStack(InitFlower.flowerGreen));
    }
}