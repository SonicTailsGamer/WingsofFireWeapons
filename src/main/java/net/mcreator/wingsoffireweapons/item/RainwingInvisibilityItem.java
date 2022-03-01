
package net.mcreator.wingsoffireweapons.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.wingsoffireweapons.procedures.IcewingInvisibilityRightClickedOnBlockProcedure;
import net.mcreator.wingsoffireweapons.init.WingsoffireweaponsModTabs;

public class RainwingInvisibilityItem extends Item {
	public RainwingInvisibilityItem() {
		super(new Item.Properties().tab(WingsoffireweaponsModTabs.TAB_WOF_WEAPONS).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("rainwing_invisibility");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		IcewingInvisibilityRightClickedOnBlockProcedure.execute(context.getPlayer());
		return retval;
	}
}
