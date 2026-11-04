package net.oreo.mod.blocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.oreo.mod.Main;
import net.oreo.mod.blocks.custom.ConverterBlock;
import net.oreo.mod.blocks.custom.SapphireLampBlock;

import java.util.function.Function;

public class ModBlocks {
    public static final Block SAPPHIRE_BLOCK    = registerBlock("sapphire_block",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final Block SAPPHIRE_ORE    = registerBlock("sapphire_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final Block SAPPHIRE_NETHER_ORE    = registerBlock("sapphire_nether_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final Block SAPPHIRE_END_ORE    = registerBlock("sapphire_end_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final Block SAPPHIRE_BRICK    = registerBlock("sapphire_brick",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            properties -> new Block(properties.strength(7f)
                    .requiresCorrectToolForDrops().sound(SoundType.SCAFFOLDING)));

    public static final Block CONVERTER_BLOCK = registerBlock("converter_block",
            properties -> new ConverterBlock(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.SCAFFOLDING)));
    public static final Block SAPPHIRE_LAMP = registerBlock("sapphire_lamp",
            properties -> new SapphireLampBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().lightLevel(state -> state.getValue(SapphireLampBlock.CLICKED) ? 15 : 0)));



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }
    public static void registerModBlocks(){
        Main.LOGGER.info("block stuff" + Main.MOD_ID);
    }
}
