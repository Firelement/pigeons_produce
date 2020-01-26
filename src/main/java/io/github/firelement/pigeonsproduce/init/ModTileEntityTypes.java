package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.tileentity.ModFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, PigeonsProduce.MODID);

    public static final RegistryObject<TileEntityType<ModFurnaceTileEntity>> MOD_FURNACE = TILE_ENTITY_TYPES.register("mod_furnace", () -> TileEntityType.Builder.create(ModFurnaceTileEntity::new, ModBlocks.MOD_FURNACE.get()).build(null));
}
