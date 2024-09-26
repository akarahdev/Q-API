package dev.akarah.registry;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.dimension.block.BlockType;
import dev.akarah.dimension.Dimension;
import dev.akarah.entities.EntityType;
import dev.akarah.events.Event;
import dev.akarah.item.Item;

public final class Registries {
    public static Registry<Registry<?>> REGISTRIES;

    public static final Identifier<Registry<Item>> ITEM
        = Identifier.of("minecraft:item");
    public static final Identifier<Registry<EntityType>> ENTITY_TYPES
        = Identifier.of("minecraft:entity");
    public static final Identifier<Registry<Dimension>> DIMENSION
        = Identifier.of("minecraft:dimension");
    public static final Identifier<Registry<BlockType>> BLOCK_TYPES
        = Identifier.of("minecraft:block");
    public static final Identifier<Registry<Event>> EVENTS
        = Identifier.of("q_mc:events");

    public static Registry<Event> eventRegistry() {
        return Registries.findRegistry(Registries.EVENTS);
    }
    public static Registry<Item> itemRegistry() {
        return Registries.findRegistry(Registries.ITEM);
    }
    public static Registry<Dimension> dimensionRegistry() {
        return Registries.findRegistry(Registries.DIMENSION);
    }
    public static Registry<BlockType> blockTypeRegistry() {
        return Registries.findRegistry(Registries.BLOCK_TYPES);
    }
    public static Registry<EntityType> entityTypeRegistry() {
        return Registries.findRegistry(Registries.ENTITY_TYPES);
    }
    public static <T> Registry<T> findRegistry(Identifier<Registry<T>> registryResourceKey) {
        // safety: type is guaranteed by generics at compile-time
        return (Registry<T>) Registries.REGISTRIES.getUnsafe(registryResourceKey);
    }
}
