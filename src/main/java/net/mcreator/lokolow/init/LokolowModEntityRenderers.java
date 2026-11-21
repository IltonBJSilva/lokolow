/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.lokolow.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class LokolowModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LokolowModEntities.CAPITALISTA.get(), CapitalistaRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.GULESKATE.get(), GuleskateRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.HELLIIOT.get(), HelliiotRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOW_KRUEGER.get(), LokowKruegerRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOLOW_INVERSO.get(), LokolowInversoRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOLOWPRESIDENTE.get(), LokolowpresidenteRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LEJUKI.get(), LejukiRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LEJUKI_WANDINHA.get(), LejukiWandinhaRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.RUBIO_KN.get(), RubioKnRenderer::new);
		event.registerEntityRenderer(LokolowModEntities.LOKOLOW.get(), LokolowRenderer::new);
	}
}