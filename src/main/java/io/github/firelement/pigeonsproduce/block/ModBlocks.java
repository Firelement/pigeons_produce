package io.github.firelement.pigeonsproduce.block;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.block.CustomPlant;
import io.github.firelement.pigeonsproduce.block.ModFurnaceBlock;
import io.github.firelement.pigeonsproduce.item.SeedItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PigeonsProduce.MODID);

    public static final RegistryObject<Block> MOD_FURNACE = BLOCKS.register("mod_furnace", () -> new ModFurnaceBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f).lightValue(13)));
    public static final Block TOMATO_BLOCK = register("pigeonsproduce:tomato_block", new CustomPlant(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0,0).tickRandomly().sound(SoundType.CROP)));
    public static final Block PEPPER_BLOCK = register("pigeonsproduce:pepper_block", new CustomPlant(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0,0).tickRandomly().sound(SoundType.CROP)));
    public static final Block LETTUCE_BLOCK = register("pigeonsproduce:lettuce_block", new CustomPlant(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0,0).tickRandomly().sound(SoundType.CROP)));

    private static Block register(String key, Block p_222382_1_) {

        return Registry.register(Registry.BLOCK, key, p_222382_1_);
    }

}
