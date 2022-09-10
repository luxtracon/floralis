package com.luxtracon.floralis.mixin;

import com.mojang.datafixers.util.Either;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.structures.SinglePoolElement;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.Supplier;

@SuppressWarnings("unused")

@Mixin(SinglePoolElement.class)
public interface SinglePoolElementMixin {
	@Invoker("<init>")
	static SinglePoolElement construct(Either<ResourceLocation, StructureTemplate> pEither, Supplier<StructureProcessorList> pSupplier, StructureTemplatePool.Projection pProjection) {
		throw new UnsupportedOperationException("Replaced by Mixin");
	}
}
