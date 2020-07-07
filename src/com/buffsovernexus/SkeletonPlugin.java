package com.buffsovernexus;

import org.bukkit.plugin.java.JavaPlugin;

import com.buffsovernexus.cmds.SimpleCommand;
import com.buffsovernexus.event.SimplePlayerJoinEvent;

public class SkeletonPlugin extends JavaPlugin {

	/**
	 * When the plugin is starting up, this method is called.
	 */
	public void onEnable() {
		
		/*
		 * You must declare all events and commands here. 
		 * Normally you put them in this class, but you can export them to other classes to reserve space.
		 */
		
		//Listen for an event in the plugin using this:
		this.getServer().getPluginManager().registerEvents(new SimplePlayerJoinEvent(), this);
		
		/*
		 * Commands are a bit tricky in that they are more than what they seem.
		 * You must type in the command (the example is test).
		 * You must also go into the plugin.yml and add the command (https://www.spigotmc.org/wiki/plugin-yml/)
		 * One has been provided but it is recommend you learn how to use a plugin.yml properly.
		 */
		this.getCommand("test").setExecutor(new SimpleCommand());
		
	}
	
	/**
	 * When the plugin is shutting down, this method is called.
	 */
	public void onDisable() {
		
	}
}
