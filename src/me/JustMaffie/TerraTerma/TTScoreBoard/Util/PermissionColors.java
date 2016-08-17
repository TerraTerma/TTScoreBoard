package me.JustMaffie.TerraTerma.TTScoreBoard.Util;

import java.util.Arrays;
import java.util.Optional;

import org.bukkit.ChatColor;

import TTCore.Entity.Living.Human.Player.TTPlayer;

public enum PermissionColors {
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
    STARLORD("starlord", ChatColor.GOLD),
    VIPPLUS("vip+", ChatColor.GOLD),
    VIP("vip", ChatColor.GOLD),
    VIPMINUS("vip-", ChatColor.GOLD),
    DEFAULT("default", ChatColor.GRAY);	
	  
    
    
    String PERMISSION;
    ChatColor COLOUR;
    ChatColor SECONDARY;
    
    private PermissionColors(String permission, ChatColor color){
      	PERMISSION = permission;
      	COLOUR = color;
    }
    
    private PermissionColors(String permission, ChatColor color, ChatColor second){
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
    
    public static PermissionColors getColour(TTPlayer player){
    	String group = player.getPermissionGroup().getName();
    	Optional<PermissionColors> opColour = Arrays.asList(values()).stream().filter(c -> c.getPermission().equals(group)).findFirst();
    	if(opColour.isPresent()){
    		return opColour.get();
    	}
    	return DEFAULT;
    }
  }