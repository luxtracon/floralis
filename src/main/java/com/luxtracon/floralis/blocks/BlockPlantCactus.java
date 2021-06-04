package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.IShearable;

import java.util.Arrays;
import java.util.List;

public class BlockPlantCactus extends Block implements IPlantable, IShearable
{
    protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);
    protected static final AxisAlignedBB COLLISIONAABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);

    public BlockPlantCactus(String name, Material material)
    {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.PLANT);
    }

    public boolean canBlockStay(World world, BlockPos pos)
    {
        boolean up = world.getBlockState(pos.up()).getMaterial().isLiquid();
        boolean north = world.getBlockState(pos.north()).getMaterial().isLiquid();
        boolean south = world.getBlockState(pos.south()).getMaterial().isLiquid();
        boolean east = world.getBlockState(pos.east()).getMaterial().isLiquid();
        boolean west = world.getBlockState(pos.west()).getMaterial().isLiquid();

        return world.getBlockState(pos.down()).getBlock() == Blocks.SAND && !up && !north && !south && !east && !west;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos)
    {
        return super.canPlaceBlockAt(world, pos) ? this.canBlockStay(world, pos) : false;
    }

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return 300;
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
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
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        if(state.getBlock() == BlockInit.cactusBlack)
        {
            drops.add(new ItemStack(ItemInit.seedCactusBlack, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlack, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlack, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusBlue)
        {
            drops.add(new ItemStack(ItemInit.seedCactusBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlue, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusBrown)
        {
            drops.add(new ItemStack(ItemInit.seedCactusBrown, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBrown, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBrown, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusCyan)
        {
            drops.add(new ItemStack(ItemInit.seedCactusCyan, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsCyan, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusGray)
        {
            drops.add(new ItemStack(ItemInit.seedCactusGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGray, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusGreen)
        {
            drops.add(new ItemStack(ItemInit.seedCactusGreen, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGreen, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGreen, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusLightBlue)
        {
            drops.add(new ItemStack(ItemInit.seedCactusLightBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightBlue, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusLightGray)
        {
            drops.add(new ItemStack(ItemInit.seedCactusLightGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightGray, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusLime)
        {
            drops.add(new ItemStack(ItemInit.seedCactusLime, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLime, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusMagenta)
        {
            drops.add(new ItemStack(ItemInit.seedCactusMagenta, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalMagenta, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsMagenta, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusOrange)
        {
            drops.add(new ItemStack(ItemInit.seedCactusOrange, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalOrange, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsOrange, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusPink)
        {
            drops.add(new ItemStack(ItemInit.seedCactusPink, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPink, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPink, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusPurple)
        {
            drops.add(new ItemStack(ItemInit.seedCactusPurple, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPurple, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPurple, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusRed)
        {
            drops.add(new ItemStack(ItemInit.seedCactusRed, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalRed, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsRed, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusWhite)
        {
            drops.add(new ItemStack(ItemInit.seedCactusWhite, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsWhite, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.cactusYellow)
        {
            drops.add(new ItemStack(ItemInit.seedCactusYellow, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalYellow, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsYellow, 1 + fortune));
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos fromPos)
    {
        if (!this.canBlockStay(world, pos))
        {
            world.destroyBlock(pos, true);
        }
    }

    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess source, BlockPos pos)
    {
        return EnumPlantType.Desert;
    }

    @Override
    public IBlockState getPlant(IBlockAccess source, BlockPos pos)
    {
        return null;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        if(world.getBlockState(pos).getBlock() == BlockInit.cactusBlack)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusBlack));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusBlue)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusBlue));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusBrown)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusBrown));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusCyan)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusCyan));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusGray)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusGray));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusGreen)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusGreen));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusLightBlue)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusLightBlue));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusLightGray)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusLightGray));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusLime)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusLime));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusMagenta)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusMagenta));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusOrange)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusOrange));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusPink)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusPink));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusPurple)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusPurple));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusRed)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusRed));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusWhite)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusWhite));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.cactusYellow)
        {
            return Arrays.asList(new ItemStack(BlockInit.cactusYellow));
        }

        return null;
    }

    @SuppressWarnings("deprecation")
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
    }

    @SuppressWarnings("deprecation")
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return COLLISIONAABB;
    }
}