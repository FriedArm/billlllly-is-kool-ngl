
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.billysmod.item.WoodenArmorItem;
import net.mcreator.billysmod.item.TopazSwordItem;
import net.mcreator.billysmod.item.TopazShovelItem;
import net.mcreator.billysmod.item.TopazPickaxeItem;
import net.mcreator.billysmod.item.TopazItem;
import net.mcreator.billysmod.item.TopazHoeItem;
import net.mcreator.billysmod.item.TopazAxeItem;
import net.mcreator.billysmod.item.TopazArmorItem;
import net.mcreator.billysmod.item.TitaniumSwordItem;
import net.mcreator.billysmod.item.TitaniumShovelItem;
import net.mcreator.billysmod.item.TitaniumPickaxeItem;
import net.mcreator.billysmod.item.TitaniumIngotItem;
import net.mcreator.billysmod.item.TitaniumHoeItem;
import net.mcreator.billysmod.item.TitaniumAxeItem;
import net.mcreator.billysmod.item.TitaniumArmorItem;
import net.mcreator.billysmod.item.TheFrozenDimensionItem;
import net.mcreator.billysmod.item.SapphireSwordItem;
import net.mcreator.billysmod.item.SapphireShovelItem;
import net.mcreator.billysmod.item.SapphirePickaxeItem;
import net.mcreator.billysmod.item.SapphireItem;
import net.mcreator.billysmod.item.SapphireHoeItem;
import net.mcreator.billysmod.item.SapphireAxeItem;
import net.mcreator.billysmod.item.SapphireArmorItem;
import net.mcreator.billysmod.item.RubyItem;
import net.mcreator.billysmod.item.RubiSwordItem;
import net.mcreator.billysmod.item.RubiShovelItem;
import net.mcreator.billysmod.item.RubiPickaxeItem;
import net.mcreator.billysmod.item.RubiHoeItem;
import net.mcreator.billysmod.item.RubiAxeItem;
import net.mcreator.billysmod.item.RubiArmorItem;
import net.mcreator.billysmod.item.QuicksandItem;
import net.mcreator.billysmod.item.PeridotSwordItem;
import net.mcreator.billysmod.item.PeridotShovelItem;
import net.mcreator.billysmod.item.PeridotPickaxeItem;
import net.mcreator.billysmod.item.PeridotItem;
import net.mcreator.billysmod.item.PeridotHoeItem;
import net.mcreator.billysmod.item.PeridotAxeItem;
import net.mcreator.billysmod.item.PeridotArmorItem;
import net.mcreator.billysmod.item.JadeSwordItem;
import net.mcreator.billysmod.item.JadeShovelItem;
import net.mcreator.billysmod.item.JadePickaxeItem;
import net.mcreator.billysmod.item.JadeItem;
import net.mcreator.billysmod.item.JadeHoeItem;
import net.mcreator.billysmod.item.JadeAxeItem;
import net.mcreator.billysmod.item.JadeArmorItem;
import net.mcreator.billysmod.item.GarnetSwordItem;
import net.mcreator.billysmod.item.GarnetShovelItem;
import net.mcreator.billysmod.item.GarnetPickaxeItem;
import net.mcreator.billysmod.item.GarnetItem;
import net.mcreator.billysmod.item.GarnetHoeItem;
import net.mcreator.billysmod.item.GarnetAxeItem;
import net.mcreator.billysmod.item.GarnetArmorItem;
import net.mcreator.billysmod.item.EmeraldSwordItem;
import net.mcreator.billysmod.item.EmeraldShovelItem;
import net.mcreator.billysmod.item.EmeraldPickAxeItem;
import net.mcreator.billysmod.item.EmeraldHoeItem;
import net.mcreator.billysmod.item.EmeraldAxeItem;
import net.mcreator.billysmod.item.EmeraldArmorItem;
import net.mcreator.billysmod.item.DesertDimensionItem;
import net.mcreator.billysmod.item.CopperSwordItem;
import net.mcreator.billysmod.item.CopperShovelItem;
import net.mcreator.billysmod.item.CopperPickaxeItem;
import net.mcreator.billysmod.item.CopperHoeItem;
import net.mcreator.billysmod.item.CopperAxeItem;
import net.mcreator.billysmod.item.CopperArmorItem;
import net.mcreator.billysmod.item.CitreneSwordItem;
import net.mcreator.billysmod.item.CitreneShovelItem;
import net.mcreator.billysmod.item.CitrenePickaxeItem;
import net.mcreator.billysmod.item.CitreneItem;
import net.mcreator.billysmod.item.CitreneHoeItem;
import net.mcreator.billysmod.item.CitreneAxeItem;
import net.mcreator.billysmod.item.CitreneArmorItem;
import net.mcreator.billysmod.item.BlueTopazSwordItem;
import net.mcreator.billysmod.item.BlueTopazShovelItem;
import net.mcreator.billysmod.item.BlueTopazPickaxeItem;
import net.mcreator.billysmod.item.BlueTopazItem;
import net.mcreator.billysmod.item.BlueTopazHoeItem;
import net.mcreator.billysmod.item.BlueTopazAxeItem;
import net.mcreator.billysmod.item.BlueTopazArmorItem;
import net.mcreator.billysmod.item.AquamarineSwordItem;
import net.mcreator.billysmod.item.AquamarineShovelItem;
import net.mcreator.billysmod.item.AquamarinePickaxeItem;
import net.mcreator.billysmod.item.AquamarineItem;
import net.mcreator.billysmod.item.AquamarineHoeItem;
import net.mcreator.billysmod.item.AquamarineAxeItem;
import net.mcreator.billysmod.item.AquamarineArmorItem;
import net.mcreator.billysmod.item.AlunimiumSwordItem;
import net.mcreator.billysmod.item.AlunimiumShovelItem;
import net.mcreator.billysmod.item.AlunimiumPickaxeItem;
import net.mcreator.billysmod.item.AlunimiumIngotItem;
import net.mcreator.billysmod.item.AlunimiumHoeItem;
import net.mcreator.billysmod.item.AlunimiumAxeItem;
import net.mcreator.billysmod.item.AlunimiumArmorItem;
import net.mcreator.billysmod.BillysmodMod;

