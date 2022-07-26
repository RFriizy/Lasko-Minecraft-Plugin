package com.evcraft.laskoplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feed implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(!p.hasPermission("laskoplugin.feed")) {
				p.sendMessage(ChatColor.DARK_RED + "You do not have enough permissions to use this command");
			}else {
				p.sendMessage(ChatColor.GOLD + "Yuum!");
				p.setFoodLevel(20);
			}
		}
		return true;
	}
}
