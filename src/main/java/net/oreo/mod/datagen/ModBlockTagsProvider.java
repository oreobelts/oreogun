package net.oreo.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.oreo.mod.blocks.ModBlocks;
import net.oreo.mod.tag.ModTags;

import javax.swing.text.BadLocationException;
import java.rmi.MarshalledObject;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {

    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_BRICK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.SAPPHIRE_END_ORE)
                .add(ModBlocks.SAPPHIRE_NETHER_ORE);
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL);
        valueLookupBuilder(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.CONVERTER_BLOCK)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
