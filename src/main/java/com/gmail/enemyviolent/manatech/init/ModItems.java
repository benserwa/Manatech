package com.gmail.enemyviolent.manatech.init;

import com.gmail.enemyviolent.manatech.help.RegisterHelper;
import com.gmail.enemyviolent.manatech.items.ItemManatech;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item manatechwrench = new ItemManatech().setUnlocalizedName("manatechwrench");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(manatechwrench);
	}

	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(manatechwrench);
	}

}
