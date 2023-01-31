package com.luxtracon.floralis.trade;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerDataHolder;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;

import java.util.Map;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class EmeraldsForItemsTrade implements VillagerTrades.ItemListing {
    public Map<VillagerType, Item> map;

    public EmeraldsForItemsTrade(Map<VillagerType, Item> pMap) {
        this.map = pMap;
    }

    @Override
    public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
        return pTrader instanceof VillagerDataHolder ? new MerchantOffer(new ItemStack(this.map.get(((VillagerDataHolder) pTrader).getVillagerData().getType()), 64), new ItemStack(Items.EMERALD, 1), 12, 2, 0.05F) : null;
    }
}
