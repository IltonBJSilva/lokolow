package net.mcreator.lokolow.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.lokolow.init.LokolowModMobEffects;
import net.mcreator.lokolow.init.LokolowModItems;
import net.mcreator.lokolow.LokolowMod;

public class POTIONNEGATIVOQuandoClicadoComOBotaoDireitoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LokolowModItems.POTIONNEGATIVO.get()) {
			LokolowMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(LokolowModMobEffects.QINEGATIVO.get(), 200, 1));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(LokolowModItems.POTIONNEGATIVO.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			});
		}
	}
}
