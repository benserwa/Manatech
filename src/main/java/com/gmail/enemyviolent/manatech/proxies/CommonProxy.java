package com.gmail.enemyviolent.manatech.proxies;

import com.gmail.enemyviolent.manatech.init.ModBlocks;
import com.gmail.enemyviolent.manatech.init.ModItems;
import com.gmail.enemyviolent.manatech.init.ModRecipes;

public class CommonProxy {
	
	public void registerRenderers()
	{

	}
	
	public void registerAll()
	{
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModRecipes.registerRecipes();
	}

}