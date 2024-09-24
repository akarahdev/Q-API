package dev.akarah.registry;

import dev.akarah.dimension.BlockType;
import dev.akarah.dimension.Dimension;
import dev.akarah.datatypes.server.Identifier;
import dev.akarah.entities.EntityType;
import dev.akarah.item.Item;

import java.util.Optional;
import java.util.function.Consumer;

public class Registries {
    public static Registry<Registry<?>> REGISTRIES;

    public static Identifier<Registry<Item>> ITEM
        = Identifier.of("minecraft:item");
    public static Identifier<Registry<EntityType>> ENTITY_TYPES
        = Identifier.of("minecraft:entity");
    public static Identifier<Registry<Dimension>> DIMENSION
        = Identifier.of("minecraft:dimension");
    public static Identifier<Registry<BlockType>> BLOCK_TYPES
        = Identifier.of("minecraft:block");
    public static Identifier<Registry<Consumer<?>>> EVENTS
            = Identifier.of("q_mc:events");

    public static<T> Optional<Registry<T>> findRegistry(Identifier<Registry<T>> registryResourceKey) {
        // safety: type is guaranteed by generics at compile-time
        return Optional.ofNullable((Registry<T>) Registries.REGISTRIES.lookupUnsafe(registryResourceKey));
    }
}
