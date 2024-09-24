package dev.akarah.events;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.events.components.EventData;

import java.util.ArrayList;
import java.util.List;

public class Event {
    List<EventListener> listeners = new ArrayList<>();
    Identifier<Event> id;

    public List<EventListener> eventListeners() {
        return this.listeners;
    }

    public Identifier<Event> name() {
        return this.id;
    }

    public void invoke(EventData eventData) {
        for (var listener : this.listeners) {
            listener.run(eventData);
        }
    }

    public Event subscribe(EventListener eventListener) {
        this.listeners.add(eventListener);
        return this;
    }
}
