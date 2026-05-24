package com.luxtracon.floralis.common.registry;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockStateProperties {
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
}
