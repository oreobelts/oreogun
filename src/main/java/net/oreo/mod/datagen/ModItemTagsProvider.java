package net.oreo.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.oreo.mod.modItems.ModItems;
import net.oreo.mod.tag.ModTags;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {


    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.SAPPHIRE)
                .add(Items.BAMBOO)
                .add(Items.DANDELION)
                .add(Items.NETHERITE_INGOT);
        valueLookupBuilder(ItemTags.SWORDS).add (ModItems.SAPPHIRE_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES).add (ModItems.SAPPHIRE_PICKAXE);
        valueLookupBuilder(ItemTags.AXES).add (ModItems.SAPPHIRE_AXE);
        valueLookupBuilder(ItemTags.SHOVELS).add (ModItems.SAPPHIRE_SHOVEL);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.SAPPHIRE_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.SAPPHIRE_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.SAPPHIRE_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.SAPPHIRE_BOOTS);
    }
}
