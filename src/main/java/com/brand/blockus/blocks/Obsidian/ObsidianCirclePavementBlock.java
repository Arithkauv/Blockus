package com.brand.blockus.blocks.Obsidian;

import com.brand.blockus.Blockus;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ObsidianCirclePavementBlock extends GlazedTerracottaBlock {

		public ObsidianCirclePavementBlock(String name, float hardness, float resistance) {
			super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).strength(hardness, resistance).build());
			Registry.register(Registry.BLOCK, new Identifier(Blockus.MOD_ID, name), this);
			Registry.register(Registry.ITEM,new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(Blockus.BLOCKUS_BUILDING_BLOCKS)));
		}		
	}
