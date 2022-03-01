
package net.mcreator.wingsoffireweapons.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.wingsoffireweapons.procedures.SandwingBladeLivingEntityIsHitWithToolProcedure;
import net.mcreator.wingsoffireweapons.init.WingsoffireweaponsModTabs;

public class SandwingBladeItem extends SwordItem {
	public SandwingBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.5f, new Item.Properties().tab(WingsoffireweaponsModTabs.TAB_WOF_WEAPONS).fireResistant());
		setRegistryName("sandwing_blade");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		SandwingBladeLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
