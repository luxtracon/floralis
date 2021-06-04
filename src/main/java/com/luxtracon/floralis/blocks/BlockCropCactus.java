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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCropCactus extends BlockCrops
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 5);

    private static final AxisAlignedBB[] AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.125D, 0.5625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)};
    private static final AxisAlignedBB[] COLLISIONAABB = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.125D, 0.5625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D)};

    public BlockCropCactus(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(SoundType.PLANT);
    }

    public boolean canBlockStay(World world, BlockPos pos, IBlockState state)
    {
        return (world.getLight(pos) >= 8 || world.canSeeSky(pos)) && world.getBlockState(pos.down()).getBlock() == Blocks.SAND;
    }

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return 300;
    }

    @Override
    protected int getAge(IBlockState state)
    {
        return state.getValue(this.getAgeProperty()).intValue();
    }

    @Override
    public int getMaxAge()
    {
        return 5;
    }

    @Override
    protected int getBonemealAgeIncrease(World world)
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
        if(state.getBlock() == BlockInit.cropCactusBlack && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusBlack, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusBlack)
        {
            drops.add(new ItemStack(ItemInit.seedCactusBlack, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlack, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlack, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusBlue && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusBlue, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusBlue)
        {
            drops.add(new ItemStack(ItemInit.seedCactusBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBlue, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusBrown && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusBrown, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusBrown)
        {
            drops.add(new ItemStack(ItemInit.seedCactusBrown, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalBrown, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsBrown, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusCyan && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusCyan, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusCyan)
        {
            drops.add(new ItemStack(ItemInit.seedCactusCyan, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalCyan, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsCyan, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusGray && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusGray, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusGray)
        {
            drops.add(new ItemStack(ItemInit.seedCactusGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGray, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusGreen && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusGreen, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusGreen)
        {
            drops.add(new ItemStack(ItemInit.seedCactusGreen, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalGreen, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsGreen, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusLightBlue && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusLightBlue, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusLightBlue)
        {
            drops.add(new ItemStack(ItemInit.seedCactusLightBlue, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightBlue, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightBlue, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusLightGray && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusLightGray, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusLightGray)
        {
            drops.add(new ItemStack(ItemInit.seedCactusLightGray, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLightGray, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLightGray, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusLime && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusLime, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusLime)
        {
            drops.add(new ItemStack(ItemInit.seedCactusLime, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalLime, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsLime, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusMagenta && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusMagenta, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusMagenta)
        {
            drops.add(new ItemStack(ItemInit.seedCactusMagenta, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalMagenta, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsMagenta, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusOrange && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusOrange, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusOrange)
        {
            drops.add(new ItemStack(ItemInit.seedCactusOrange, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalOrange, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsOrange, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusPink && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusPink, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusPink)
        {
            drops.add(new ItemStack(ItemInit.seedCactusPink, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPink, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPink, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusPurple && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusPurple, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusPurple)
        {
            drops.add(new ItemStack(ItemInit.seedCactusPurple, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalPurple, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsPurple, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusRed && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusRed, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusRed)
        {
            drops.add(new ItemStack(ItemInit.seedCactusRed, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalRed, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsRed, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusWhite && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusWhite, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusWhite)
        {
            drops.add(new ItemStack(ItemInit.seedCactusWhite, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalWhite, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsWhite, 1 + fortune));
        }

        if(state.getBlock() == BlockInit.cropCactusYellow && getAge(state) < getMaxAge())
        {
            drops.add(new ItemStack(ItemInit.seedCactusYellow, 1));
        }

        else if(state.getBlock() == BlockInit.cropCactusYellow)
        {
            drops.add(new ItemStack(ItemInit.seedCactusYellow, 2 + fortune));
            drops.add(new ItemStack(ItemInit.petalYellow, 1 + fortune));
            drops.add(new ItemStack(ItemInit.partsYellow, 1 + fortune));
        }
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
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, AGE);
    }

    @Override
    protected PropertyInteger getAgeProperty()
    {
        return AGE;
    }

    @Override
    public ItemStack getItem(World world, BlockPos pos, IBlockState state)
    {
        if(state.getBlock() == BlockInit.cropCactusBlack)
        {
            return new ItemStack(ItemInit.seedCactusBlack);
        }

        else if(state.getBlock() == BlockInit.cropCactusBlue)
        {
            return new ItemStack(ItemInit.seedCactusBlue);
        }

        else if(state.getBlock() == BlockInit.cropCactusBrown)
        {
            return new ItemStack(ItemInit.seedCactusBrown);
        }

        else if(state.getBlock() == BlockInit.cropCactusCyan)
        {
            return new ItemStack(ItemInit.seedCactusCyan);
        }

        else if(state.getBlock() == BlockInit.cropCactusGray)
        {
            return new ItemStack(ItemInit.seedCactusGray);
        }

        else if(state.getBlock() == BlockInit.cropCactusGreen)
        {
            return new ItemStack(ItemInit.seedCactusGreen);
        }

        else if(state.getBlock() == BlockInit.cropCactusLightBlue)
        {
            return new ItemStack(ItemInit.seedCactusLightBlue);
        }

        else if(state.getBlock() == BlockInit.cropCactusLightGray)
        {
            return new ItemStack(ItemInit.seedCactusLightGray);
        }

        else if(state.getBlock() == BlockInit.cropCactusLime)
        {
            return new ItemStack(ItemInit.seedCactusLime);
        }

        else if(state.getBlock() == BlockInit.cropCactusMagenta)
        {
            return new ItemStack(ItemInit.seedCactusMagenta);
        }

        else if(state.getBlock() == BlockInit.cropCactusOrange)
        {
            return new ItemStack(ItemInit.seedCactusOrange);
        }

        else if(state.getBlock() == BlockInit.cropCactusPink)
        {
            return new ItemStack(ItemInit.seedCactusPink);
        }

        else if(state.getBlock() == BlockInit.cropCactusPurple)
        {
            return new ItemStack(ItemInit.seedCactusPurple);
        }

        else if(state.getBlock() == BlockInit.cropCactusRed)
        {
            return new ItemStack(ItemInit.seedCactusRed);
        }

        else if(state.getBlock() == BlockInit.cropCactusWhite)
        {
            return new ItemStack(ItemInit.seedCactusWhite);
        }

        else if(state.getBlock() == BlockInit.cropCactusYellow)
        {
            return new ItemStack(ItemInit.seedCactusYellow);
        }

        return null;
    }
}