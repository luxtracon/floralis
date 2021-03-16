package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BaseFlower extends BlockBush
{
    public BaseFlower(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(SoundType.PLANT);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return super.getBoundingBox(state, source, pos).offset(state.getOffset(source, pos));
    }

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return 300;
    }
}