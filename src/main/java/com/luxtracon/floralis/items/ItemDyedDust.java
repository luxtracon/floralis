package com.luxtracon.floralis.items;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.ItemInit;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class ItemDyedDust extends Item
{
    public ItemDyedDust(String name)
    {
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target, EnumHand hand)
    {
        if (target instanceof EntitySheep)
        {
            EntitySheep entitysheep = (EntitySheep)target;

            EnumDyeColor black = EnumDyeColor.byDyeDamage(0);
            EnumDyeColor blue = EnumDyeColor.byDyeDamage(4);
            EnumDyeColor brown = EnumDyeColor.byDyeDamage(3);
            EnumDyeColor cyan = EnumDyeColor.byDyeDamage(6);
            EnumDyeColor gray = EnumDyeColor.byDyeDamage(8);
            EnumDyeColor green = EnumDyeColor.byDyeDamage(2);
            EnumDyeColor lightblue = EnumDyeColor.byDyeDamage(12);
            EnumDyeColor lightgray = EnumDyeColor.byDyeDamage(7);
            EnumDyeColor lime = EnumDyeColor.byDyeDamage(10);
            EnumDyeColor magenta = EnumDyeColor.byDyeDamage(13);
            EnumDyeColor orange = EnumDyeColor.byDyeDamage(14);
            EnumDyeColor pink = EnumDyeColor.byDyeDamage(9);
            EnumDyeColor purple = EnumDyeColor.byDyeDamage(5);
            EnumDyeColor red = EnumDyeColor.byDyeDamage(1);
            EnumDyeColor white = EnumDyeColor.byDyeDamage(15);
            EnumDyeColor yellow = EnumDyeColor.byDyeDamage(11);

            if(stack.getItem() == ItemInit.dyeBlack && entitysheep.getFleeceColor() != black && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(black);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeBlue && entitysheep.getFleeceColor() != blue && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(blue);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeBrown && entitysheep.getFleeceColor() != brown && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(brown);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeCyan && entitysheep.getFleeceColor() != cyan && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(cyan);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeGray && entitysheep.getFleeceColor() != gray && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(gray);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeGreen && entitysheep.getFleeceColor() != green && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(green);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeLightBlue && entitysheep.getFleeceColor() != lightblue && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(lightblue);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeLightGray && entitysheep.getFleeceColor() != lightgray && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(lightgray);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeLime && entitysheep.getFleeceColor() != lime && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(lime);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeMagenta && entitysheep.getFleeceColor() != magenta && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(magenta);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeOrange && entitysheep.getFleeceColor() != orange && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(orange);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyePink && entitysheep.getFleeceColor() != pink && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(pink);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyePurple && entitysheep.getFleeceColor() != purple && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(purple);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeRed && entitysheep.getFleeceColor() != red && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(red);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeWhite && entitysheep.getFleeceColor() != white && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(white);
                stack.shrink(1);
            }

            else if(stack.getItem() == ItemInit.dyeYellow && entitysheep.getFleeceColor() != yellow && !entitysheep.getSheared())
            {
                player.playSound(SoundEvents.BLOCK_CLOTH_HIT, 1.0F, 1.0F);
                entitysheep.setFleeceColor(yellow);
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