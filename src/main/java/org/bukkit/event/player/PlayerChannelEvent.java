package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * An abstract base for events relating to PluginChannels.
 *
 * @see org.bukkit.plugin.messaging.Messenger
 */
public abstract class PlayerChannelEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final String channel;

    public PlayerChannelEvent(final Player player, final String channel) {
        super(player);
        this.channel = channel;
    }

    public final String getChannel() {
        return channel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
