
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.billysmod.world.biome.FrozenBiomeBiome;
import net.mcreator.billysmod.world.biome.DesertDimensionBiomeBiome;
import net.mcreator.billysmod.BillysmodMod;

public class BillysmodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BillysmodMod.MODID);
	public static final RegistryObject<Biome> FROZEN_BIOME = REGISTRY.register("frozen_biome", FrozenBiomeBiome::createBiome);
	public static final RegistryObject<Biome> DESERT_DIMENSION_BIOME = REGISTRY.register("desert_dimension_biome", DesertDimensionBiomeBiome::createBiome);
}
