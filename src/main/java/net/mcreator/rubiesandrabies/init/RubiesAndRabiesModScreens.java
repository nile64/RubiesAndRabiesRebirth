/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rubiesandrabies.client.gui.OldenCrateGuiScreen;

@EventBusSubscriber(Dist.CLIENT)
public class RubiesAndRabiesModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RubiesAndRabiesModMenus.OLDEN_CRATE_GUI.get(), OldenCrateGuiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}