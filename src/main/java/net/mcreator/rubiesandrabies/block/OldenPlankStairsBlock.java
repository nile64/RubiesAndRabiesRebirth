package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class OldenPlankStairsBlock extends StairBlock {
	public OldenPlankStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.WOOD).strength(3f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}