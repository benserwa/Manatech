package com.gmail.enemyviolent.manatech.init;

import com.gmail.enemyviolent.manatech.help.RegisterHelper;
import com.gmail.enemyviolent.manatech.items.ItemManatech;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static Item manastone_ingot = new ItemManatech().setUnlocalizedName("manastone_ingot");
	
	public static Item manastone_pickaxe = new ItemManatech().setUnlocalizedName("manastone_pickaxe");
	public static Item manastone_axe = new ItemManatech().setUnlocalizedName("manastone_axe");
	public static Item manastone_shovel = new ItemManatech().setUnlocalizedName("manastone_shovel");
	public static Item manastone_sword = new ItemManatech().setUnlocalizedName("manastone_sword");
	public static Item manastone_hoe = new ItemManatech().setUnlocalizedName("manastone_hoe");
	
	public static ToolMaterial MANASTONE = EnumHelper.addToolMaterial("MANASTONE", 2, 400, 7.0F, 2.0F, 20);
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(manastone_ingot);
		RegisterHelper.registerItem(manastone_pickaxe = new ModItemPickaxe("manastone_pickaxe", MANASTONE));
		RegisterHelper.registerItem(manastone_axe = new ModItemAxe("manastone_axe", MANASTONE));
		RegisterHelper.registerItem(manastone_shovel = new ModItemShovel("manastone_shovel", MANASTONE));
		RegisterHelper.registerItem(manastone_sword = new ModItemSword("manastone_sword", MANASTONE));
		RegisterHelper.registerItem(manastone_hoe = new ModItemHoe("manastone_hoe", MANASTONE));
		
	}

	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(manastone_ingot);
		RegisterHelper.registerItemRenderer(manastone_pickaxe);
		RegisterHelper.registerItemRenderer(manastone_axe);
		RegisterHelper.registerItemRenderer(manastone_shovel);
		RegisterHelper.registerItemRenderer(manastone_sword);
		RegisterHelper.registerItemRenderer(manastone_hoe);
	}

}