public class BillysmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BillysmodMod.MODID);
	public static final RegistryObject<Item> THE_FROZEN_DIMENSION = REGISTRY.register("the_frozen_dimension", () -> new TheFrozenDimensionItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> EMERALD_PICK_AXE = REGISTRY.register("emerald_pick_axe", () -> new EmeraldPickAxeItem());
	public static final RegistryObject<Item> EMERALD_AXE = REGISTRY.register("emerald_axe", () -> new EmeraldAxeItem());
	public static final RegistryObject<Item> EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", () -> new EmeraldShovelItem());
	public static final RegistryObject<Item> EMERALD_HOE = REGISTRY.register("emerald_hoe", () -> new EmeraldHoeItem());
	public static final RegistryObject<Item> EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", () -> new EmeraldArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate", () -> new EmeraldArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings", () -> new EmeraldArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", () -> new EmeraldArmorItem.Boots());
	public static final RegistryObject<Item> RUBY_BLOCK = block(BillysmodModBlocks.RUBY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_ORE = block(BillysmodModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBI_PICKAXE = REGISTRY.register("rubi_pickaxe", () -> new RubiPickaxeItem());
	public static final RegistryObject<Item> RUBI_AXE = REGISTRY.register("rubi_axe", () -> new RubiAxeItem());
	public static final RegistryObject<Item> RUBI_SWORD = REGISTRY.register("rubi_sword", () -> new RubiSwordItem());
	public static final RegistryObject<Item> RUBI_SHOVEL = REGISTRY.register("rubi_shovel", () -> new RubiShovelItem());
	public static final RegistryObject<Item> RUBI_HOE = REGISTRY.register("rubi_hoe", () -> new RubiHoeItem());
	public static final RegistryObject<Item> RUBI_ARMOR_HELMET = REGISTRY.register("rubi_armor_helmet", () -> new RubiArmorItem.Helmet());
	public static final RegistryObject<Item> RUBI_ARMOR_CHESTPLATE = REGISTRY.register("rubi_armor_chestplate", () -> new RubiArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBI_ARMOR_LEGGINGS = REGISTRY.register("rubi_armor_leggings", () -> new RubiArmorItem.Leggings());
	public static final RegistryObject<Item> RUBI_ARMOR_BOOTS = REGISTRY.register("rubi_armor_boots", () -> new RubiArmorItem.Boots());
	public static final RegistryObject<Item> TOPAZ_ARMOR_HELMET = REGISTRY.register("topaz_armor_helmet", () -> new TopazArmorItem.Helmet());
	public static final RegistryObject<Item> TOPAZ_ARMOR_CHESTPLATE = REGISTRY.register("topaz_armor_chestplate", () -> new TopazArmorItem.Chestplate());
	public static final RegistryObject<Item> TOPAZ_ARMOR_LEGGINGS = REGISTRY.register("topaz_armor_leggings", () -> new TopazArmorItem.Leggings());
	public static final RegistryObject<Item> TOPAZ_ARMOR_BOOTS = REGISTRY.register("topaz_armor_boots", () -> new TopazArmorItem.Boots());
	public static final RegistryObject<Item> TOPAZ_ORE = block(BillysmodModBlocks.TOPAZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOPAZ_BLOCK = block(BillysmodModBlocks.TOPAZ_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> TOPAZ_PICKAXE = REGISTRY.register("topaz_pickaxe", () -> new TopazPickaxeItem());
	public static final RegistryObject<Item> TOPAZ_AXE = REGISTRY.register("topaz_axe", () -> new TopazAxeItem());
	public static final RegistryObject<Item> TOPAZ_SWORD = REGISTRY.register("topaz_sword", () -> new TopazSwordItem());
	public static final RegistryObject<Item> TOPAZ_SHOVEL = REGISTRY.register("topaz_shovel", () -> new TopazShovelItem());
	public static final RegistryObject<Item> TOPAZ_HOE = REGISTRY.register("topaz_hoe", () -> new TopazHoeItem());
	public static final RegistryObject<Item> JADE_ARMOR_HELMET = REGISTRY.register("jade_armor_helmet", () -> new JadeArmorItem.Helmet());
	public static final RegistryObject<Item> JADE_ARMOR_CHESTPLATE = REGISTRY.register("jade_armor_chestplate", () -> new JadeArmorItem.Chestplate());
	public static final RegistryObject<Item> JADE_ARMOR_LEGGINGS = REGISTRY.register("jade_armor_leggings", () -> new JadeArmorItem.Leggings());
	public static final RegistryObject<Item> JADE_ARMOR_BOOTS = REGISTRY.register("jade_armor_boots", () -> new JadeArmorItem.Boots());
	public static final RegistryObject<Item> JADE_ORE = block(BillysmodModBlocks.JADE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JADE_BLOCK = block(BillysmodModBlocks.JADE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JADE = REGISTRY.register("jade", () -> new JadeItem());
	public static final RegistryObject<Item> JADE_PICKAXE = REGISTRY.register("jade_pickaxe", () -> new JadePickaxeItem());
	public static final RegistryObject<Item> JADE_AXE = REGISTRY.register("jade_axe", () -> new JadeAxeItem());
	public static final RegistryObject<Item> JADE_SWORD = REGISTRY.register("jade_sword", () -> new JadeSwordItem());
	public static final RegistryObject<Item> JADE_SHOVEL = REGISTRY.register("jade_shovel", () -> new JadeShovelItem());
	public static final RegistryObject<Item> JADE_HOE = REGISTRY.register("jade_hoe", () -> new JadeHoeItem());
	public static final RegistryObject<Item> WOODEN_ARMOR_HELMET = REGISTRY.register("wooden_armor_helmet", () -> new WoodenArmorItem.Helmet());
	public static final RegistryObject<Item> WOODEN_ARMOR_CHESTPLATE = REGISTRY.register("wooden_armor_chestplate", () -> new WoodenArmorItem.Chestplate());
	public static final RegistryObject<Item> WOODEN_ARMOR_LEGGINGS = REGISTRY.register("wooden_armor_leggings", () -> new WoodenArmorItem.Leggings());
	public static final RegistryObject<Item> WOODEN_ARMOR_BOOTS = REGISTRY.register("wooden_armor_boots", () -> new WoodenArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> WIRE = block(BillysmodModBlocks.WIRE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DESERT_DIMENSION = REGISTRY.register("desert_dimension", () -> new DesertDimensionItem());
	public static final RegistryObject<Item> DESERT_WOOD = block(BillysmodModBlocks.DESERT_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DESERT_LOG = block(BillysmodModBlocks.DESERT_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DESERT_PLANKS = block(BillysmodModBlocks.DESERT_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DESERT_LEAVES = block(BillysmodModBlocks.DESERT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DESERT_STAIRS = block(BillysmodModBlocks.DESERT_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DESERT_SLAB = block(BillysmodModBlocks.DESERT_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DESERT_FENCE = block(BillysmodModBlocks.DESERT_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DESERT_FENCE_GATE = block(BillysmodModBlocks.DESERT_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> DESERT_PRESSURE_PLATE = block(BillysmodModBlocks.DESERT_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> DESERT_BUTTON = block(BillysmodModBlocks.DESERT_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUM_ARMOR_HELMET = REGISTRY.register("titanium_armor_helmet", () -> new TitaniumArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_ARMOR_CHESTPLATE = REGISTRY.register("titanium_armor_chestplate", () -> new TitaniumArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_ARMOR_LEGGINGS = REGISTRY.register("titanium_armor_leggings", () -> new TitaniumArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_ARMOR_BOOTS = REGISTRY.register("titanium_armor_boots", () -> new TitaniumArmorItem.Boots());
	public static final RegistryObject<Item> TITANIUM_ORE = block(BillysmodModBlocks.TITANIUM_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(BillysmodModBlocks.TITANIUM_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> GARNET_ARMOR_HELMET = REGISTRY.register("garnet_armor_helmet", () -> new GarnetArmorItem.Helmet());
	public static final RegistryObject<Item> GARNET_ARMOR_CHESTPLATE = REGISTRY.register("garnet_armor_chestplate", () -> new GarnetArmorItem.Chestplate());
	public static final RegistryObject<Item> GARNET_ARMOR_LEGGINGS = REGISTRY.register("garnet_armor_leggings", () -> new GarnetArmorItem.Leggings());
	public static final RegistryObject<Item> GARNET_ARMOR_BOOTS = REGISTRY.register("garnet_armor_boots", () -> new GarnetArmorItem.Boots());
	public static final RegistryObject<Item> GARNET_ORE = block(BillysmodModBlocks.GARNET_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> GARNET_BLOCK = block(BillysmodModBlocks.GARNET_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> GARNET = REGISTRY.register("garnet", () -> new GarnetItem());
	public static final RegistryObject<Item> GARNET_PICKAXE = REGISTRY.register("garnet_pickaxe", () -> new GarnetPickaxeItem());
	public static final RegistryObject<Item> GARNET_AXE = REGISTRY.register("garnet_axe", () -> new GarnetAxeItem());
	public static final RegistryObject<Item> GARNET_SWORD = REGISTRY.register("garnet_sword", () -> new GarnetSwordItem());
	public static final RegistryObject<Item> GARNET_SHOVEL = REGISTRY.register("garnet_shovel", () -> new GarnetShovelItem());
	public static final RegistryObject<Item> GARNET_HOE = REGISTRY.register("garnet_hoe", () -> new GarnetHoeItem());
	public static final RegistryObject<Item> AQUAMARINE_ARMOR_HELMET = REGISTRY.register("aquamarine_armor_helmet", () -> new AquamarineArmorItem.Helmet());
	public static final RegistryObject<Item> AQUAMARINE_ARMOR_CHESTPLATE = REGISTRY.register("aquamarine_armor_chestplate", () -> new AquamarineArmorItem.Chestplate());
	public static final RegistryObject<Item> AQUAMARINE_ARMOR_LEGGINGS = REGISTRY.register("aquamarine_armor_leggings", () -> new AquamarineArmorItem.Leggings());
	public static final RegistryObject<Item> AQUAMARINE_ARMOR_BOOTS = REGISTRY.register("aquamarine_armor_boots", () -> new AquamarineArmorItem.Boots());
	public static final RegistryObject<Item> AQUAMARINE_ORE = block(BillysmodModBlocks.AQUAMARINE_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> AQUAMARINE_BLOCK = block(BillysmodModBlocks.AQUAMARINE_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> AQUAMARINE = REGISTRY.register("aquamarine", () -> new AquamarineItem());
	public static final RegistryObject<Item> AQUAMARINE_PICKAXE = REGISTRY.register("aquamarine_pickaxe", () -> new AquamarinePickaxeItem());
	public static final RegistryObject<Item> AQUAMARINE_AXE = REGISTRY.register("aquamarine_axe", () -> new AquamarineAxeItem());
	public static final RegistryObject<Item> AQUAMARINE_SWORD = REGISTRY.register("aquamarine_sword", () -> new AquamarineSwordItem());
	public static final RegistryObject<Item> AQUAMARINE_SHOVEL = REGISTRY.register("aquamarine_shovel", () -> new AquamarineShovelItem());
	public static final RegistryObject<Item> AQUAMARINE_HOE = REGISTRY.register("aquamarine_hoe", () -> new AquamarineHoeItem());
	public static final RegistryObject<Item> PERIDOT_ARMOR_HELMET = REGISTRY.register("peridot_armor_helmet", () -> new PeridotArmorItem.Helmet());
	public static final RegistryObject<Item> PERIDOT_ARMOR_CHESTPLATE = REGISTRY.register("peridot_armor_chestplate", () -> new PeridotArmorItem.Chestplate());
	public static final RegistryObject<Item> PERIDOT_ARMOR_LEGGINGS = REGISTRY.register("peridot_armor_leggings", () -> new PeridotArmorItem.Leggings());
	public static final RegistryObject<Item> PERIDOT_ARMOR_BOOTS = REGISTRY.register("peridot_armor_boots", () -> new PeridotArmorItem.Boots());
	public static final RegistryObject<Item> PERIDOT_ORE = block(BillysmodModBlocks.PERIDOT_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> PERIDOT_BLOCK = block(BillysmodModBlocks.PERIDOT_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> PERIDOT = REGISTRY.register("peridot", () -> new PeridotItem());
	public static final RegistryObject<Item> PERIDOT_PICKAXE = REGISTRY.register("peridot_pickaxe", () -> new PeridotPickaxeItem());
	public static final RegistryObject<Item> PERIDOT_AXE = REGISTRY.register("peridot_axe", () -> new PeridotAxeItem());
	public static final RegistryObject<Item> PERIDOT_SWORD = REGISTRY.register("peridot_sword", () -> new PeridotSwordItem());
	public static final RegistryObject<Item> PERIDOT_SHOVEL = REGISTRY.register("peridot_shovel", () -> new PeridotShovelItem());
	public static final RegistryObject<Item> PERIDOT_HOE = REGISTRY.register("peridot_hoe", () -> new PeridotHoeItem());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_HELMET = REGISTRY.register("sapphire_armor_helmet", () -> new SapphireArmorItem.Helmet());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_CHESTPLATE = REGISTRY.register("sapphire_armor_chestplate", () -> new SapphireArmorItem.Chestplate());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_LEGGINGS = REGISTRY.register("sapphire_armor_leggings", () -> new SapphireArmorItem.Leggings());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_BOOTS = REGISTRY.register("sapphire_armor_boots", () -> new SapphireArmorItem.Boots());
	public static final RegistryObject<Item> CITRENE_ARMOR_HELMET = REGISTRY.register("citrene_armor_helmet", () -> new CitreneArmorItem.Helmet());
	public static final RegistryObject<Item> CITRENE_ARMOR_CHESTPLATE = REGISTRY.register("citrene_armor_chestplate", () -> new CitreneArmorItem.Chestplate());
	public static final RegistryObject<Item> CITRENE_ARMOR_LEGGINGS = REGISTRY.register("citrene_armor_leggings", () -> new CitreneArmorItem.Leggings());
	public static final RegistryObject<Item> CITRENE_ARMOR_BOOTS = REGISTRY.register("citrene_armor_boots", () -> new CitreneArmorItem.Boots());
	public static final RegistryObject<Item> BLUE_TOPAZ_ARMOR_HELMET = REGISTRY.register("blue_topaz_armor_helmet", () -> new BlueTopazArmorItem.Helmet());
	public static final RegistryObject<Item> BLUE_TOPAZ_ARMOR_CHESTPLATE = REGISTRY.register("blue_topaz_armor_chestplate", () -> new BlueTopazArmorItem.Chestplate());
	public static final RegistryObject<Item> BLUE_TOPAZ_ARMOR_LEGGINGS = REGISTRY.register("blue_topaz_armor_leggings", () -> new BlueTopazArmorItem.Leggings());
	public static final RegistryObject<Item> BLUE_TOPAZ_ARMOR_BOOTS = REGISTRY.register("blue_topaz_armor_boots", () -> new BlueTopazArmorItem.Boots());
	public static final RegistryObject<Item> ALUNIMIUM_ARMOR_HELMET = REGISTRY.register("alunimium_armor_helmet", () -> new AlunimiumArmorItem.Helmet());
	public static final RegistryObject<Item> ALUNIMIUM_ARMOR_CHESTPLATE = REGISTRY.register("alunimium_armor_chestplate", () -> new AlunimiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ALUNIMIUM_ARMOR_LEGGINGS = REGISTRY.register("alunimium_armor_leggings", () -> new AlunimiumArmorItem.Leggings());
	public static final RegistryObject<Item> ALUNIMIUM_ARMOR_BOOTS = REGISTRY.register("alunimium_armor_boots", () -> new AlunimiumArmorItem.Boots());
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(BillysmodModBlocks.SAPPHIRE_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(BillysmodModBlocks.SAPPHIRE_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> CITRENE_ORE = block(BillysmodModBlocks.CITRENE_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> CITRENE_BLOCK = block(BillysmodModBlocks.CITRENE_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> BLUE_TOPAZ_ORE = block(BillysmodModBlocks.BLUE_TOPAZ_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> BLUE_TOPAZ_BLOCK = block(BillysmodModBlocks.BLUE_TOPAZ_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> ALUNIMIUM_ORE = block(BillysmodModBlocks.ALUNIMIUM_ORE, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> ALUNIMIUM_BLOCK = block(BillysmodModBlocks.ALUNIMIUM_BLOCK, BillysmodModTabs.TAB_BILLYS_MOD);
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> CITRENE = REGISTRY.register("citrene", () -> new CitreneItem());
	public static final RegistryObject<Item> BLUE_TOPAZ = REGISTRY.register("blue_topaz", () -> new BlueTopazItem());
	public static final RegistryObject<Item> ALUNIMIUM_INGOT = REGISTRY.register("alunimium_ingot", () -> new AlunimiumIngotItem());
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = REGISTRY.register("sapphire_pickaxe", () -> new SapphirePickaxeItem());
	public static final RegistryObject<Item> SAPPHIRE_AXE = REGISTRY.register("sapphire_axe", () -> new SapphireAxeItem());
	public static final RegistryObject<Item> SAPPHIRE_SWORD = REGISTRY.register("sapphire_sword", () -> new SapphireSwordItem());
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = REGISTRY.register("sapphire_shovel", () -> new SapphireShovelItem());
	public static final RegistryObject<Item> SAPPHIRE_HOE = REGISTRY.register("sapphire_hoe", () -> new SapphireHoeItem());
	public static final RegistryObject<Item> CITRENE_PICKAXE = REGISTRY.register("citrene_pickaxe", () -> new CitrenePickaxeItem());
	public static final RegistryObject<Item> CITRENE_AXE = REGISTRY.register("citrene_axe", () -> new CitreneAxeItem());
	public static final RegistryObject<Item> CITRENE_SWORD = REGISTRY.register("citrene_sword", () -> new CitreneSwordItem());
	public static final RegistryObject<Item> CITRENE_SHOVEL = REGISTRY.register("citrene_shovel", () -> new CitreneShovelItem());
	public static final RegistryObject<Item> CITRENE_HOE = REGISTRY.register("citrene_hoe", () -> new CitreneHoeItem());
	public static final RegistryObject<Item> BLUE_TOPAZ_PICKAXE = REGISTRY.register("blue_topaz_pickaxe", () -> new BlueTopazPickaxeItem());
	public static final RegistryObject<Item> BLUE_TOPAZ_AXE = REGISTRY.register("blue_topaz_axe", () -> new BlueTopazAxeItem());
	public static final RegistryObject<Item> BLUE_TOPAZ_SWORD = REGISTRY.register("blue_topaz_sword", () -> new BlueTopazSwordItem());
	public static final RegistryObject<Item> BLUE_TOPAZ_SHOVEL = REGISTRY.register("blue_topaz_shovel", () -> new BlueTopazShovelItem());
	public static final RegistryObject<Item> BLUE_TOPAZ_HOE = REGISTRY.register("blue_topaz_hoe", () -> new BlueTopazHoeItem());
	public static final RegistryObject<Item> ALUNIMIUM_PICKAXE = REGISTRY.register("alunimium_pickaxe", () -> new AlunimiumPickaxeItem());
	public static final RegistryObject<Item> ALUNIMIUM_AXE = REGISTRY.register("alunimium_axe", () -> new AlunimiumAxeItem());
	public static final RegistryObject<Item> ALUNIMIUM_SWORD = REGISTRY.register("alunimium_sword", () -> new AlunimiumSwordItem());
	public static final RegistryObject<Item> ALUNIMIUM_SHOVEL = REGISTRY.register("alunimium_shovel", () -> new AlunimiumShovelItem());
	public static final RegistryObject<Item> ALUNIMIUM_HOE = REGISTRY.register("alunimium_hoe", () -> new AlunimiumHoeItem());
	public static final RegistryObject<Item> QUICKSAND_BUCKET = REGISTRY.register("quicksand_bucket", () -> new QuicksandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
