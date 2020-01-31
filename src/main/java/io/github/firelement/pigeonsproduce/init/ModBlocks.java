package io.github.firelement.pigeonsproduce.init;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.ModFurnaceBlock;
import io.github.firelement.pigeonsproduce.block.TomatoPlant;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PigeonsProduce.MODID);

    public static final RegistryObject<Block> MOD_FURNACE = BLOCKS.register("mod_furnace", () -> new ModFurnaceBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f).lightValue(13)));
    //public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant", () -> new TomatoPlant("tomato_plant"));
    public static final Block TOMATO_PLANT = register("tomato_plant", new TomatoPlant("tomato_plant"));

    //Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP).hardnessAndResistance(0,0)
   private static Block register(String key, Block p_222382_1_) {
       return Registry.register(Registry.BLOCK, key, p_222382_1_);
    }
}
