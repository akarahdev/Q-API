package dev.akarah.event;

import dev.akarah.datatypes.server.Location;
import dev.akarah.entities.Entity;

public interface PlayerEventListener {
    /**
     * Ran when a player connects to the server.
     * @param player The connecting player.
     *               Guaranteed to have an {@link dev.akarah.entities.types.PlayerComponent}
     */
    default void onConnect(Entity player) {
    }

    /**
     * Ran when a player disconnects from the server.
     * @param player The disconnecting player.
     *               Guaranteed to have an {@link dev.akarah.entities.types.PlayerComponent}
     */
    default void onDisconnect(Entity player) {
    }

    /**
     * Ran when a player places a block.
     * @param player The player that placed the block.
     *               Guaranteed to have an {@link dev.akarah.entities.types.PlayerComponent}
     * @param blockPos The location the block was placed at.
     * @return The event status.
     */
    default EventStatus onPlaceBlock(Entity player, Location blockPos) {
        return EventStatus.NORMAL;
    }

    default EventStatus onBreakBlock(Entity player, Location blockPos) {
        return EventStatus.NORMAL;
    }

    default void onLeftClick(Entity player, Location eventBlockPos) {
    }

    default void onRightClick(Entity player, Location eventBlockPos) {
    }


    default void onRespawn(Entity player) {
    }

    default EventStatus onDamageEntity(Entity killer, Entity victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onKillEntity(Entity killer, Entity victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onDamagePlayer(Entity killer, Entity victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onKillPlayer(Entity killer, Entity victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onTakeDamage(Entity victim) {
        return EventStatus.NORMAL;
    }
}
