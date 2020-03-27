package com.jtrent238.legendaryspawner.blocks;

import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Nullable;

import com.jtrent238.legendaryspawner.Main;
import com.pixelmonmod.pixelmon.api.events.spawning.LegendarySpawnEvent;
import com.pixelmonmod.pixelmon.api.spawning.SpawnSet;
import com.pixelmonmod.pixelmon.blocks.spawning.BlockPixelmonSpawner;
import com.pixelmonmod.pixelmon.blocks.spawning.TileEntityPixelmonSpawner;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLegendarySpawner extends BlockPixelmonSpawner {

	public BlockLegendarySpawner(Material blockMaterial){
		super();
		this.setCreativeTab(Main.tab_LegendarySpawner);
	}
	
	public TileEntity createTileEntity(World world, int var1) {
	    return new TileEntityPixelmonSpawner();
	  }
	  
	public void spawnLengendary(ArrayList<EntityPlayerMP> arg0, ArrayList<EntityPlayerMP> arg1, EntityPlayerMP arg2) {
		com.pixelmonmod.pixelmon.spawning.LegendarySpawner.fillNearby(arg0, arg1, arg2);
	}
	
	public void onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		com.pixelmonmod.pixelmon.blocks.spawning.BlockSpawningHandler.getInstance();
		createTileEntity(worldIn, state).setPos(pos);
	
	}
	
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
	    return true;
	  }
	
	public void onBlockTick(World worldIn, LegendarySpawnEvent event, EntityPlayerMP player) {
		event.spawner.spawned.add(UUID.randomUUID());
		event.spawner.shouldDoSpawning();
		event.spawner.spawnSets.add(new SpawnSet());
	}

	
}
