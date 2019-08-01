package com.cacatoes.yapp.block;

import com.cacatoes.yapp.YAPP;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TargetBlock extends Block {
    private static final String NAME = "target_block";

    public TargetBlock() {
        super(Material.ROCK);

        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setRegistryName(YAPP.MOD_ID, NAME);
        this.setUnlocalizedName(NAME);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }
}
