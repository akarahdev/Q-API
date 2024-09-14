package dev.akarah.entities;

import dev.akarah.datatypes.Location;
import dev.akarah.dimension.Dimension;

import java.util.Optional;
import java.util.UUID;

public interface Entity {
    EntityType entityType();

    <T> Optional<T> component(EntityComponent<T> component);

    <T> void component(EntityComponent<T> component, T value);

    <T> boolean hasComponent(EntityComponent<T> component);
}
