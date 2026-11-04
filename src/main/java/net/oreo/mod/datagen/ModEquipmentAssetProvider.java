package net.oreo.mod.datagen;

import net.minecraft.client.resources.model.EquipmentAssetManager;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.oreo.mod.Main;
import net.oreo.mod.modItems.ModArmorMaterials;
import net.oreo.mod.modItems.ModToolsMaterials;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> competableFuture ) {
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer){
        consumer.accept(ModArmorMaterials.SAPPHIRE_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(Main.MOD_ID, "sapphire"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(Main.MOD_ID, "sapphire")))
                        .build());
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        return null;
    }

    @Override
    public String getName() {
        return "Main equipment stuff";
    }
}
