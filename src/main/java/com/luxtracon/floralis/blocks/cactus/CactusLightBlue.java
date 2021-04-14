package com.luxtracon.floralis.blocks.cactus;

import com.luxtracon.floralis.base.CactusBase;
import com.luxtracon.floralis.init.ItemInit;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CactusLightBlue extends CactusBase
{
    public CactusLightBlue(String name, Material material, float hardness, float resistance)
    {
        super(name, material, hardness, resistance);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(ItemInit.seedCactusLightBlue, 2 + fortune));
        drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
    }
}