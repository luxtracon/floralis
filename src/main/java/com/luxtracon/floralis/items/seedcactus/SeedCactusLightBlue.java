package com.luxtracon.floralis.items.seedcactus;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.InitCropCactus;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SeedCactusLightBlue extends ItemSeeds
{
    public SeedCactusLightBlue(String name)
    {
        super(InitCropCactus.cropCactusLightBlue, Blocks.SAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (facing == EnumFacing.UP && world.getBlockState(pos).getBlock() == Blocks.SAND)
        {
            world.setBlockState(pos.up(), InitCropCactus.cropCactusLightBlue.getDefaultState());

            player.getHeldItem(hand).shrink(1);

            return EnumActionResult.SUCCESS;
        }

        else
        {
            return EnumActionResult.FAIL;
        }
    }
}