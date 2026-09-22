package net.mcreator.rubiesandrabies.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.rubiesandrabies.procedures.RabiesOnEffectActiveTickProcedure;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

public class RabiesMobEffect extends MobEffect {
	public RabiesMobEffect() {
		super(MobEffectCategory.HARMFUL, -6684775, mobEffectInstance -> ParticleTypes.DRIPPING_WATER);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, Identifier.fromNamespaceAndPath(RubiesAndRabiesMod.MODID, "effect.rabies_0"), 5, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		RabiesOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}