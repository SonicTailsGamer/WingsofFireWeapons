
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffireweapons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.wingsoffireweapons.item.SeawingAnimusDaggerItem;
import net.mcreator.wingsoffireweapons.item.SandwingBladeItem;
import net.mcreator.wingsoffireweapons.item.RainwingInvisibilityItem;
import net.mcreator.wingsoffireweapons.item.MudwingSwordItem;
import net.mcreator.wingsoffireweapons.item.IcewingFrostbreathItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WingsoffireweaponsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MUDWING_SWORD = register(new MudwingSwordItem());
	public static final Item SEAWING_ANIMUS_DAGGER = register(new SeawingAnimusDaggerItem());
	public static final Item SANDWING_BLADE = register(new SandwingBladeItem());
	public static final Item RAINWING_INVISIBILITY = register(new RainwingInvisibilityItem());
	public static final Item ICEWING_FROSTBREATH = register(new IcewingFrostbreathItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
