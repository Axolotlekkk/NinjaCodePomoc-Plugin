package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import sun.security.krb5.Config;
import xyz.axo.wildhc.ninjacodepomoc.NinjaCodePomoc;

public class ReloadCommand implements CommandExecutor {
    private final NinjaCodePomoc plugin;
    public ReloadCommand(NinjaCodePomoc plugin) {
        this.plugin = plugin;
    }



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("ninjacode.pomoc.reload")) {
            try {
                final long millisActualTime = System.currentTimeMillis();
                plugin.reloadConfig();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aConfig przeladowano"));
                final long executionTime = System.currentTimeMillis() - millisActualTime;
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPrzeladowano w &b" + executionTime + " &ams"));
            } catch (final Exception exception) {
                String error = ChatColor.translateAlternateColorCodes('&', "&cNie mozna przeladowac configu, zobacz bledy w konsoli");
                sender.sendMessage(error);
                plugin.getLogger().warning(error);
                System.out.println(exception + "");
            }
        }
        return true;
    }
}