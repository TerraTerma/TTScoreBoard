package me.JustMaffie.TerraTerma.TTScoreBoard.Config;

import java.util.ArrayList;
import java.util.List;

public class ConfigRegistry {

    private static List<ScoreboardConfig> configurationList;

    public ConfigRegistry () {
        configurationList = new ArrayList<>();
    }

    public static void registerConfiguration (ScoreboardConfig configuration) {
        configurationList.add(configuration);
        reloadConfigurations();
        System.out.println("Registered the configuration \\" + configuration.getFile().getPath() + configuration.getFile().getName());
    }

    public static void reloadConfigurations () {
        configurationList.forEach(ScoreboardConfig::reload);
    }

    public static ScoreboardConfig getConfiguration (String fileName) {
        return configurationList.stream()
                         .filter(e -> e.getFile().getName().equals(fileName))
                         .findAny().get();
    }

}
