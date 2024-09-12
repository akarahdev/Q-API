package dev.akarah.util;

public record EventPair<EventType>(
    String pluginId,
    EventType event
) {
}
