package com.luxtracon.floralis.client.tabs;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.registry.FloralisItems;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@MethodsReturnNonnullByDefault

public class FloralisTabs {
	public static final CreativeModeTab floralisTab = new CreativeModeTab(Floralis.MODID) {
		@Override
		public boolean hasSearchBar() {
			return true;
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(FloralisItems.PURPLE_CACTUS.get());
		}

		@Override
		public ResourceLocation getBackgroundImage() {
			return new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png");
		}
	};
}
