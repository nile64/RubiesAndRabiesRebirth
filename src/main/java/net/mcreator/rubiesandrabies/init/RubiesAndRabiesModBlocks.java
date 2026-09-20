/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.rubiesandrabies.block.OldGrassBlock;
import net.mcreator.rubiesandrabies.block.OldDirtBlock;
import net.mcreator.rubiesandrabies.block.NinteenohfourPortalBlock;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

import java.util.function.Function;

public class RubiesAndRabiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RubiesAndRabiesMod.MODID);
	public static final DeferredBlock<Block> NINTEENOHFOUR_PORTAL;
	public static final DeferredBlock<Block> OLD_GRASS;
	public static final DeferredBlock<Block> OLD_DIRT;
	static {
		NINTEENOHFOUR_PORTAL = register("ninteenohfour_portal", NinteenohfourPortalBlock::new);
		OLD_GRASS = register("old_grass", OldGrassBlock::new);
		OLD_DIRT = register("old_dirt", OldDirtBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}