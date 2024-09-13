package dev.akarah.registry;

import dev.akarah.datatypes.ResourceKey;
import dev.akarah.item.Item;

public class Registries {
    public static Registry<Registry<?>> REGISTRIES;
    public static ResourceKey<Item> ITEM = ResourceKey.of("minecraft:item");
}
