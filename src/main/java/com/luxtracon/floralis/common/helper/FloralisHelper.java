package com.luxtracon.floralis.common.helper;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisHelper {

	public static void hurt(DamageSource pDamageSource, Entity pEntity, float pAmount) {
		if (pEntity.level() instanceof ServerLevel serverLevel) {
			pEntity.hurtServer(serverLevel, pDamageSource, pAmount);
		}
	}
}
