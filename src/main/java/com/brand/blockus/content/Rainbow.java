package com.brand.blockus.content;

import com.brand.blockus.Blockus;
import com.brand.blockus.blocks.Base.BlockBase;
import com.brand.blockus.blocks.Base.PillarBase;
import com.brand.blockus.blocks.Base.SlabBase;
import com.brand.blockus.blocks.Base.StairsBase;
import com.brand.blockus.blocks.Base.WallBase;
import com.brand.blockus.blocks.Light.LightBlockBase;
import com.brand.blockus.blocks.Light.RedstoneLampBase;

import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class Rainbow {
	
	
	public static final PillarBase RAINBOW_BLOCK = new PillarBase("rainbow_block", 5.0f, 6.0f, Material.STONE, BlockSoundGroup.STONE);		
	public static final BlockBase RAINBOW_BRICKS = new BlockBase("rainbow_bricks", 1.5f, 6.0f, Material.STONE, BlockSoundGroup.STONE, Blockus.BLOCKUS_BUILDING_BLOCKS);
	public static final StairsBase RAINBOW_BRICKS_STAIRS = new StairsBase(RAINBOW_BRICKS.getDefaultState(), "rainbow_bricks_stairs", 1.5f, 6.0f, Material.STONE, BlockSoundGroup.STONE);
	public static final SlabBase RAINBOW_BRICKS_SLAB = new SlabBase("rainbow_bricks_slab", 2.0f, 6.0f, Material.STONE, BlockSoundGroup.STONE);
	public static final WallBase RAINBOW_BRICKS_WALL = new WallBase("rainbow_bricks_wall", 1.5f, 6.0f, Material.STONE, BlockSoundGroup.STONE);
	public static final RedstoneLampBase RAINBOW_LAMP = new RedstoneLampBase("rainbow_lamp", 0.3f, 0.3f);
	public static final LightBlockBase RAINBOW_LAMP_LIT = new LightBlockBase("rainbow_lamp_lit", 0.3f, 0.3f, Material.REDSTONE_LAMP, BlockSoundGroup.GLASS, Blockus.BLOCKUS_DECORATIONS, 15);
	
}
