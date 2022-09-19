package studio.tavex.thirdlife.utils;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;

public class deathColourChanger {

    public static void colourChangerScript(Player p) {
        int deaths = p.getStatistic(Statistic.DEATHS);
        if (deaths >= 3){
            p.setGameMode(GameMode.SPECTATOR);
            p.sendTitle(ChatColor.RED + "You are dead", ChatColor.YELLOW + "GGWP", 10, 60, 10);
            p.setDisplayName(ChatColor.RED + p.getDisplayName());
        }
        if (deaths == 2) {
            p.setDisplayName(ChatColor.RED + p.getDisplayName());
        }
        if (deaths == 1) {
            p.setDisplayName(ChatColor.YELLOW + p.getDisplayName());
        }
        if (deaths == 0) {
            p.setDisplayName(ChatColor.GREEN + p.getDisplayName());
        }
    }
}
