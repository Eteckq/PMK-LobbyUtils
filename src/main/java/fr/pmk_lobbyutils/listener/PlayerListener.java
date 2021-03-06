package fr.pmk_lobbyutils.listener;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
	
	private static HashMap<Player, String> hPlayerFlight = new HashMap<>();
	
	@EventHandler
	public void OnPlayerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		p.teleport(new Location(p.getWorld(), -537, 29, 1372));
		e.setJoinMessage("");
		p.setAllowFlight(true);
		//hPlayerFlight.put(p, "2222223");
		
		
	}
	
	@EventHandler
	public void OnPlayerQuit(PlayerQuitEvent e) {
		e.getPlayer().setAllowFlight(false);
		e.setQuitMessage("");		//pas de message
	}

	public static HashMap<Player, String> gethPlayerFlight() {
		return hPlayerFlight;
	}

	public static void sethPlayerFlight(HashMap<Player, String> hPlayerFlight) {
		PlayerListener.hPlayerFlight = hPlayerFlight;
	}
}
