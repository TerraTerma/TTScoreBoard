package me.JustMaffie.TerraTerma.TTScoreBoard.Main;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.JustMaffie.TerraTerma.TTScoreBoard.Commands.Renew;
import me.JustMaffie.TerraTerma.TTScoreBoard.Config.ConfigRegistry;
import me.JustMaffie.TerraTerma.TTScoreBoard.Config.PermissionsConfig;
import me.JustMaffie.TerraTerma.TTScoreBoard.Listeners.JoinListener;

public class TTScoreboard extends JavaPlugin{

	
	public void onEnable(){
		
		// CONFIGURATIONS
		PermissionsConfig pConfig = new PermissionsConfig();
		new ConfigRegistry();
		ConfigRegistry.registerConfiguration(pConfig);
		
		// COMMANDS
		getCommand("sbrenew").setExecutor(new Renew());
		
		// EVENTS
		Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
		
		// LOGGER
		getLogger().log(Level.INFO, getDescription().getName() + " " + getDescription().getVersion() + " by " + getDescription().getAuthors() + " is now enabled.");
	}
	
	public void onDisable(){
		
		getLogger().log(Level.INFO, getDescription().getName() + " " + getDescription().getVersion() + " by " + getDescription().getAuthors() + " is now disabled.");

	}
	
}
