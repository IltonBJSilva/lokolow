package net.mcreator.lokolow.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class MaigodaxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 700, 8f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:maigodaxe_repair_items")));

	public MaigodaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9f, 6f, properties);
	}
}