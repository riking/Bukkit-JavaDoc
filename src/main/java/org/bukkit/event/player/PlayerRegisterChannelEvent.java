package org.bukkit.event.player;

import org.bukkit.entity.Player;

/**
 * This event is called when a player registers a Plugin Channel.
 *
 * @see org.bukkit.plugin.messaging.Messenger
 */
public class PlayerRegisterChannelEvent extends PlayerChannelEvent {

    public PlayerRegisterChannelEvent(final Player player, final String channel) {
        super(player, channel);
    }
}
