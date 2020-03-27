package com.jtrent238.legendaryspawner;

import com.jtrent238.legendaryspawner.blocks.BlockLegendarySpawner;
import com.jtrent238.legendaryspawner.blocks.BlockLegendarySpawnerInvisible;
import com.jtrent238.legendaryspawner.blocks.BlockSpawnerInvisible;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModBlocks {

	public static final Block blockSpawnerInvisible = new BlockSpawnerInvisible().setUnlocalizedName("invisible_spawner").setRegistryName("invisible_spawner");
	public static final Block blockLegendarySpawner = new BlockLegendarySpawner(Material.IRON).setUnlocalizedName("legendary_spawner").setRegistryName("legendary_spawner");
	public static final Block blockLegendarySpawnerInvisible = new BlockLegendarySpawnerInvisible(Material.IRON).setUnlocalizedName("invisible_legendary_spawner").setRegistryName("invisible_legendary_spawner");


	@SubscribeEvent
	  public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(new Block [] {
				
				blockSpawnerInvisible, blockLegendarySpawner, blockLegendarySpawnerInvisible
     			

		});
		
	}


}
