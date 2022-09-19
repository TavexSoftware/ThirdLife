package studio.tavex.thirdlife;

import org.bukkit.plugin.java.JavaPlugin;
import studio.tavex.thirdlife.listeners.DeathListener;
import studio.tavex.thirdlife.listeners.JoinListener;

public final class ThirdLife extends JavaPlugin {

    private static ThirdLife plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // Getting Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        // Registering Events
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new DeathListener(), this);

        // Yup this is working
        System.out.println("Thirdlife Plugin not broken");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Thirdlife plugin yup broken");
    }
}
