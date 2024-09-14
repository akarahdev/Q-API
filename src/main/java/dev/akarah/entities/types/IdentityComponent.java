package dev.akarah.entities.types;

import java.util.UUID;

public interface IdentityComponent {
    int temporaryId();
    UUID uuid();
}
