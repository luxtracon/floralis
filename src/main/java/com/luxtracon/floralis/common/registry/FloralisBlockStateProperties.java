package com.luxtracon.floralis.common.registry;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class FloralisBlockStateProperties {
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
}
