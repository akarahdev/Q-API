package dev.akarah.entities;

import dev.akarah.datatypes.Location;

import java.util.UUID;

public interface Entity {
    EntityType mobId();

    int temporaryId();

    UUID uuid();

    Location location();

    void teleport(Location location);

    <T> T component(EntityComponent<T> component);

    <T> void component(EntityComponent<T> component, T value);

    <T> boolean hasComponent(EntityComponent<T> component);
}
