package com.gmail.enemyviolent.manatech.init;

import net.minecraft.item.ItemSpade;

public class ModItemShovel extends ItemSpade {

	public ModItemShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}