package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class OldenPlankFenceBlock extends FenceBlock {
	public OldenPlankFenceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(3f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}