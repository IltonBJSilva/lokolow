package net.mcreator.lokolow.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class CapitalistaPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5000, 200f, 0, 40, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:capitalista_pickaxe_repair_items")));

	public CapitalistaPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 9f, 26f).fireResistant());
	}
}