package com.brand.blockus.blocks.FlowerPot;

import java.util.Map;

import com.brand.blockus.content.LargeFlowerPots;
import com.google.common.collect.Maps;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class LargeFlowerPotBlock extends Block {
	   private static final Map<Block, Block> CONTENT_TO_POTTED = Maps.newHashMap();
	   protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
	   private final Block content;
		
	   public LargeFlowerPotBlock(Block content, Block.Settings settings) {
		super(settings);
		this.content = content;
	      CONTENT_TO_POTTED.put(content, this);
	   }
	   
	   public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, EntityContext context) {
		      return SHAPE;
	   }

	   public BlockRenderType getRenderType(BlockState state) {
	      return BlockRenderType.MODEL;
	   }

	   public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
	      ItemStack itemStack = player.getStackInHand(hand);
	      Item item = itemStack.getItem();
	      Block block = item instanceof BlockItem ? (Block)CONTENT_TO_POTTED.getOrDefault(((BlockItem)item).getBlock(), Blocks.AIR) : Blocks.AIR;
	      boolean bl = block == Blocks.AIR;
	      boolean bl2 = this.content == Blocks.AIR;
	      if (bl != bl2) {
	         if (bl2) {
	            world.setBlockState(pos, block.getDefaultState(), 3);
	            player.incrementStat(Stats.POT_FLOWER);
	            if (!player.abilities.creativeMode) {
	               itemStack.decrement(1);
	            }
	         } else {
	            ItemStack itemStack2 = new ItemStack(this.content);
	            if (itemStack.isEmpty()) {
	               player.setStackInHand(hand, itemStack2);
	            } else if (!player.giveItemStack(itemStack2)) {
	               player.dropItem(itemStack2, false);
	            }

	            world.setBlockState(pos, LargeFlowerPots.LARGE_FLOWER_POT.getDefaultState(), 3);
	         }

	         return ActionResult.SUCCESS;
	      } else {
	         return ActionResult.CONSUME;
	      }
	   }

	   @Environment(EnvType.CLIENT)
	   public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
	      return this.content == Blocks.AIR ? super.getPickStack(world, pos, state) : new ItemStack(this.content);
	   }

	   public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
	      return facing == Direction.DOWN && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
	   }

	   public Block getContent() {
	      return this.content;
	   }
	}
