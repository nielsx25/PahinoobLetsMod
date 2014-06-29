package com.nielsx25.letsmod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static void init(File configFile){
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		try{
			configuration.load();
			
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
		}
		catch(Exception e){
			
		}
		finally{
			configuration.save();
		}
		System.out.println("Config test:" + configValue);
	}
}
