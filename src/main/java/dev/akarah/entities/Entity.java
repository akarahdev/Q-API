package dev.akarah.entities;

import dev.akarah.datatypes.Location;
import dev.akarah.dimension.Dimension;

import java.util.UUID;

public interface Entity {
    EntityType entityType();

    <T> T component(EntityComponent<T> component);

    <T> void component(EntityComponent<T> component, T value);

    <T> boolean hasComponent(EntityComponent<T> component);
}
