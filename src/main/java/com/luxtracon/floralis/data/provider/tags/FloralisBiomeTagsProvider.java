package com.luxtracon.floralis.data.provider.tags;

import com.luxtracon.floralis.common.registry.FloralisConstants;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

import org.jspecify.annotations.NullMarked;

@SuppressWarnings("unused")

@NullMarked

public class FloralisBiomeTagsProvider extends BiomeTagsProvider {
	public static final TagKey<Biome> HAS_CACTUS = FloralisBiomeTagsProvider.floralisKey("has_cactus");

	public FloralisBiomeTagsProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider, String pId) {
		super(pPackOutput, pProvider, pId);
	}

	@Override
	public void addTags(HolderLookup.Provider pProvider) {
		this.tag(FloralisBiomeTagsProvider.HAS_CACTUS)
			.add(Biomes.BADLANDS)
			.add(Biomes.ERODED_BADLANDS)
			.add(Biomes.WOODED_BADLANDS)
			.add(Biomes.DESERT);
	}

	@Override
	public String getName() {
		return "Biome Tags";
	}

	public static TagKey<Biome> cKey(String pName) {
		return FloralisBiomeTagsProvider.createKey(FloralisConstants.C + ":" + pName);
	}

	public static TagKey<Biome> floralisKey(String pName) {
		return FloralisBiomeTagsProvider.createKey(FloralisConstants.FLORALIS + ":" + pName);
	}

	public static TagKey<Biome> industrialforegoingKey(String pName) {
		return FloralisBiomeTagsProvider.createKey(FloralisConstants.INDUSTRIALFOREGOING + ":" + pName);
	}

	public static TagKey<Biome> minecraftKey(String pName) {
		return FloralisBiomeTagsProvider.createKey(FloralisConstants.MINECRAFT + ":" + pName);
	}

	public static TagKey<Biome> neoforgeKey(String pName) {
		return FloralisBiomeTagsProvider.createKey(FloralisConstants.NEOFORGE + ":" + pName);
	}

	public static TagKey<Biome> createKey(String pName) {
		return TagKey.create(Registries.BIOME, Identifier.parse(pName));
	}
}
