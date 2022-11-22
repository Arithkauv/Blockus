package com.brand.blockus.content.types;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.BlocksRegistration;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.ItemGroup;

import java.util.ArrayList;

public class ConcreteTypes {
    private static final ArrayList<ConcreteTypes> LIST = new ArrayList<>();

    public final Block block;
    public final Block slab;
    public final Block stairs;
    public final Block wall;
    public final Block base;
    public final Block chiseled;
    public final Block pillar;

    public ConcreteTypes(String type, Block base) {

        this.base = base;

        ItemGroup group = Blockus.BLOCKUS_BUILDING_BLOCKS;
        this.block = BlocksRegistration.register(type, new Block(FabricBlockSettings.copyOf(base)), group);
        this.slab = BlocksRegistration.registerSlab(this.block);
        this.stairs = BlocksRegistration.registerStairs(this.block);
        this.wall = BlocksRegistration.registerWall(this.block);
        String replace = type.replace("_bricks", "");
        this.chiseled = BlocksRegistration.register("chiseled_" + replace, new Block(FabricBlockSettings.copyOf(base)), group);
        this.pillar = BlocksRegistration.register(replace + "_pillar", new PillarBlock(FabricBlockSettings.copyOf(base)), group);

        LIST.add(this);
    }

    public static ArrayList<ConcreteTypes> values() {
        return LIST;
    }
}
