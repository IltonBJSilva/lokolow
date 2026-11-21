package net.mcreator.lokolow.block;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.lokolow.procedures.BlocoDaSorteQuebradoProcedure;

public class BlocoDaSorteBlock extends Block {
	public BlocoDaSorteBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(0.5f, 1f).lightLevel(blockstate -> 7).ignitedByLava().instrument(NoteBlockInstrument.BELL));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, ItemStack toolStack, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, toolStack, willHarvest, fluid);
		BlocoDaSorteQuebradoProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}