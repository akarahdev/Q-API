package dev.akarah.dimension;

import dev.akarah.datatypes.server.Location;
import dev.akarah.datatypes.server.Identifier;
import dev.akarah.entities.Entity;
import dev.akarah.entities.EntityType;

import java.util.stream.Stream;

/**
 * Represents a dimension in a Minecraft Server.
 */
public interface Dimension {
    /**
     * Returns the name of the dimension.
     * @return The name of the dimension.
     */
    Identifier<Dimension> name();

    /**
     * Gets a block at a specific location.
     *
     * @param location The location to check for the block at.
     * @return The block at the specified location.
     */
    Block blockAt(Location location);

    void setBlockAt(Location location, Block block);

    void breakBlockAt(Location location);

    Stream<Entity> entities();

    Entity spawnEntity(Location location, EntityType entityType);
}
