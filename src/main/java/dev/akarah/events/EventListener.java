package dev.akarah.events;

import dev.akarah.entities.EntityComponent;
import dev.akarah.events.components.EventComponents;
import dev.akarah.events.components.EventData;
import dev.akarah.registry.Registries;
import dev.akarah.registry.Registry;

@FunctionalInterface
public interface EventListener {
    void run(EventData data);
}
