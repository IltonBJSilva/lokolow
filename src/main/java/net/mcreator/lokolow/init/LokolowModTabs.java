
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.lokolow.LokolowMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LokolowModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LokolowMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(LokolowModItems.GULESKATE_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.CAPITALISTA_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.HELLIIOT_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.LOKOW_KRUEGER_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.LOKOLOW_INVERSO_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.LOKOLOWPRESIDENTE_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.LOKOLOW_VILLAGER_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.LEJUKI_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.LEJUKI_WANDINHA_SPAWN_EGG.get());
			tabData.accept(LokolowModItems.RUBIO_KN_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LokolowModItems.CAPITALISTA_NUGGETS.get());
			tabData.accept(LokolowModItems.MUIE.get());
			tabData.accept(LokolowModItems.MAIGOD.get());
			tabData.accept(LokolowModItems.TOME.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LokolowModBlocks.CAPITALISTAORE.get().asItem());
			tabData.accept(LokolowModBlocks.MAIGODEORE.get().asItem());
			tabData.accept(LokolowModBlocks.MUIEORE.get().asItem());
			tabData.accept(LokolowModBlocks.TOMEORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
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
		}
	}
}
