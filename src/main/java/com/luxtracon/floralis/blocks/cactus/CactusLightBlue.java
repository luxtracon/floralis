package com.luxtracon.floralis.blocks.cactus;

import com.luxtracon.floralis.base.CactusBase;
import com.luxtracon.floralis.init.CactusInit;
import com.luxtracon.floralis.init.ItemInit;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import net.minecraftforge.common.IShearable;

import java.util.Arrays;
import java.util.List;

public class CactusLightBlue extends CactusBase implements IShearable
{
    public CactusLightBlue(String name, Material material)
    {
        super(name, material);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(ItemInit.seedCactusLightBlue, 2 + fortune));
        drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        return Arrays.asList(new ItemStack(CactusInit.cactusLightBlue));
    }
}