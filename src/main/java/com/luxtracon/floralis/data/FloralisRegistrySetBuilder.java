package com.luxtracon.floralis.data;

import com.luxtracon.floralis.data.registry.FloralisBiomeModifiers;
import com.luxtracon.floralis.data.registry.FloralisConfiguredFeatures;
import com.luxtracon.floralis.data.registry.FloralisPlacedFeatures;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

import net.neoforged.neoforge.registries.NeoForgeRegistries;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisRegistrySetBuilder extends RegistrySetBuilder {
	public FloralisRegistrySetBuilder() {
		this.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, FloralisBiomeModifiers::bootstrap)
			.add(Registries.CONFIGURED_FEATURE, FloralisConfiguredFeatures::bootstrap)
			.add(Registries.PLACED_FEATURE, FloralisPlacedFeatures::bootstrap);
	}
}
