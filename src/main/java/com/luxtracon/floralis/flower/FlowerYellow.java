package com.luxtracon.floralis.flower;

import com.luxtracon.floralis.base.BaseFlower;
import com.luxtracon.floralis.init.InitItem;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FlowerYellow extends BaseFlower
{
    public FlowerYellow(String name)
    {
        super(name);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(InitItem.petalYellow, RANDOM.nextInt(4)+3));
        drops.add(new ItemStack(InitItem.seedYellow, RANDOM.nextInt(2)+1));
    }
}