package me.JustMaffie.TerraTerma.TTScoreBoard.TabCompleters;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class RenewCompleter implements TabCompleter {
	@SuppressWarnings("unused")
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
		if (cmd.getName().equalsIgnoreCase("sbrenew") && args.length == 1) {
			if (sender instanceof Player) {
				Player p = (Player) sender;

				List<String> list = new ArrayList<String>();
				list.add("f");
				if (list == null) {
					List<String> empty = new ArrayList<>();
					list = empty;
				}

				List<String> newList = new ArrayList<>();

				for (String site : list) {
					newList.add("Nametags");

				}
				return newList;
			}
		} else if (cmd.getName().equalsIgnoreCase("sbrenew") && args.length > 2) {
			if (sender instanceof Player) {
				List<String> list = new ArrayList<String>();
				List<String> newList = new ArrayList<>();
				for (String site : list) {
					newList.add(null);
				}

				return newList;
			}
		}
		return null;
	}
}
