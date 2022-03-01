package net.mcreator.wingsoffireweapons.procedures;

import net.minecraft.world.entity.Entity;

public class MudwingSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire((int) 2.5);
	}
}
