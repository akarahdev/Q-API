package dev.akarah.entities;

import dev.akarah.component.MutableComponent;
import dev.akarah.datatypes.server.Location;
import dev.akarah.dimension.Dimension;

import java.util.Optional;

public interface LocationComponent extends MutableComponent<LocationComponent, Entity, EntityComponent> {
    public Dimension dimension();
    public LocationComponent dimension(Dimension dimension);
    public Location location();
    public LocationComponent location(Location location);
}
