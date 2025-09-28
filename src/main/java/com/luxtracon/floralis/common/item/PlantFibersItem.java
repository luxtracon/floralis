package com.luxtracon.floralis.common.item;

import com.luxtracon.floralis.common.registry.FloralisConstants;

import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.ChatFormatting;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class PlantFibersItem extends BoneMealItem {
	public PlantFibersItem(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public void appendHoverText(ItemStack pItemStack, TooltipContext pTooltipContext, List<Component> pComponents, TooltipFlag pTooltipFlag) {
		pComponents.add(Component.translatable("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers").withStyle(ChatFormatting.GRAY));
	}
}
