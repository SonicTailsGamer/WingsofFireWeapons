package net.mcreator.wingsoffireweapons.procedures;

import net.minecraft.world.entity.Entity;

public class SandwingBladeLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(7);
	}
}
