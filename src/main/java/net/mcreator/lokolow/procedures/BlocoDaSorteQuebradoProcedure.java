package net.mcreator.lokolow.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.lokolow.init.LokolowModItems;
import net.mcreator.lokolow.init.LokolowModEntities;

public class BlocoDaSorteQuebradoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("lokolowSorte", (Mth.nextInt(RandomSource.create(), 1, 6)));
		if (entity.getPersistentData().getDoubleOr("lokolowSorte", 0) == 1) {
			for (int _i1 = 0; _i1 < 8; _i1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("lokolowSorte", 0) == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = LokolowModEntities.CAPITALISTA.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("lokolow:capitalism_honestamente")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("lokolow:capitalism_honestamente")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("lokolowSorte", 0) == 3) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.NONE);
		} else if (entity.getPersistentData().getDoubleOr("lokolowSorte", 0) == 4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = LokolowModEntities.LOKOLOW.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("lokolow:lokolow_choi")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("lokolow:lokolow_choi")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("lokolowSorte", 0) == 5) {
			for (int _i1 = 0; _i1 < 16; _i1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("lokolow:lokolow_choi")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("lokolow:lokolow_choi")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (entity.getPersistentData().getDoubleOr("lokolowSorte", 0) == 6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.VILLAGER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			for (int _i1 = 0; _i1 < 4; _i1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(LokolowModItems.TOME.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}