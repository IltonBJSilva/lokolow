package net.mcreator.lokolow.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.lokolow.init.LokolowModMenus;

public class AnteriorItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 3) {
			entity.getPersistentData().putDouble("playerTradePage", 2);
		} else if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 2) {
			entity.getPersistentData().putDouble("playerTradePage", 1);
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
			_menu.getSlots().get(1).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
	}
}