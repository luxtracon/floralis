package com.luxtracon.floralis.data.provider;

import com.luxtracon.floralis.data.FloralisRegistrySetBuilder;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisDatapackBuiltinEntriesProvider extends DatapackBuiltinEntriesProvider {
	public FloralisDatapackBuiltinEntriesProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider, String pId) {
		super(pPackOutput, pProvider, new FloralisRegistrySetBuilder(), Set.of(pId));
	}
}
