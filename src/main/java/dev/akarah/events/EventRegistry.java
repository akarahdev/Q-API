package dev.akarah.events;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.registry.Registry;
import dev.akarah.registry.RegistryFrozenException;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EventRegistry implements Registry<Event> {

    public static HashMap<Identifier<Event>, Event> EVENTS = new HashMap<>();

    @Override
    public Event get(Identifier<Event> key) {
        if(!EVENTS.containsKey(key)) {
            EVENTS.put(key, new Event());
        }
        return EVENTS.get(key);
    }

    @Override
    public void register(Identifier<Event> resourceKey, Event value) throws RegistryFrozenException {
        EVENTS.put(resourceKey, value);
    }

    @Override
    public Stream<Identifier<Event>> keys() {
        return EVENTS.keySet().stream();
    }
}
