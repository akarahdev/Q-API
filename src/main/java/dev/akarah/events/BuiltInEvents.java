package dev.akarah.events;

import dev.akarah.datatypes.event.PlayerConnectEvent;
import dev.akarah.datatypes.event.PlayerDisconnectEvent;
import dev.akarah.datatypes.server.Identifier;

public class BuiltInEvents {
    public static Identifier<Event> PLAYER_CONNECT_EVENT
        = Identifier.of("minecraft:connect");
    public static Identifier<Event> PLAYER_DISCONNECT_EVENT
        = Identifier.of("minecraft:disconnect");
}
