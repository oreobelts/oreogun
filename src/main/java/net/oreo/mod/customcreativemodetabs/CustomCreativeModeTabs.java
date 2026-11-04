package net.oreo.mod.customcreativemodetabs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.oreo.mod.Main;
import net.oreo.mod.blocks.ModBlocks;
import net.oreo.mod.modItems.ModItems;


public class CustomCreativeModeTabs{
    public static final CreativeModeTab OREOMOD_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Main.MOD_ID, "oreo.mod"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LAPIZINGOT))
                    .title(Component.translatable("creativemodetab.Main.oreo.mod"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.LAPIZINGOT);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.RAWSAPPHIRE);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.SAPPHIRE_BRICK);
                        output.accept(ModBlocks.SAPPHIRE_END_ORE);
                        output.accept(ModBlocks.SAPPHIRE_NETHER_ORE);   
                        output.accept(ModBlocks.URANIUM_ORE);
                        output.accept(ModBlocks.CONVERTER_BLOCK);
                        output.accept(ModItems.BACON);
                        output.accept(ModItems.SAPPHIRE_SWORD);
                        output.accept(ModItems.SAPPHIRE_PICKAXE);
                        output.accept(ModItems.SAPPHIRE_AXE);
                        output.accept(ModItems.SAPPHIRE_SHOVEL);
                        output.accept(ModItems.SAPPHIRE_HELMET);
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE);
                        output.accept(ModItems.SAPPHIRE_LEGGINGS);
                        output.accept(ModItems.SAPPHIRE_BOOTS);
                        output.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
                        output.accept(ModBlocks.SAPPHIRE_LAMP);
                    }).build());


    public  static  void registerModCreativeModeTabs(){
        Main.LOGGER.info("Registering Creative tabs" + Main.MOD_ID);
    }
}
