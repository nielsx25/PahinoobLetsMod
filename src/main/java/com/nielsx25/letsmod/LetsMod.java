package com.nielsx25.letsmod;

import com.nielsx25.letsmod.proxy.IProxy;
import com.nielsx25.letsmod.reference.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsMod {
	@Mod.Instance("LetsMod")
	public static LetsMod instance;
	
	@SidedProxy(clientSide = "com.nielsx25.letsmod.proxy.ClientProxy", serverSide = "com.nielsx25.letsmod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}