package dev.akarah.events;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.registry.Registry;
import dev.akarah.registry.RegistryFrozenException;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class EventRegistry implements Registry<Event> {

    public static HashMap<Identifier<Event>, Event> EVENTS = new HashMap<>();

    @Override
    public Optional<Event> lookup(Identifier<Event> key) {
        return Optional.ofNullable(EVENTS.getOrDefault(key, null));
    }

    @Override
    public void put(Identifier<Event> resourceKey, Event value) throws RegistryFrozenException {
        EVENTS.put(resourceKey, value);
    }

    @Override
    public List<Identifier<Event>> keys() {
        return EVENTS.keySet().stream().toList();
    }
}
