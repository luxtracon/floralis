package com.luxtracon.floralis.items.seedcactus;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.init.InitCrop;
import com.luxtracon.floralis.init.InitCropCactus;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SeedCactusWhite extends ItemSeeds
{
    public SeedCactusWhite(String name)
    {
        super(InitCropCactus.cropCactusWhite, Blocks.SAND);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, player.getHeldItem(hand)) && worldIn.getBlockState(pos).getBlock() == Blocks.SAND && worldIn.isAirBlock(pos.up()))
        {
            worldIn.setBlockState(pos.up(), InitCropCactus.cropCactusWhite.getDefaultState());

            if (player instanceof EntityPlayerMP)
            {
                CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos.up(), player.getHeldItem(hand));
            }

            player.getHeldItem(hand).shrink(1);
            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.FAIL;
        }
    }
}