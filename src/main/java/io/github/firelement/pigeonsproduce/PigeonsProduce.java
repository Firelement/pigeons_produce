package io.github.firelement.pigeonsproduce;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PigeonsProduce.MODID)
public class PigeonsProduce {
    public final static String MODID = "pigeons_produce";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public PigeonsProduce() {
        LOGGER.debug("Hello from pigeon!");
    }
}
