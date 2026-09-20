/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubiesandrabies.item.RubyItem;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

import java.util.function.Function;

public class RubiesAndRabiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RubiesAndRabiesMod.MODID);
	public static final DeferredItem<Item> RUBY;
	public static final DeferredItem<Item> RUBY_DOOR;
	public static final DeferredItem<Item> RUBY_BLOCK;
	public static final DeferredItem<Item> RUBY_BRICKS;
	public static final DeferredItem<Item> RUBY_TILES;
	public static final DeferredItem<Item> RUBY_TETRAHEXADRON_BRICKS;
	public static final DeferredItem<Item> RUBY_SHELF;
	static {
		RUBY = register("ruby", RubyItem::new);
		RUBY_DOOR = doubleBlock(RubiesAndRabiesModBlocks.RUBY_DOOR);
		RUBY_BLOCK = block(RubiesAndRabiesModBlocks.RUBY_BLOCK);
		RUBY_BRICKS = block(RubiesAndRabiesModBlocks.RUBY_BRICKS);
		RUBY_TILES = block(RubiesAndRabiesModBlocks.RUBY_TILES);
		RUBY_TETRAHEXADRON_BRICKS = block(RubiesAndRabiesModBlocks.RUBY_TETRAHEXADRON_BRICKS);
		RUBY_SHELF = block(RubiesAndRabiesModBlocks.RUBY_SHELF);
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

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), () -> properties);
	}
}