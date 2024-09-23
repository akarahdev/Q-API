package dev.akarah.item;

import dev.akarah.component.MutableComponent;

import java.util.Optional;

public class ItemNameComponent implements MutableComponent<String, Item, ItemComponent> {

    @Override
    public void set(Item holder, String value) {
        holder.itemName = value;
    }

    @Override
    public Optional<String> get(Item holder) {
        return Optional.ofNullable(holder.itemName);
    }

    @Override
    public boolean isPresent(Item holder) {
        return holder.itemName != null;
    }
}
