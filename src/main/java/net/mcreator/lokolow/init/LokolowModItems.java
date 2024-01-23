
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

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
}
