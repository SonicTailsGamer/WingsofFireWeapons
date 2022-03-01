package net.mcreator.wingsoffireweapons.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.wingsoffireweapons.WingsoffireweaponsMod;

import java.util.Map;

public class DragonTribesWingsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WingsoffireweaponsMod.LOGGER.warn("Failed to load dependency entity for procedure DragonTribesWings!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion((Math.sin(Math.toRadians(entity.rotationYaw + 180)) * 0.5), (entity.rotationPitch * (-0.025)),
				(Math.cos(Math.toRadians(entity.rotationYaw)) * 0.5));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 1, (int) 9));
	}
}
