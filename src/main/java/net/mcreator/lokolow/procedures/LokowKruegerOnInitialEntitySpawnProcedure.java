package net.mcreator.lokolow.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class LokowKruegerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("randomTradeItem1", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeItem1") >= 1) {
				entity.getPersistentData().putDouble("tradeItem1", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 1) {
				entity.getPersistentData().putDouble("tradeItem1", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 1) {
				entity.getPersistentData().putDouble("tradeItem1", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 1) {
				entity.getPersistentData().putDouble("tradeItem1", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 1) {
				entity.getPersistentData().putDouble("tradeItem1", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0) {
				entity.getPersistentData().putDouble("tradeItem1", 6);
			}
			entity.getPersistentData().putDouble("randomTradeItem2", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.83) {
				entity.getPersistentData().putDouble("tradeItem2", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.664) {
				entity.getPersistentData().putDouble("tradeItem2", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.498) {
				entity.getPersistentData().putDouble("tradeItem2", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.332) {
				entity.getPersistentData().putDouble("tradeItem2", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.166) {
				entity.getPersistentData().putDouble("tradeItem2", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0) {
				entity.getPersistentData().putDouble("tradeItem2", 6);
			}
			entity.getPersistentData().putDouble("randomTradeItem3", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.83) {
				entity.getPersistentData().putDouble("tradeItem3", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.66) {
				entity.getPersistentData().putDouble("tradeItem3", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.2) {
				entity.getPersistentData().putDouble("tradeItem3", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.33) {
				entity.getPersistentData().putDouble("tradeItem3", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.16) {
				entity.getPersistentData().putDouble("tradeItem3", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.1) {
				entity.getPersistentData().putDouble("tradeItem3", 6);
			}
			entity.getPersistentData().putDouble("randomTradeCount1", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.75) {
				entity.getPersistentData().putDouble("tradeCount1", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.5) {
				entity.getPersistentData().putDouble("tradeCount1", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.25) {
				entity.getPersistentData().putDouble("tradeCount1", 8);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0) {
				entity.getPersistentData().putDouble("tradeCount1", 16);
			}
			entity.getPersistentData().putDouble("randomTradeCount2", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.75) {
				entity.getPersistentData().putDouble("tradeCount2", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.5) {
				entity.getPersistentData().putDouble("tradeCount2", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.25) {
				entity.getPersistentData().putDouble("tradeCount2", 8);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0) {
				entity.getPersistentData().putDouble("tradeCount2", 16);
			}
			entity.getPersistentData().putDouble("randomTradeCount3", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.75) {
				entity.getPersistentData().putDouble("tradeCount3", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.5) {
				entity.getPersistentData().putDouble("tradeCount3", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.25) {
				entity.getPersistentData().putDouble("tradeCount3", 8);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0) {
				entity.getPersistentData().putDouble("tradeCount3", 16);
			}
		}
	}
}
