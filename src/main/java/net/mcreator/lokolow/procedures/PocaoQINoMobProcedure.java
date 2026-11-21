package net.mcreator.lokolow.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.lokolow.init.LokolowModMobEffects;
import net.mcreator.lokolow.init.LokolowModItems;

public class PocaoQINoMobProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(LokolowModMobEffects.QINEGATIVO, 600, 1));
		if (sourceentity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(LokolowModItems.POTIONNEGATIVO.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}