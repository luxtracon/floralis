package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;

import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.event.ForgeEventFactory;

import java.util.List;
import javax.annotation.Nullable;

public class ItemPlantParts extends Item
{
    public ItemPlantParts(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flags)
    {
        super.addInformation(stack, world, tooltip, flags);
        tooltip.add(I18n.format(getTooltipTranslationKey()));
    }

    public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @Nullable EnumHand hand)
    {
        IBlockState iblockstate = worldIn.getBlockState(target);

        int hook = ForgeEventFactory.onApplyBonemeal(player, worldIn, target, iblockstate, stack, hand);
        if (hook != 0) return hook > 0;

        if (iblockstate.getBlock() instanceof IGrowable)
        {
            IGrowable igrowable = (IGrowable)iblockstate.getBlock();

            if (igrowable.canGrow(worldIn, target, iblockstate, worldIn.isRemote))
            {
                if (!worldIn.isRemote)
                {
                    if (igrowable.canUseBonemeal(worldIn, worldIn.rand, target, iblockstate))
                    {
                        igrowable.grow(worldIn, worldIn.rand, target, iblockstate);
                    }

                    stack.shrink(1);
                }

                return true;
            }
        }

        return false;
    }

    public String getTooltipTranslationKey()
    {
        return "item.parts.tooltip";
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            if (applyBonemeal(itemstack, worldIn, pos, player, hand))
            {
                player.playSound(SoundEvents.BLOCK_GRASS_HIT, 1.0F, 1.0F);

                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
                }

                return EnumActionResult.SUCCESS;
            }
        }

        return EnumActionResult.FAIL;
    }
}