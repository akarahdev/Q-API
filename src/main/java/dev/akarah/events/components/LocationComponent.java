package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;
import dev.akarah.datatypes.server.Location;

import java.util.Optional;

public class LocationComponent implements AbstractComponent<Location, EventData, EventComponents> {
    @Override
    public Location get(EventData holder) {
        return holder.location;
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.location != null;
    }
}
