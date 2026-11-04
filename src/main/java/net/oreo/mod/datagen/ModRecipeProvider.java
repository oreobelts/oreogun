package net.oreo.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.oreo.mod.blocks.ModBlocks;
import net.oreo.mod.modItems.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> Oreo_Smeltables = List.of
                (
                        ModItems.RAWSAPPHIRE,
                        ModItems.SAPPHIRE,
                        ModBlocks.SAPPHIRE_ORE,
                        ModBlocks.SAPPHIRE_END_ORE,
                        ModBlocks.SAPPHIRE_NETHER_ORE
                );

                // Pass unique suffix strings to prevent collision between smelting and blasting JSON names
                oreSmelting(Oreo_Smeltables, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SAPPHIRE, 500f, 20, "sapphire");
                oreBlasting(Oreo_Smeltables, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SAPPHIRE, 1000f, 10, "sapphire");

                // Nine block storage recipes (packs sapphire into sapphire block/brick, and vice versa)
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BRICK);

                // Custom Shaped Recipe
                shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BRICK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAWSAPPHIRE)
                        .unlockedBy(getHasName(ModItems.RAWSAPPHIRE), has(ModItems.RAWSAPPHIRE))
                        .group("sapphire")
                        .save(output, "sapphire_brick_from_raw_sapphire");// Explicit unique filename

                shaped(RecipeCategory.MISC, ModBlocks.CONVERTER_BLOCK)
                        .pattern("CVC")
                        .pattern("VRV")
                        .pattern("CVC")
                        .define('C', Items.DIAMOND)
                        .define('V', Items.LAPIS_BLOCK)
                        .define('R', Items.NETHERITE_BLOCK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .unlockedBy(getHasName(Items.LAPIS_BLOCK), has(Items.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Items.NETHERITE_BLOCK), has(Items.NETHERITE_BLOCK))
                        .group("sapphire")
                        .save(output, "converter_block_from_diamond_lapiz_block_netherite_block");
                shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE)
                        .pattern("CCC")
                        .pattern(" V ")
                        .pattern(" V ")
                        .define('C', Items.DIAMOND)
                        .define('V', Items.STICK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .unlockedBy(getHasName(Items.LAPIS_BLOCK), has(Items.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Items.NETHERITE_BLOCK), has(Items.NETHERITE_BLOCK))
                        .group("sapphire")
                        .save(output, "sapphire_pickaxe_from_diamond_and_stick");
                shaped(RecipeCategory.TOOLS, ModBlocks.SAPPHIRE_LAMP)
                        .pattern("CCC")
                        .pattern("CVC")
                        .pattern("CCC")
                        .define('C', ModItems.SAPPHIRE)
                        .define('V', Items.REDSTONE)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(ModItems.SAPPHIRE))
                        .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                        .group("sapphire")
                        .save(output, "sapphire_lamp_from_sapphire_and_redstone");
                shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE)
                        .pattern(" CC")
                        .pattern(" VC")
                        .pattern(" V ")
                        .define('C', ModItems.SAPPHIRE)
                        .define('V', Items.STICK)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(ModItems.SAPPHIRE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("sapphire")
                        .save(output, "sapphire_axe_from_diamond_and_stick");

                // Custom Shapeless Recipe
                shapeless(RecipeCategory.MISC, ModItems.CHISEL, 1)
                        .requires(ModItems.SAPPHIRE)
                        .requires(Items.STICK)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(ModItems.SAPPHIRE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("sapphire")
                        .save(output, "chisel_from_sapphire_and_stick"); // Updated for accuracy*/

                shapeless(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SWORD, 1)
                        .requires(ModItems.SAPPHIRE)
                        .requires(ModItems.SAPPHIRE)
                        .requires(Items.STICK)
                        .unlockedBy(getHasName(ModItems.SAPPHIRE), has(ModItems.SAPPHIRE))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("sapphire")
                        .save(output, "sapphire_sword_from_sapphire_and_stick"); // Updated for accuracy*/
            }
        };
    }

    @Override
    public String getName() {
        return "OreoGunMod Recipes";
    }
}