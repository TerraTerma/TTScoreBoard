package me.JustMaffie.TerraTerma.TTScoreBoard.Config;

public class PermissionsConfig extends ExtraConfig {

	public static final KeyValuePair NAMETAG_OWNER = new KeyValuePair();
	public static final KeyValuePair NAMETAG_HEADDEV = new KeyValuePair();
	public static final KeyValuePair NAMETAG_DEV = new KeyValuePair();
	public static final KeyValuePair NAMETAG_HEADADMIN = new KeyValuePair();
	public static final KeyValuePair NAMETAG_ADMIN = new KeyValuePair();
	public static final KeyValuePair NAMETAG_LEADMOD = new KeyValuePair();
	public static final KeyValuePair NAMETAG_MOD = new KeyValuePair();
	public static final KeyValuePair NAMETAG_HELPER = new KeyValuePair();
	public static final KeyValuePair NAMETAG_DEFAULT = new KeyValuePair();

	private KeyValuePair[] keyValuePairs =  {
			NAMETAG_OWNER,
			NAMETAG_HEADDEV,
			NAMETAG_DEV,
			NAMETAG_HEADADMIN,
			NAMETAG_ADMIN,
			NAMETAG_LEADMOD,
			NAMETAG_MOD,
			NAMETAG_HELPER,
			NAMETAG_DEFAULT
	};

	public PermissionsConfig () {
		super("permissions.yml");

		NAMETAG_OWNER.set("Nametags.Owner", "sb.owner");
		NAMETAG_HEADDEV.set("Nametags.Headdev", "sb.headdev");
		NAMETAG_DEV.set("Nametags.Dev", "sb.dev");
		NAMETAG_HEADADMIN.set("Nametags.Headadmin", "sb.headadmin");
		NAMETAG_ADMIN.set("Nametags.Admin", "sb.admin");
		NAMETAG_LEADMOD.set("Nametags.Leadmod", "sb.leadmod");
		NAMETAG_MOD.set("Nametags.Mod", "sb.mod");
		NAMETAG_HELPER.set("Nametags.Helper", "sb.helper");
		NAMETAG_DEFAULT.set("Nametags.Default", "sb.player");

		setSections(keyValuePairs);
	}

	@Override
	void reload () {
		super.reload(keyValuePairs);
	}
}