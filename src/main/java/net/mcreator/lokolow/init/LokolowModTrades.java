
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.lokolow.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class LokolowModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == LokolowModVillagerProfessions.CAPITALISTA_PROFESSION.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.STICK, 10),

					new ItemStack(Items.EMERALD, 3), 20, 15, 0.12f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK), new ItemStack(Items.STICK, 30), new ItemStack(Items.EMERALD, 12), 5, 20, 0.15f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.COBBLESTONE, 64), new ItemStack(Items.COAL, 64), new ItemStack(Items.DIAMOND, 4), 10, 30, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 2), new ItemStack(Blocks.QUARTZ_BLOCK, 32), new ItemStack(Blocks.DIAMOND_BLOCK, 4), 10, 40, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.BLAZE_ROD, 30), new ItemStack(Items.DIAMOND, 9), new ItemStack(Items.NETHERITE_CHESTPLATE), 10, 50, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.BLAZE_ROD, 40), new ItemStack(Items.DIAMOND, 5), new ItemStack(Items.NETHERITE_HELMET), 10, 60, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.BLAZE_ROD, 50), new ItemStack(Items.DIAMOND, 3), new ItemStack(Items.NETHERITE_PICKAXE), 10, 70, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.BLAZE_ROD, 60), new ItemStack(Items.DIAMOND, 2), new ItemStack(Items.NETHERITE_SWORD), 10, 80, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.LAPIS_BLOCK, 4), new ItemStack(LokolowModItems.MAIGOD.get()), new ItemStack(LokolowModItems.MAIGODAXE.get()), 10, 90, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK, 6), new ItemStack(Blocks.EMERALD_BLOCK, 3), new ItemStack(LokolowModItems.CAPITALISTA_PICKAXE.get()), 10, 100, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK), new ItemStack(LokolowModItems.MAIGOD.get(), 2), new ItemStack(LokolowModItems.MAIGODPICKAXE.get()), 10, 200, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND_AXE), new ItemStack(LokolowModItems.TOME.get(), 2), new ItemStack(LokolowModItems.TOMEAXE.get()), 10, 300, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(LokolowModItems.VERY_CAPITALISTA.get(), 10), new ItemStack(Blocks.END_STONE, 64), new ItemStack(Items.ELYTRA), 10, 400, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 2),

					new ItemStack(Blocks.SPONGE), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.ECHO_SHARD), new ItemStack(Items.NETHER_STAR), new ItemStack(Blocks.DRAGON_EGG), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 10), new ItemStack(Blocks.DIAMOND_BLOCK, 10), new ItemStack(LokolowModItems.SUMMON_MOUTAIN.get()), 10, 5, 0.05f));
		}
	}
}
