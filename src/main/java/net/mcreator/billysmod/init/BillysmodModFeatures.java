
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.billysmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.billysmod.world.features.ores.TopazOreFeature;
import net.mcreator.billysmod.world.features.ores.TitaniumOreFeature;
import net.mcreator.billysmod.world.features.ores.SapphireOreFeature;
import net.mcreator.billysmod.world.features.ores.RubyOreFeature;
import net.mcreator.billysmod.world.features.ores.PeridotOreFeature;
import net.mcreator.billysmod.world.features.ores.JadeOreFeature;
import net.mcreator.billysmod.world.features.ores.GarnetOreFeature;
import net.mcreator.billysmod.world.features.ores.CitreneOreFeature;
import net.mcreator.billysmod.world.features.ores.BlueTopazOreFeature;
import net.mcreator.billysmod.world.features.ores.AquamarineOreFeature;
import net.mcreator.billysmod.world.features.ores.AlunimiumOreFeature;
import net.mcreator.billysmod.world.features.WildChestFeature;
import net.mcreator.billysmod.world.features.SnowHouseFeature;
import net.mcreator.billysmod.world.features.RuinedHouseFeature;
import net.mcreator.billysmod.world.features.FrozenHouseFeature;
import net.mcreator.billysmod.BillysmodMod;

@Mod.EventBusSubscriber
public class BillysmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BillysmodMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
	public static final RegistryObject<Feature<?>> FROZEN_HOUSE = REGISTRY.register("frozen_house", FrozenHouseFeature::feature);
	public static final RegistryObject<Feature<?>> TOPAZ_ORE = REGISTRY.register("topaz_ore", TopazOreFeature::feature);
	public static final RegistryObject<Feature<?>> JADE_ORE = REGISTRY.register("jade_ore", JadeOreFeature::feature);
	public static final RegistryObject<Feature<?>> SNOW_HOUSE = REGISTRY.register("snow_house", SnowHouseFeature::feature);
	public static final RegistryObject<Feature<?>> WILD_CHEST = REGISTRY.register("wild_chest", WildChestFeature::feature);
	public static final RegistryObject<Feature<?>> RUINED_HOUSE = REGISTRY.register("ruined_house", RuinedHouseFeature::feature);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> GARNET_ORE = REGISTRY.register("garnet_ore", GarnetOreFeature::feature);
	public static final RegistryObject<Feature<?>> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", AquamarineOreFeature::feature);
	public static final RegistryObject<Feature<?>> PERIDOT_ORE = REGISTRY.register("peridot_ore", PeridotOreFeature::feature);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::feature);
	public static final RegistryObject<Feature<?>> CITRENE_ORE = REGISTRY.register("citrene_ore", CitreneOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLUE_TOPAZ_ORE = REGISTRY.register("blue_topaz_ore", BlueTopazOreFeature::feature);
	public static final RegistryObject<Feature<?>> ALUNIMIUM_ORE = REGISTRY.register("alunimium_ore", AlunimiumOreFeature::feature);
}
