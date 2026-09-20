/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

public class RubiesAndRabiesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubiesAndRabiesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RUBIES_TAB = REGISTRY.register("rubies_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rubies_and_rabies.rubies_tab")).icon(() -> new ItemStack(RubiesAndRabiesModItems.RUBY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RubiesAndRabiesModItems.RUBY.get());
			}).withSearchBar().build());
}