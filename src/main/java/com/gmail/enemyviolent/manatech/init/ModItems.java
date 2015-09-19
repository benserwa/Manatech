package com.gmail.enemyviolent.manatech.init;

import com.gmail.enemyviolent.manatech.help.RegisterHelper;
import com.gmail.enemyviolent.manatech.items.ItemManatech;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static Item manastone_ingot = new ItemManatech().setUnlocalizedName("manastone_ingot");
	public static Item manastone_pickaxe = new ItemManatech().setUnlocalizedName("manastone_pickaxe");
	
	public static ToolMaterial MANASTONE = EnumHelper.addToolMaterial("MANASTONE", 2, 400, 7.0F, 2.0F, 20);
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(manastone_ingot);
		RegisterHelper.registerItem(manastone_pickaxe = new ModItemPickaxe("manastone_pickaxe", MANASTONE));
	}

	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(manastone_ingot);
		RegisterHelper.registerItemRenderer(manastone_pickaxe);
	}

}