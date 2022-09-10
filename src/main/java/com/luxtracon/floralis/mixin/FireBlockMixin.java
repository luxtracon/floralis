package com.luxtracon.floralis.mixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FireBlock;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(FireBlock.class)
public interface FireBlockMixin {
	@Invoker("setFlammable")
	void mixinFlammable(Block pBlock, int flameOdds, int burnOdds);
}
