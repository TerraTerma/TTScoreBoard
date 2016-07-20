package utilities;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

import main.Main;

public class configGetter {

	
	public static void createMainConfig(){

			if (!new File(Main.getInstance().getDataFolder(), "config.yml").exists()){
			Main.getInstance().saveResource("config.yml", true);
			System.out.println("File /plugins/TTScoreBoard/config.yml Created.");
			}
		
	}
	public static void createDir(){
		if (!Main.getInstance().getDataFolder().exists()){
			System.out.println("/plugins/TTScoreBoard/ Directory Created.");
			Main.getInstance().getDataFolder().mkdir();
		}
	}
	
	public static void getMainConfig(){
		Main.getInstance().getConfig();
	}
	public static void reloadMainConfig(){
		Main.getInstance().reloadConfig();
	}
}
