package io.github.firelement.pigeonsproduce;


import io.github.firelement.pigeonsproduce.init.ModItemGroups;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = PigeonsProduce.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {


    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(1).saturation(0.6F).build())), "example_item"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(new Food.Builder().hunger(3).saturation(0.6F).build())), "cheese")
        );
    }



    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(PigeonsProduce.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
