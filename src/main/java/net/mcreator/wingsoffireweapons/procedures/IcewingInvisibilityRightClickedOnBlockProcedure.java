package net.mcreator.wingsoffireweapons.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.wingsoffireweapons.WingsoffireweaponsMod;

import java.util.Map;

public class IcewingInvisibilityRightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WingsoffireweaponsMod.LOGGER.warn("Failed to load dependency entity for procedure IcewingInvisibilityRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"effect give @a invisibility 20 1 true");
			}
		}
	}
}
