package dev.akarah.entities.types;

import dev.akarah.datatypes.server.Location;
import dev.akarah.dimension.Dimension;

public class LocationComponent {
    Dimension dimension;
    Location location;

    public LocationComponent(Dimension dimension, Location location) {
        this.dimension = dimension;
        this.location = location;
    }

    public Dimension dimension() {
        return this.dimension;
    }

    public LocationComponent dimension(Dimension dimension) {
        return new LocationComponent(dimension,location);
    }

    public Location location() {
        return this.location;
    }

    public LocationComponent location(Location location) {
        return new LocationComponent(dimension,location);
    }
}
