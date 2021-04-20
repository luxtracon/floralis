package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FlowerBase extends BlockBush
{
    private static final AxisAlignedBB AABB = new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 1.0D, 0.7235D);

    public FlowerBase(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.PLANT);
    }

    public boolean canBlockStay(World world, BlockPos pos)
    {
        return world.getBlockState(pos.down()).getBlock() == Blocks.DIRT || world.getBlockState(pos.down()).getBlock() == Blocks.GRASS;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos)
    {
        return super.canPlaceBlockAt(world, pos) ? this.canBlockStay(world, pos) : false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
    }

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return 300;
    }
}