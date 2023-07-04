package com.luxtracon.floralis.trade;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class ItemsForEmeraldsTrade implements VillagerTrades.ItemListing {
    public ItemStack stack;

    public ItemsForEmeraldsTrade(ItemStack pStack) {
        this.stack = pStack;
    }

    @Override
    public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
        return new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(this.stack.getItem(), 16), 12, 1, 0.05F);
    }
}
