
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.lokolow.world.inventory.SistemaDeTrocaMenu;
import net.mcreator.lokolow.LokolowMod;

public class LokolowModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LokolowMod.MODID);
	public static final RegistryObject<MenuType<SistemaDeTrocaMenu>> SISTEMA_DE_TROCA = REGISTRY.register("sistema_de_troca", () -> IForgeMenuType.create(SistemaDeTrocaMenu::new));
}
