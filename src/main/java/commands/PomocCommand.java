package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import xyz.axo.wildhc.ninjacodepomoc.NinjaCodePomoc;

import java.util.List;

public
class PomocCommand implements CommandExecutor {
    private final NinjaCodePomoc plugin;
    public PomocCommand(NinjaCodePomoc plugin) {
        this.plugin = plugin;
    }


    @Override
    public
    boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        for (String pomoc : plugin.getConfig().getStringList("text")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', pomoc));
        }
        return true; }
}
