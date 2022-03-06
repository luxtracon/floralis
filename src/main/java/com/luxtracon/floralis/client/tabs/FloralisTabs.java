package com.luxtracon.floralis.client.tabs;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.registry.FloralisItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class FloralisTabs {
	public static final CreativeModeTab floralisTab = new CreativeModeTab(Floralis.MODID) {
		public boolean hasSearchBar() {
			return true;
		}

		public @Nonnull ItemStack makeIcon() {
			return new ItemStack(FloralisItems.PURPLE_CACTUS.get());
		}

		public @Nonnull ResourceLocation getBackgroundImage() {
			return new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png");
		}
	};
}
