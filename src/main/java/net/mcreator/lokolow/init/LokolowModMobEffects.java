
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.lokolow.potion.QINEGATIVOMobEffect;
import net.mcreator.lokolow.LokolowMod;

public class LokolowModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LokolowMod.MODID);
	public static final RegistryObject<MobEffect> QINEGATIVO = REGISTRY.register("qinegativo", () -> new QINEGATIVOMobEffect());
}
