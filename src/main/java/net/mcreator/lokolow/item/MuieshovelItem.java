package net.mcreator.lokolow.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class MuieshovelItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 400, 5f, 0, 5, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:muiehoe_repair_items")));

	public MuieshovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2.8f, 36f, properties.fireResistant());
	}
}