package io.github.firelement.pigeonsproduce;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.energy.EnergyStorage;

/**
 * Assorted common utility code
 *
 * @author Cadiboo
 */
public final class ModUtil {
    @Deprecated public static final DefaultedRegistry<Block> BLOCK = Registry.BLOCK;
    /**
     * Cache all the directions instead of calling Direction.values()
     * each time (because each call creates a new Direction[] which is wasteful)
     * TODO: change to Direction.VALUES once it's ATed
     */
    public static final Direction[] DIRECTIONS = Direction.values();


}