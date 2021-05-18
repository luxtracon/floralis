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

public class ItemSeedCactus extends Item implements IPlantable
{
    public ItemSeedCactus(String name)
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
        if (facing == EnumFacing.UP && world.getBlockState(pos).getBlock() == Blocks.SAND)
        {
            if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusBlack)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusBlack.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusBlue)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusBlue.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusBrown)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusBrown.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusCyan)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusCyan.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusGray)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusGray.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusGreen)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusGreen.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusLightBlue)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusLightBlue.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusLightGray)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusLightGray.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusLime)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusLime.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusMagenta)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusMagenta.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusOrange)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusOrange.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusPink)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusPink.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusPurple)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusPurple.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusRed)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusRed.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusWhite)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusWhite.getDefaultState());
                player.getHeldItem(hand).shrink(1);
            }

            else if(player.getHeldItem(hand).getItem() == ItemInit.seedCactusYellow)
            {
                world.setBlockState(pos.up(), BlockInit.cropCactusYellow.getDefaultState());
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