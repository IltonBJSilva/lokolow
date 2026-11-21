package net.mcreator.lokolow.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TomeItem extends Item {
	public TomeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}