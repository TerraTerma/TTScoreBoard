package command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CommandHandler implements CommandExecutor {

	@Override
	public boolean onCommand (CommandSender sender, Command command, String
			label, String[] args) {

		List<ScoreBoardCommand> commands;
		commands = CommandRegistry.getCommandList();

		for (ScoreBoardCommand chatSystemCommand : commands) {

			String name = chatSystemCommand.getName();

			if (label.equalsIgnoreCase(name))
				return chatSystemCommand.run(sender, args);

		}
		
		return false;
	}
	
}
