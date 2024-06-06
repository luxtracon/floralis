package com.luxtracon.floralis.item;

import com.luxtracon.floralis.registry.FloralisConstants;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class PlantFibersItem extends BoneMealItem {
    public PlantFibersItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pList, TooltipFlag pFlag) {
        pList.add(Component.translatable("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers").withStyle(ChatFormatting.GRAY));
    }
}
