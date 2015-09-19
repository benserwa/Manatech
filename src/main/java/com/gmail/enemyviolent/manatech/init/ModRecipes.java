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
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manastone_block), 
				"xxx", 
				"xxx", 
				"xxx", 
				'x' , ModItems.manastone_ingot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.manastone_ingot, 9), new Object[] {ModItems.manastone_block, new ItemStack(ModItems.manastone_block, 1)});
	}
	
}
