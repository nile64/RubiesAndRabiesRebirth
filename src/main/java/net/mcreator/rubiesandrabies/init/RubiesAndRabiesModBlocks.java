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
	public static final DeferredBlock<Block> RUBY_DOOR;
	public static final DeferredBlock<Block> RUBY_BLOCK;
	public static final DeferredBlock<Block> RUBY_BRICKS;
	public static final DeferredBlock<Block> RUBY_TILES;
	public static final DeferredBlock<Block> RUBY_TETRAHEXADRON_BRICKS;
	public static final DeferredBlock<Block> RUBY_SHELF;
	static {
		RUBY_DOOR = register("ruby_door", RubyDoorBlock::new);
		RUBY_BLOCK = register("ruby_block", RubyBlockBlock::new);
		RUBY_BRICKS = register("ruby_bricks", RubyBricksBlock::new);
		RUBY_TILES = register("ruby_tiles", RubyTilesBlock::new);
		RUBY_TETRAHEXADRON_BRICKS = register("ruby_tetrahexadron_bricks", RubyTetrahexadronBricksBlock::new);
		RUBY_SHELF = register("ruby_shelf", RubyShelfBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}