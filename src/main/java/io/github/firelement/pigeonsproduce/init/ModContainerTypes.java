package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import io.github.firelement.pigeonsproduce.container.ModFurnaceContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, PigeonsProduce.MODID);
    public static final RegistryObject<ContainerType<ModFurnaceContainer>> MOD_FURNACE = CONTAINER_TYPES.register("mod_furnace", () -> IForgeContainerType.create(ModFurnaceContainer::new));
}
