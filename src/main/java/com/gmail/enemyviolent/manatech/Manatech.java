package com.gmail.enemyviolent.manatech;

import com.gmail.enemyviolent.manatech.help.Reference;
import com.gmail.enemyviolent.manatech.init.ModWorldGen;
import com.gmail.enemyviolent.manatech.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Import mod identification variables from Reference class
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Manatech {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static Manatech instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		proxy.registerAll();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent evt)
	{
		proxy.registerRenderers();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt)
	{

	}

}
