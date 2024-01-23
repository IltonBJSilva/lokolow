
package net.mcreator.lokolow.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.lokolow.init.LokolowModBlocks;

import java.util.List;

public class CapitalistaaxeItem extends AxeItem {
	public CapitalistaaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 80f;
			}

			public float getAttackDamageBonus() {
				return 78f;
			}

			public int getLevel() {
				return 80;
			}

			public int getEnchantmentValue() {
				return 40;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LokolowModBlocks.CAPITALISTAORE.get()));
			}
		}, 1, 46f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
