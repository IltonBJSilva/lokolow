/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lokolow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.lokolow.entity.*;
import net.mcreator.lokolow.LokolowMod;

@EventBusSubscriber
public class LokolowModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, LokolowMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CapitalistaEntity>> CAPITALISTA = register("capitalista",
			EntityType.Builder.<CapitalistaEntity>of(CapitalistaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GuleskateEntity>> GULESKATE = register("guleskate",
			EntityType.Builder.<GuleskateEntity>of(GuleskateEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HelliiotEntity>> HELLIIOT = register("helliiot",
			EntityType.Builder.<HelliiotEntity>of(HelliiotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LokowKruegerEntity>> LOKOW_KRUEGER = register("lokow_krueger",
			EntityType.Builder.<LokowKruegerEntity>of(LokowKruegerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LokolowInversoEntity>> LOKOLOW_INVERSO = register("lokolow_inverso",
			EntityType.Builder.<LokolowInversoEntity>of(LokolowInversoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LokolowpresidenteEntity>> LOKOLOWPRESIDENTE = register("lokolowpresidente",
			EntityType.Builder.<LokolowpresidenteEntity>of(LokolowpresidenteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LejukiEntity>> LEJUKI = register("lejuki",
			EntityType.Builder.<LejukiEntity>of(LejukiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LejukiWandinhaEntity>> LEJUKI_WANDINHA = register("lejuki_wandinha",
			EntityType.Builder.<LejukiWandinhaEntity>of(LejukiWandinhaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RubioKnEntity>> RUBIO_KN = register("rubio_kn",
			EntityType.Builder.<RubioKnEntity>of(RubioKnEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LokolowEntity>> LOKOLOW = register("lokolow",
			EntityType.Builder.<LokolowEntity>of(LokolowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(LokolowMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CapitalistaEntity.init(event);
		GuleskateEntity.init(event);
		HelliiotEntity.init(event);
		LokowKruegerEntity.init(event);
		LokolowInversoEntity.init(event);
		LokolowpresidenteEntity.init(event);
		LejukiEntity.init(event);
		LejukiWandinhaEntity.init(event);
		RubioKnEntity.init(event);
		LokolowEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CAPITALISTA.get(), CapitalistaEntity.createAttributes().build());
		event.put(GULESKATE.get(), GuleskateEntity.createAttributes().build());
		event.put(HELLIIOT.get(), HelliiotEntity.createAttributes().build());
		event.put(LOKOW_KRUEGER.get(), LokowKruegerEntity.createAttributes().build());
		event.put(LOKOLOW_INVERSO.get(), LokolowInversoEntity.createAttributes().build());
		event.put(LOKOLOWPRESIDENTE.get(), LokolowpresidenteEntity.createAttributes().build());
		event.put(LEJUKI.get(), LejukiEntity.createAttributes().build());
		event.put(LEJUKI_WANDINHA.get(), LejukiWandinhaEntity.createAttributes().build());
		event.put(RUBIO_KN.get(), RubioKnEntity.createAttributes().build());
		event.put(LOKOLOW.get(), LokolowEntity.createAttributes().build());
	}
}