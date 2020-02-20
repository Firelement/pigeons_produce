package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.ModBlocks;
import io.github.firelement.pigeonsproduce.item.ModKnifeReturnable;
import io.github.firelement.pigeonsproduce.item.ModSwordItem;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PigeonsProduce.MODID);
    //Foods
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(1F).build())));
    public static final RegistryObject<Item> GROUND_MEAT = ITEMS.register("ground_meat", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0F).build())));
    public static final RegistryObject<Item> PEPPERONI = ITEMS.register("pepperoni", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(2).saturation(0.5F).build())));
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(20).saturation(20).build())));
    public static final RegistryObject<Item> PIZZA_SLICE = ITEMS.register("pizza_slice", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(5).saturation(5).build())));

    //Non-Eatable Foods
    public static final RegistryObject<Item> APPLE_VINEGAR = ITEMS.register("apple_vinegar", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> PIZZA_DOUGH = ITEMS.register("pizza_dough", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> UNCOOKED_PIZZA = ITEMS.register("uncooked_pizza", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    //Other Items
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    //Weapons / Tools
    public static final Item KNIFE = register("knife", new ModKnifeReturnable(ItemTier.STONE, 1, -1f,(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP))));
    //Plant Seeds
    public static final Item TOMATO_SEEDS = register("tomato_seeds", new BlockNamedItem(ModBlocks.TOMATO_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final Item PEPPER_SEEDS = register("pepper_seeds", new BlockNamedItem(ModBlocks.PEPPER_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));

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
