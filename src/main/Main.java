package main;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import command.CommandRegistry;
import command.ReloadCommand;
import command.ScoreBoardCommand;
import events.OnPlayerJoin;
import utilities.configGetter;



public class Main extends JavaPlugin implements Listener{
	private static String name;
	private static Main instance;
	private static String version;
	public static Main getInstance(){
		return instance;
	}
	private Logger logger = getLogger();
	public void onEnable(){
		instance = this;
		Server server = getServer();
		PluginManager pluginManager = server.getPluginManager();

	name = getName();
	version = getDescription().getVersion();

	ScoreBoardCommand[] commands = {
			new ReloadCommand()
	};
	
	configGetter.createDir();
	configGetter.createMainConfig();
	
	new CommandRegistry(this);
	pluginManager.registerEvents(new OnPlayerJoin(this), this);

	for (ScoreBoardCommand command : commands)
		CommandRegistry.registerCommand(command);
	
	logger.info(name + " " + version + " enabled.");
}

@Override
public void onDisable () {
	logger.info(name + " " + version + " disabled.");
}

public void loadMainConfig() {
	new File(Main.getInstance().getDataFolder(), "config.yml");
}
}
