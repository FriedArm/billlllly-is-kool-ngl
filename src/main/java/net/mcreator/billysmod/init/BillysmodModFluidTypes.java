
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.billysmod.fluid.types.QuicksandFluidType;
import net.mcreator.billysmod.BillysmodMod;

public class BillysmodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BillysmodMod.MODID);
	public static final RegistryObject<FluidType> QUICKSAND_TYPE = REGISTRY.register("quicksand", () -> new QuicksandFluidType());
}
