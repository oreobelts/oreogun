package net.oreo.mod.modItems;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import net.oreo.mod.Main;
import net.oreo.mod.food.ModFoods;
import net.oreo.mod.modItems.custom.ChiselItem;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModItems {

    public static final Item LAPIZINGOT = registerItem("lapiz_ingot", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item RAWSAPPHIRE = registerItem("raw_sapphire", Item::new);

    public static final Item CHISEL = registerItem("chisel", properties -> new ChiselItem(properties.durability( 100)));
    public static final Item BACON = registerItem("bacon", properties -> new Item(properties
            .food(ModFoods.BACON, ModFoods.BACON_CONSUMABLE)) {

    });


    public static final Item DEPLETED_URANIUM_RODS = registerItem("depleted_uranium_rods", properties -> new Item(properties.stacksTo(64)));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            properties -> new Item(properties.sword(ModToolsMaterials.SAPPHIRE, 17, -1f)));
    public static final Item TRUE_KNIFE = registerItem("true_knife",
            properties -> new Item(properties.sword(ModToolsMaterials.KNIFE, 999999999, 0f)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            properties -> new ShovelItem(ModToolsMaterials.SAPPHIRE, 55, -2.5f, properties));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolsMaterials.SAPPHIRE, 7, -3f)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            properties -> new ShovelItem(ModToolsMaterials.SAPPHIRE, 7, -3f, properties));

    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIALS, ArmorType.BOOTS)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIALS, ArmorType.HELMET)));

    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIALS, ArmorType.CHESTPLATE)));

    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIALS, ArmorType.LEGGINGS)));

    public static final Item SAPPHIRE_HORSE_ARMOR = registerItem("sapphire_horse_armor",
            properties -> new Item(properties.horseArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIALS)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Main.LOGGER.info("Registering Mod Items for " + Main.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(LAPIZINGOT);
            output.accept(SAPPHIRE);
            output.accept(RAWSAPPHIRE);
        });
    }
}