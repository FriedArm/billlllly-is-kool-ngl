
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BillysmodModTabs {
	public static CreativeModeTab TAB_BILLYS_MOD;

	public static void load() {
		TAB_BILLYS_MOD = new CreativeModeTab("tabbillys_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BillysmodModItems.THE_FROZEN_DIMENSION.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
