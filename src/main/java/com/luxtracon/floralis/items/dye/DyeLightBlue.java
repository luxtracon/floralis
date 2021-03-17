package com.luxtracon.floralis.items.dye;

import com.luxtracon.floralis.base.BaseItem;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class DyeLightBlue extends BaseItem
{
    public DyeLightBlue(String name)
    {
        super(name);
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand)
    {
        if (target instanceof EntitySheep)
        {
            EntitySheep entitysheep = (EntitySheep)target;
            EnumDyeColor enumdyecolor = EnumDyeColor.byDyeDamage(12);

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