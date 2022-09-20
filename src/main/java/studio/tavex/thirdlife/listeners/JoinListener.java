package studio.tavex.thirdlife.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import studio.tavex.thirdlife.ThirdLife;
import studio.tavex.thirdlife.utils.deathColourChanger;

public class JoinListener implements Listener {

    @EventHandler
    public void joinEvent (PlayerJoinEvent e) {
        System.out.println("Player joined");
        Player p = e.getPlayer();
        if (ThirdLife.getPlugin(ThirdLife.class).getConfig().getBoolean("enablejoinleave")){

        }
        int deaths = p.getStatistic(Statistic.DEATHS);
        if (deaths >= 3){
            p.setGameMode(GameMode.SPECTATOR);
            p.sendTitle(ChatColor.RED + "You are dead", ChatColor.YELLOW + "GGWP", 10, 60, 10);
            p.setDisplayName(ChatColor.RED + p.getDisplayName());
        } 
        
        switch (deaths) {
            case 0:
                p.setDisplayName(ChatColor.GREEN + p.getDisplayName() + " (3)");
                break;
            case 1:
                p.setDisplayName(ChatColor.YELLOW + p.getDisplayName() + " (2)");
                break;
            case 2:
                p.setDisplayName(ChatColor.RED + p.getDisplayName() + " (1)");
                break;
        
            default:
                break;
        }
    }
}
