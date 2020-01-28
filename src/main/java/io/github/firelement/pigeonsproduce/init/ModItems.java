package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PigeonsProduce.MODID);


    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0.6F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0.6F).build())));

        /*event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0.6F).build())), "example_item"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0.6F).build())), "cheese")
        );*/
}
