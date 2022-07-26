package com.evcraft.laskoplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class god implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(!p.hasPermission("laskoplugin.god")) {
				p.sendMessage(ChatColor.DARK_RED + "You do not have enough permissions to use this command");
			}else if(!p.isInvulnerable()) {
				p.sendMessage(ChatColor.GOLD + "You are now invincible");
				p.setInvulnerable(true);
			}else {
				p.sendMessage(ChatColor.GOLD + "You are now mortale");
				p.setInvulnerable(false);
			}
		}
		return true;
	}
}
