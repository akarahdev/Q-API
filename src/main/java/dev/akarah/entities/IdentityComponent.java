package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;

import java.util.Optional;
import java.util.UUID;

public interface IdentityComponent extends AbstractComponent<IdentityComponent, Entity, EntityComponent> {
    int temporaryId();

    UUID uuid();

    @Override
    default Optional<IdentityComponent> get(Entity holder) {
        return Optional.ofNullable(holder.unsafe().identity);
    }
}
