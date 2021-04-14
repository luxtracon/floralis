package com.luxtracon.floralis.items.dye;

import com.luxtracon.floralis.base.ItemBase;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class DyeLightGray extends ItemBase
{
    public DyeLightGray(String name)
    {
        super(name);
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target, EnumHand hand)
    {
        if (target instanceof EntitySheep)
        {
            EntitySheep entitysheep = (EntitySheep)target;

            EnumDyeColor enumdyecolor = EnumDyeColor.byDyeDamage(7);

            if (!entitysheep.getSheared() && entitysheep.getFleeceColor() != enumdyecolor)
            {
                entitysheep.setFleeceColor(enumdyecolor);

                stack.shrink(1);
            }

            return true;
        }

        else
        {
            return false;
        }
    }
}