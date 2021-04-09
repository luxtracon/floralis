package com.luxtracon.floralis.base;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BaseCropCactus extends BlockCrops
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);

    private static final AxisAlignedBB[] AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.125D, 0.5625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)};
    private static final AxisAlignedBB[] COLLISIONAABB = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.125D, 0.5625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)};


    public BaseCropCactus(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(SoundType.PLANT);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB[state.getValue(this.getAgeProperty()).intValue()];
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return COLLISIONAABB[state.getValue(this.getAgeProperty()).intValue()];
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

    /*@Override
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.SAND;
    }*/



    @Override
    public boolean canBlockStay(World world, BlockPos pos, IBlockState state)
    {
        return (world.getLight(pos) >= 8 || world.canSeeSky(pos)) && world.getBlockState(pos.down()).getBlock() == Blocks.SAND;
    }



    @Override
    public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity)
    {
        entity.attackEntityFrom(DamageSource.CACTUS, 1.0F);
    }
}