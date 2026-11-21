package net.mcreator.lokolow.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class EsmeraldaAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1200, 8f, 0, 18, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:esmeralda_axe_repair_items")));

	public EsmeraldaAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -3f, properties);
	}
}