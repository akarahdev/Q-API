package dev.akarah.entities;

import java.util.Optional;

public interface Entity {
    EntityType entityType();

    <T> Optional<T> component(EntityComponent<T> component);

    <T> void component(EntityComponent<T> component, T value);

    <T> boolean hasComponent(EntityComponent<T> component);
}
