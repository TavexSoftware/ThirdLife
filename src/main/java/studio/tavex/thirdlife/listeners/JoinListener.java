package studio.tavex.thirdlife.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import studio.tavex.thirdlife.ThirdLife;

public class JoinListener implements Listener {

    @EventHandler
    public void joinEvent (PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (ThirdLife.getPlugin(ThirdLife.class).getConfig().getBoolean("enablejoinleave")){

        }
        if (p.getStatistic(Statistic.DEATHS) >= 3){
            p.setGameMode(GameMode.SPECTATOR);
            p.sendTitle(ChatColor.RED + "You are dead", ChatColor.YELLOW + "GGWP", 10, 60, 10);
        }
    }
}