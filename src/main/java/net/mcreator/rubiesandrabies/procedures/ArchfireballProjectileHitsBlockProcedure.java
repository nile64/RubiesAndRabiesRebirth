package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class ArchfireballProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.AIR && world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.SOUL_FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.AIR && world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.SOUL_FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.AIR && world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.SOUL_FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.AIR && world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.SOUL_FIRE.defaultBlockState(), 3);
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.MOB);
	}
}