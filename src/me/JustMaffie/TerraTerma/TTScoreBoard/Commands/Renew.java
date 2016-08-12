package me.JustMaffie.TerraTerma.TTScoreBoard.Commands;

import java.util.Optional;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import TTCore.Entity.Living.Human.Player.TTAccount;
import TTCore.Entity.Living.Human.Player.TTPlayer;
import me.JustMaffie.TerraTerma.TTScoreBoard.TTScoreboard;
import me.JustMaffie.TerraTerma.TTScoreBoard.Managers.NameTagManager;

public class Renew implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		
		if (args.length == 2 && args[0].equalsIgnoreCase("nametags")){
			Optional<TTAccount> opAccount = TTAccount.getAccount(args[1]);
			if(opAccount.isPresent()){
				TTAccount account = opAccount.get();
				if(account.getPlayer().isOnline()){
					TTPlayer player = account.getOnline().get();
					NameTagManager.renewNameTag(player);
					player.sendMessage(TTScoreboard.getPlugin(), "You renewed the Nametags of " + player.getPlayer().getDisplayName());
				}
			}
		}else{
			s.sendMessage(ChatColor.RED + "[Scoreboard] Usage: /sbrenew [nametags] [playername]");
		}

			
		return false;
	}

}
