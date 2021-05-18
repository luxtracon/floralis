package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.IShearable;

import java.util.Arrays;
import java.util.List;

public class BlockPlantFlower extends BlockBush implements IShearable
{
    private static final AxisAlignedBB AABB = new AxisAlignedBB(0.2765D, 0.0D, 0.2765D, 0.7235D, 1.0D, 0.7235D);

    public BlockPlantFlower(String name)
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
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        if(state.getBlock() == BlockInit.flowerBlack)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBlack, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlack, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlack, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerBlue)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlue, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerBrown)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerBrown, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBrown, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBrown, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerCyan)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerCyan, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsCyan, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerGray)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGray, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerGreen)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerGreen, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGreen, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGreen, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerLightBlue)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLightBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightBlue, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerLightGray)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLightGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightGray, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerLime)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerLime, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLime, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerMagenta)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerMagenta, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalMagenta, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsMagenta, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerOrange)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerOrange, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalOrange, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsOrange, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerPink)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerPink, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPink, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPink, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerPurple)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerPurple, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPurple, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPurple, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerRed)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerRed, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalRed, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsRed, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerWhite)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerWhite, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsWhite, 1 + fortune));
        }

        else if(state.getBlock() == BlockInit.flowerYellow)
        {
            drops.add(new ItemStack(ItemInit.seedFlowerYellow, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalYellow, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsYellow, 1 + fortune));
        }
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        if(world.getBlockState(pos).getBlock() == BlockInit.flowerBlack)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerBlack));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerBlue)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerBlue));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerBrown)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerBrown));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerCyan)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerCyan));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerGray)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerGray));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerGreen)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerGreen));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerLightBlue)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerLightBlue));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerLightGray)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerLightGray));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerLime)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerLime));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerMagenta)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerMagenta));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerOrange)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerOrange));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerPink)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerPink));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerPurple)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerPurple));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerRed)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerRed));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerWhite)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerWhite));
        }

        else if(world.getBlockState(pos).getBlock() == BlockInit.flowerYellow)
        {
            return Arrays.asList(new ItemStack(BlockInit.flowerYellow));
        }

        return null;
    }
}