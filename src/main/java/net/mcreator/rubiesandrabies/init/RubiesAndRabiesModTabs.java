/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

@EventBusSubscriber
public class RubiesAndRabiesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubiesAndRabiesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NINETEENOHFOUR = REGISTRY.register("nineteenohfour",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rubies_and_rabies.nineteenohfour")).icon(() -> new ItemStack(RubiesAndRabiesModBlocks.OLD_GRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RubiesAndRabiesModItems.NINTEENOHFOUR.get());
				tabData.accept(RubiesAndRabiesModBlocks.OLD_GRASS.get().asItem());
				tabData.accept(RubiesAndRabiesModBlocks.OLD_DIRT.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RubiesAndRabiesModItems.NINTEENOHFOUR.get());
		}
	}
}