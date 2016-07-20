package events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import main.Main;
import methods.TabListMethod;
import utilities.configGetter;

public class OnPlayerJoin implements Listener{
	
	public Main plugin;
	public OnPlayerJoin(Main plugin)
	{
		this.plugin = plugin;
	}
	String header = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("header"));
	String footer = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("footer"));
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
	for (Player onlinePlayers: Bukkit.getOnlinePlayers()){
		TabListMethod.sendTablist(event.getPlayer(), header, footer, (Main) Main.getPlugin(Main.class), true);
	}
	}


}
