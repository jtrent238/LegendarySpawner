package com.jtrent238.legendaryspawner.blocks;

import javax.annotation.Nullable;

import com.jtrent238.legendaryspawner.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockLegendarySpawnerInvisible extends BlockLegendarySpawner {

	
	public BlockLegendarySpawnerInvisible(Material blockMaterial){
		super(blockMaterial);
		this.setCreativeTab(Main.tab_LegendarySpawner);
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.INVISIBLE;
	}
	
	@Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
}

