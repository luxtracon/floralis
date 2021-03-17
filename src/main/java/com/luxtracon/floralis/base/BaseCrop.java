package com.luxtracon.floralis.base;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BaseCrop extends BlockCrops
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);

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
        return ((Integer)state.getValue(this.getAgeProperty())).intValue();
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn)
    {
        return MathHelper.getInt(worldIn.rand, 1, 3);
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }
}