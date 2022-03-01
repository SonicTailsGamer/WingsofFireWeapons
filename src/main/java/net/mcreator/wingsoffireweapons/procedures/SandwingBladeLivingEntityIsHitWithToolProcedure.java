package net.mcreator.wingsoffireweapons.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.wingsoffireweapons.WingsoffireweaponsMod;

import java.util.Map;

public class SandwingBladeLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WingsoffireweaponsMod.LOGGER.warn("Failed to load dependency entity for procedure SandwingBladeLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 7);
	}
}
