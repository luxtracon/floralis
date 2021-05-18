package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemSeedFlower extends Item implements IPlantable
{
    public ItemSeedFlower(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos)
    {
        return null;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos)
    {
        return null;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (facing == EnumFacing.UP && world.getBlockState(pos).getBlock() == Blocks.FARMLAND)
        {
            if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerBlack)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerBlack.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerBlue)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerBlue.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerBrown)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerBrown.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerCyan)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerCyan.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerGray)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerGray.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerGreen)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerGreen.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerLightBlue)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerLightBlue.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerLightGray)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerLightGray.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerLime)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerLime.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerMagenta)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerMagenta.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerOrange)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerOrange.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerPink)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerPink.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerPurple)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerPurple.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerRed)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerRed.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerWhite)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerWhite.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedFlowerYellow)
            {
                world.setBlockState(pos.up(), BlockInit.cropFlowerYellow.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            return EnumActionResult.SUCCESS;
        }

        else
        {
            return EnumActionResult.FAIL;
        }
    }
}