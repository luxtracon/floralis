package com.luxtracon.floralis.common.item;

import com.luxtracon.floralis.common.registry.FloralisConstants;

import java.util.function.Consumer;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import org.jspecify.annotations.NullMarked;

@SuppressWarnings("deprecation")

@NullMarked

public class PlantFibersItem extends BoneMealItem {
	public PlantFibersItem(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public void appendHoverText(ItemStack pItemStack, TooltipContext pTooltipContext, TooltipDisplay pTooltipDisplay, Consumer<Component> pConsumer, TooltipFlag pTooltipFlag) {
		pConsumer.accept(Component.translatable("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers").withStyle(ChatFormatting.GRAY));
	}
}
