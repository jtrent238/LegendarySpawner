package com.jtrent238.legendaryspawner;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Main.MODID)@EventBusSubscriber
public class ModItems {
	

	
	
	private static ModelRegistryEvent mre;

	@SubscribeEvent
	  public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new Item [] {
			
				(Item)new ItemBlock(ModBlocks.blockSpawnerInvisible).setRegistryName(ModBlocks.blockSpawnerInvisible.getRegistryName()), 
				(Item)new ItemBlock(ModBlocks.blockLegendarySpawner).setRegistryName(ModBlocks.blockLegendarySpawner.getRegistryName()), 
				(Item)new ItemBlock(ModBlocks.blockLegendarySpawnerInvisible).setRegistryName(ModBlocks.blockLegendarySpawnerInvisible.getRegistryName()), 
				
		});
		registerItemRenders(mre);
	}

	@SubscribeEvent
	  public static void registerItemRenders(ModelRegistryEvent event)
	  {
	    registerRender(new ItemBlock(ModBlocks.blockSpawnerInvisible).getItemFromBlock(ModBlocks.blockSpawnerInvisible));
	    registerRender(new ItemBlock(ModBlocks.blockLegendarySpawner).getItemFromBlock(ModBlocks.blockLegendarySpawner));
	    registerRender(new ItemBlock(ModBlocks.blockLegendarySpawnerInvisible).getItemFromBlock(ModBlocks.blockLegendarySpawnerInvisible));
	    
        registerRender(Item.getItemFromBlock(ModBlocks.blockSpawnerInvisible));
        registerRender(Item.getItemFromBlock(ModBlocks.blockLegendarySpawner));
        registerRender(Item.getItemFromBlock(ModBlocks.blockLegendarySpawnerInvisible));
        

	  }
	
	public static void registerRender(Item item) {
		   ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(item.getRegistryName().toString()), "inventory"));
		   
			   if(Config.debugMode == true) {
		       	System.out.println("Registered Model for: " + item.getRegistryName());
	   		}
		}
}