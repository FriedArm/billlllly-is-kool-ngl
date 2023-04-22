
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.billysmod.block.TopazOreBlock;
import net.mcreator.billysmod.block.TopazBlockBlock;
import net.mcreator.billysmod.block.TheFrozenDimensionPortalBlock;
import net.mcreator.billysmod.block.RubyOreBlock;
import net.mcreator.billysmod.block.RubyBlockBlock;
import net.mcreator.billysmod.block.JadeOreBlock;
import net.mcreator.billysmod.block.JadeBlockBlock;
import net.mcreator.billysmod.block.IcewoodWoodBlock;
import net.mcreator.billysmod.block.IcewoodStairsBlock;
import net.mcreator.billysmod.block.IcewoodSlabBlock;
import net.mcreator.billysmod.block.IcewoodPressurePlateBlock;
import net.mcreator.billysmod.block.IcewoodPlanksBlock;
import net.mcreator.billysmod.block.IcewoodLogBlock;
import net.mcreator.billysmod.block.IcewoodLeavesBlock;
import net.mcreator.billysmod.block.IcewoodFenceGateBlock;
import net.mcreator.billysmod.block.IcewoodFenceBlock;
import net.mcreator.billysmod.block.IcewoodButtonBlock;
import net.mcreator.billysmod.BillysmodMod;

public class BillysmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BillysmodMod.MODID);
	public static final RegistryObject<Block> THE_FROZEN_DIMENSION_PORTAL = REGISTRY.register("the_frozen_dimension_portal", () -> new TheFrozenDimensionPortalBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> TOPAZ_ORE = REGISTRY.register("topaz_ore", () -> new TopazOreBlock());
	public static final RegistryObject<Block> TOPAZ_BLOCK = REGISTRY.register("topaz_block", () -> new TopazBlockBlock());
	public static final RegistryObject<Block> JADE_ORE = REGISTRY.register("jade_ore", () -> new JadeOreBlock());
	public static final RegistryObject<Block> JADE_BLOCK = REGISTRY.register("jade_block", () -> new JadeBlockBlock());
	public static final RegistryObject<Block> ICEWOOD_WOOD = REGISTRY.register("icewood_wood", () -> new IcewoodWoodBlock());
	public static final RegistryObject<Block> ICEWOOD_LOG = REGISTRY.register("icewood_log", () -> new IcewoodLogBlock());
	public static final RegistryObject<Block> ICEWOOD_PLANKS = REGISTRY.register("icewood_planks", () -> new IcewoodPlanksBlock());
	public static final RegistryObject<Block> ICEWOOD_LEAVES = REGISTRY.register("icewood_leaves", () -> new IcewoodLeavesBlock());
	public static final RegistryObject<Block> ICEWOOD_STAIRS = REGISTRY.register("icewood_stairs", () -> new IcewoodStairsBlock());
	public static final RegistryObject<Block> ICEWOOD_SLAB = REGISTRY.register("icewood_slab", () -> new IcewoodSlabBlock());
	public static final RegistryObject<Block> ICEWOOD_FENCE = REGISTRY.register("icewood_fence", () -> new IcewoodFenceBlock());
	public static final RegistryObject<Block> ICEWOOD_FENCE_GATE = REGISTRY.register("icewood_fence_gate", () -> new IcewoodFenceGateBlock());
	public static final RegistryObject<Block> ICEWOOD_PRESSURE_PLATE = REGISTRY.register("icewood_pressure_plate", () -> new IcewoodPressurePlateBlock());
	public static final RegistryObject<Block> ICEWOOD_BUTTON = REGISTRY.register("icewood_button", () -> new IcewoodButtonBlock());
}
