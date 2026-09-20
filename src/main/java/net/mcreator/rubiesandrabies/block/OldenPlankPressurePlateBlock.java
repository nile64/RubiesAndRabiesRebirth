package net.mcreator.rubiesandrabies.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class OldenPlankPressurePlateBlock extends PressurePlateBlock {
	public OldenPlankPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(3f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}