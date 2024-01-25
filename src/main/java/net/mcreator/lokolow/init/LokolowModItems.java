
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lokolow.item.VerycapitalistashovelItem;
import net.mcreator.lokolow.item.VeryCapitalistaItem;
import net.mcreator.lokolow.item.TomepickaxeItem;
import net.mcreator.lokolow.item.TomeaxeItem;
import net.mcreator.lokolow.item.TomeItem;
import net.mcreator.lokolow.item.SummonMoutainItem;
import net.mcreator.lokolow.item.MuieshovelItem;
import net.mcreator.lokolow.item.MuieaxeItem;
import net.mcreator.lokolow.item.MuieItem;
import net.mcreator.lokolow.item.MaigodpickaxeItem;
import net.mcreator.lokolow.item.MaigodaxeItem;
import net.mcreator.lokolow.item.MaigodItem;
import net.mcreator.lokolow.item.CapitalistaaxeItem;
import net.mcreator.lokolow.item.CapitalistaPickaxeItem;
import net.mcreator.lokolow.item.CapitalistaNuggetsItem;
import net.mcreator.lokolow.LokolowMod;

public class LokolowModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LokolowMod.MODID);
	public static final RegistryObject<Item> GULESKATE_SPAWN_EGG = REGISTRY.register("guleskate_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.GULESKATE, -16777216, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> CAPITALISTA_SPAWN_EGG = REGISTRY.register("capitalista_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.CAPITALISTA, -3355648, -205, new Item.Properties()));
	public static final RegistryObject<Item> HELLIIOT_SPAWN_EGG = REGISTRY.register("helliiot_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.HELLIIOT, -256, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> LOKOW_KRUEGER_SPAWN_EGG = REGISTRY.register("lokow_krueger_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LOKOW_KRUEGER, -3407872, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> LOKOLOW_INVERSO_SPAWN_EGG = REGISTRY.register("lokolow_inverso_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LOKOLOW_INVERSO, -13421773, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> LOKOLOWPRESIDENTE_SPAWN_EGG = REGISTRY.register("lokolowpresidente_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LOKOLOWPRESIDENTE, -13382656, -256, new Item.Properties()));
	public static final RegistryObject<Item> LOKOLOW_VILLAGER_SPAWN_EGG = REGISTRY.register("lokolow_villager_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LOKOLOW_VILLAGER, -14675712, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> LEJUKI_SPAWN_EGG = REGISTRY.register("lejuki_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LEJUKI, -6750004, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> LEJUKI_WANDINHA_SPAWN_EGG = REGISTRY.register("lejuki_wandinha_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LEJUKI_WANDINHA, -16777216, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> RUBIO_KN_SPAWN_EGG = REGISTRY.register("rubio_kn_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.RUBIO_KN, -16737793, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> CAPITALISTAORE = block(LokolowModBlocks.CAPITALISTAORE);
	public static final RegistryObject<Item> MAIGODEORE = block(LokolowModBlocks.MAIGODEORE);
	public static final RegistryObject<Item> MUIEORE = block(LokolowModBlocks.MUIEORE);
	public static final RegistryObject<Item> TOMEORE = block(LokolowModBlocks.TOMEORE);
	public static final RegistryObject<Item> CAPITALISTA_NUGGETS = REGISTRY.register("capitalista_nuggets", () -> new CapitalistaNuggetsItem());
	public static final RegistryObject<Item> MUIE = REGISTRY.register("muie", () -> new MuieItem());
	public static final RegistryObject<Item> MAIGOD = REGISTRY.register("maigod", () -> new MaigodItem());
	public static final RegistryObject<Item> VERY_CAPITALISTA = REGISTRY.register("very_capitalista", () -> new VeryCapitalistaItem());
	public static final RegistryObject<Item> TOME = REGISTRY.register("tome", () -> new TomeItem());
	public static final RegistryObject<Item> CAPITALISTAAXE = REGISTRY.register("capitalistaaxe", () -> new CapitalistaaxeItem());
	public static final RegistryObject<Item> CAPITALISTA_PICKAXE = REGISTRY.register("capitalista_pickaxe", () -> new CapitalistaPickaxeItem());
	public static final RegistryObject<Item> MAIGODAXE = REGISTRY.register("maigodaxe", () -> new MaigodaxeItem());
	public static final RegistryObject<Item> MAIGODPICKAXE = REGISTRY.register("maigodpickaxe", () -> new MaigodpickaxeItem());
	public static final RegistryObject<Item> MUIEAXE = REGISTRY.register("muieaxe", () -> new MuieaxeItem());
	public static final RegistryObject<Item> MUIEHOE = REGISTRY.register("muiehoe", () -> new MuieshovelItem());
	public static final RegistryObject<Item> TOMEAXE = REGISTRY.register("tomeaxe", () -> new TomeaxeItem());
	public static final RegistryObject<Item> TOMEPICKAXE = REGISTRY.register("tomepickaxe", () -> new TomepickaxeItem());
	public static final RegistryObject<Item> VERYCAPITALISTASHOVEL = REGISTRY.register("verycapitalistashovel", () -> new VerycapitalistashovelItem());
	public static final RegistryObject<Item> SUMMON_MOUTAIN = REGISTRY.register("summon_moutain", () -> new SummonMoutainItem());
	public static final RegistryObject<Item> LOKOLOW_SPAWN_EGG = REGISTRY.register("lokolow_spawn_egg", () -> new ForgeSpawnEggItem(LokolowModEntities.LOKOLOW, -16777012, -10092442, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
