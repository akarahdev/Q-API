package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;
import dev.akarah.datatypes.server.Location;
import dev.akarah.entities.Entity;

import java.util.Optional;

public class LocationComponent implements AbstractComponent<Location, EventData, EventComponents> {
    @Override
    public Optional<Location> get(EventData holder) {
        return Optional.ofNullable(holder.location);
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.location != null;
    }
}
