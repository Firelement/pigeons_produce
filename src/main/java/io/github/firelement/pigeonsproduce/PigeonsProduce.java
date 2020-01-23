package io.github.firelement.pigeonsproduce;

import io.github.firelement.pigeonsproduce.init.ModItemGroups;
import io.github.firelement.pigeonsproduce.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PigeonsProduce.MODID)
public class PigeonsProduce {
    public final static String MODID = "pigeonsproduce";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public PigeonsProduce() {
        LOGGER.debug("Hello from pigeon!");
    }


}
