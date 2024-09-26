package dev.akarah.datatypes.server;

import dev.akarah.registry.Registries;

/**
 * Represents a namespaced identifier.
 * These are used to look up values from Minecraft's or other plugins' registries.
 *
 * For example, to get an {@link dev.akarah.item.Item} from an item ID (e.g, `minecraft:diamond`),
 * you must first turn the ID into an {@link Identifier} with the method {@link Identifier#of(String)}.
 * From there, you can get the item registry {@link Registries#itemRegistry()} and fetch the item using the
 * {@link dev.akarah.registry.Registry#get(Identifier)} method.
 * @param <T> The type of this identifier.
 */
public class Identifier<T> {
    String namespace;
    String location;

    private Identifier(String namespace, String location) {
        this.namespace = namespace;
        this.location = location;
    }

    public static <T> Identifier<T> of(String path) {
        if (path.contains(":")) {
            return new Identifier<>(
                path.split(":")[0],
                path.split(":")[1]
            );
        }
        return new Identifier<>(
            "minecraft",
            path
        );
    }

    @Override
    public String toString() {
        return this.namespace + ":" + this.location;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Identifier<?> orl))
            return false;
        return this.namespace.equals(orl.namespace)
            && this.location.equals(orl.location);
    }
}
