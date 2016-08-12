package me.JustMaffie.TerraTerma.TTScoreBoard.Managers;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import me.JustMaffie.TerraTerma.TTScoreBoard.Config.PermissionsConfig;

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
  	OWNER(PermissionsConfig.NAMETAG_OWNER.toString(), ChatColor.GOLD, ChatColor.BOLD),
    HEAD_DEV(PermissionsConfig.NAMETAG_HEADDEV.toString(), ChatColor.DARK_AQUA, ChatColor.BOLD),
    DEV(PermissionsConfig.NAMETAG_DEV.toString(), ChatColor.DARK_AQUA),
    HEAD_ADMIN(PermissionsConfig.NAMETAG_HEADADMIN.toString(), ChatColor.BLUE, ChatColor.BOLD),
    ADMIN(PermissionsConfig.NAMETAG_ADMIN.toString(), ChatColor.BLUE),
    LEAD_MOD(PermissionsConfig.NAMETAG_LEADMOD.toString(), ChatColor.RED, ChatColor.BOLD),
    MOD(PermissionsConfig.NAMETAG_MOD.toString(), ChatColor.RED),
    HELPER(PermissionsConfig.NAMETAG_HELPER.toString(), ChatColor.AQUA),
    DEFAULT(PermissionsConfig.NAMETAG_DEFAULT.toString(), ChatColor.GRAY);
    
    
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
