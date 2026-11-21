/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lokolow.LokolowMod;

@EventBusSubscriber
public class LokolowModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LokolowMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LOKOLOW_CREATIVE_TAB = REGISTRY.register("lokolow_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lokolow.lokolow_creative_tab")).icon(() -> new ItemStack(Blocks.EMERALD_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(LokolowModItems.CAPITALISTA_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.HELLIIOT_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.LOKOW_KRUEGER_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.LOKOLOW_INVERSO_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.LOKOLOWPRESIDENTE_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.LEJUKI_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.LEJUKI_WANDINHA_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.RUBIO_KN_SPAWN_EGG.get());
				tabData.accept(LokolowModBlocks.CAPITALISTAORE.get().asItem());
				tabData.accept(LokolowModBlocks.MAIGODEORE.get().asItem());
				tabData.accept(LokolowModBlocks.MUIEORE.get().asItem());
				tabData.accept(LokolowModBlocks.TOMEORE.get().asItem());
				tabData.accept(LokolowModItems.CAPITALISTA_NUGGETS.get());
				tabData.accept(LokolowModItems.MUIE.get());
				tabData.accept(LokolowModItems.MAIGOD.get());
				tabData.accept(LokolowModItems.VERY_CAPITALISTA.get());
				tabData.accept(LokolowModItems.TOME.get());
				tabData.accept(LokolowModItems.CAPITALISTAAXE.get());
				tabData.accept(LokolowModItems.CAPITALISTA_PICKAXE.get());
				tabData.accept(LokolowModItems.MAIGODAXE.get());
				tabData.accept(LokolowModItems.MAIGODPICKAXE.get());
				tabData.accept(LokolowModItems.MUIEAXE.get());
				tabData.accept(LokolowModItems.MUIEHOE.get());
				tabData.accept(LokolowModItems.TOMEAXE.get());
				tabData.accept(LokolowModItems.TOMEPICKAXE.get());
				tabData.accept(LokolowModItems.VERYCAPITALISTASHOVEL.get());
				tabData.accept(LokolowModItems.SUMMON_MOUTAIN.get());
				tabData.accept(LokolowModItems.LOKOLOW_SPAWN_EGG.get());
				tabData.accept(LokolowModItems.POTIONNEGATIVO.get());
				tabData.accept(LokolowModItems.URNA_ELETRONICA.get());
				tabData.accept(LokolowModItems.TINTA_ARCO_IRIS.get());
				tabData.accept(LokolowModItems.DISCO_LOKOLOW.get());
				tabData.accept(LokolowModItems.ESMERALDA_PICKAXE.get());
				tabData.accept(LokolowModItems.ESMERALDA_AXE.get());
				tabData.accept(LokolowModItems.ESMERALDA_SHOVEL.get());
				tabData.accept(LokolowModBlocks.BLOCO_DA_SORTE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(LokolowModItems.GULESKATE_SPAWN_EGG.get());
		}
	}
}