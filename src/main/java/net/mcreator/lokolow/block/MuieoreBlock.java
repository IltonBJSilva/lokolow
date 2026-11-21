package net.mcreator.lokolow.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MuieoreBlock extends Block {
	public MuieoreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 13f).requiresCorrectToolForDrops());
	}
}