package net.mcreator.lokolow.item;

import net.minecraft.world.item.*;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

public class VerycapitalistashovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 1000f, 0, 1000, TagKey.create(Registries.ITEM, Identifier.parse("lokolow:verycapitalistashovel_repair_items")));

	public VerycapitalistashovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 999f, -3f, properties.fireResistant().setNoCombineRepair());
	}

	@Override
	public ItemStackTemplate getCraftingRemainder(ItemInstance itemInstance) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemInstance.getOrDefault(DataComponents.DAMAGE, 0) + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return null;
		}
		return ItemStackTemplate.fromNonEmptyStack(retval);
	}
}