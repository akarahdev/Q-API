package dev.akarah.registry;

import dev.akarah.datatypes.ResourceKey;

import java.util.Optional;

public interface Registry<T> {
    /**
     * Fetches a value from a registry based off of a key.
     *
     * @param key The key to lookup in this registry.
     * @return The value in the registry. Is empty if the key is not present
     * in the registry.
     */
    Optional<T> lookup(ResourceKey<T> key);

    /**
     * Attempts to put a key-value pair in the registry.
     *
     * @param resourceKey The key to modify in the registry.
     * @param value       The value to associate with the key.
     * @throws RegistryFrozenException If the registry is unable to be modified.
     */
    void put(ResourceKey<T> resourceKey, T value) throws RegistryFrozenException;
}
