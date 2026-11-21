package net.mcreator.lokolow.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.lokolow.procedures.QINEGATIVOQuandoAPocaoIniciadaaplicadaProcedure;

public class QINEGATIVOMobEffect extends MobEffect {
	public QINEGATIVOMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13382656);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		QINEGATIVOQuandoAPocaoIniciadaaplicadaProcedure.execute(entity);
	}
}