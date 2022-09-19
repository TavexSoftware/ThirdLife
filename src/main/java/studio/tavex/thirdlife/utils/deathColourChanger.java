package studio.tavex.thirdlife.utils;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Statistic;

public class deathColourChanger {

    public void colourChangerScript {
        if (p.getStatistic(Statistic.DEATHS) >= 3){
            p.setGameMode(GameMode.SPECTATOR);
            p.sendTitle(ChatColor.RED + "You are dead", ChatColor.YELLOW + "GGWP", 10, 60, 10);
            p.setDisplayName(ChatColor.RED + p.getDisplayName());
        }
    }
}
