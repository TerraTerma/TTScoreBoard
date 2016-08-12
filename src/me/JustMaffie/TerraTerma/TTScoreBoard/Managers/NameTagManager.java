package me.JustMaffie.TerraTerma.TTScoreBoard.Managers;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class NameTagManager {
	
  @SuppressWarnings({ "deprecation", "null" })
  public static void renewNameTag(Player player){
      List<PermissionColours> permissions = Arrays.asList(PermissionColours.values());
      Optional<PermissionColours> opPermission = permissions.stream().filter(p -> {
          return (player.hasPermission(p.getPermission()));
      }).findFirst();
    
      if(opPermission.isPresent()){
          PermissionColours permission = opPermission.get();
          //has a permission
          Scoreboard board = player.getScoreboard();
          String name = player.getName();
          Team team = board.getTeam(name);
          if(team != null){
              team.setPrefix(permission.getColour());
              team.addPlayer(player);
          }else if (team.getPrefix().equals(permission.getColour())){
              team.setPrefix(permission.getColour());
              team.addPlayer(player);
          }else{
              team = board.registerNewTeam(name);
              team.setPrefix(permission.getColour());
              team.addPlayer(player);
          }
      }
  }
  
  public static enum PermissionColours {
  	OWNER("sb.owner", ChatColor.GOLD, ChatColor.BOLD),
    HEAD_DEV("sb.headdev", ChatColor.DARK_AQUA, ChatColor.BOLD),
    DEV("sb.dev", ChatColor.DARK_AQUA),
    HEAD_ADMIN("sb.headadmin", ChatColor.BLUE, ChatColor.BOLD),
    ADMIN("sb.admin", ChatColor.BLUE),
    LEAD_MOD("sb.leadmod", ChatColor.RED, ChatColor.BOLD),
    MOD("sb.mod", ChatColor.RED),
    HELPER("sb.helper", ChatColor.AQUA);
    
    
    String PERMISSION;
    ChatColor COLOUR;
    ChatColor SECONDARY;
    
    private PermissionColours(String permission, ChatColor color){
      	PERMISSION = permission;
      	COLOUR = color;
    }
    
    private PermissionColours(String permission, ChatColor color, ChatColor second){
      	PERMISSION = permission;
      	COLOUR = color;
      	SECONDARY = second;
    }
    
    public String getPermission(){
      	return PERMISSION;
    }
    
    public String getColour(){
      	if(SECONDARY == null){
        	return COLOUR + "";
      	}else{
          	return COLOUR + "" + SECONDARY;
      	}
  	}
  }
}
