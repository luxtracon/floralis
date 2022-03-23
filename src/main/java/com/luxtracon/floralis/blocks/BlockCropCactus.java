package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.IShearable;

import java.util.Collections;
import java.util.List;

public class BlockCropCactus extends BlockCrops implements IShearable
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);

    public static final AxisAlignedBB[] AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.125D, 0.5625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)};
    public static final AxisAlignedBB[] COLLISIONAABB = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.125D, 0.5625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)};

    public BlockCropCactus(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(SoundType.PLANT);
    }

    @Override
    public boolean canBlockStay(World world, BlockPos pos, IBlockState state)
    {
        return (world.getLight(pos) >= 8 || world.canSeeSky(pos)) && world.getBlockState(pos.down()).getBlock() == Blocks.SAND;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean canSilkHarvest()
    {
        return true;
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    @Override
    public int getAge(IBlockState state)
    {
        return state.getValue(this.getAgeProperty());
    }

    @Override
    public int getMaxAge()
    {
        return 5;
    }

    @Override
    public int getBonemealAgeIncrease(World world)
    {
        return MathHelper.getInt(world.rand, 1, 3);
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
        if(getAge(state) < getMaxAge())
        {
            if(state.getBlock() == BlockInit.cropCactusBlack)
            {
                drops.add(new ItemStack(ItemInit.seedCactusBlack));
            }

            if(state.getBlock() == BlockInit.cropCactusBlue)
            {
                drops.add(new ItemStack(ItemInit.seedCactusBlue));
            }

            if(state.getBlock() == BlockInit.cropCactusBrown)
            {
                drops.add(new ItemStack(ItemInit.seedCactusBrown));
            }

            if(state.getBlock() == BlockInit.cropCactusCyan)
            {
                drops.add(new ItemStack(ItemInit.seedCactusCyan));
            }

            if(state.getBlock() == BlockInit.cropCactusGray)
            {
                drops.add(new ItemStack(ItemInit.seedCactusGray));
            }

            if(state.getBlock() == BlockInit.cropCactusGreen)
            {
                drops.add(new ItemStack(ItemInit.seedCactusGreen));
            }

            if(state.getBlock() == BlockInit.cropCactusLightBlue)
            {
                drops.add(new ItemStack(ItemInit.seedCactusLightBlue));
            }

            if(state.getBlock() == BlockInit.cropCactusLightGray)
            {
                drops.add(new ItemStack(ItemInit.seedCactusLightGray));
            }

            if(state.getBlock() == BlockInit.cropCactusLime)
            {
                drops.add(new ItemStack(ItemInit.seedCactusLime));
            }

            if(state.getBlock() == BlockInit.cropCactusMagenta)
            {
                drops.add(new ItemStack(ItemInit.seedCactusMagenta));
            }

            if(state.getBlock() == BlockInit.cropCactusOrange)
            {
                drops.add(new ItemStack(ItemInit.seedCactusOrange));
            }

            if(state.getBlock() == BlockInit.cropCactusPink)
            {
                drops.add(new ItemStack(ItemInit.seedCactusPink));
            }

            if(state.getBlock() == BlockInit.cropCactusPurple)
            {
                drops.add(new ItemStack(ItemInit.seedCactusPurple));
            }

            if(state.getBlock() == BlockInit.cropCactusRed)
            {
                drops.add(new ItemStack(ItemInit.seedCactusRed));
            }

            if(state.getBlock() == BlockInit.cropCactusWhite)
            {
                drops.add(new ItemStack(ItemInit.seedCactusWhite));
            }

            if(state.getBlock() == BlockInit.cropCactusYellow)
            {
                drops.add(new ItemStack(ItemInit.seedCactusYellow));
            }
        }

        else
        {
            if(state.getBlock() == BlockInit.cropCactusBlack)
            {
                drops.add(new ItemStack(ItemInit.seedCactusBlack, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalBlack, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsBlack, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusBlue)
            {
                drops.add(new ItemStack(ItemInit.seedCactusBlue, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalBlue, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsBlue, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusBrown)
            {
                drops.add(new ItemStack(ItemInit.seedCactusBrown, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalBrown, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsBrown, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusCyan)
            {
                drops.add(new ItemStack(ItemInit.seedCactusCyan, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsCyan, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusGray)
            {
                drops.add(new ItemStack(ItemInit.seedCactusGray, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalGray, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsGray, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusGreen)
            {
                drops.add(new ItemStack(ItemInit.seedCactusGreen, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalGreen, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsGreen, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusLightBlue)
            {
                drops.add(new ItemStack(ItemInit.seedCactusLightBlue, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsLightBlue, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusLightGray)
            {
                drops.add(new ItemStack(ItemInit.seedCactusLightGray, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalLightGray, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsLightGray, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusLime)
            {
                drops.add(new ItemStack(ItemInit.seedCactusLime, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsLime, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusMagenta)
            {
                drops.add(new ItemStack(ItemInit.seedCactusMagenta, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalMagenta, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsMagenta, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusOrange)
            {
                drops.add(new ItemStack(ItemInit.seedCactusOrange, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalOrange, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsOrange, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusPink)
            {
                drops.add(new ItemStack(ItemInit.seedCactusPink, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalPink, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsPink, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusPurple)
            {
                drops.add(new ItemStack(ItemInit.seedCactusPurple, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalPurple, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsPurple, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusRed)
            {
                drops.add(new ItemStack(ItemInit.seedCactusRed, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalRed, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsRed, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusWhite)
            {
                drops.add(new ItemStack(ItemInit.seedCactusWhite, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsWhite, 1 + fortune));
            }

            if(state.getBlock() == BlockInit.cropCactusYellow)
            {
                drops.add(new ItemStack(ItemInit.seedCactusYellow, 2 + fortune));
                drops.add(new ItemStack(ItemInit.petalYellow, 1 + fortune));
                drops.add(new ItemStack(ItemInit.partsYellow, 1 + fortune));
            }
        }
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB[state.getValue(this.getAgeProperty())];
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return COLLISIONAABB[state.getValue(this.getAgeProperty())];
    }

    @Override
    public BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, AGE);
    }

    @Override
    public ItemStack getItem(World world, BlockPos pos, IBlockState state)
    {
        if(state.getBlock() == BlockInit.cropCactusBlack)
        {
            return new ItemStack(ItemInit.seedCactusBlack);
        }

        if(state.getBlock() == BlockInit.cropCactusBlue)
        {
            return new ItemStack(ItemInit.seedCactusBlue);
        }

        if(state.getBlock() == BlockInit.cropCactusBrown)
        {
            return new ItemStack(ItemInit.seedCactusBrown);
        }

        if(state.getBlock() == BlockInit.cropCactusCyan)
        {
            return new ItemStack(ItemInit.seedCactusCyan);
        }

        if(state.getBlock() == BlockInit.cropCactusGray)
        {
            return new ItemStack(ItemInit.seedCactusGray);
        }

        if(state.getBlock() == BlockInit.cropCactusGreen)
        {
            return new ItemStack(ItemInit.seedCactusGreen);
        }

        if(state.getBlock() == BlockInit.cropCactusLightBlue)
        {
            return new ItemStack(ItemInit.seedCactusLightBlue);
        }

        if(state.getBlock() == BlockInit.cropCactusLightGray)
        {
            return new ItemStack(ItemInit.seedCactusLightGray);
        }

        if(state.getBlock() == BlockInit.cropCactusLime)
        {
            return new ItemStack(ItemInit.seedCactusLime);
        }

        if(state.getBlock() == BlockInit.cropCactusMagenta)
        {
            return new ItemStack(ItemInit.seedCactusMagenta);
        }

        if(state.getBlock() == BlockInit.cropCactusOrange)
        {
            return new ItemStack(ItemInit.seedCactusOrange);
        }

        if(state.getBlock() == BlockInit.cropCactusPink)
        {
            return new ItemStack(ItemInit.seedCactusPink);
        }

        if(state.getBlock() == BlockInit.cropCactusPurple)
        {
            return new ItemStack(ItemInit.seedCactusPurple);
        }

        if(state.getBlock() == BlockInit.cropCactusRed)
        {
            return new ItemStack(ItemInit.seedCactusRed);
        }

        if(state.getBlock() == BlockInit.cropCactusWhite)
        {
            return new ItemStack(ItemInit.seedCactusWhite);
        }

        if(state.getBlock() == BlockInit.cropCactusYellow)
        {
            return new ItemStack(ItemInit.seedCactusYellow);
        }

        return null;
    }

    @Override
    public ItemStack getSilkTouchDrop(IBlockState state)
    {
        if(getAge(state) == getMaxAge())
        {
            if(state.getBlock() == BlockInit.cropCactusBlack)
            {
                return new ItemStack(BlockInit.cactusBlack);
            }

            if(state.getBlock() == BlockInit.cropCactusBlue)
            {
                return new ItemStack(BlockInit.cactusBlue);
            }

            if(state.getBlock() == BlockInit.cropCactusBrown)
            {
                return new ItemStack(BlockInit.cactusBrown);
            }

            if(state.getBlock() == BlockInit.cropCactusCyan)
            {
                return new ItemStack(BlockInit.cactusCyan);
            }

            if(state.getBlock() == BlockInit.cropCactusGray)
            {
                return new ItemStack(BlockInit.cactusGray);
            }

            if(state.getBlock() == BlockInit.cropCactusGreen)
            {
                return new ItemStack(BlockInit.cactusGreen);
            }

            if(state.getBlock() == BlockInit.cropCactusLightBlue)
            {
                return new ItemStack(BlockInit.cactusLightBlue);
            }

            if(state.getBlock() == BlockInit.cropCactusLightGray)
            {
                return new ItemStack(BlockInit.cactusLightGray);
            }

            if(state.getBlock() == BlockInit.cropCactusLime)
            {
                return new ItemStack(BlockInit.cactusLime);
            }

            if(state.getBlock() == BlockInit.cropCactusMagenta)
            {
                return new ItemStack(BlockInit.cactusMagenta);
            }

            if(state.getBlock() == BlockInit.cropCactusOrange)
            {
                return new ItemStack(BlockInit.cactusOrange);
            }

            if(state.getBlock() == BlockInit.cropCactusPink)
            {
                return new ItemStack(BlockInit.cactusPink);
            }

            if(state.getBlock() == BlockInit.cropCactusPurple)
            {
                return new ItemStack(BlockInit.cactusPurple);
            }

            if(state.getBlock() == BlockInit.cropCactusRed)
            {
                return new ItemStack(BlockInit.cactusRed);
            }

            if(state.getBlock() == BlockInit.cropCactusWhite)
            {
                return new ItemStack(BlockInit.cactusWhite);
            }

            if(state.getBlock() == BlockInit.cropCactusYellow)
            {
                return new ItemStack(BlockInit.cactusYellow);
            }
        }

        else
        {
            if(state.getBlock() == BlockInit.cropCactusBlack)
            {
                return new ItemStack(ItemInit.seedCactusBlack);
            }

            if(state.getBlock() == BlockInit.cropCactusBlue)
            {
                return new ItemStack(ItemInit.seedCactusBlue);
            }

            if(state.getBlock() == BlockInit.cropCactusBrown)
            {
                return new ItemStack(ItemInit.seedCactusBrown);
            }

            if(state.getBlock() == BlockInit.cropCactusCyan)
            {
                return new ItemStack(ItemInit.seedCactusCyan);
            }

            if(state.getBlock() == BlockInit.cropCactusGray)
            {
                return new ItemStack(ItemInit.seedCactusGray);
            }

            if(state.getBlock() == BlockInit.cropCactusGreen)
            {
                return new ItemStack(ItemInit.seedCactusGreen);
            }

            if(state.getBlock() == BlockInit.cropCactusLightBlue)
            {
                return new ItemStack(ItemInit.seedCactusLightBlue);
            }

            if(state.getBlock() == BlockInit.cropCactusLightGray)
            {
                return new ItemStack(ItemInit.seedCactusLightGray);
            }

            if(state.getBlock() == BlockInit.cropCactusLime)
            {
                return new ItemStack(ItemInit.seedCactusLime);
            }

            if(state.getBlock() == BlockInit.cropCactusMagenta)
            {
                return new ItemStack(ItemInit.seedCactusMagenta);
            }

            if(state.getBlock() == BlockInit.cropCactusOrange)
            {
                return new ItemStack(ItemInit.seedCactusOrange);
            }

            if(state.getBlock() == BlockInit.cropCactusPink)
            {
                return new ItemStack(ItemInit.seedCactusPink);
            }

            if(state.getBlock() == BlockInit.cropCactusPurple)
            {
                return new ItemStack(ItemInit.seedCactusPurple);
            }

            if(state.getBlock() == BlockInit.cropCactusRed)
            {
                return new ItemStack(ItemInit.seedCactusRed);
            }

            if(state.getBlock() == BlockInit.cropCactusWhite)
            {
                return new ItemStack(ItemInit.seedCactusWhite);
            }

            if(state.getBlock() == BlockInit.cropCactusYellow)
            {
                return new ItemStack(ItemInit.seedCactusYellow);
            }
        }

        return new ItemStack(Blocks.AIR);
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);

        if(getAge(state) == getMaxAge())
        {
            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusBlack)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusBlack));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusBlue)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusBrown)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusBrown));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusCyan)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusCyan));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusGray)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusGreen)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusGreen));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusLightBlue)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusLightBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusLightGray)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusLightGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusLime)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusLime));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusMagenta)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusMagenta));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusOrange)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusOrange));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusPink)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusPink));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusPurple)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusPurple));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusRed)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusRed));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusWhite)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusWhite));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusYellow)
            {
                return Collections.singletonList(new ItemStack(BlockInit.cactusYellow));
            }
        }

        else
        {
            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusBlack)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusBlack));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusBlue)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusBrown)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusBrown));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusCyan)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusCyan));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusGray)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusGreen)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusGreen));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusLightBlue)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusLightBlue));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusLightGray)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusLightGray));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusLime)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusLime));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusMagenta)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusMagenta));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusOrange)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusOrange));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusPink)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusPink));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusPurple)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusPurple));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusRed)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusRed));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusWhite)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusWhite));
            }

            if(world.getBlockState(pos).getBlock() == BlockInit.cropCactusYellow)
            {
                return Collections.singletonList(new ItemStack(ItemInit.seedCactusYellow));
            }
        }

        return Collections.singletonList(new ItemStack(Blocks.AIR));
    }

    @SuppressWarnings("deprecation")
    @Override
    public PathNodeType getAiPathNodeType(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return PathNodeType.DAMAGE_CACTUS;
    }

    @Override
    public PropertyInteger getAgeProperty()
    {
        return AGE;
    }
}