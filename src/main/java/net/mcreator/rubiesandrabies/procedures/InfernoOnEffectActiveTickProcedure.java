package net.mcreator.rubiesandrabies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.rubiesandrabies.init.RubiesAndRabiesModMobEffects;

public class InfernoOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RubiesAndRabiesModMobEffects.INFERNO)) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RubiesAndRabiesModMobEffects.INFERNO) ? _livEnt.getEffect(RubiesAndRabiesModMobEffects.INFERNO).getDuration() : 0) % 20 == 0) {
				{
					Entity _ent = entity;
					if (_ent.level() instanceof ServerLevel _serverLevel) {
						_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.ON_FIRE)), 1);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 7, 0.5, 2, 0.5, 0);
			}
		}
	}
}