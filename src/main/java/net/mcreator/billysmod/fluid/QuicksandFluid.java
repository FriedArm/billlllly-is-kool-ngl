
package net.mcreator.billysmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.billysmod.init.BillysmodModItems;
import net.mcreator.billysmod.init.BillysmodModFluids;
import net.mcreator.billysmod.init.BillysmodModFluidTypes;
import net.mcreator.billysmod.init.BillysmodModBlocks;

public abstract class QuicksandFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BillysmodModFluidTypes.QUICKSAND_TYPE.get(), () -> BillysmodModFluids.QUICKSAND.get(), () -> BillysmodModFluids.FLOWING_QUICKSAND.get())
			.explosionResistance(100f).slopeFindDistance(1).bucket(() -> BillysmodModItems.QUICKSAND_BUCKET.get()).block(() -> (LiquidBlock) BillysmodModBlocks.QUICKSAND.get());

	private QuicksandFluid() {
		super(PROPERTIES);
	}

	public static class Source extends QuicksandFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QuicksandFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
