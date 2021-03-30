package com.luxtracon.floralis.base;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BaseCrop extends BlockCrops
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);
    private static final AxisAlignedBB[] AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 0.375D, 0.7235D), new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 0.5D, 0.7235D), new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 0.625D, 0.7235D), new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 0.75D, 0.7235D), new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 0.875D, 0.7235D), new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 1.0D, 0.7235D)};

    public BaseCrop(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(SoundType.PLANT);
    }

    @Override
    protected PropertyInteger getAgeProperty()
    {
        return AGE;
    }

    @Override
    public int getMaxAge()
    {
        return 5;
    }

    @Override
    protected int getAge(IBlockState state)
    {
        return state.getValue(this.getAgeProperty()).intValue();
    }

    @Override
    protected int getBonemealAgeIncrease(World world)
    {
        return MathHelper.getInt(world.rand, 1, 3);
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, AGE);
    }

    @Override
    public boolean canBlockStay(World world, BlockPos pos, IBlockState state)
    {
        IBlockState soil = world.getBlockState(pos.down());
        return (world.getLight(pos) >= 8 || world.canSeeSky(pos)) && soil.getBlock() == Blocks.FARMLAND;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB[state.getValue(this.getAgeProperty()).intValue()];
    }
}