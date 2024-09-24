package dev.akarah.events.components;

import dev.akarah.component.ComponentHolder;
import dev.akarah.datatypes.server.Location;
import dev.akarah.entities.Entity;

public class EventData implements ComponentHolder<EventData, EventComponents> {

    Entity mainEntity;
    Entity attacker;
    Entity victim;
    Location location;
    boolean isCancellable;
    boolean cancelled;

    private EventData() {
    }

    public static EventData empty() {
        return new EventData();
    }

    @Override
    public EventData copy() {
        var ed = EventData.empty();
        for (var field : ed.getClass().getFields()) {
            field.setAccessible(true);
            try {
                field.set(ed, field.get(this));
            } catch (IllegalAccessException ignored) {
            }
        }
        return ed;
    }
}
