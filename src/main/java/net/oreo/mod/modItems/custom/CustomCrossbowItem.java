package net.oreo.mod.modItems.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

public class CustomCrossbowItem extends CrossbowItem {
    private final float attackDamage;

    public CustomCrossbowItem(Properties properties, float attackDamage)
    {
        super(properties);
        this.attackDamage = attackDamage;
    }

    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    protected Projectile createProjectile(Level level, LivingEntity shooter, ItemStack weapon, ItemStack projectileStack, boolean critical)
    {
        Projectile projectile = super.createProjectile(level, shooter, weapon, projectileStack, critical);

        if (projectile instanceof AbstractArrow arrow)
        {
            arrow.setBaseDamage(this.attackDamage);

            arrow.setNoGravity(true);
        }

        return projectile;
    }
}
