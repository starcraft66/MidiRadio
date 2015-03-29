package net.t7seven7t.midiradio;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {

    private final MidiRadio plugin;

    public LoginListener(final MidiRadio plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        plugin.getMidiPlayer().tuneIn(event.getPlayer());
    }

}
