package com.luxtracon.floralis.common.events;

import com.google.common.collect.ImmutableMap;
import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.registry.FloralisItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerDataHolder;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerTrades.ItemListing;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

@EventBusSubscriber(modid = Floralis.MODID)
public class FloralisVillagerTrades {
	private static final int sellEmeralds = 1;
	private static final int sellItems = 16;
	private static final int sellUses = 12;
	private static final int sellXp = 1;
	private static final float sellMultiplier = 0.05F;

	private static final int buyEmeralds = 1;
	private static final int buyItems = 64;
	private static final int buyUses = 16;
	private static final int buyXp = 2;
	private static final float buyMultiplier = 0.05F;

	@SubscribeEvent
	public static void onVillagerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<ItemListing>> trades = event.getTrades();
		VillagerProfession profession = event.getType();

		if (Objects.requireNonNull(profession.getRegistryName()).getPath().equals("farmer")) {
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.WHITE_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.ORANGE_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.MAGENTA_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.LIGHT_BLUE_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.YELLOW_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.LIME_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.PINK_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.GRAY_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.LIGHT_GRAY_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.CYAN_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.PURPLE_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.BLUE_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.BROWN_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.GREEN_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.RED_PETALS.get())));
			trades.get(1).add(new ItemsForEmeralds(new ItemStack(FloralisItems.BLACK_PETALS.get())));
			
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.WHITE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.WHITE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.WHITE_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.ORANGE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.ORANGE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.ORANGE_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.MAGENTA_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.MAGENTA_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.YELLOW_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.YELLOW_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.YELLOW_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIME_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIME_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIME_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.PINK_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.PINK_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.PINK_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.GRAY_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.GRAY_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.GRAY_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.CYAN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.CYAN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.CYAN_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.PURPLE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.PURPLE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.PURPLE_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BLUE_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BLUE_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BLUE_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BROWN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BROWN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BROWN_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.GREEN_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.GREEN_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.GREEN_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.RED_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.RED_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.RED_FLOWER_SEEDS.get()).build()));
			trades.get(1).add(new EmeraldsForVillagerTypeItem(ImmutableMap.<VillagerType, Item>builder().put(VillagerType.PLAINS, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.TAIGA, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SNOW, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.DESERT, FloralisItems.BLACK_CACTUS_SEEDS.get()).put(VillagerType.JUNGLE, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SAVANNA, FloralisItems.BLACK_FLOWER_SEEDS.get()).put(VillagerType.SWAMP, FloralisItems.BLACK_FLOWER_SEEDS.get()).build()));
		}
	}

	private static class ItemsForEmeralds implements ItemListing {
		private final ItemStack itemStack;

		public ItemsForEmeralds(ItemStack pItemStack) {
			this.itemStack = pItemStack;
		}

		public MerchantOffer getOffer(@Nonnull Entity pTrader, @Nonnull Random pRand) {
			return new MerchantOffer(new ItemStack(Items.EMERALD, sellEmeralds), new ItemStack(this.itemStack.getItem(), sellItems), sellUses, sellXp, sellMultiplier);
		}
	}

	private static class EmeraldsForVillagerTypeItem implements VillagerTrades.ItemListing {
		private final Map<VillagerType, Item> trades;

		public EmeraldsForVillagerTypeItem(Map<VillagerType, Item> pTrades) {
			this.trades = pTrades;
		}

		public MerchantOffer getOffer(@Nonnull Entity pTrader, @Nonnull Random pRand) {
			if (pTrader instanceof VillagerDataHolder) {
				return new MerchantOffer(new ItemStack(this.trades.get(((VillagerDataHolder)pTrader).getVillagerData().getType()), buyItems), new ItemStack(Items.EMERALD, buyEmeralds), buyUses, buyXp, buyMultiplier);
			} else {
				return null;
			}
		}
	}
}
