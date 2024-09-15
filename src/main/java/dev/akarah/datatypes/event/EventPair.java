package dev.akarah.datatypes.event;

public record EventPair<EventType>(
    String pluginId,
    EventType event
) {
}
