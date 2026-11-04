package net.oreo.mod.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.oreo.mod.Main;


public class ModTags {
    public static class Blocks{
        public static final TagKey<Block>  NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");

        private static TagKey<Block> createTag(String name){
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name));
        }
    }
    public static class Items{
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transfromable_items");
        public static final TagKey<Item> SAPPHIRE_REPAIR = createTag("sapphire_repair");

        private static TagKey<Item> createTag(String name){
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name));
        }
    }
}
