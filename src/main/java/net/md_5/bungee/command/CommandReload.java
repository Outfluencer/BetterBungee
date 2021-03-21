package net.md_5.bungee.command;

import net.md_5.bungee.api.plugin.*;
import net.md_5.bungee.*;
import net.md_5.bungee.api.event.*;
import net.md_5.bungee.api.*;

public class CommandReload extends Command
{
    public CommandReload() {
        super("greload", "bungeecord.command.reload", new String[0]);
    }
    
    @SuppressWarnings("deprecation")
	@Override
    public void execute(final CommandSender sender, final String[] args) {
        BungeeCord.getInstance().config.load();
        BungeeCord.getInstance().reloadMessages();
        BungeeCord.getInstance().stopListeners();
        BungeeCord.getInstance().startListeners();
        BungeeCord.getInstance().getPluginManager().callEvent(new ProxyReloadEvent(sender));
        sender.sendMessage(ChatColor.BOLD.toString() + ChatColor.RED.toString() + "BungeeCord has been reloaded. This is NOT advisable and you will not be supported with any issues that arise! Please restart BungeeCord ASAP.");
    }
}
