package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RubyTetrahexadronBricksBlock extends Block {
	public RubyTetrahexadronBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 50f).requiresCorrectToolForDrops());
	}
}