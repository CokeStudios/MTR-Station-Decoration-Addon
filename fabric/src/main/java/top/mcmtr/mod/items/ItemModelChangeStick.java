package top.mcmtr.mod.items;

import org.jetbrains.annotations.Nullable;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.ItemExtension;
import org.mtr.mapping.mapper.TextHelper;
import top.mcmtr.mod.blocks.BlockChangeModelBase;

import java.util.List;

public class ItemModelChangeStick extends ItemExtension {
    public ItemModelChangeStick(ItemSettings itemSettings) {
        super(itemSettings);
    }

    @Override
    public ActionResult useOnBlock2(ItemUsageContext context) {
        final World world = context.getWorld();
        if (!world.isClient()) {
            final BlockState state = world.getBlockState(context.getBlockPos());
            final Block block = state.getBlock();
            if (block.data instanceof BlockChangeModelBase) {
                final int value = state.get(new Property<>(BlockChangeModelBase.TYPE.data));
                final int count = ((BlockChangeModelBase) block.data).getCount();
                world.setBlockState(context.getBlockPos(), state.with(new Property<>(BlockChangeModelBase.TYPE.data), value == (count - 1) ? 0 : (value + 1)));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }

    @Override
    public void addTooltips(ItemStack stack, @Nullable World world, List<MutableText> tooltip, TooltipContext options) {
        tooltip.add(TextHelper.translatable("tooltip.msd.can_change_model").formatted(TextFormatting.GOLD));
    }
}