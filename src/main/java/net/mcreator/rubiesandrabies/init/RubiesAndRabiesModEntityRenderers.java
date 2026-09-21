/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.rubiesandrabies.client.renderer.MummyRenderer;
import net.mcreator.rubiesandrabies.client.renderer.ArchblazeRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesAndRabiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RubiesAndRabiesModEntities.MUMMY.get(), MummyRenderer::new);
		event.registerEntityRenderer(RubiesAndRabiesModEntities.ARCHBLAZE.get(), ArchblazeRenderer::new);
		event.registerEntityRenderer(RubiesAndRabiesModEntities.ARCHFIREBALL.get(), ThrownItemRenderer::new);
	}
}