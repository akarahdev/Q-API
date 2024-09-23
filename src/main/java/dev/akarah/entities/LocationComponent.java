package dev.akarah.entities;

import dev.akarah.component.MutableComponent;
import dev.akarah.datatypes.server.Location;
import dev.akarah.dimension.Dimension;

import java.util.Optional;

public class LocationComponent implements MutableComponent<LocationComponent, Entity, EntityComponent> {
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

    @Override
    public void set(Entity holder, LocationComponent value) {
        holder.unsafe().location = value;
    }

    @Override
    public Optional<LocationComponent> get(Entity holder) {
        return Optional.ofNullable(holder.unsafe().location);
    }

    @Override
    public boolean isPresent(Entity holder) {
        return holder.unsafe().location != null;
    }
}
