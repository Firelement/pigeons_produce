package io.github.firelement.pigeonsproduce.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;

import java.util.Map;

public class SeedItem extends BlockNamedItem {
    public static final Map<Block, Item> BLOCK_TO_ITEM = net.minecraftforge.registries.GameData.getBlockItemMap();

    public SeedItem(Block blockIn, Properties properties) {
        super(blockIn, properties);
    }

}
