
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.lokolow.LokolowMod;

public class LokolowModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LokolowMod.MODID);
	public static final RegistryObject<SoundEvent> LOKOLOW_CHOI = REGISTRY.register("lokolow_choi", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "lokolow_choi")));
	public static final RegistryObject<SoundEvent> LOKOLOW_MORTE = REGISTRY.register("lokolow_morte", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "lokolow_morte")));
	public static final RegistryObject<SoundEvent> MORTE_DE_LOKOLOW = REGISTRY.register("morte_de_lokolow", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "morte_de_lokolow")));
	public static final RegistryObject<SoundEvent> MUIE_MORTE = REGISTRY.register("muie_morte", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "muie_morte")));
	public static final RegistryObject<SoundEvent> MUIE_HIT = REGISTRY.register("muie_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "muie_hit")));
	public static final RegistryObject<SoundEvent> MORTE_RUBIO = REGISTRY.register("morte_rubio", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "morte_rubio")));
	public static final RegistryObject<SoundEvent> RUBIOKN_HIT = REGISTRY.register("rubiokn_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "rubiokn_hit")));
	public static final RegistryObject<SoundEvent> CAPITALISM_HONESTAMENTE = REGISTRY.register("capitalism_honestamente", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "capitalism_honestamente")));
	public static final RegistryObject<SoundEvent> HELLIOT_MORTE = REGISTRY.register("helliot_morte", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "helliot_morte")));
	public static final RegistryObject<SoundEvent> HELLIOT_HIT = REGISTRY.register("helliot_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "helliot_hit")));
	public static final RegistryObject<SoundEvent> CAPITALISTA_HIT = REGISTRY.register("capitalista_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "capitalista_hit")));
	public static final RegistryObject<SoundEvent> HIT_NO_CAPITALISTA = REGISTRY.register("hit_no_capitalista", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lokolow", "hit_no_capitalista")));
}
