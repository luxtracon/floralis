package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FlowerBase extends BlockBush {
    public FlowerBase(String name) {
        setRegistryName(name);
        setTranslationKey(name);
        setLightLevel(8/16f);
        setSoundType(SoundType.PLANT);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return super.getBoundingBox(state, source, pos).offset(state.getOffset(source, pos));
    }

    @Override
    public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }
}