package com.luxtracon.floralis.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class FloralisBuiltinEntries extends DatapackBuiltinEntriesProvider {
	public FloralisBuiltinEntries(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, RegistrySetBuilder pBuilder, String pId) {
		super(pOutput, pProvider, pBuilder, Set.of(pId));
	}
}
