
package net.mcreator.billysmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

public class CopperHoeItem extends HoeItem {
	public CopperHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 225;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 0, -1.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
