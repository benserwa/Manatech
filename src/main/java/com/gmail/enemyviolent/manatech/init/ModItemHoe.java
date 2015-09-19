package com.gmail.enemyviolent.manatech.init;

import net.minecraft.item.ItemHoe;

public class ModItemHoe extends ItemHoe {

	public ModItemHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}