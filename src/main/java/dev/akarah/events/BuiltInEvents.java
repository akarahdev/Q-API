package dev.akarah.events;

import dev.akarah.datatypes.server.Identifier;

public class BuiltInEvents {
    public static Identifier<Event> PLAYER_CONNECT_EVENT
        = Identifier.of("minecraft:connect");
    public static Identifier<Event> PLAYER_DISCONNECT_EVENT
        = Identifier.of("minecraft:disconnect");
    public static Identifier<Event> PLAYER_RESPAWN
            = Identifier.of("minecraft:respawn");
    public static Identifier<Event> LEFT_CLICK
            = Identifier.of("minecraft:left_click");
    public static Identifier<Event> RIGHT_CLICK
            = Identifier.of("minecraft:right_click");
    public static Identifier<Event> START_SNEAKING
            = Identifier.of("minecraft:sneak");
    public static Identifier<Event> STOP_SNEAKING
            = Identifier.of("minecraft:unsneak");
    public static Identifier<Event> START_SPRINTING
            = Identifier.of("minecraft:start_sprinting");
    public static Identifier<Event> STOP_SPRINTING
            = Identifier.of("minecraft:stop_sprinting");
}
