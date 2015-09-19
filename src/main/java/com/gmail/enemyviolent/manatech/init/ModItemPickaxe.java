package com.gmail.enemyviolent.manatech.init;

import net.minecraft.item.ItemPickaxe;

public class ModItemPickaxe extends ItemPickaxe {

	public ModItemPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}