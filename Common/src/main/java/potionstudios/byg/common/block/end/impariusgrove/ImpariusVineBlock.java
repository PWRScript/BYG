package potionstudios.byg.common.block.end.impariusgrove;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import potionstudios.byg.common.block.BYGBlocks;

import net.minecraft.util.RandomSource;

public class ImpariusVineBlock extends GrowingPlantHeadBlock {
    protected static final VoxelShape SHAPE = Block.box(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);



    public ImpariusVineBlock(Properties properties) {
        super(properties, Direction.DOWN, SHAPE, true, 0.1D);
    }

    /**
     * Used to determine how much to grow the plant when using bonemeal. Kelp always returns 1, where as the nether vines
     * return a RandomSource value at least 1.
     */
    protected int getBlocksToGrowWhenBonemealed(RandomSource rand) {
        return NetherVines.getBlocksToGrowWhenBonemealed(rand);
    }

    protected Block getBodyBlock() {
        return BYGBlocks.IMPARIUS_VINE_PLANT.get();
    }

    protected boolean canGrowInto(BlockState state) {
        return NetherVines.isValidGrowthState(state);
    }
}
