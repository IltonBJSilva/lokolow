
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lokolow.client.renderer.RubioKnRenderer;
import net.mcreator.lokolow.client.renderer.LokowKruegerRenderer;
import net.mcreator.lokolow.client.renderer.LokolowpresidenteRenderer;
import net.mcreator.lokolow.client.renderer.LokolowVillagerRenderer;
import net.mcreator.lokolow.client.renderer.LokolowInversoRenderer;
import net.mcreator.lokolow.client.renderer.LejukiWandinhaRenderer;
import net.mcreator.lokolow.client.renderer.LejukiVillagerRenderer;
import net.mcreator.lokolow.client.renderer.LejukiRenderer;
import net.mcreator.lokolow.client.renderer.HelliiotRenderer;
import net.mcreator.lokolow.client.renderer.GuleskateRenderer;
import net.mcreator.lokolow.client.renderer.CapitalistaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LokolowModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LokolowModEntities.GULESKATE.get(), GuleskateRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.CAPITALISTA.get(), CapitalistaRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.HELLIIOT.get(), HelliiotRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOW_KRUEGER.get(), LokowKruegerRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LEJUKI_VILLAGER.get(), LejukiVillagerRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOLOW_INVERSO.get(), LokolowInversoRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOLOWPRESIDENTE.get(), LokolowpresidenteRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOLOW_VILLAGER.get(), LokolowVillagerRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LEJUKI.get(), LejukiRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LEJUKI_WANDINHA.get(), LejukiWandinhaRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.RUBIO_KN.get(), RubioKnRenderer::new);
	}
}
