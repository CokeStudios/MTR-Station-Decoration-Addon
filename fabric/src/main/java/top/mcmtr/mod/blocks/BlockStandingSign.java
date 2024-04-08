package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockHelper;
import top.mcmtr.mod.BlockEntityTypes;

public class BlockStandingSign extends BlockCustomTextSignBase {
    public BlockStandingSign(int maxArrivals) {
        super(BlockHelper.createBlockSettings(true, light -> 10).nonOpaque(), maxArrivals, 2);
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockStandingSignEntity(this.maxArrivals, blockPos, blockState);
    }

    public static class BlockStandingSignEntity extends BlockCustomTextSignBaseEntity {
        public BlockStandingSignEntity(int maxArrivals, BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.STANDING_SIGN.get(), blockPos, blockState, maxArrivals);
        }

        @Override
        public String defaultFormat(int line) {
            return null;
        }
    }
}
