/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubiesandrabies.item.NinteenohfourItem;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

import java.util.function.Function;

public class RubiesAndRabiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RubiesAndRabiesMod.MODID);
	public static final DeferredItem<Item> NINTEENOHFOUR;
	public static final DeferredItem<Item> OLD_GRASS;
	public static final DeferredItem<Item> OLD_DIRT;
	public static final DeferredItem<Item> MUMMY_SPAWN_EGG;
	static {
		NINTEENOHFOUR = register("ninteenohfour", NinteenohfourItem::new);
		OLD_GRASS = block(RubiesAndRabiesModBlocks.OLD_GRASS);
		OLD_DIRT = block(RubiesAndRabiesModBlocks.OLD_DIRT);
		MUMMY_SPAWN_EGG = register("mummy_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(RubiesAndRabiesModEntities.MUMMY.get())));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}