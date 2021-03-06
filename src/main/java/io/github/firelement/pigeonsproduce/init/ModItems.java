package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.ModBlocks;
import io.github.firelement.pigeonsproduce.item.ModItemReturnable;
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
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(3F).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(3F).build())));
    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(.75F).build())));
    public static final RegistryObject<Item> GROUND_MEAT = ITEMS.register("ground_meat", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0F).build())));
    public static final RegistryObject<Item> PEPPERONI = ITEMS.register("pepperoni", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(2).saturation(0.5F).build())));
    public static final RegistryObject<Item> BURNT_PIZZA = ITEMS.register("burnt_pizza", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(0).build())));
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(40).saturation(40).build())));
    public static final RegistryObject<Item> PIZZA_SLICE = ITEMS.register("pizza_slice", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(10).saturation(10).build())));
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register("sliced_bread", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(0).build())));
    public static final RegistryObject<Item> PASTA = ITEMS.register("pasta", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(2).build())));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(1).build())));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(15).saturation(15).build())));
    public static final RegistryObject<Item> SPAGHETTI = ITEMS.register("spaghetti", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(15).saturation(15).build())));
    public static final RegistryObject<Item> SPAGHETTI_MEATBALL = ITEMS.register("spaghetti_meatball", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(20).saturation(20).build())));
    public static final RegistryObject<Item> COOKED_HAMBURGER_PATTY = ITEMS.register("cooked_hamburger_patty", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(9).saturation(7).build())));
    public static final RegistryObject<Item> BURNT_HAMBURGER_PATTY = ITEMS.register("burnt_hamburger_patty", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(2).saturation(0).build())));
    public static final RegistryObject<Item> COOKED_MEATBALL = ITEMS.register("cooked_meatball", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(5).saturation(5).build())));
    public static final RegistryObject<Item> BURNT_MEATBALL = ITEMS.register("burnt_meatball", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(2).saturation(0).build())));

    //Non-Eatable Foods
    public static final RegistryObject<Item> APPLE_VINEGAR = ITEMS.register("apple_vinegar", () -> new ModItemReturnable(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> KETCHUP = ITEMS.register("ketchup", () -> new ModItemReturnable(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> OLIVE_OIL = ITEMS.register("olive_oil", () -> new ModItemReturnable(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> HAMBURGER_PATTY = ITEMS.register("hamburger_patty", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> PIZZA_DOUGH = ITEMS.register("pizza_dough", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> UNCOOKED_PIZZA = ITEMS.register("uncooked_pizza", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<Item> UNCOOKED_MEATBALL = ITEMS.register("uncooked_meatball", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(9).saturation(7).build())));

    //Other Items
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    //Weapons / Tools
    public static final Item KNIFE = register("knife", new ModKnifeReturnable(ItemTier.STONE, 1, -1f,(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP))));
    //Plant Seeds
    public static final Item TOMATO_SEEDS = register("tomato_seeds", new BlockNamedItem(ModBlocks.TOMATO_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final Item PEPPER_SEEDS = register("pepper_seeds", new BlockNamedItem(ModBlocks.PEPPER_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final Item LETTUCE_SEEDS = register("lettuce_seeds", new BlockNamedItem(ModBlocks.LETTUCE_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));
    public static final Item OLIVE_SEEDS = register("olive_seeds", new BlockNamedItem(ModBlocks.OLIVE_BLOCK,(new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));

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
