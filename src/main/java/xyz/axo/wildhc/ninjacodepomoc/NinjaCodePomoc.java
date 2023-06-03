package xyz.axo.wildhc.ninjacodepomoc;

import commands.PomocCommand;
import commands.ReloadCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class NinjaCodePomoc extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("pomocreload").setExecutor(new ReloadCommand(this));
        this.getCommand("pomoc").setExecutor(new PomocCommand(this));
        saveDefaultConfig();
        // Plugin startup logic

    }
}



