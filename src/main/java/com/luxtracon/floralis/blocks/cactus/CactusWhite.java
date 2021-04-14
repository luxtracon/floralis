package com.luxtracon.floralis.blocks.cactus;

import com.luxtracon.floralis.base.CactusBase;
import com.luxtracon.floralis.init.ItemInit;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CactusWhite extends CactusBase
{
    public CactusWhite(String name, Material material, float hardness, float resistance)
    {
        super(name, material, hardness, resistance);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(ItemInit.seedCactusWhite, 2 + fortune));
        drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
    }
}