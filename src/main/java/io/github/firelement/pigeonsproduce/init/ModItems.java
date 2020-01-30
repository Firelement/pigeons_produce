package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PigeonsProduce.MODID);


    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0.6F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0.6F).build())));
    public static final Item TOMATO = register("tomato", new BlockNamedItem(ModBlocks.TOMATO_PLANT_BLOCK, (new Item.Properties()).group(ItemGroup.MATERIALS)));

    /*event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0.6F).build())), "example_item"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0.6F).build())), "cheese")
        );*/
        private static Item register(Block blockIn) {
            return register(new BlockItem(blockIn, new Item.Properties()));
        }

    private static Item register(Block blockIn, ItemGroup itemGroupIn) {
        return register(new BlockItem(blockIn, (new Item.Properties()).group(itemGroupIn)));
    }

    private static Item register(BlockItem blockItemIn) {
        return register(blockItemIn.getBlock(), blockItemIn);
    }

    protected static Item register(Block blockIn, Item itemIn) {
        return register(Registry.BLOCK.getKey(blockIn), itemIn);
    }

    private static Item register(String key, Item itemIn) {
        return register(new ResourceLocation(key), itemIn);
    }

    private static Item register(ResourceLocation key, Item itemIn) {
        if (itemIn instanceof BlockItem) {
            ((BlockItem)itemIn).addToBlockToItemMap(Item.BLOCK_TO_ITEM, itemIn);
        }

        return Registry.register(Registry.ITEM, key, itemIn);
    }
}
