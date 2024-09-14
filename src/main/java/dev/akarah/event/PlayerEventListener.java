package dev.akarah.event;

import dev.akarah.datatypes.Location;
import dev.akarah.entities.Entity;
import dev.akarah.entities.Player;

public interface PlayerEventListener {
    default void onConnect(Player player) {
    }

    default void onDisconnect(Player player) {
    }

    default EventStatus onPlaceBlock(Player player, Location blockPos) {
        return EventStatus.NORMAL;
    }

    default EventStatus onBreakBlock(Player player, Location blockPos) {
        return EventStatus.NORMAL;
    }

    default void onLeftClick(Player player, Location eventBlockPos) {
    }

    default void onRightClick(Player player, Location eventBlockPos) {
    }

    default void onRespawn(Player player) {
    }

    default EventStatus onDamageEntity(Player killer, Entity victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onKillEntity(Player killer, Entity victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onDamagePlayer(Player killer, Player victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onKillPlayer(Player killer, Player victim) {
        return EventStatus.NORMAL;
    }

    default EventStatus onTakeDamage(Player victim) {
        return EventStatus.NORMAL;
    }
}
