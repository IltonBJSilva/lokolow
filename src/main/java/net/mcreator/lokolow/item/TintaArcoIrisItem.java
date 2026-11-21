package net.mcreator.lokolow.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.lokolow.procedures.AplicarTintaArcoIrisProcedure;

public class TintaArcoIrisItem extends Item {
	public TintaArcoIrisItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(16));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		AplicarTintaArcoIrisProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}