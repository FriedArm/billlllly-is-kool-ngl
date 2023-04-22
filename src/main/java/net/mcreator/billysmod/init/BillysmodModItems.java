
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
import net.mcreator.billysmod.item.TheFrozenDimensionItem;
import net.mcreator.billysmod.item.RubyItem;
import net.mcreator.billysmod.item.RubiSwordItem;
import net.mcreator.billysmod.item.RubiShovelItem;
import net.mcreator.billysmod.item.RubiPickaxeItem;
import net.mcreator.billysmod.item.RubiHoeItem;
import net.mcreator.billysmod.item.RubiAxeItem;
import net.mcreator.billysmod.item.RubiArmorItem;
import net.mcreator.billysmod.item.JadeSwordItem;
import net.mcreator.billysmod.item.JadeShovelItem;
import net.mcreator.billysmod.item.JadePickaxeItem;
import net.mcreator.billysmod.item.JadeItem;
import net.mcreator.billysmod.item.JadeHoeItem;
import net.mcreator.billysmod.item.JadeAxeItem;
import net.mcreator.billysmod.item.JadeArmorItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
