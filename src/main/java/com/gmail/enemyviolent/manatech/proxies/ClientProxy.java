package com.gmail.enemyviolent.manatech.proxies;

import com.gmail.enemyviolent.manatech.help.Reference;
import com.gmail.enemyviolent.manatech.init.ModBlocks;
import com.gmail.enemyviolent.manatech.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerRenderers()
	{
		ModBlocks.registerBlockRenderer();
		ModItems.registerItemRenderer();
		

	}

}
