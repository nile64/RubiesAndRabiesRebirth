package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rubiesandrabies.init.RubiesAndRabiesModBlocks;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

public class OldGrassNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			RubiesAndRabiesMod.queueServerWork(100, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RubiesAndRabiesModBlocks.OLD_DIRT.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RubiesAndRabiesModBlocks.OLD_GRASS.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			});
		} else {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = RubiesAndRabiesModBlocks.OLD_DIRT.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}