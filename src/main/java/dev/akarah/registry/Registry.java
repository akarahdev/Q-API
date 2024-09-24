package dev.akarah.registry;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.meta.ApiUsage;

import java.util.List;
import java.util.Optional;

public interface Registry<T> {
    /**
     * Fetches a value from a registry based off of a key.
     *
     * @param key The key to lookup in this registry.
     * @return The value in the registry. Is empty if the key is not present
     * in the registry.
     */
    Optional<T> lookup(Identifier<T> key);

    /**
     * Attempts to put a key-value pair in the registry.
     *
     * @param resourceKey The key to modify in the registry.
     * @param value       The value to associate with the key.
     * @throws RegistryFrozenException If the registry is unable to be modified.
     */
    void put(Identifier<T> resourceKey, T value) throws RegistryFrozenException;

    /**
     * Fetches a list of all of the keys present in the registry.
     *
     * @return List of all of the present keys.
     */
    List<Identifier<T>> keys();

    /**
     * Parallels {@link Registry#lookup(Identifier)}, but is not type safe.
     * This should not be used unless you are developing an internal API, as this has undefined behavior
     * when a key of another type is passed in.
     *
     * @param key The key to look up in the registry.
     * @return The value looked up from the registry.
     */
    @ApiUsage.Internal
    @ApiUsage.Unsafe
    default T lookupUnsafe(Identifier<?> key) {
        return this.lookup((Identifier<T>) key).orElse(null);
    }
}
