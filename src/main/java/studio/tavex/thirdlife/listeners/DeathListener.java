package studio.tavex.thirdlife.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import studio.tavex.thirdlife.utils.deathColourChanger;


public class DeathListener implements Listener {

    // Listener for Deaths
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
            Player p = e.getEntity().getPlayer();
        int deaths = p.getStatistic(Statistic.DEATHS);
        if (deaths >= 3){
            p.setGameMode(GameMode.SPECTATOR);
            p.sendTitle(ChatColor.RED + "You are dead", ChatColor.YELLOW + "GGWP", 10, 60, 10);
            p.setDisplayName(ChatColor.RED + p.getDisplayName() + " (0)");
        }
        if (deaths == 2) {
            p.setDisplayName(ChatColor.RED + p.getDisplayName() + " (1)");

        }
        if (deaths == 1) {
            p.setDisplayName(ChatColor.YELLOW + p.getDisplayName() + " (2)");
        }
        if (deaths == 0) {
            p.setDisplayName(ChatColor.GREEN + p.getDisplayName() + " (3)");
        }
    }
}
