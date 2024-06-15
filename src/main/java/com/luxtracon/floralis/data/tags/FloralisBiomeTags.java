package com.luxtracon.floralis.data.tags;

import com.luxtracon.floralis.registry.FloralisConstants;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBiomeTags extends BiomeTagsProvider {
	public static final TagKey<Biome> HAS_CACTUS = FloralisBiomeTags.floralisTag("has_cactus");

	public FloralisBiomeTags(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, String pId, ExistingFileHelper pHelper) {
		super(pOutput, pProvider, pId, pHelper);
	}

	@Override
	public void addTags(HolderLookup.Provider pProvider) {
		this.tag(FloralisBiomeTags.HAS_CACTUS)
			.add(Biomes.BADLANDS)
			.add(Biomes.ERODED_BADLANDS)
			.add(Biomes.WOODED_BADLANDS)
			.add(Biomes.DESERT);
	}

	public static TagKey<Biome> bind(String pName) {
		return TagKey.create(Registries.BIOME, ResourceLocation.parse(pName));
	}

	public static TagKey<Biome> cTag(String pName) {
		return FloralisBiomeTags.bind(FloralisConstants.C + ":" + pName);
	}

	public static TagKey<Biome> floralisTag(String pName) {
		return FloralisBiomeTags.bind(FloralisConstants.FLORALIS + ":" + pName);
	}

	public static TagKey<Biome> neoforgeTag(String pName) {
		return FloralisBiomeTags.bind(FloralisConstants.NEOFORGE + ":" + pName);
	}

	public static TagKey<Biome> industrialforegoingTag(String pName) {
		return FloralisBiomeTags.bind(FloralisConstants.INDUSTRIALFOREGOING + ":" + pName);
	}
}
