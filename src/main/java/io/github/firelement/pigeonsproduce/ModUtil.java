package io.github.firelement.pigeonsproduce;

import net.minecraft.util.Direction;
import net.minecraftforge.energy.EnergyStorage;

/**
 * Assorted common utility code
 *
 * @author Cadiboo
 */
public final class ModUtil {

    /**
     * Cache all the directions instead of calling Direction.values()
     * each time (because each call creates a new Direction[] which is wasteful)
     * TODO: change to Direction.VALUES once it's ATed
     */
    public static final Direction[] DIRECTIONS = Direction.values();


}