/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.lokolow.LokolowMod;

public class LokolowModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, LokolowMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LOKOLOW_CHOI = REGISTRY.register("lokolow_choi", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "lokolow_choi")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LOKOLOW_MORTE = REGISTRY.register("lokolow_morte", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "lokolow_morte")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MORTE_DE_LOKOLOW = REGISTRY.register("morte_de_lokolow", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "morte_de_lokolow")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUIE_MORTE = REGISTRY.register("muie_morte", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "muie_morte")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUIE_HIT = REGISTRY.register("muie_hit", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "muie_hit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MORTE_RUBIO = REGISTRY.register("morte_rubio", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "morte_rubio")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RUBIOKN_HIT = REGISTRY.register("rubiokn_hit", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "rubiokn_hit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CAPITALISM_HONESTAMENTE = REGISTRY.register("capitalism_honestamente", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "capitalism_honestamente")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HELLIOT_MORTE = REGISTRY.register("helliot_morte", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "helliot_morte")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HELLIOT_HIT = REGISTRY.register("helliot_hit", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "helliot_hit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CAPITALISTA_HIT = REGISTRY.register("capitalista_hit", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "capitalista_hit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HIT_NO_CAPITALISTA = REGISTRY.register("hit_no_capitalista", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "hit_no_capitalista")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TEMA_LOKOLOW = REGISTRY.register("tema_lokolow", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("lokolow", "tema_lokolow")));
}