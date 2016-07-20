package command;

import utilities.ChatHelper;
import utilities.configGetter;

import org.bukkit.command.CommandSender;

public class ReloadCommand extends ScoreBoardCommand {

    public ReloadCommand () {
        super("sbreload");
    }

    @Override
    boolean run (CommandSender sender, Object... args) {
        configGetter.reloadMainConfig();
        ChatHelper.sendGreenMessage(sender, "ScoreBoard Configurations Reloaded.");
        return true;
    }
}
