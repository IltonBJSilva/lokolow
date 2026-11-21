package net.mcreator.lokolow.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class CapitalistaaxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6000, 100f, 0, 100, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:capitalistaaxe_repair_items")));

	public CapitalistaaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 79f, 66f, properties.fireResistant());
	}
}