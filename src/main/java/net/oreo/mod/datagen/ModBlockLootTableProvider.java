package net.oreo.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.oreo.mod.blocks.ModBlocks;
import net.oreo.mod.modItems.ModItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {

    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.SAPPHIRE_BRICK);
        dropSelf(ModBlocks.SAPPHIRE_BLOCK);
        dropSelf(ModBlocks.CONVERTER_BLOCK);
        dropSelf(ModBlocks.SAPPHIRE_LAMP);

        add(ModBlocks.SAPPHIRE_ORE, createMultipleOreDrops(ModBlocks.SAPPHIRE_ORE));
        add(ModBlocks.SAPPHIRE_END_ORE, createMultipleOreDrops(ModBlocks.SAPPHIRE_END_ORE));
        add(ModBlocks.SAPPHIRE_NETHER_ORE, createMultipleOreDrops(ModBlocks.SAPPHIRE_NETHER_ORE));
        add(ModBlocks.URANIUM_ORE, createOreDrop(ModBlocks.URANIUM_ORE, ModItems.DEPLETED_URANIUM_RODS));

    }

    public LootTable.Builder createMultipleOreDrops(final Block block) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                block,      LootItem.lootTableItem(ModItems.RAWSAPPHIRE)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0f,1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
