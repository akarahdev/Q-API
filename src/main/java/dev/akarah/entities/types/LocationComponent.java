package dev.akarah.entities.types;

import dev.akarah.datatypes.server.Location;
import dev.akarah.dimension.Dimension;

public interface LocationComponent {
    Dimension dimension();
    Location location();
    void teleport(Location location);
}
