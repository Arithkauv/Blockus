package com.brand.blockus.blocks.base.asphalt;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class AsphaltSlab extends SlabBlock {

    public AsphaltSlab(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        AsphaltBlock.applySprintEffect(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext context) {
        AsphaltBlock.addTooltipInfo(stack, world, tooltip, context);
    }
}
