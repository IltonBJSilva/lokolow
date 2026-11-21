package net.mcreator.lokolow.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.lokolow.init.LokolowModMenus;

public class RemoverProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
			_menu.getSlots().get(0).remove(1);
			_player.containerMenu.broadcastChanges();
		}
	}
}