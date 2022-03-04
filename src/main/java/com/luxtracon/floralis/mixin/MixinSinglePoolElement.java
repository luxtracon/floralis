package com.luxtracon.floralis.mixin;

import com.mojang.datafixers.util.Either;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.structures.SinglePoolElement;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool.Projection;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.Supplier;

@Mixin(SinglePoolElement.class)
public interface MixinSinglePoolElement {
	@Invoker("<init>")
	static SinglePoolElement construct(Either<ResourceLocation, StructureTemplate> nameOrData, Supplier<StructureProcessorList> processors, Projection placementBehaviour) {
		throw new UnsupportedOperationException("Replaced by Mixin");
	}
}
