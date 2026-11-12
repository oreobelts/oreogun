package net.oreo.mod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.oreo.mod.blocks.ModBlocks;
import net.oreo.mod.modItems.ModArmorMaterials;
import net.oreo.mod.modItems.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricPackOutput output)
    {
        super(output);
    }

    // @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_BRICK);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_END_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_NETHER_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CONVERTER_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.URANIUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_LAMP);
    }

    // @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators)
    {
        itemModelGenerators.generateFlatItem(ModItems.LAPIZINGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE,ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAWSAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHISEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BACON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEPLETED_URANIUM_RODS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TRUE_KNIFE, ModelTemplates.FLAT_HANDHELD_ITEM);


        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_BOOTS, ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_CHESTPLATE, ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_LEGGINGS, ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_HELMET, ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateBow(ModItems.GUN);
    }
}