package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;

import java.util.UUID;

public interface IdentityComponent extends AbstractComponent<IdentityComponent, Entity, EntityComponent> {
    int temporaryId();
    UUID uuid();

    @Override
    default IdentityComponent get(Entity holder) {
        return holder.unsafe().identity;
    }
}
