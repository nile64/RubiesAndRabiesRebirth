/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.rubiesandrabies.block.*;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

import java.util.function.Function;

public class RubiesAndRabiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RubiesAndRabiesMod.MODID);
	public static final DeferredBlock<Block> NINTEENOHFOURDIMENSION_PORTAL;
	public static final DeferredBlock<Block> OLD_GRASS;
	public static final DeferredBlock<Block> OLD_DIRT;
	public static final DeferredBlock<Block> OLD_STONE;
	public static final DeferredBlock<Block> CHISLED_OLD;
	public static final DeferredBlock<Block> POLISHED_OLD;
	public static final DeferredBlock<Block> OLD_BRICKS;
	public static final DeferredBlock<Block> OLD_PILLAR;
	public static final DeferredBlock<Block> OLD_TILES;
	public static final DeferredBlock<Block> POLISHED_OLD_SLAB;
	public static final DeferredBlock<Block> OLD_BRICKS_SLAB;
	public static final DeferredBlock<Block> OLD_TILES_SLAB;
	public static final DeferredBlock<Block> POLISHED_OLD_STAIRS;
	public static final DeferredBlock<Block> OLD_BRICKS_STAIRS;
	public static final DeferredBlock<Block> OLD_TILES_STAIRS;
	public static final DeferredBlock<Block> OLDEN_PLANK;
	public static final DeferredBlock<Block> OLDEN_LOG;
	public static final DeferredBlock<Block> OLDEN_PLANK_SLAB;
	public static final DeferredBlock<Block> OLDEN_PLANK_STAIRS;
	public static final DeferredBlock<Block> OLDEN_PLANK_FENCE;
	public static final DeferredBlock<Block> OLDEN_PLANK_PRESSURE_PLATE;
	public static final DeferredBlock<Block> OLDEN_BULB;
	public static final DeferredBlock<Block> OLDEN_CRATE;
	public static final DeferredBlock<Block> OLDEN_DOOR;
	static {
		NINTEENOHFOURDIMENSION_PORTAL = register("ninteenohfourdimension_portal", NinteenohfourPortalBlock::new);
		OLD_GRASS = register("old_grass", OldGrassBlock::new);
		OLD_DIRT = register("old_dirt", OldDirtBlock::new);
		OLD_STONE = register("old_stone", OldStoneBlock::new);
		CHISLED_OLD = register("chisled_old", ChisledOldBlock::new);
		POLISHED_OLD = register("polished_old", PolishedOldBlock::new);
		OLD_BRICKS = register("old_bricks", OldBricksBlock::new);
		OLD_PILLAR = register("old_pillar", OldPillarBlock::new);
		OLD_TILES = register("old_tiles", OldTilesBlock::new);
		POLISHED_OLD_SLAB = register("polished_old_slab", PolishedOldSlabBlock::new);
		OLD_BRICKS_SLAB = register("old_bricks_slab", OldBricksSlabBlock::new);
		OLD_TILES_SLAB = register("old_tiles_slab", OldTilesSlabBlock::new);
		POLISHED_OLD_STAIRS = register("polished_old_stairs", PolishedOldStairsBlock::new);
		OLD_BRICKS_STAIRS = register("old_bricks_stairs", OldBricksStairsBlock::new);
		OLD_TILES_STAIRS = register("old_tiles_stairs", OldTilesStairsBlock::new);
		OLDEN_PLANK = register("olden_plank", OldenPlankBlock::new);
		OLDEN_LOG = register("olden_log", OldenLogBlock::new);
		OLDEN_PLANK_SLAB = register("olden_plank_slab", OldenPlankSlabBlock::new);
		OLDEN_PLANK_STAIRS = register("olden_plank_stairs", OldenPlankStairsBlock::new);
		OLDEN_PLANK_FENCE = register("olden_plank_fence", OldenPlankFenceBlock::new);
		OLDEN_PLANK_PRESSURE_PLATE = register("olden_plank_pressure_plate", OldenPlankPressurePlateBlock::new);
		OLDEN_BULB = register("olden_bulb", OldenBulbBlock::new);
		OLDEN_CRATE = register("olden_crate", OldenCrateBlock::new);
		OLDEN_DOOR = register("olden_door", OldenDoorBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}