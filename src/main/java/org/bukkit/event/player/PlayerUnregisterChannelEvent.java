package org.bukkit.event.player;

import org.bukkit.entity.Player;

/**
 * This event is called when a player unregisters a Plugin Channel.
 *
 * @see org.bukkit.plugin.messaging.Messenger
 */
public class PlayerUnregisterChannelEvent extends PlayerChannelEvent {

    public PlayerUnregisterChannelEvent(final Player player, final String channel) {
        super(player, channel);
    }
}
