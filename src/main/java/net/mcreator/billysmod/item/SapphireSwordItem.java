
package net.mcreator.billysmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.billysmod.init.BillysmodModItems;

public class SapphireSwordItem extends SwordItem {
	public SapphireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1741;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 56;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BillysmodModItems.SAPPHIRE.get()));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
