package dev.akarah.entities;

import dev.akarah.datatypes.ResourceKey;

public class EntityType {
    public ResourceKey<?> resourceKey;

    private EntityType(ResourceKey<?> resourceKey) {
        this.resourceKey = resourceKey;
    }

    public static EntityType of(ResourceKey<?> resourceKey) {
        return new EntityType(resourceKey);
    }
}
