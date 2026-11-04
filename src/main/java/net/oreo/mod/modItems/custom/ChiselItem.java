package net.oreo.mod.modItems.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import  net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.oreo.mod.blocks.ModBlocks;

import java.util.Map;
import java.util.function.Consumer;

public class ChiselItem extends Item {
    private static final Map<Block, Block> Chisel_Map =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.END_STONE, Blocks.END_STONE_BRICKS,
                    Blocks.OAK_LOG, ModBlocks.SAPPHIRE_BLOCK,
                    Blocks.BIRCH_LOG, ModBlocks.SAPPHIRE_BLOCK,
                    Blocks.SPRUCE_LOG, ModBlocks.SAPPHIRE_BLOCK,
                    Blocks.DARK_OAK_LOG, ModBlocks.SAPPHIRE_BLOCK,
                    Blocks.MANGROVE_LOG, ModBlocks.SAPPHIRE_BLOCK,
                    Blocks.PALE_OAK_LOG, ModBlocks.SAPPHIRE_BLOCK,
                    Blocks.NETHERRACK, Blocks.NETHERITE_BLOCK,
                    Blocks.IRON_BLOCK, Blocks.DIAMOND_BLOCK
            );

    public ChiselItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {


        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if (Chisel_Map.containsKey(clickedBlock) && !level.isClientSide()) {
            // we are on sever!
            level.setBlockAndUpdate(context.getClickedPos(), Chisel_Map.get(clickedBlock).defaultBlockState());

            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());

        }

        return InteractionResult.SUCCESS;
    }
}
