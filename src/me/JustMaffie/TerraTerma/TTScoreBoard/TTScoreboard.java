package me.JustMaffie.TerraTerma.TTScoreBoard;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.JustMaffie.TerraTerma.TTScoreBoard.Commands.Renew;
import me.JustMaffie.TerraTerma.TTScoreBoard.Listeners.JoinListener;

public class TTScoreboard extends JavaPlugin{

	static TTScoreboard PLUGIN;
	
	public void onEnable(){
		PLUGIN = this;		
		// COMMANDS
		new Renew(this);
		
		// EVENTS
		Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
	}
	
	public static TTScoreboard getPlugin(){
		return PLUGIN;
	}
	
}
