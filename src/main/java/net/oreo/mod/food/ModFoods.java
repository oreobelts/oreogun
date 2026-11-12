package net.oreo.mod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties BACON = new FoodProperties.Builder().nutrition(100).saturationModifier(100).build();

    public static final Consumable BACON_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.5f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 100000000, 10000000), 15f)).build();
}
