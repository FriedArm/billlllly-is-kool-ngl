
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.billysmod.block.WireBlock;
import net.mcreator.billysmod.block.TopazOreBlock;
import net.mcreator.billysmod.block.TopazBlockBlock;
import net.mcreator.billysmod.block.TheFrozenDimensionPortalBlock;
import net.mcreator.billysmod.block.RubyOreBlock;
import net.mcreator.billysmod.block.RubyBlockBlock;
import net.mcreator.billysmod.block.JadeOreBlock;
import net.mcreator.billysmod.block.JadeBlockBlock;
import net.mcreator.billysmod.block.DesertWoodBlock;
import net.mcreator.billysmod.block.DesertStairsBlock;
import net.mcreator.billysmod.block.DesertSlabBlock;
import net.mcreator.billysmod.block.DesertPressurePlateBlock;
import net.mcreator.billysmod.block.DesertPlanksBlock;
import net.mcreator.billysmod.block.DesertLogBlock;
import net.mcreator.billysmod.block.DesertLeavesBlock;
import net.mcreator.billysmod.block.DesertFenceGateBlock;
import net.mcreator.billysmod.block.DesertFenceBlock;
import net.mcreator.billysmod.block.DesertDimensionPortalBlock;
import net.mcreator.billysmod.block.DesertButtonBlock;
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
	public static final RegistryObject<Block> WIRE = REGISTRY.register("wire", () -> new WireBlock());
	public static final RegistryObject<Block> DESERT_DIMENSION_PORTAL = REGISTRY.register("desert_dimension_portal", () -> new DesertDimensionPortalBlock());
	public static final RegistryObject<Block> DESERT_WOOD = REGISTRY.register("desert_wood", () -> new DesertWoodBlock());
	public static final RegistryObject<Block> DESERT_LOG = REGISTRY.register("desert_log", () -> new DesertLogBlock());
	public static final RegistryObject<Block> DESERT_PLANKS = REGISTRY.register("desert_planks", () -> new DesertPlanksBlock());
	public static final RegistryObject<Block> DESERT_LEAVES = REGISTRY.register("desert_leaves", () -> new DesertLeavesBlock());
	public static final RegistryObject<Block> DESERT_STAIRS = REGISTRY.register("desert_stairs", () -> new DesertStairsBlock());
	public static final RegistryObject<Block> DESERT_SLAB = REGISTRY.register("desert_slab", () -> new DesertSlabBlock());
	public static final RegistryObject<Block> DESERT_FENCE = REGISTRY.register("desert_fence", () -> new DesertFenceBlock());
	public static final RegistryObject<Block> DESERT_FENCE_GATE = REGISTRY.register("desert_fence_gate", () -> new DesertFenceGateBlock());
	public static final RegistryObject<Block> DESERT_PRESSURE_PLATE = REGISTRY.register("desert_pressure_plate", () -> new DesertPressurePlateBlock());
	public static final RegistryObject<Block> DESERT_BUTTON = REGISTRY.register("desert_button", () -> new DesertButtonBlock());
}
