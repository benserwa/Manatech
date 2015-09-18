package com.gmail.enemyviolent.manatech.proxies;

import com.gmail.enemyviolent.manatech.init.ModBlocks;
import com.gmail.enemyviolent.manatech.init.ModItems;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerRenderers()
	{
		ModBlocks.registerBlockRenderer();
		ModItems.registerItemRenderer();
		
	}

}
