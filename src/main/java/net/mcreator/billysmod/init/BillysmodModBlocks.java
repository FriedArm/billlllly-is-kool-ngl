
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
import net.mcreator.billysmod.block.TitaniumOreBlock;
import net.mcreator.billysmod.block.TitaniumBlockBlock;
import net.mcreator.billysmod.block.TheFrozenDimensionPortalBlock;
import net.mcreator.billysmod.block.SapphireOreBlock;
import net.mcreator.billysmod.block.SapphireBlockBlock;
import net.mcreator.billysmod.block.RubyOreBlock;
import net.mcreator.billysmod.block.RubyBlockBlock;
import net.mcreator.billysmod.block.QuicksandBlock;
import net.mcreator.billysmod.block.PeridotOreBlock;
import net.mcreator.billysmod.block.PeridotBlockBlock;
import net.mcreator.billysmod.block.JadeOreBlock;
import net.mcreator.billysmod.block.JadeBlockBlock;
import net.mcreator.billysmod.block.GarnetOreBlock;
import net.mcreator.billysmod.block.GarnetBlockBlock;
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
import net.mcreator.billysmod.block.CitreneOreBlock;
import net.mcreator.billysmod.block.CitreneBlockBlock;
import net.mcreator.billysmod.block.BlueTopazOreBlock;
import net.mcreator.billysmod.block.BlueTopazBlockBlock;
import net.mcreator.billysmod.block.AquamarineOreBlock;
import net.mcreator.billysmod.block.AquamarineBlockBlock;
import net.mcreator.billysmod.block.AlunimiumOreBlock;
import net.mcreator.billysmod.block.AlunimiumBlockBlock;
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
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> GARNET_ORE = REGISTRY.register("garnet_ore", () -> new GarnetOreBlock());
	public static final RegistryObject<Block> GARNET_BLOCK = REGISTRY.register("garnet_block", () -> new GarnetBlockBlock());
	public static final RegistryObject<Block> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", () -> new AquamarineOreBlock());
	public static final RegistryObject<Block> AQUAMARINE_BLOCK = REGISTRY.register("aquamarine_block", () -> new AquamarineBlockBlock());
	public static final RegistryObject<Block> PERIDOT_ORE = REGISTRY.register("peridot_ore", () -> new PeridotOreBlock());
	public static final RegistryObject<Block> PERIDOT_BLOCK = REGISTRY.register("peridot_block", () -> new PeridotBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> CITRENE_ORE = REGISTRY.register("citrene_ore", () -> new CitreneOreBlock());
	public static final RegistryObject<Block> CITRENE_BLOCK = REGISTRY.register("citrene_block", () -> new CitreneBlockBlock());
	public static final RegistryObject<Block> BLUE_TOPAZ_ORE = REGISTRY.register("blue_topaz_ore", () -> new BlueTopazOreBlock());
	public static final RegistryObject<Block> BLUE_TOPAZ_BLOCK = REGISTRY.register("blue_topaz_block", () -> new BlueTopazBlockBlock());
	public static final RegistryObject<Block> ALUNIMIUM_ORE = REGISTRY.register("alunimium_ore", () -> new AlunimiumOreBlock());
	public static final RegistryObject<Block> ALUNIMIUM_BLOCK = REGISTRY.register("alunimium_block", () -> new AlunimiumBlockBlock());
	public static final RegistryObject<Block> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandBlock());
}
