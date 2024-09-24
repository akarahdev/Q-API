package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;
import dev.akarah.entities.Entity;

import java.util.Optional;

public class MainEntityComponent implements AbstractComponent<Entity, EventData, EventComponents> {
    @Override
    public Optional<Entity> get(EventData holder) {
        return Optional.ofNullable(holder.mainEntity);
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.mainEntity != null;
    }
}
