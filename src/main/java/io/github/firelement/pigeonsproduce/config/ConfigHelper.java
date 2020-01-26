package io.github.firelement.pigeonsproduce.config;
import net.minecraftforge.fml.config.ModConfig;

/**
 * This bakes the config values to normal fields
 *
 * @author Cadiboo
 * It can be merged into the main ExampleModConfig class, but is separate because of personal preference and to keep the code organised
 */
public final class ConfigHelper {

    public static void bakeClient(final ModConfig config) {
        PigeonsProduceConfig.clientBoolean = ConfigHolder.CLIENT.clientBoolean.get();
        PigeonsProduceConfig.clientStringList = ConfigHolder.CLIENT.clientStringList.get();
        PigeonsProduceConfig.clientDyeColorEnum = ConfigHolder.CLIENT.clientDyeColorEnum.get();

        PigeonsProduceConfig.modelTranslucency = ConfigHolder.CLIENT.modelTranslucency.get();
        PigeonsProduceConfig.modelScale = ConfigHolder.CLIENT.modelScale.get();
    }

    public static void bakeServer(final ModConfig config) {
        PigeonsProduceConfig.serverBoolean = ConfigHolder.SERVER.serverBoolean.get();
        PigeonsProduceConfig.serverStringList = ConfigHolder.SERVER.serverStringList.get();
        PigeonsProduceConfig.serverEnumDyeColor = ConfigHolder.SERVER.serverEnumDyeColor.get();

        }

}