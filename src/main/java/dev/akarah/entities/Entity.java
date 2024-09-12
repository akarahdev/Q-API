package dev.akarah.entities;

import dev.akarah.datatypes.Location;
import dev.akarah.datatypes.ResourceKey;

import java.util.UUID;

public interface Entity {
    ResourceKey<Entity> mobId();
    int temporaryId();
    UUID uuid();
    Location location();
    void teleport(Location location);

    <T> T component(EntityComponent<T> component);
    <T> void component(EntityComponent<T> component, T value);
    <T> boolean hasComponent(EntityComponent<T> component);
}
