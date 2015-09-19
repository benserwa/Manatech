package com.gmail.enemyviolent.manatech.init;

import net.minecraft.item.ItemAxe;

public class ModItemAxe extends ItemAxe {

	public ModItemAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}