package potionstudios.byg.common.world.feature.gen.overworld.trees.palm;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import potionstudios.byg.common.world.feature.config.BYGTreeConfig;
import potionstudios.byg.common.world.feature.gen.overworld.trees.util.BYGAbstractTreeFeature;

import net.minecraft.util.RandomSource;
import java.util.Set;

public class PalmTree4 extends BYGAbstractTreeFeature<BYGTreeConfig> {
    //private static final BlockState LOG = Blocks.JUNGLE_LOG.getDefaultState();
    //private static final BlockState LEAVES = Blocks.JUNGLE_LEAVES.getDefaultState();
    private static final BlockState BEENEST = Blocks.BEE_NEST.defaultBlockState();

    public PalmTree4(Codec<BYGTreeConfig> configIn) {
        super(configIn);
    }

    protected boolean generate(Set<BlockPos> changedBlocks, WorldGenLevel worldIn, RandomSource rand, BlockPos pos, BoundingBox boundsIn, boolean isSapling, BYGTreeConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.MutableBlockPos mainmutable = new BlockPos.MutableBlockPos().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxBuildHeight()) {
            if (!isDesiredGroundwSandTag(worldIn, pos.below(), config) || !isDesiredGroundwDirtTag(worldIn, pos.below(), config)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 7, 5, 5, isSapling)) {
                return false;
            } else {
                mainmutable.set(pos).immutable();
                mainmutable.set(pos).move(0, 0, 1).immutable();
                mainmutable.set(pos).move(1, 0, 0).immutable();
                mainmutable.set(pos).move(1, 0, 1).immutable();

                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 0, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 1, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 2, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 3, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 4, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 5, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 6, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 7, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 0, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 0, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 0, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 1, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 1, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 1, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 2, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 2, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 2, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 3, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 3, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 3, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 4, 0), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 4, -1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 4, 1), boundsIn);
                placeTrunk(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 4, 0), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 5, 0), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 5, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 5, 1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 5, 0), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 6, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 6, 0), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 6, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 7, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 7, 0), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 7, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 8, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 8, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 8, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 8, 0), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 8, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 9, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 9, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 9, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 10, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 10, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 10, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 10, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 11, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 11, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 11, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 11, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 12, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 12, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 12, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 12, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 12, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 12, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 13, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 13, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 13, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 13, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 13, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 14, -4), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 14, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 14, -4), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 14, -1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 15, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 15, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -6), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, 1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -6), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -2), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, 1), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 15, -3), boundsIn);
                placeBranch(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 13, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 13, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 13, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 13, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 13, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 13, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 13, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 13, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 13, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 13, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 13, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 13, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 13, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-9, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-9, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-8, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-8, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-7, 14, -7), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-7, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-7, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-7, 14, 2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, -7), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 14, 2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 14, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 14, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 14, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 14, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -9), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -8), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, 3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 14, 4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -9), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -8), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, 3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 14, 4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 14, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 14, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 14, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 14, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, -7), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 14, 2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(2, 14, -7), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(2, 14, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(2, 14, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(2, 14, 2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(3, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(3, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(4, 14, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(4, 14, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-8, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-8, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-7, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-7, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 15, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 15, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -8), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -7), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, 2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 15, 3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -8), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -7), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, 2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 15, 3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 15, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 15, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 15, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 15, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 15, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 15, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(2, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(2, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(3, 15, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(3, 15, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-6, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-5, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 16, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 16, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 16, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, -6), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, -5), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, 0), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 16, 1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 16, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 16, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(0, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 16, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(1, 16, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 17, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-4, 17, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 17, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 17, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 17, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-3, 17, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 17, -4), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 17, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 17, -2), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-2, 17, -1), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 17, -3), boundsIn);
                placeLeaves(pos, config, rand, changedBlocks, worldIn, mainmutable.set(pos).move(-1, 17, -2), boundsIn);
            }
        }
        return true;
    }
}