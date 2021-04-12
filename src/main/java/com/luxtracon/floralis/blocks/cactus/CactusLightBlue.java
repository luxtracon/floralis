package com.luxtracon.floralis.blocks.cactus;

import com.luxtracon.floralis.base.BaseCactus;
import com.luxtracon.floralis.init.InitItem;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CactusLightBlue extends BaseCactus
{
    public CactusLightBlue(String name, Material material, float hardness, float resistance)
    {
        super(name, material, hardness, resistance);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(InitItem.seedCactusLightBlue, 2 + fortune));
        drops.add(new ItemStack(InitItem.petalLightBlue, 1 + fortune));
    }
}