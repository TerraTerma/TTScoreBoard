package me.JustMaffie.TerraTerma.TTScoreBoard.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.JustMaffie.TerraTerma.TTScoreBoard.Managers.NameTagManager;

public class JoinListener implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		NameTagManager.renewNameTag(e.getPlayer());
	}
}