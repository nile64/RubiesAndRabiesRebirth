/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.rubiesandrabies.item.RubyItem;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

import java.util.function.Function;

public class RubiesAndRabiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RubiesAndRabiesMod.MODID);
	public static final DeferredItem<Item> RUBY;
	static {
		RUBY = register("ruby", RubyItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}