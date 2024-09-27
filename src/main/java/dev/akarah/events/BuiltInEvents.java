package dev.akarah.events;

import dev.akarah.datatypes.server.Identifier;

public class BuiltInEvents {
    /**
     * Invoked when a player connects to the server.
     *
     * {@link dev.akarah.events.components.EventComponents#ENTITY} is the player connecting.
     * Guaranteed to have the {@link dev.akarah.entities.EntityComponent#PLAYER} component.
     */
    public static final Identifier<Event> PLAYER_CONNECT_EVENT
        = Identifier.of("minecraft:connect");
    /**
     * Invoked when a player disconnects to the server.
     *
     * {@link dev.akarah.events.components.EventComponents#ENTITY} is the player connecting.
     * Guaranteed to have the {@link dev.akarah.entities.EntityComponent#PLAYER} component.
     */
    public static final Identifier<Event> PLAYER_DISCONNECT_EVENT
        = Identifier.of("minecraft:disconnect");
    public static final Identifier<Event> PLAYER_RESPAWN
            = Identifier.of("minecraft:respawn");

    public static final Identifier<Event> LOCATION
            = Identifier.of("minecraft:location");
    public static final Identifier<Event> TICK
            = Identifier.of("minecraft:tick");

    public static final Identifier<Event> LEFT_CLICK
            = Identifier.of("minecraft:left_click");
    public static final Identifier<Event> RIGHT_CLICK
            = Identifier.of("minecraft:right_click");
    public static final Identifier<Event> START_SNEAKING
            = Identifier.of("minecraft:sneak");
    public static final Identifier<Event> STOP_SNEAKING
            = Identifier.of("minecraft:unsneak");
    public static final Identifier<Event> START_SPRINTING
            = Identifier.of("minecraft:start_sprinting");
    public static final Identifier<Event> STOP_SPRINTING
            = Identifier.of("minecraft:stop_sprinting");

    public static final Identifier<Event> IMPOSSIBLE
        = Identifier.of("minecraft:impossible");
    public static final Identifier<Event> PLAYER_KILLED_ENTITY
        = Identifier.of("minecraft:player_killed_entity");
    public static final Identifier<Event> ENTITY_KILLED_PLAYER
        = Identifier.of("minecraft:entity_killed_player");
    public static final Identifier<Event> ENTITY_ENTER_BLOCK
        = Identifier.of("minecraft:enter_block");
    public static final Identifier<Event> PLAYER_INVENTORY_CHANGED
        = Identifier.of("minecraft:inventory_changed");
    public static final Identifier<Event> PLAYER_CHANGED_DIMENSION
        = Identifier.of("minecraft:changed_dimension");
    public static final Identifier<Event> RAID_OMEN
        = Identifier.of("minecraft:raid_omen");
    public static final Identifier<Event> RAID_WIN
        = Identifier.of("minecraft:raid_win");
    public static final Identifier<Event> FALL_FROM_HEIGHT
        = Identifier.of("minecraft:fall_from_height");
    public static final Identifier<Event> CRAFTER_RECIPE_CRAFTED
        = Identifier.of("minecraft:crafter_recipe_crafted");
    public static final Identifier<Event> LIGHTNING_STRIKE
        = Identifier.of("minecraft:lightning_strike");
    public static final Identifier<Event> TARGET_BLOCK_HIT
        = Identifier.of("minecraft:target_block_hit");
}
