package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FlowerBase extends BlockBush
{
    public FlowerBase(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setLightLevel(8/16f);
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

    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        drops.add(new ItemStack(ItemInit.petalPurple, RANDOM.nextInt(4)+3));
        drops.add(new ItemStack(ItemInit.seedPurple, RANDOM.nextInt(2)+1));
    }
}