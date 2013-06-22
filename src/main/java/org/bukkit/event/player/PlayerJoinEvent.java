package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * This event is called when a player has completed logging in and is joining
 * the world.
 * <p>
 * This event is the final event in the login process lifecycle. It is
 * preceded by {@link AsyncPlayerPreLoginEvent} and {@link PlayerJoinEvent}.
 * At this point, the player's username has already been verified with Mojang
 * (if the server is not in offline/insecure mode), the bans have been
 * processed, and the player's position and world are not known. There may be
 * some more initialization steps taken after this event is complete.
 * <p>
 * It is acceptable to change the location of the player during this event.
 * <p>
 * If you wish to block the login of a player to the server, it is necessary
 * to handle PlayerLoginEvent instead (or AsyncPlayerPreLoginEvent). This
 * event does not permit plugins to halt the login process.
 *
 * @see AsyncPlayerPreLoginEvent
 * @see PlayerLoginEvent
 */
public class PlayerJoinEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private String joinMessage;

    public PlayerJoinEvent(final Player playerJoined, final String joinMessage) {
        super(playerJoined);
        this.joinMessage = joinMessage;
    }

    /**
     * Gets the join message to send to all online players
     *
     * @return string join message
     */
    public String getJoinMessage() {
        return joinMessage;
    }

    /**
     * Sets the join message to send to all online players
     *
     * @param joinMessage join message
     */
    public void setJoinMessage(String joinMessage) {
        this.joinMessage = joinMessage;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
