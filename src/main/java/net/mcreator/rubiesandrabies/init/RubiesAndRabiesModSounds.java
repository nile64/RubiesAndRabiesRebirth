/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubiesandrabies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubiesandrabies.RubiesAndRabiesMod;

public class RubiesAndRabiesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RubiesAndRabiesMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> NINETEENFOUR = REGISTRY.register("nineteenfour", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("rubies_and_rabies", "nineteenfour")));
}