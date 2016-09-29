package me.JustMaffie.TerraTerma.TTScoreBoard.Managers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class NameTagManager {

	@SuppressWarnings("deprecation")
	public static void renewNameTag(Player bPlayer) {
		Scoreboard board = bPlayer.getScoreboard();
		String name = bPlayer.getName();
		Team team = board.getTeam(name);
		if (bPlayer.hasPermission("owner")) {
			if (team != null) {
				team.setPrefix(ChatColor.GOLD + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.GOLD + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("headdev")) {
			if (team != null) {
				team.setPrefix(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("dev")) {
			if (team != null) {
				team.setPrefix(ChatColor.DARK_AQUA + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.GOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("headadmin")) {
			if (team != null) {
				team.setPrefix(ChatColor.BLUE + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.BLUE + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("admin")) {
			if (team != null) {
				team.setPrefix(ChatColor.BLUE + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.BLUE + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("leadmod")) {
			if (team != null) {
				team.setPrefix(ChatColor.RED + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.RED + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("moderator")) {
			if (team != null) {
				team.setPrefix(ChatColor.RED + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.RED + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("helper")) {
			if (team != null) {
				team.setPrefix(ChatColor.AQUA + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.AQUA + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("headbuilder")) {
			if (team != null) {
				team.setPrefix(ChatColor.RED + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.RED + "" + ChatColor.BOLD + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("builder")) {
			if (team != null) {
				team.setPrefix(ChatColor.DARK_GREEN + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.DARK_GREEN + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("youtuber")) {
			if (team != null) {
				team.setPrefix(ChatColor.YELLOW + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.YELLOW + "");
				team.addPlayer(bPlayer);
			}
		}else if (bPlayer.hasPermission("starlord") || bPlayer.hasPermission("vip+") || bPlayer.hasPermission("vip") || bPlayer.hasPermission("vip-")) {
			if (team != null) {
				team.setPrefix(ChatColor.YELLOW + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.YELLOW + "");
				team.addPlayer(bPlayer);
			}
		}else{
			if (team != null) {
				team.setPrefix(ChatColor.GRAY + "");
				team.addPlayer(bPlayer);
			} else {
				team = board.registerNewTeam(name);
				team.setPrefix(ChatColor.GRAY + "");
				team.addPlayer(bPlayer);
			}
		}
	}

}
