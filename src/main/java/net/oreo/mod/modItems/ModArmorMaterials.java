package net.oreo.mod.modItems;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.oreo.mod.Main;
import net.oreo.mod.tag.ModTags;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equiment_asset"));
    public static final ResourceKey<EquipmentAsset> SAPPHIRE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Main.MOD_ID, "sapphire"));

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIALS = new ArmorMaterial(75000,
            ArmorMaterials.makeDefense(20, 30, 80, 40, 100),
            100, SoundEvents.ARMOR_EQUIP_ELYTRA, 10, 3, ModTags.Items.SAPPHIRE_REPAIR, SAPPHIRE_KEY);

}
