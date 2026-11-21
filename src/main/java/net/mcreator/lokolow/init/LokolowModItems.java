/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lokolow.item.*;
import net.mcreator.lokolow.LokolowMod;

import java.util.function.Function;

public class LokolowModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LokolowMod.MODID);
	public static final DeferredItem<Item> CAPITALISTA_SPAWN_EGG;
	public static final DeferredItem<Item> GULESKATE_SPAWN_EGG;
	public static final DeferredItem<Item> HELLIIOT_SPAWN_EGG;
	public static final DeferredItem<Item> LOKOW_KRUEGER_SPAWN_EGG;
	public static final DeferredItem<Item> LOKOLOW_INVERSO_SPAWN_EGG;
	public static final DeferredItem<Item> LOKOLOWPRESIDENTE_SPAWN_EGG;
	public static final DeferredItem<Item> LEJUKI_SPAWN_EGG;
	public static final DeferredItem<Item> LEJUKI_WANDINHA_SPAWN_EGG;
	public static final DeferredItem<Item> RUBIO_KN_SPAWN_EGG;
	public static final DeferredItem<Item> CAPITALISTAORE;
	public static final DeferredItem<Item> MAIGODEORE;
	public static final DeferredItem<Item> MUIEORE;
	public static final DeferredItem<Item> TOMEORE;
	public static final DeferredItem<Item> CAPITALISTA_NUGGETS;
	public static final DeferredItem<Item> MUIE;
	public static final DeferredItem<Item> MAIGOD;
	public static final DeferredItem<Item> VERY_CAPITALISTA;
	public static final DeferredItem<Item> TOME;
	public static final DeferredItem<Item> CAPITALISTAAXE;
	public static final DeferredItem<Item> CAPITALISTA_PICKAXE;
	public static final DeferredItem<Item> MAIGODAXE;
	public static final DeferredItem<Item> MAIGODPICKAXE;
	public static final DeferredItem<Item> MUIEAXE;
	public static final DeferredItem<Item> MUIEHOE;
	public static final DeferredItem<Item> TOMEAXE;
	public static final DeferredItem<Item> TOMEPICKAXE;
	public static final DeferredItem<Item> VERYCAPITALISTASHOVEL;
	public static final DeferredItem<Item> SUMMON_MOUTAIN;
	public static final DeferredItem<Item> LOKOLOW_SPAWN_EGG;
	public static final DeferredItem<Item> POTIONNEGATIVO;
	public static final DeferredItem<Item> URNA_ELETRONICA;
	public static final DeferredItem<Item> TINTA_ARCO_IRIS;
	public static final DeferredItem<Item> DISCO_LOKOLOW;
	public static final DeferredItem<Item> ESMERALDA_PICKAXE;
	public static final DeferredItem<Item> ESMERALDA_AXE;
	public static final DeferredItem<Item> ESMERALDA_SHOVEL;
	public static final DeferredItem<Item> BLOCO_DA_SORTE;
	static {
		CAPITALISTA_SPAWN_EGG = register("capitalista_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.CAPITALISTA.get())));
		GULESKATE_SPAWN_EGG = register("guleskate_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.GULESKATE.get())));
		HELLIIOT_SPAWN_EGG = register("helliiot_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.HELLIIOT.get())));
		LOKOW_KRUEGER_SPAWN_EGG = register("lokow_krueger_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.LOKOW_KRUEGER.get())));
		LOKOLOW_INVERSO_SPAWN_EGG = register("lokolow_inverso_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.LOKOLOW_INVERSO.get())));
		LOKOLOWPRESIDENTE_SPAWN_EGG = register("lokolowpresidente_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.LOKOLOWPRESIDENTE.get())));
		LEJUKI_SPAWN_EGG = register("lejuki_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.LEJUKI.get())));
		LEJUKI_WANDINHA_SPAWN_EGG = register("lejuki_wandinha_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.LEJUKI_WANDINHA.get())));
		RUBIO_KN_SPAWN_EGG = register("rubio_kn_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.RUBIO_KN.get())));
		CAPITALISTAORE = block(LokolowModBlocks.CAPITALISTAORE);
		MAIGODEORE = block(LokolowModBlocks.MAIGODEORE);
		MUIEORE = block(LokolowModBlocks.MUIEORE);
		TOMEORE = block(LokolowModBlocks.TOMEORE);
		CAPITALISTA_NUGGETS = register("capitalista_nuggets", CapitalistaNuggetsItem::new);
		MUIE = register("muie", MuieItem::new);
		MAIGOD = register("maigod", MaigodItem::new);
		VERY_CAPITALISTA = register("very_capitalista", VeryCapitalistaItem::new);
		TOME = register("tome", TomeItem::new);
		CAPITALISTAAXE = register("capitalistaaxe", CapitalistaaxeItem::new);
		CAPITALISTA_PICKAXE = register("capitalista_pickaxe", CapitalistaPickaxeItem::new);
		MAIGODAXE = register("maigodaxe", MaigodaxeItem::new);
		MAIGODPICKAXE = register("maigodpickaxe", MaigodpickaxeItem::new);
		MUIEAXE = register("muieaxe", MuieaxeItem::new);
		MUIEHOE = register("muiehoe", MuieshovelItem::new);
		TOMEAXE = register("tomeaxe", TomeaxeItem::new);
		TOMEPICKAXE = register("tomepickaxe", TomepickaxeItem::new);
		VERYCAPITALISTASHOVEL = register("verycapitalistashovel", VerycapitalistashovelItem::new);
		SUMMON_MOUTAIN = register("summon_moutain", SummonMoutainItem::new);
		LOKOLOW_SPAWN_EGG = register("lokolow_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LokolowModEntities.LOKOLOW.get())));
		POTIONNEGATIVO = register("potionnegativo", POTIONNEGATIVOItem::new);
		URNA_ELETRONICA = register("urna_eletronica", UrnaEletronicaItem::new);
		TINTA_ARCO_IRIS = register("tinta_arco_iris", TintaArcoIrisItem::new);
		DISCO_LOKOLOW = register("disco_lokolow", DiscoLokolowItem::new);
		ESMERALDA_PICKAXE = register("esmeralda_pickaxe", EsmeraldaPickaxeItem::new);
		ESMERALDA_AXE = register("esmeralda_axe", EsmeraldaAxeItem::new);
		ESMERALDA_SHOVEL = register("esmeralda_shovel", EsmeraldaShovelItem::new);
		BLOCO_DA_SORTE = block(LokolowModBlocks.BLOCO_DA_SORTE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}