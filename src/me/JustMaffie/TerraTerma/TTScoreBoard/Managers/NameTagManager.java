package me.JustMaffie.TerraTerma.TTScoreBoard.Managers;



import java.util.Arrays;
import java.util.Optional;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import TTCore.Entity.Living.Human.Player.TTPlayer;

public class NameTagManager {
	
  @SuppressWarnings("deprecation")
  public static void renewNameTag(TTPlayer player){
      PermissionColours permission = PermissionColours.getColour(player);
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
  
  public static enum PermissionColours {
  	OWNER("owner", ChatColor.GOLD, ChatColor.BOLD),
    HEAD_DEV("headdev", ChatColor.DARK_AQUA, ChatColor.BOLD),
    DEV("developer", ChatColor.DARK_AQUA),
    HEAD_ADMIN("headadmin", ChatColor.BLUE, ChatColor.BOLD),
    ADMIN("Admins", ChatColor.BLUE),
    LEAD_MOD("Lead-Mod", ChatColor.RED, ChatColor.BOLD),
    MOD("moderator", ChatColor.RED),
    HELPER("helper", ChatColor.AQUA),
    BUILDER("builder", ChatColor.DARK_GREEN),
    YOUTUBER("youtuber", ChatColor.YELLOW),
    DEFAULT("default", ChatColor.GRAY);	
	  
    
    
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
    
    public static PermissionColours getColour(TTPlayer player){
    	String group = player.getPermissionGroup().getName();
    	Optional<PermissionColours> opColour = Arrays.asList(values()).stream().filter(c -> c.getPermission().equals(group)).findFirst();
    	if(opColour.isPresent()){
    		return opColour.get();
    	}
    	return DEFAULT;
    }
  }
}
