package dev.akarah.events;

import dev.akarah.events.components.EventData;

@FunctionalInterface
public interface EventListener {
    void run(EventData data);
}
