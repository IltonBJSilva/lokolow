
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

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LokolowModBlocks.CAPITALISTAORE.get().asItem());
		}
	}
}
