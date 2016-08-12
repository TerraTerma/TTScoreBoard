package me.JustMaffie.TerraTerma.TTScoreBoard.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.JustMaffie.TerraTerma.TTScoreBoard.Managers.NameTagManager;

public class Renew implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		
		if (args.length == 2 && args[0].equalsIgnoreCase("nametags")){
			NameTagManager.renewNameTag(Bukkit.getPlayerExact(args[1]));
			s.sendMessage(ChatColor.GREEN + "[Scoreboard] You renewed the Nametags of the player " + args[1]);
		}else{
			s.sendMessage(ChatColor.RED + "[Scoreboard] Usage: /sbrenew [nametags] [playername]");
		}

			
		return false;
	}

}
