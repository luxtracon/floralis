package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class CactusBase extends Block implements IPlantable
{
    protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);
    protected static final AxisAlignedBB COLLISIONAABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);

    public CactusBase(String name, Material material, float hardness, float resistance)
    {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.PLANT);
    }

    public boolean canBlockStay(World world, BlockPos pos)
    {
        return world.getBlockState(pos.down()).getBlock() == Blocks.SAND && !world.getBlockState(pos.up()).getMaterial().isLiquid();
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos fromPos)
    {
        if (!this.canBlockStay(world, pos))
        {
            world.destroyBlock(pos, true);
        }
    }

    @Override
    public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity)
    {
        if(Config.cactidamage)
        {
            entity.attackEntityFrom(DamageSource.CACTUS, 1.0F);
        }
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
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return COLLISIONAABB;
    }

    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess source, BlockPos pos)
    {
        return EnumPlantType.Desert;
    }

    @Override
    public IBlockState getPlant(IBlockAccess source, BlockPos pos)
    {
        return this.getDefaultState();
    }
}