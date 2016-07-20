package command;

import main.Main;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {

    private static List<ScoreBoardCommand> commandList = new ArrayList<>();

    private static Main main;
    private static CommandHandler commandHandler;

    public CommandRegistry (Main main) {
        CommandRegistry.main = main;
        commandHandler = new CommandHandler();
    }

    static List<ScoreBoardCommand> getCommandList () {
        return commandList;
    }

    public static void registerCommand (ScoreBoardCommand command) {
        main.getCommand(command.getName())
                .setExecutor(commandHandler);

        commandList.add(command);
    }

}
