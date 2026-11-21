package net.mcreator.lokolow.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MaigodItem extends Item {
	public MaigodItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}