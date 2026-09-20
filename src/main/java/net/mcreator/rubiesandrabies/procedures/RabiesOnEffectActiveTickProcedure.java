package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.init.RubiesAndRabiesModMobEffects;

public class RabiesOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (isInWaterOrBubble(entity) && entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RubiesAndRabiesModMobEffects.RABIES)) {
			{
				Entity _ent = entity;
				if (_ent.level() instanceof ServerLevel _serverLevel) {
					_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.parse("rubies_and_rabies:rabies_water_damage")))), 1);
				}
			}
		}
	}

	private static boolean isInWaterOrBubble(Entity entity) {
		return entity.isInWater() || entity.getInBlockState().is(Blocks.BUBBLE_COLUMN);
	}
}