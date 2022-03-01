
package net.mcreator.wingsoffireweapons.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.wingsoffireweapons.WingsoffireweaponsModElements;

@WingsoffireweaponsModElements.ModElement.Tag
public class WofWeaponsItemGroup extends WingsoffireweaponsModElements.ModElement {
	public WofWeaponsItemGroup(WingsoffireweaponsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwof_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.DRAGON_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
