package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ChisledOldBlock extends Block {
	public ChisledOldBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 10f).requiresCorrectToolForDrops());
	}
}