package dev.akarah.events.components;

import dev.akarah.component.ComponentHolder;
import dev.akarah.datatypes.server.Location;
import dev.akarah.dimension.Dimension;
import dev.akarah.entities.Entity;

public class EventData implements ComponentHolder<EventData, EventComponents> {

    Entity mainEntity;
    Entity attacker;
    Entity victim;
    Location location;
    boolean isCancellable;
    boolean cancelled;

    Dimension fromDimension;
    Dimension toDimension;

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

    public static class Builder extends EventData {
        private Builder() {}

        public static Builder empty() {
            return new Builder();
        }

        public Builder mainEntity(Entity mainEntity) {
            this.mainEntity = mainEntity;
            return this;
        }

        public Builder attacker(Entity attacker) {
            this.attacker = attacker;
            return this;
        }

        public Builder victim(Entity victim) {
            this.victim = victim;
            return this;
        }

        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Builder fromDimension(Dimension fromDimension) {
            this.fromDimension = fromDimension;
            return this;
        }

        public Builder toDimension(Dimension toDimension) {
            this.toDimension = toDimension;
            return this;
        }
    }
}
