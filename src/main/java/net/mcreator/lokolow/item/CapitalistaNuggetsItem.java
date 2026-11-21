package net.mcreator.lokolow.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CapitalistaNuggetsItem extends Item {
	public CapitalistaNuggetsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}