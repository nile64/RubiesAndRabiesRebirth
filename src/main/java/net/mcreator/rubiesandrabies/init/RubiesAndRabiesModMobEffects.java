/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.potion.InfernoMobEffect;
import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

public class RubiesAndRabiesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, RubiesAndRabiesMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> INFERNO = REGISTRY.register("inferno", InfernoMobEffect::new);
}