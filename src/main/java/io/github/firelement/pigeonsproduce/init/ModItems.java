package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.ModBlocks;
import io.github.firelement.pigeonsproduce.item.SeedItem;
import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PigeonsProduce.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0.6F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0.6F).build())));
    public static final Item TOMATO_SEEDS = register("tomato_seeds", new BlockNamedItem(ModBlocks.TOMATO_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));
   // public static final Item  WHEAT_SEEDS = register("wheat_seeds" , new BlockNamedItem(Blocks.WHEAT, (new Item.Properties()).group(ItemGroup.MATERIALS)));

    private static Item register(String key, Item itemIn) {
        return register(new ResourceLocation("pigeonsproduce:" + key), itemIn);
    }

    private static Item register(ResourceLocation key, Item itemIn) {
        if (itemIn instanceof BlockItem) {
            ((BlockItem)itemIn).addToBlockToItemMap(BlockNamedItem.BLOCK_TO_ITEM, itemIn);
        }

        return Registry.register(Registry.ITEM, key, itemIn);
    }

}
