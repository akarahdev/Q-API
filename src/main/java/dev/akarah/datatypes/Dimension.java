package dev.akarah.datatypes;

import dev.akarah.entities.Entity;
import dev.akarah.entities.EntityType;

import java.util.stream.Stream;

/**
 * Represents a dimension in a Minecraft Server.
 */
public interface Dimension {
    /**
     * @return The name of the dimension.
     */
    ResourceKey<Dimension> name();

    /**
     * Gets a block at a specific location.
     *
     * @param location The location to check for the block at.
     * @return The block at the specified location.
     */
    ResourceKey<?> blockAt(Location location);

    void setBlockAt(Location location, ResourceKey<?> blockType);

    void breakBlockAt(Location location);

    Stream<Entity> entities();

    Entity spawnEntity(Location location, EntityType entityType);
}
