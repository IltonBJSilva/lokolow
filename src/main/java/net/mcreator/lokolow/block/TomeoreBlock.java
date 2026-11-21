package net.mcreator.lokolow.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class TomeoreBlock extends Block {
	public TomeoreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 12f).requiresCorrectToolForDrops().ignitedByLava());
	}
}