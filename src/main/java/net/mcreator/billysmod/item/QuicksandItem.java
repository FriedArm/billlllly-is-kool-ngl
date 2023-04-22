
package net.mcreator.billysmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.billysmod.init.BillysmodModFluids;

public class QuicksandItem extends BucketItem {
	public QuicksandItem() {
		super(BillysmodModFluids.QUICKSAND, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
