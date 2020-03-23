package com.jtrent238.lengendaryspawner.blocks;

import java.util.ArrayList;

import javax.annotation.Nullable;

import com.jtrent238.lengendaryspawner.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockLegendarySpawner extends Block {

	public BlockLegendarySpawner(Material blockMaterial){
		super(blockMaterial);
		this.setUnlocalizedName("legendary_spawner");
		this.setRegistryName("legendary_spawner");
		this.setCreativeTab(Main.tab_LegendarySpawner);
	}
	
	public void spawnLengendary(ArrayList<EntityPlayerMP> arg0, ArrayList<EntityPlayerMP> arg1, EntityPlayerMP arg2) {
		com.pixelmonmod.pixelmon.spawning.LegendarySpawner.fillNearby(arg0, arg1, arg2);
	}
	
	public void onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		com.pixelmonmod.pixelmon.blocks.spawning.BlockSpawningHandler.getInstance();
		createTileEntity(worldIn, state).setPos(pos);
	
	}
	
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
		
	}

	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		
	}
	
}
