package com.luxtracon.floralis.common.world.structure;

import com.google.common.collect.ImmutableList;

import com.luxtracon.floralis.Floralis;
import com.luxtracon.floralis.common.config.FloralisStructuresConfig;
import com.luxtracon.floralis.mixin.SingleJigsawAccess;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Lifecycle;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

import net.minecraft.core.WritableRegistry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

import java.util.*;
import java.util.stream.Collectors;

public class FloralisStructures {
	private static final int WEIGHT = 4;

	public static void register() {
		PlainVillagePools.bootstrap();
		SnowyVillagePools.bootstrap();
		SavannaVillagePools.bootstrap();
		DesertVillagePools.bootstrap();
		TaigaVillagePools.bootstrap();

		if(FloralisStructuresConfig.PLAINS_FIELD.get()) {
			addStructureToPool(new ResourceLocation("village/plains/houses"), new ResourceLocation(Floralis.MODID, "village/houses/plains_field"));
		}

		if(FloralisStructuresConfig.SNOWY_FIELD.get()) {
			addStructureToPool(new ResourceLocation("village/snowy/houses"), new ResourceLocation(Floralis.MODID, "village/houses/snowy_field"));
		}

		if(FloralisStructuresConfig.SAVANNA_FIELD.get()) {
			addStructureToPool(new ResourceLocation("village/savanna/houses"), new ResourceLocation(Floralis.MODID, "village/houses/savanna_field"));
		}

		if(FloralisStructuresConfig.DESERT_FIELD.get()) {
			addStructureToPool(new ResourceLocation("village/desert/houses"), new ResourceLocation(Floralis.MODID, "village/houses/desert_field"));
		}

		if(FloralisStructuresConfig.TAIGA_FIELD.get()) {
			addStructureToPool(new ResourceLocation("village/taiga/houses"), new ResourceLocation(Floralis.MODID, "village/houses/taiga_field"));
		}
	}

	private static void addStructureToPool(ResourceLocation pool, ResourceLocation structure) {
		StructureTemplatePool structureTemplatePool = BuiltinRegistries.TEMPLATE_POOL.get(pool);
		int id = BuiltinRegistries.TEMPLATE_POOL.getId(structureTemplatePool);

		List<StructurePoolElement> structurePoolElementList;
		if (structureTemplatePool != null) {
			structurePoolElementList = structureTemplatePool.getShuffledTemplates(new Random(0));
		} else {
			structurePoolElementList = ImmutableList.of();
		}

		Object2IntMap<StructurePoolElement> structurePoolElementMap = new Object2IntLinkedOpenHashMap<>();
		for(StructurePoolElement structurePoolElement : structurePoolElementList) {
			structurePoolElementMap.computeInt(structurePoolElement, (StructurePoolElement p, Integer i) -> (i == null ? 0 : i) + 1);
		}

		structurePoolElementMap.put(SingleJigsawAccess.construct(Either.left(structure), ProcessorLists.EMPTY, StructureTemplatePool.Projection.RIGID), WEIGHT);
		List<Pair<StructurePoolElement, Integer>> newStructure = structurePoolElementMap.object2IntEntrySet().stream().map(e -> Pair.of(e.getKey(), e.getIntValue())).collect(Collectors.toList());

		ResourceLocation resourceLocation = structureTemplatePool.getName();
		((WritableRegistry<StructureTemplatePool>)BuiltinRegistries.TEMPLATE_POOL).registerOrOverride(OptionalInt.of(id), ResourceKey.create(BuiltinRegistries.TEMPLATE_POOL.key(), resourceLocation), new StructureTemplatePool(pool, resourceLocation, newStructure), Lifecycle.stable());
	}
}
