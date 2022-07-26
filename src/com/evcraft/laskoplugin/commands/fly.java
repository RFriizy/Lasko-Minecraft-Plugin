package com.evcraft.laskoplugin.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
	
	ArrayList<Player> flying_list = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(!p.hasPermission("laskoplugin.fly")) {
				p.sendMessage(ChatColor.DARK_RED + "You do not have enough permissions to use this command");
			}else if(!flying_list.contains(p)) {
				flying_list.add(p);
				p.sendMessage(ChatColor.GOLD + "You are now flying");
				p.setAllowFlight(true);
			}else if(flying_list.contains(p)) {
				flying_list.remove(p);
				p.sendMessage(ChatColor.GOLD + "You have stopped flying");
				p.setAllowFlight(false);
			}
		}
		return true;
	}
}
