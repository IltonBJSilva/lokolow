package net.mcreator.lokolow.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class TesteItensProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.OAK_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SPRUCE_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.BIRCH_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.JUNGLE_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.ACACIA_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove((int) entity.getPersistentData().getDouble("playerTradeCount1"));
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.OAK_SAPLING);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SPRUCE_SAPLING);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.BIRCH_SAPLING);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SAPLING);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.ACACIA_SAPLING);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_SAPLING);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove((int) entity.getPersistentData().getDouble("playerTradeCount2"));
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove((int) entity.getPersistentData().getDouble("playerTradeCount3"));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
