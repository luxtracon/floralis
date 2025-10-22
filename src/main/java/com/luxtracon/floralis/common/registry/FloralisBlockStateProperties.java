package com.luxtracon.floralis.common.registry;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockStateProperties {
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
}
