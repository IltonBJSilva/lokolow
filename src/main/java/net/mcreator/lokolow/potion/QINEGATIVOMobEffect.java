
package net.mcreator.lokolow.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.lokolow.procedures.QINEGATIVOQuandoAPocaoIniciadaaplicadaProcedure;

public class QINEGATIVOMobEffect extends MobEffect {
	public QINEGATIVOMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13382656);
	}

	@Override
	public String getDescriptionId() {
		return "effect.lokolow.qinegativo";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		QINEGATIVOQuandoAPocaoIniciadaaplicadaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
