package dev.akarah.registry;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.meta.ApiUsage;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Registry<T> {
    /**
     * Fetches a value from a registry based off of a key.
     *
     * @param key The key to lookup in this registry.
     * @return The value in the registry. Is empty if the key is not present
     * in the registry.
     */
    T get(Identifier<T> key);

    /**
     * Attempts to put a key-value pair in the registry.
     *
     * @param resourceKey The key to modify in the registry.
     * @param value       The value to associate with the key.
     * @throws RegistryFrozenException If the registry is unable to be modified.
     */
    void register(Identifier<T> resourceKey, T value) throws RegistryFrozenException;

    /**
     * Fetches a list of all the keys present in the registry.
     *
     * @return List of all the present keys.
     */
    Stream<Identifier<T>> keys();

    /**
     * Parallels {@link Registry#get(Identifier)}, but is not type safe.
     * This should not be used unless you are developing an internal API, as this has undefined behavior
     * when a key of another type is passed in.
     *
     * @param key The key to look up in the registry.
     * @return The value looked up from the registry.
     */
    @ApiUsage.Internal
    @ApiUsage.Unsafe
    default T getUnsafe(Identifier<?> key) {
        return this.getOptional((Identifier<T>) key).orElse(null);
    }

    default Optional<T> getOptional(Identifier<T> key) {
        return Optional.ofNullable(this.get(key));
    }

    default void map(Identifier<T> key, Function<T, T> mappingFunction) {
        this.getOptional(key).ifPresent(value -> {
            this.register(key, mappingFunction.apply(value));
        });
    }
}
