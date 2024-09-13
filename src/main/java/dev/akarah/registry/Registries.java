package dev.akarah.registry;

import dev.akarah.datatypes.Dimension;
import dev.akarah.datatypes.ResourceKey;
import dev.akarah.entities.EntityType;
import dev.akarah.item.Item;

import java.util.Optional;

public class Registries {
    public static Registry<Registry<Object>> REGISTRIES;

    public static ResourceKey<Registry<Item>> ITEM
        = ResourceKey.of("minecraft:item");
    public static ResourceKey<Registry<EntityType>> ENTITY_TYPES
        = ResourceKey.of("minecraft:entity");
    public static ResourceKey<Registry<Dimension>> DIMENSION
        = ResourceKey.of("minecraft:dimension");

    public static<T> Optional<Registry<T>> findRegistry(ResourceKey<Registry<T>> registryResourceKey) {
        // safety: type is guaranteed by generics at compile-time
        return Optional.ofNullable((Registry<T>) Registries.REGISTRIES.lookupUnsafe(registryResourceKey));
    }
}
