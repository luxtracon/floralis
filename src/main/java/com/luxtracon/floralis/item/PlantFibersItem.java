package com.luxtracon.floralis.item;

import com.luxtracon.floralis.constant.FloralisConstant;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class PlantFibersItem extends BoneMealItem {
    public PlantFibersItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tip." + FloralisConstant.MODID + ".plant_fibers").withStyle(ChatFormatting.GRAY));
    }
}
