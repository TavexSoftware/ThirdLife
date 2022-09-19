package studio.tavex.thirdlife.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import studio.tavex.thirdlife.utils.deathColourChanger;


public class DeathListener implements Listener {

    // Listener for Deaths
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = e.getEntity().getPlayer();
            deathColourChanger.colourChangerScript(p);
        }
    }
}