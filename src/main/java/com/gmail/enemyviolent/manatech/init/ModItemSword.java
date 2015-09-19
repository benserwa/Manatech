package com.gmail.enemyviolent.manatech.init;

import net.minecraft.item.ItemSword;

public class ModItemSword extends ItemSword {
	
	public ModItemSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}