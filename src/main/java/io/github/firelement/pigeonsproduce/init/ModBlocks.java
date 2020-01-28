package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.ModFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PigeonsProduce.MODID);

    public static final RegistryObject<Block> MOD_FURNACE = BLOCKS.register("mod_furnace", () -> new ModFurnaceBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f).lightValue(13)));
    public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant", () -> new Block(Block.Properties.create(Material.ORGANIC)));

}
