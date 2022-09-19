package studio.tavex.thirdlife.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import studio.tavex.thirdlife.ThirdLife;
import studio.tavex.thirdlife.utils.deathColourChanger;

public class JoinListener implements Listener {

    @EventHandler
    public void joinEvent (PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (ThirdLife.getPlugin(ThirdLife.class).getConfig().getBoolean("enablejoinleave")){

        }
        deathColourChanger.colourChangerScript(p);
    }
}
