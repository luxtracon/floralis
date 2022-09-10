package com.luxtracon.floralis.common.world.modifier;

import com.mojang.serialization.Codec;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;

@MethodsReturnNonnullByDefault

public record FloralisVegetalBiomeModifier(HolderSet<Biome> pSet, Holder<PlacedFeature> pHolder) implements BiomeModifier {
    @Override
    public void modify(Holder<Biome> pHolder, Phase pPhase, ModifiableBiomeInfo.BiomeInfo.Builder pBuilder) {
        if (pPhase == Phase.ADD && pSet.contains(pHolder)) {
            pBuilder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, this.pHolder);
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return FloralisBiomeModifiers.VEGETAL_MODIFIERS.get();
    }
}
