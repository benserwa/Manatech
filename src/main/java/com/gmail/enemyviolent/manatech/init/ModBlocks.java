package com.gmail.enemyviolent.manatech.init;

import com.gmail.enemyviolent.manatech.blocks.BlockManatech;
import com.gmail.enemyviolent.manatech.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block manastone_ore = new BlockManatech(1.0F, 3.0F, "pickaxe", 1, 0F).setUnlocalizedName("manastone_ore");
	
	public static void registerBlocks()
	{
		RegisterHelper.registerBlock(manastone_ore);
	}

	public static void registerBlockRenderer()
	{
		RegisterHelper.registerBlockRenderer(manastone_ore);
	}

}
