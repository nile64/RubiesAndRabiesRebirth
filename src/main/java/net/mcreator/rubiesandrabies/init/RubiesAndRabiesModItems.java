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
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubiesandrabies.item.*;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

import java.util.function.Function;

public class RubiesAndRabiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RubiesAndRabiesMod.MODID);
	public static final DeferredItem<Item> NINTEENOHFOURDIMENSION;
	public static final DeferredItem<Item> OLD_GRASS;
	public static final DeferredItem<Item> OLD_DIRT;
	public static final DeferredItem<Item> MUMMY_SPAWN_EGG;
	public static final DeferredItem<Item> OLD_STONE;
	public static final DeferredItem<Item> OLD_PEBBLE;
	public static final DeferredItem<Item> CHISLED_OLD;
	public static final DeferredItem<Item> POLISHED_OLD;
	public static final DeferredItem<Item> OLD_BRICKS;
	public static final DeferredItem<Item> OLD_PILLAR;
	public static final DeferredItem<Item> OLD_TILES;
	public static final DeferredItem<Item> POLISHED_OLD_SLAB;
	public static final DeferredItem<Item> OLD_BRICKS_SLAB;
	public static final DeferredItem<Item> OLD_TILES_SLAB;
	public static final DeferredItem<Item> POLISHED_OLD_STAIRS;
	public static final DeferredItem<Item> OLD_BRICKS_STAIRS;
	public static final DeferredItem<Item> OLD_TILES_STAIRS;
	public static final DeferredItem<Item> OLDEN_PLANK;
	public static final DeferredItem<Item> OLDEN_LOG;
	public static final DeferredItem<Item> OLDEN_PLANK_SLAB;
	public static final DeferredItem<Item> OLDEN_PLANK_STAIRS;
	public static final DeferredItem<Item> OLDEN_PLANK_FENCE;
	public static final DeferredItem<Item> OLDEN_PLANK_PRESSURE_PLATE;
	public static final DeferredItem<Item> OLDEN_BULB;
	public static final DeferredItem<Item> OLDEN_CRATE;
	public static final DeferredItem<Item> ARCHBLAZE_SPAWN_EGG;
	public static final DeferredItem<Item> ARCHFIRECHARGE;
	public static final DeferredItem<Item> OLDEN_DOOR;
	public static final DeferredItem<Item> ARCHBLAZEROD;
	public static final DeferredItem<Item> ARCHBLAZEPOWDER;
	public static final DeferredItem<Item> BLAZECORE;
	public static final DeferredItem<Item> ANCIENTSCRIPTS;
	static {
		NINTEENOHFOURDIMENSION = register("ninteenohfourdimension", NinteenohfourItem::new);
		OLD_GRASS = block(RubiesAndRabiesModBlocks.OLD_GRASS);
		OLD_DIRT = block(RubiesAndRabiesModBlocks.OLD_DIRT);
		MUMMY_SPAWN_EGG = register("mummy_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(RubiesAndRabiesModEntities.MUMMY.get())));
		OLD_STONE = block(RubiesAndRabiesModBlocks.OLD_STONE);
		OLD_PEBBLE = register("old_pebble", OldPebbleItem::new);
		CHISLED_OLD = block(RubiesAndRabiesModBlocks.CHISLED_OLD);
		POLISHED_OLD = block(RubiesAndRabiesModBlocks.POLISHED_OLD);
		OLD_BRICKS = block(RubiesAndRabiesModBlocks.OLD_BRICKS);
		OLD_PILLAR = block(RubiesAndRabiesModBlocks.OLD_PILLAR);
		OLD_TILES = block(RubiesAndRabiesModBlocks.OLD_TILES);
		POLISHED_OLD_SLAB = block(RubiesAndRabiesModBlocks.POLISHED_OLD_SLAB);
		OLD_BRICKS_SLAB = block(RubiesAndRabiesModBlocks.OLD_BRICKS_SLAB);
		OLD_TILES_SLAB = block(RubiesAndRabiesModBlocks.OLD_TILES_SLAB);
		POLISHED_OLD_STAIRS = block(RubiesAndRabiesModBlocks.POLISHED_OLD_STAIRS);
		OLD_BRICKS_STAIRS = block(RubiesAndRabiesModBlocks.OLD_BRICKS_STAIRS);
		OLD_TILES_STAIRS = block(RubiesAndRabiesModBlocks.OLD_TILES_STAIRS);
		OLDEN_PLANK = block(RubiesAndRabiesModBlocks.OLDEN_PLANK);
		OLDEN_LOG = block(RubiesAndRabiesModBlocks.OLDEN_LOG);
		OLDEN_PLANK_SLAB = block(RubiesAndRabiesModBlocks.OLDEN_PLANK_SLAB);
		OLDEN_PLANK_STAIRS = block(RubiesAndRabiesModBlocks.OLDEN_PLANK_STAIRS);
		OLDEN_PLANK_FENCE = block(RubiesAndRabiesModBlocks.OLDEN_PLANK_FENCE);
		OLDEN_PLANK_PRESSURE_PLATE = block(RubiesAndRabiesModBlocks.OLDEN_PLANK_PRESSURE_PLATE);
		OLDEN_BULB = block(RubiesAndRabiesModBlocks.OLDEN_BULB);
		OLDEN_CRATE = block(RubiesAndRabiesModBlocks.OLDEN_CRATE);
		ARCHBLAZE_SPAWN_EGG = register("archblaze_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(RubiesAndRabiesModEntities.ARCHBLAZE.get())));
		ARCHFIRECHARGE = register("archfirecharge", ArchfirechargeItem::new);
		OLDEN_DOOR = doubleBlock(RubiesAndRabiesModBlocks.OLDEN_DOOR);
		ARCHBLAZEROD = register("archblazerod", ArchblazerodItem::new);
		ARCHBLAZEPOWDER = register("archblazepowder", ArchblazepowderItem::new);
		BLAZECORE = register("blazecore", BlazecoreItem::new);
		ANCIENTSCRIPTS = register("ancientscripts", AncientscriptsItem::new);
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