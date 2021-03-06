package io.github.firelement.pigeonsproduce.client;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.ModBlocks;
import io.github.firelement.pigeonsproduce.client.gui.ModFurnaceScreen;
import io.github.firelement.pigeonsproduce.init.ModContainerTypes;
import io.github.firelement.pigeonsproduce.init.ModTileEntityTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Subscribe to events from the MOD EventBus that should be handled on the PHYSICAL CLIENT side in this class
 *
 * @author Cadiboo
 */
@EventBusSubscriber(modid = PigeonsProduce.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEventSubscriber {

    private static final Logger LOGGER = LogManager.getLogger(PigeonsProduce.MODID + " Client Mod Event Subscriber");

    /**
     * We need to register our renderers on the client because rendering code does not exist on the server
     * and trying to use it on a dedicated server will crash the game.
     * <p>
     * This method will be called by Forge when it is time for the mod to do its client-side setup
     * This method will always be called after the Registry events.
     * This means that all Blocks, Items, TileEntityTypes, etc. will all have been registered already
     */
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {
        // Register ContainerType Screens
        ScreenManager.registerFactory(ModContainerTypes.MOD_FURNACE.get(), ModFurnaceScreen::new);
        RenderTypeLookup.setRenderLayer(ModBlocks.TOMATO_BLOCK, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PEPPER_BLOCK, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.LETTUCE_BLOCK, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.OLIVE_BLOCK, RenderType.cutout());

        LOGGER.debug("Registered ContainerType Screens");

    }

}