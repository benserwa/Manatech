package com.gmail.enemyviolent.manatech.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void registerRecipes ()
	{
		GameRegistry.addSmelting(ModBlocks.manastone_ore, new ItemStack(ModItems.manastone_ingot), 1.0F);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_pickaxe), 
				"xxx", 
				" y ", 
				" y ", 
				'x' , ModItems.manastone_ingot, 'y' , Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_axe), 
				"xx ", 
				"xy ", 
				" y ", 
				'x' , ModItems.manastone_ingot, 'y' , Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_sword), 
				" x ", 
				" x ", 
				" y ", 
				'x' , ModItems.manastone_ingot, 'y' , Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_shovel), 
				" x ", 
				" y ", 
				" y ", 
				'x' , ModItems.manastone_ingot, 'y' , Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_hoe), 
				"xx ", 
				" y ", 
				" y ", 
				'x' , ModItems.manastone_ingot, 'y' , Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.manastone_block), 
				"xxx", 
				"xxx", 
				"xxx", 
				'x' , ModItems.manastone_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_helmet), 
				"   ", 
				"xxx", 
				"x x", 
				'x' , ModItems.manastone_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_chestplate), 
				"x x", 
				"xxx", 
				"xxx", 
				'x' , ModItems.manastone_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_leggings), 
				"xxx", 
				"x x", 
				"x x", 
				'x' , ModItems.manastone_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_boots), 
				"   ", 
				"x x", 
				"x x", 
				'x' , ModItems.manastone_ingot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.manastone_ingot, 9), new ItemStack(ModBlocks.manastone_block));
	}
	
}
