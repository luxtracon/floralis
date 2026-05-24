package com.luxtracon.floralis.data.provider.loot;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisLootTableProvider extends LootTableProvider {
	public FloralisLootTableProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
		super(pPackOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(FloralisBlockLootSubProvider::new, LootContextParamSets.BLOCK)), pProvider);
	}
}
