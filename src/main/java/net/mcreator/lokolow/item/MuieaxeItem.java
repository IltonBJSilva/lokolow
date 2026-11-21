package net.mcreator.lokolow.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class MuieaxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 300, 500f, 0, 1, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:muieaxe_repair_items")));

	public MuieaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 14f, -3f, properties.fireResistant());
	}
}