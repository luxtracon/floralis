package com.luxtracon.floralis.common.registry;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.client.data.models.model.TextureSlot;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisTextureSlots {
	public static final TextureSlot DIRT = TextureSlot.create("dirt");
	public static final TextureSlot FLOWER_POT = TextureSlot.create("flower_pot");
	public static final TextureSlot PARTICLE = TextureSlot.create("particle");
	public static final TextureSlot TEXTURE = TextureSlot.create("texture");
}
