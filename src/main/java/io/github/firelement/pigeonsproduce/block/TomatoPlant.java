package io.github.firelement.pigeonsproduce.block;

import io.github.firelement.pigeonsproduce.PigeonsProduce;
import io.github.firelement.pigeonsproduce.init.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

public class TomatoPlant extends CropsBlock implements IGrowable {

    public static final IntegerProperty TOMATO_PLANT_AGE = BlockStateProperties.AGE_0_7;

    public TomatoPlant(String name)
    {
        super(Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
        this.setRegistryName(PigeonsProduce.MODID, name);
        this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));
    }


    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
    {
        return new ItemStack(this.getSeedsItem());
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.getBlock() instanceof FarmlandBlock;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.TOMATO_SEEDS;
    }

    public IntegerProperty getAgeProperty()
    {
        return TOMATO_PLANT_AGE;
    }

    public int getMaxAge()
    {
        return 7;
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient)
    {
        return !this.isMaxAge(state);
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        return true;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        this.grow(worldIn, pos, state);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(TOMATO_PLANT_AGE);
    }

}