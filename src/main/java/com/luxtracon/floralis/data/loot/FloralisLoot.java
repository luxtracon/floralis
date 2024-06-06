package com.luxtracon.floralis.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class FloralisLoot extends LootTableProvider {
	public FloralisLoot(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
		super(pOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(FloralisBlockLoot::new, LootContextParamSets.BLOCK)), pProvider);
	}
}
