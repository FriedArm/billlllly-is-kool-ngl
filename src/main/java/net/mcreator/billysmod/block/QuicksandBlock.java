
package net.mcreator.billysmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.billysmod.init.BillysmodModFluids;

public class QuicksandBlock extends LiquidBlock {
	public QuicksandBlock() {
		super(() -> BillysmodModFluids.QUICKSAND.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).noCollission().noLootTable());
	}
}
