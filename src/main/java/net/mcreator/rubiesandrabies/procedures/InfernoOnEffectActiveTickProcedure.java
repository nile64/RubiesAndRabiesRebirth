package net.mcreator.rubiesandrabies.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.rubiesandrabies.init.RubiesAndRabiesModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class InfernoOnEffectActiveTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RubiesAndRabiesModMobEffects.INFERNO)) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RubiesAndRabiesModMobEffects.INFERNO) ? _livEnt.getEffect(RubiesAndRabiesModMobEffects.INFERNO).getDuration() : 0) % 20 == 10) {
				{
					Entity _ent = entity;
					if (_ent.level() instanceof ServerLevel _serverLevel) {
						_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 1);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 7, 0.5, 2, 0.5, 0);
			}
		}
	}
}