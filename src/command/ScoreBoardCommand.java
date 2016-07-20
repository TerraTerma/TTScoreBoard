package command;

import org.bukkit.command.CommandSender;

public abstract class ScoreBoardCommand {

	private String name;

	ScoreBoardCommand (String name) {
		this.name = name;
	}

	String getName () {
		return name;
	}

	abstract boolean run (CommandSender sender, Object... args);

}
