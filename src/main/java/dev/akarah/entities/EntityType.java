package dev.akarah.entities;

import dev.akarah.datatypes.server.Identifier;

public interface EntityType {
    public Identifier<?> resourceKey();
}
