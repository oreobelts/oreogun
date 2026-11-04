package net.oreo.mod.registries;


import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.oreo.mod.modItems.ModItems;

public class ModFuels {
    public static void registerFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.DEPLETED_URANIUM_RODS, 1000000000);
        });
    }
}
