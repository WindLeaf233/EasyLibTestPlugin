package ml.windleaf.test.listeners;

import ml.windleaf.easylib.interfaces.IListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListeners implements IListener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage("idk who joined");
    }
}
