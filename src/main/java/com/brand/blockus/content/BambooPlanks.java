package com.brand.blockus.content;


import com.brand.blockus.Blockus;
import com.brand.blockus.blocks.Base.DoorBase;
import com.brand.blockus.blocks.Base.FenceBase;
import com.brand.blockus.blocks.Base.FenceGateBase;
import com.brand.blockus.blocks.Base.PressurePlateBase;
import com.brand.blockus.blocks.Base.TrapdoorBase;
import com.brand.blockus.blocks.Base.SpecificTool.BlockBase2;
import com.brand.blockus.blocks.Base.SpecificTool.SlabBase2;
import com.brand.blockus.blocks.Base.SpecificTool.StairsBase2;
import com.brand.blockus.blocks.Wood.WoodButtonBase;

import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.sound.BlockSoundGroup;

public class BambooPlanks {
	
	public static final BlockBase2 BAMBOO_PLANKS = new BlockBase2("bamboo_planks", 2.0f, 3.0f, Material.WOOD, BlockSoundGroup.WOOD, Blockus.BLOCKUS_BUILDING_BLOCKS, FabricToolTags.AXES, 0);
	public static final SlabBase2 BAMBOO_SLAB = new SlabBase2("bamboo_slab", 2.0f, 3.0f, Material.WOOD, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0);
	public static final StairsBase2 BAMBOO_STAIRS = new StairsBase2(BAMBOO_PLANKS.getDefaultState(), "bamboo_stairs", 2.0f, 3.0f, Material.WOOD, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0);
	public static final FenceBase BAMBOO_FENCE = new FenceBase("bamboo_fence", 2.0f, 3.0f);
	public static final FenceGateBase BAMBOO_FENCE_GATE = new FenceGateBase("bamboo_fence_gate", 2.0f, 3.0f);
	public static final PressurePlateBase BAMBOO_PRESSURE_PLATE = new PressurePlateBase("bamboo_pressure_plate", 2.0f, 3.0f, ActivationRule.EVERYTHING);
	public static final WoodButtonBase BAMBOO_BUTTON = new WoodButtonBase("bamboo_button", 2.0f, 3.0f);
	public static final DoorBase BAMBOO_DOOR = new DoorBase("bamboo_door", 2.0f, 3.0f, Material.WOOD, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0);
	public static final TrapdoorBase BAMBOO_TRAPDOOR = new TrapdoorBase("bamboo_trapdoor", 2.0f, 3.0f, Material.WOOD, BlockSoundGroup.WOOD, FabricToolTags.AXES, 0);
	
}
