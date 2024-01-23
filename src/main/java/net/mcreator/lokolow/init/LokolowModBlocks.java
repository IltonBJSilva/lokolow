
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lokolow.block.TomeoreBlock;
import net.mcreator.lokolow.block.MuieoreBlock;
import net.mcreator.lokolow.block.MaigodeoreBlock;
import net.mcreator.lokolow.block.CapitalistaoreBlock;
import net.mcreator.lokolow.LokolowMod;

public class LokolowModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LokolowMod.MODID);
	public static final RegistryObject<Block> CAPITALISTAORE = REGISTRY.register("capitalistaore", () -> new CapitalistaoreBlock());
	public static final RegistryObject<Block> MAIGODEORE = REGISTRY.register("maigodeore", () -> new MaigodeoreBlock());
	public static final RegistryObject<Block> MUIEORE = REGISTRY.register("muieore", () -> new MuieoreBlock());
	public static final RegistryObject<Block> TOMEORE = REGISTRY.register("tomeore", () -> new TomeoreBlock());
}
