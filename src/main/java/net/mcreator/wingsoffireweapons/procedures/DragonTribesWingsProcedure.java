package net.mcreator.wingsoffireweapons.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class DragonTribesWingsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 0.5), (entity.getXRot() * (-0.025)),
				(Math.cos(Math.toRadians(entity.getYRot())) * 0.5));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 1));
	}
}
