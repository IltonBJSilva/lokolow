
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.lokolow.entity.RubioKnEntity;
import net.mcreator.lokolow.entity.LokowKruegerEntity;
import net.mcreator.lokolow.entity.LokolowpresidenteEntity;
import net.mcreator.lokolow.entity.LokolowVillagerEntity;
import net.mcreator.lokolow.entity.LokolowInversoEntity;
import net.mcreator.lokolow.entity.LejukiWandinhaEntity;
import net.mcreator.lokolow.entity.LejukiVillagerEntity;
import net.mcreator.lokolow.entity.LejukiEntity;
import net.mcreator.lokolow.entity.HelliiotEntity;
import net.mcreator.lokolow.entity.GuleskateEntity;
import net.mcreator.lokolow.entity.CapitalistaEntity;
import net.mcreator.lokolow.LokolowMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LokolowModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LokolowMod.MODID);
	public static final RegistryObject<EntityType<GuleskateEntity>> GULESKATE = register("guleskate",
			EntityType.Builder.<GuleskateEntity>of(GuleskateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GuleskateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CapitalistaEntity>> CAPITALISTA = register("capitalista",
			EntityType.Builder.<CapitalistaEntity>of(CapitalistaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CapitalistaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HelliiotEntity>> HELLIIOT = register("helliiot",
			EntityType.Builder.<HelliiotEntity>of(HelliiotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HelliiotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LokowKruegerEntity>> LOKOW_KRUEGER = register("lokow_krueger",
			EntityType.Builder.<LokowKruegerEntity>of(LokowKruegerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LokowKruegerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LejukiVillagerEntity>> LEJUKI_VILLAGER = register("lejuki_villager",
			EntityType.Builder.<LejukiVillagerEntity>of(LejukiVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LejukiVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LokolowInversoEntity>> LOKOLOW_INVERSO = register("lokolow_inverso",
			EntityType.Builder.<LokolowInversoEntity>of(LokolowInversoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LokolowInversoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LokolowpresidenteEntity>> LOKOLOWPRESIDENTE = register("lokolowpresidente",
			EntityType.Builder.<LokolowpresidenteEntity>of(LokolowpresidenteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LokolowpresidenteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LokolowVillagerEntity>> LOKOLOW_VILLAGER = register("lokolow_villager",
			EntityType.Builder.<LokolowVillagerEntity>of(LokolowVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LokolowVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LejukiEntity>> LEJUKI = register("lejuki",
			EntityType.Builder.<LejukiEntity>of(LejukiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LejukiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LejukiWandinhaEntity>> LEJUKI_WANDINHA = register("lejuki_wandinha",
			EntityType.Builder.<LejukiWandinhaEntity>of(LejukiWandinhaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LejukiWandinhaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RubioKnEntity>> RUBIO_KN = register("rubio_kn",
			EntityType.Builder.<RubioKnEntity>of(RubioKnEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RubioKnEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GuleskateEntity.init();
			CapitalistaEntity.init();
			HelliiotEntity.init();
			LokowKruegerEntity.init();
			LejukiVillagerEntity.init();
			LokolowInversoEntity.init();
			LokolowpresidenteEntity.init();
			LokolowVillagerEntity.init();
			LejukiEntity.init();
			LejukiWandinhaEntity.init();
			RubioKnEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GULESKATE.get(), GuleskateEntity.createAttributes().build());
		event.put(CAPITALISTA.get(), CapitalistaEntity.createAttributes().build());
		event.put(HELLIIOT.get(), HelliiotEntity.createAttributes().build());
		event.put(LOKOW_KRUEGER.get(), LokowKruegerEntity.createAttributes().build());
		event.put(LEJUKI_VILLAGER.get(), LejukiVillagerEntity.createAttributes().build());
		event.put(LOKOLOW_INVERSO.get(), LokolowInversoEntity.createAttributes().build());
		event.put(LOKOLOWPRESIDENTE.get(), LokolowpresidenteEntity.createAttributes().build());
		event.put(LOKOLOW_VILLAGER.get(), LokolowVillagerEntity.createAttributes().build());
		event.put(LEJUKI.get(), LejukiEntity.createAttributes().build());
		event.put(LEJUKI_WANDINHA.get(), LejukiWandinhaEntity.createAttributes().build());
		event.put(RUBIO_KN.get(), RubioKnEntity.createAttributes().build());
	}
}
