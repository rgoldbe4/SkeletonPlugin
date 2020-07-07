package com.buffsovernexus.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SimplePlayerJoinEvent implements Listener {

	/**
	 * When a player joins, send them a friendly message.
	 * @param event - The player event joining that fires
	 */
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		//This sends a private message to the player.
		player.sendMessage("Welcome to the server!");
	}
}
