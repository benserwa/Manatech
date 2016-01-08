package com.gmail.enemyviolent.manatech.init;

import com.gmail.enemyviolent.manatech.help.RegisterHelper;
import com.gmail.enemyviolent.manatech.items.ItemManatech;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static Item manastone_ingot = new ItemManatech().setUnlocalizedName("manastone_ingot");
	
	public static Item manastone_pickaxe = new ItemManatech().setUnlocalizedName("manastone_pickaxe");
	public static Item manastone_axe = new ItemManatech().setUnlocalizedName("manastone_axe");
	public static Item manastone_shovel = new ItemManatech().setUnlocalizedName("manastone_shovel");
	public static Item manastone_sword = new ItemManatech().setUnlocalizedName("manastone_sword");
	public static Item manastone_hoe = new ItemManatech().setUnlocalizedName("manastone_hoe");
	public static Item manastone_helmet = new ItemManatech().setUnlocalizedName("manastone_helmet");
	public static Item manastone_chestplate = new ItemManatech().setUnlocalizedName("manastone_chestplate");
	public static Item manastone_leggings = new ItemManatech().setUnlocalizedName("manastone_leggings");
	public static Item manastone_boots = new ItemManatech().setUnlocalizedName("manastone_boots");
	
	public static ToolMaterial MANASTONE = EnumHelper.addToolMaterial("MANASTONE", 2, 400, 7.0F, 2.0F, 20);
	public static ArmorMaterial MANASTONEARMOR = EnumHelper.addArmorMaterial("MANASTONEARMOR", "manatech:manastonearmor", 20, new int[] {2, 7, 5, 2}, 20);

	
	public static void registerItems()
	{
		RegisterHelper.registerItem(manastone_ingot);
		RegisterHelper.registerItem(manastone_pickaxe = new ModItemPickaxe("manastone_pickaxe", MANASTONE));
		RegisterHelper.registerItem(manastone_axe = new ModItemAxe("manastone_axe", MANASTONE));
		RegisterHelper.registerItem(manastone_shovel = new ModItemShovel("manastone_shovel", MANASTONE));
		RegisterHelper.registerItem(manastone_sword = new ModItemSword("manastone_sword", MANASTONE));
		RegisterHelper.registerItem(manastone_hoe = new ModItemHoe("manastone_hoe", MANASTONE));
		RegisterHelper.registerItem(manastone_helmet = new ItemModArmor("manastone_helmet", MANASTONEARMOR, 1, 0));
		RegisterHelper.registerItem(manastone_chestplate = new ItemModArmor("manastone_chestplate", MANASTONEARMOR, 1, 1));
		RegisterHelper.registerItem(manastone_leggings = new ItemModArmor("manastone_leggings", MANASTONEARMOR, 2, 2));
		RegisterHelper.registerItem(manastone_boots = new ItemModArmor("manastone_boots", MANASTONEARMOR, 1, 3));
		
	}

	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(manastone_ingot);
		RegisterHelper.registerItemRenderer(manastone_pickaxe);
		RegisterHelper.registerItemRenderer(manastone_axe);
		RegisterHelper.registerItemRenderer(manastone_shovel);
		RegisterHelper.registerItemRenderer(manastone_sword);
		RegisterHelper.registerItemRenderer(manastone_hoe);
		RegisterHelper.registerItemRenderer(manastone_helmet);
		RegisterHelper.registerItemRenderer(manastone_chestplate);
		RegisterHelper.registerItemRenderer(manastone_leggings);
		RegisterHelper.registerItemRenderer(manastone_boots);
	}

}