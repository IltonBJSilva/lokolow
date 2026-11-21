package net.mcreator.lokolow.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.lokolow.init.LokolowModMenus;

public class TesteItensProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 1) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LokolowModMenus.MenuAccessor _menu1 ? _menu1.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack5 = new ItemStack(Blocks.OAK_LOG).copy();
						_setstack5.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack5);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack8 = new ItemStack(Blocks.SPRUCE_LOG).copy();
						_setstack8.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack8);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack11 = new ItemStack(Blocks.BIRCH_LOG).copy();
						_setstack11.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack11);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack14 = new ItemStack(Blocks.JUNGLE_LOG).copy();
						_setstack14.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack14);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack17 = new ItemStack(Blocks.ACACIA_LOG).copy();
						_setstack17.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack17);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack20 = new ItemStack(Blocks.DARK_OAK_LOG).copy();
						_setstack20.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack20);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 2) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LokolowModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack28 = new ItemStack(Blocks.OAK_SAPLING).copy();
						_setstack28.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack28);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack31 = new ItemStack(Blocks.SPRUCE_SAPLING).copy();
						_setstack31.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack31);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack34 = new ItemStack(Blocks.BIRCH_SAPLING).copy();
						_setstack34.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack34);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack37 = new ItemStack(Blocks.JUNGLE_SAPLING).copy();
						_setstack37.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack37);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack40 = new ItemStack(Blocks.ACACIA_SAPLING).copy();
						_setstack40.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack40);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack43 = new ItemStack(Blocks.DARK_OAK_SAPLING).copy();
						_setstack43.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack43);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 3) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LokolowModMenus.MenuAccessor _menu47 ? _menu47.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack51 = new ItemStack(Blocks.OAK_PLANKS).copy();
						_setstack51.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack51);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack54 = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
						_setstack54.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack54);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack57 = new ItemStack(Blocks.BIRCH_PLANKS).copy();
						_setstack57.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack57);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack60 = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
						_setstack60.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack60);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack63 = new ItemStack(Blocks.ACACIA_PLANKS).copy();
						_setstack63.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack63);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack66 = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
						_setstack66.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack66);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).remove((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}