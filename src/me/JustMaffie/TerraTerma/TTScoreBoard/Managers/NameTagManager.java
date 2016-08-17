package me.JustMaffie.TerraTerma.TTScoreBoard.Managers;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import TTCore.Entity.Living.Human.Player.TTPlayer;
import me.JustMaffie.TerraTerma.TTScoreBoard.Util.PermissionColors;

public class NameTagManager {
	
  @SuppressWarnings("deprecation")
  public static void renewNameTag(TTPlayer player){
	  PermissionColors permission = PermissionColors.getColour(player);
      Player bPlayer = player.getPlayer();
          //has a permission
          Scoreboard board = bPlayer.getScoreboard();
          String name = bPlayer.getName();
          Team team = board.getTeam(name);
          if(team != null){
              team.setPrefix(permission.getColour());
              team.addPlayer(bPlayer);
          }else{
              team = board.registerNewTeam(name);
              team.setPrefix(permission.getColour());
              team.addPlayer(bPlayer);
          }
  }
  
}
