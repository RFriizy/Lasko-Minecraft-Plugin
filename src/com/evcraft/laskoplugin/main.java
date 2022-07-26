package com.evcraft.laskoplugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.evcraft.laskoplugin.commands.feed;
import com.evcraft.laskoplugin.commands.fly;
import com.evcraft.laskoplugin.commands.god;
import com.evcraft.laskoplugin.commands.heal;

public class main extends JavaPlugin {
 
    @Override
    public void onEnable() {

 
        getCommand("fly").setExecutor(new fly());
        getCommand("god").setExecutor(new god());
        getCommand("heal").setExecutor(new heal());
        getCommand("feed").setExecutor(new feed());
    }
}