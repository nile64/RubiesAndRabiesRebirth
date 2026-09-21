/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.model.Modelmummy;
import net.mcreator.rubiesandrabies.client.model.Modelarch_blaze;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesAndRabiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelarch_blaze.LAYER_LOCATION, Modelarch_blaze::createBodyLayer);
		event.registerLayerDefinition(Modelmummy.LAYER_LOCATION, Modelmummy::createBodyLayer);
	}
}