package com.buffsovernexus.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SimpleCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		
		//Ensure a Player runs this command and not console.
		//Good for filtering between console and player.
		if (sender instanceof Player) {
			//Convert the sender into a Player object.
			Player player = (Player) sender;
			
			// [/test] command.
			if (lbl.equalsIgnoreCase("test")) {
				
				//Default command
				if (args.length == 0) {
					player.sendMessage("Hey, this worked!");
				}
				
				// [/test <0>]
				if (args.length == 1) {
					//Grab the argument
					String argument = args[0];
					player.sendMessage("You typed in:" + argument);
				}
			}
		}
		
		//This flag determines whether or not show the "help" dialog.
		return false; 
	}
}
