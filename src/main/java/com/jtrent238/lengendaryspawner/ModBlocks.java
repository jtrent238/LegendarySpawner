package com.jtrent238.lengendaryspawner;

import com.jtrent238.lengendaryspawner.blocks.BlockLegendarySpawner;
import com.jtrent238.lengendaryspawner.blocks.BlockLegendarySpawnerInvisible;
import com.jtrent238.lengendaryspawner.blocks.BlockSpawnerInvisible;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModBlocks {

	public static final Block blockSpawnerInvisible = new BlockSpawnerInvisible();
	public static final Block blockLegendarySpawner = new BlockLegendarySpawner(Material.CAKE);
	public static final Block blockLegendarySpawnerInvisible = new BlockLegendarySpawnerInvisible();


	@SubscribeEvent
	  public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(new Block [] {
				
				blockSpawnerInvisible, blockLegendarySpawner, blockLegendarySpawnerInvisible
     			

		});
		
	}


}
