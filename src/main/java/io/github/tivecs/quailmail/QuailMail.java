package io.github.tivecs.quailmail;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuailMail extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("String baru");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
