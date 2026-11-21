/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.lokolow.block.TomeoreBlock;
import net.mcreator.lokolow.block.MuieoreBlock;
import net.mcreator.lokolow.block.MaigodeoreBlock;
import net.mcreator.lokolow.block.CapitalistaoreBlock;
import net.mcreator.lokolow.block.BlocoDaSorteBlock;
import net.mcreator.lokolow.LokolowMod;

import java.util.function.Function;

public class LokolowModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LokolowMod.MODID);
	public static final DeferredBlock<Block> CAPITALISTAORE;
	public static final DeferredBlock<Block> MAIGODEORE;
	public static final DeferredBlock<Block> MUIEORE;
	public static final DeferredBlock<Block> TOMEORE;
	public static final DeferredBlock<Block> BLOCO_DA_SORTE;
	static {
		CAPITALISTAORE = register("capitalistaore", CapitalistaoreBlock::new);
		MAIGODEORE = register("maigodeore", MaigodeoreBlock::new);
		MUIEORE = register("muieore", MuieoreBlock::new);
		TOMEORE = register("tomeore", TomeoreBlock::new);
		BLOCO_DA_SORTE = register("bloco_da_sorte", BlocoDaSorteBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}