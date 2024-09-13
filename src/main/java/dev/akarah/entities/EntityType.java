package dev.akarah.entities;

import dev.akarah.datatypes.Identifier;

public class EntityType {
    public Identifier<?> resourceKey;

    private EntityType(Identifier<?> resourceKey) {
        this.resourceKey = resourceKey;
    }

    public static EntityType of(Identifier<?> resourceKey) {
        return new EntityType(resourceKey);
    }
}
