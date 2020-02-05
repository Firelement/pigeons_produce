package io.github.firelement.pigeonsproduce.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;

import java.util.Map;

public class SeedItem extends BlockNamedItem {
    public SeedItem(Block blockIn, Item.Properties properties) {
        super(blockIn, properties);
    }

    /**
     * Returns the unlocalized name of this item.
     */
    public String getTranslationKey() {
        return this.getDefaultTranslationKey();
    }
}
