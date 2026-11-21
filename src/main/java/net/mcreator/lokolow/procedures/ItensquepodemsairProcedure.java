package net.mcreator.lokolow.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.lokolow.init.LokolowModMenus;
import net.mcreator.lokolow.init.LokolowModItems;

public class ItensquepodemsairProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 1) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LokolowModMenus.MenuAccessor _menu1 ? _menu1.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack5 = new ItemStack(Blocks.PUMPKIN).copy();
						_setstack5.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack5);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack8 = new ItemStack(Blocks.CARVED_PUMPKIN).copy();
						_setstack8.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack8);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack11 = new ItemStack(Blocks.JACK_O_LANTERN).copy();
						_setstack11.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack11);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack14 = new ItemStack(Items.PUMPKIN_PIE).copy();
						_setstack14.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack14);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack17 = new ItemStack(Items.PUMPKIN_SEEDS).copy();
						_setstack17.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack17);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem1", 0) == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack20 = new ItemStack(Blocks.REDSTONE_TORCH).copy();
						_setstack20.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount1", 0));
						_menu.getSlots().get(1).set(_setstack20);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 2) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LokolowModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack27 = new ItemStack(Blocks.OBSIDIAN).copy();
						_setstack27.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack27);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack30 = new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS).copy();
						_setstack30.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack30);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack33 = new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICKS).copy();
						_setstack33.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack33);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack36 = new ItemStack(Blocks.CHISELED_DEEPSLATE).copy();
						_setstack36.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack36);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack38 = new ItemStack(Blocks.BLACK_BED).copy();
						_setstack38.setCount(1);
						_menu.getSlots().get(1).set(_setstack38);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem2", 0) == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack41 = new ItemStack(Blocks.BLACK_WOOL).copy();
						_setstack41.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount2", 0));
						_menu.getSlots().get(1).set(_setstack41);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("playerTradePage", 0) == 3) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LokolowModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.NETHERITE_BLOCK.asItem()) {
				if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack48 = new ItemStack(Blocks.CHISELED_BOOKSHELF).copy();
						_setstack48.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack48);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack51 = new ItemStack(Blocks.BLACK_CANDLE).copy();
						_setstack51.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack51);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack54 = new ItemStack(Blocks.ENCHANTING_TABLE).copy();
						_setstack54.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack54);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack57 = new ItemStack(Blocks.COAL_BLOCK).copy();
						_setstack57.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack57);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack60 = new ItemStack(Blocks.SOUL_SAND).copy();
						_setstack60.setCount((int) entity.getPersistentData().getDoubleOr("playerTradeCount3", 0));
						_menu.getSlots().get(1).set(_setstack60);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDoubleOr("playerTradeItem3", 0) == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
						ItemStack _setstack62 = new ItemStack(LokolowModItems.SUMMON_MOUTAIN.get()).copy();
						_setstack62.setCount(1);
						_menu.getSlots().get(1).set(_setstack62);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof LokolowModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(1).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}