package dev.akarah.event;

import dev.akarah.datatypes.server.Location;
import dev.akarah.entities.Entity;
import dev.akarah.meta.ApiUsage;

import java.nio.ByteBuffer;

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

    default void onSneak(Entity player) {}
    default void onStopSneak(Entity player) {}
    default void onStartSprint(Entity player) {}
    default void onStopSprint(Entity player) {}

    default void onMoveVehicle(Entity player, Entity vehicle) {}
    default void onRenameItem(Entity player) {}

    default void onSwapHands(Entity player) {}
    default void onDropItem(Entity player) {}

    default EventStatus onUseItem(Entity player) { return EventStatus.NORMAL; }

    @ApiUsage.Experimental
    default EventStatus onChat(Entity player, String message) { return EventStatus.NORMAL; }

    default void onOpenInventory(Entity player) {}
    default void onCloseInventory(Entity player) {}
    default void onClickInventory(Entity player, int slot) {}

    @ApiUsage.Experimental
    default void onCustomPayload(ByteBuffer byteBuffer) {}

    default void onInteract(Entity player, Entity other) {}
}
