package com.gmail.enemyviolent.manatech.init;

import net.minecraft.init.Blocks;
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
	}
	
}
