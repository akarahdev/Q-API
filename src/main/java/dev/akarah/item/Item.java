package dev.akarah.item;

import dev.akarah.datatypes.ResourceKey;

import java.util.HashMap;
import java.util.function.Consumer;

public class Item {
    ResourceKey<Item> itemType;
    int amount;
    HashMap<ItemComponent<?>, Object> components = new HashMap<>();

    private Item(ResourceKey<Item> itemType, int amount) {
        this.itemType = itemType;
        this.amount = 1;
    }

    private Item(Item oldItem, Consumer<Item> modify) {
        this.itemType = oldItem.itemType;
        this.amount = oldItem.amount;
        this.components = oldItem.cloneComponents();
        modify.accept(this);
    }

    public static Item of(String itemType) {
        return new Item(ResourceKey.of(itemType), 1);
    }

    public static Item of(String itemType, int amount) {
        return new Item(ResourceKey.of(itemType), amount);
    }

    public static Item of(ResourceKey<Item> itemType) {
        return new Item(itemType, 1);
    }

    public static Item of(ResourceKey<Item> itemType, int amount) {
        return new Item(itemType, amount);
    }

    private HashMap<ItemComponent<?>, Object> cloneComponents() {
        var hm = new HashMap<ItemComponent<?>, Object>();
        for (var key : this.components.keySet())
            hm.put(key, this.components.get(key));
        return hm;
    }

    public ResourceKey<Item> getType() {
        return this.itemType;
    }

    public <T> Item component(ItemComponent<T> component, T value) {
        return new Item(this, item -> item.components.put(component, value));
    }

    public <T> T component(ItemComponent<T> component) {
        // Safety: This is guaranteed safe at compile-time
        // by the type system.
        return (T) this.components.get(component);
    }

    public <T> boolean hasComponent(ItemComponent<T> component) {
        return this.components.containsKey(component);
    }
}
