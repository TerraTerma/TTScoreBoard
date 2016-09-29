package me.JustMaffie.TerraTerma.TTScoreBoard.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.JustMaffie.TerraTerma.TTScoreBoard.Managers.NameTagManager;
import me.JustMaffie.TerraTerma.TTScoreBoard.TabCompleters.RenewCompleter;

public class Renew implements CommandExecutor {

	public Renew(JavaPlugin p){
		p.getCommand("sbrenew").setExecutor(this);
		p.getCommand("sbrenew").setTabCompleter(new RenewCompleter());;
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		
		if (args.length == 2 && args[0].equalsIgnoreCase("nametags")){
			Player target = Bukkit.getPlayer(args[1]);
			if (target != null){
				if(target.isOnline()){
					NameTagManager.renewNameTag(target);
					s.sendMessage(ChatColor.GREEN + "You renewed the Nametags of " + target.getDisplayName() + "");
				}
			}else{
				s.sendMessage(ChatColor.RED + "The player /'" + args[1] + "/' is not online!");
			}
		}else{
			s.sendMessage(ChatColor.RED + "[Scoreboard] Usage: /sbrenew [nametags] [playername]");
		}

			
		return false;
	}

}
