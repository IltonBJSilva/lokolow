/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.lokolow.potion.QINEGATIVOMobEffect;
import net.mcreator.lokolow.LokolowMod;

public class LokolowModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, LokolowMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> QINEGATIVO = REGISTRY.register("qinegativo", QINEGATIVOMobEffect::new);
}