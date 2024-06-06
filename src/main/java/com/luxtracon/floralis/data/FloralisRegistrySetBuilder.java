package com.luxtracon.floralis.data;

import com.luxtracon.floralis.data.features.FloralisConfiguredFeatures;
import com.luxtracon.floralis.data.features.FloralisPlacedFeatures;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class FloralisRegistrySetBuilder extends RegistrySetBuilder {
	public FloralisRegistrySetBuilder() {
		this.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, FloralisBiomeModifiers::bootstrap).add(Registries.CONFIGURED_FEATURE, FloralisConfiguredFeatures::bootstrap).add(Registries.PLACED_FEATURE, FloralisPlacedFeatures::bootstrap);
	}
}
