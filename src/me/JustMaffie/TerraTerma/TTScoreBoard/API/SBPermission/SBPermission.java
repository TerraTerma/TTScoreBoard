package me.JustMaffie.TerraTerma.TTScoreBoard.API.SBPermission;

import me.JustMaffie.TerraTerma.TTScoreBoard.Config.PermissionsConfig;

public class SBPermission {

	public static String getPermission(SBPermissionType type){
		if (type.equals(SBPermissionType.OWNER)){
			return PermissionsConfig.NAMETAG_OWNER.toString();
		}else if(type.equals(SBPermissionType.HEADDEV)){
			return PermissionsConfig.NAMETAG_HEADDEV.toString();
		}else if(type.equals(SBPermissionType.DEV)){
			return PermissionsConfig.NAMETAG_DEV.toString();
		}else if(type.equals(SBPermissionType.HEADADMIN)){
			return PermissionsConfig.NAMETAG_HEADADMIN.toString();
		}else if(type.equals(SBPermissionType.ADMIN)){
			return PermissionsConfig.NAMETAG_ADMIN.toString();
		}else if(type.equals(SBPermissionType.LEADMOD)){
			return PermissionsConfig.NAMETAG_LEADMOD.toString();
		}else if(type.equals(SBPermissionType.MOD)){
			return PermissionsConfig.NAMETAG_MOD.toString();
		}else if(type.equals(SBPermissionType.HELPER)){
			return PermissionsConfig.NAMETAG_HELPER.toString();
		}else if(type.equals(SBPermissionType.DEFAULT)){
			return PermissionsConfig.NAMETAG_DEFAULT.toString();
		}else{
			return null;
		}
	}
	public static void setPermission(SBPermissionType type, String permission){
		if (type.equals(SBPermissionType.OWNER)){
			PermissionsConfig.NAMETAG_OWNER.set("Nametags.Owner", permission);;
		}else if(type.equals(SBPermissionType.HEADDEV)){
			PermissionsConfig.NAMETAG_HEADDEV.set("Nametags.Headdev", permission);;
		}else if(type.equals(SBPermissionType.DEV)){
			PermissionsConfig.NAMETAG_DEV.set("Nametags.Dev", permission);;
		}else if(type.equals(SBPermissionType.HEADADMIN)){
			PermissionsConfig.NAMETAG_HEADADMIN.set("Nametags.Headadmin", permission);;
		}else if(type.equals(SBPermissionType.ADMIN)){
			PermissionsConfig.NAMETAG_ADMIN.set("Nametags.Admin", permission);;
		}else if(type.equals(SBPermissionType.LEADMOD)){
			PermissionsConfig.NAMETAG_LEADMOD.set("Nametags.Leadmod", permission);;
		}else if(type.equals(SBPermissionType.MOD)){
			PermissionsConfig.NAMETAG_MOD.set("Nametags.Mod", permission);;
		}else if(type.equals(SBPermissionType.HELPER)){
			PermissionsConfig.NAMETAG_HELPER.set("Nametags.Helper", permission);;
		}else if(type.equals(SBPermissionType.DEFAULT)){
			PermissionsConfig.NAMETAG_DEFAULT.set("Nametags.Default", permission);;
		}
	}
}
