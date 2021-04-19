package com.luxtracon.floralis.utilities;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockColor implements IBlockColor
{
    public static final IBlockColor blockColor = new BlockColor();

    @Override
    public int colorMultiplier(IBlockState state, IBlockAccess world, BlockPos pos, int tint)
    {
        return world.getBiome(pos).getGrassColorAtPos(pos);
    }
}