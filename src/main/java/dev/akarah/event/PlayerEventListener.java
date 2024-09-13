package dev.akarah.event;

import dev.akarah.datatypes.Location;
import dev.akarah.entities.Entity;
import dev.akarah.entities.Player;

public interface PlayerEventListener {
    default void onConnect(Player player) {
    }

    default void onDisconnect(Player player) {
    }

    default void onPlaceBlock(Player player, Location blockPos) {
    }

    default void onBreakBlock(Player player, Location blockPos) {
    }

    default void onLeftClick(Player player, Location eventBlockPos) {
    }

    default void onRightClick(Player player, Location eventBlockPos) {
    }

    default void onRespawn(Player player) {
    }

    default void onKillPlayer(Player killer, Player victim) {
    }

    default void onKillEntity(Player killer, Entity victim) {
    }
}
