package dev.akarah.item;

import dev.akarah.component.MutableComponent;

public class ItemNameComponent extends MutableComponent<String, Item, ItemComponent> {

    @Override
    public void set(Item holder, String value) {
        holder.itemName = value;
    }

    @Override
    public String get(Item holder) {
        return holder.itemName;
    }

    @Override
    public boolean isPresent(Item holder) {
        return holder.itemName != null;
    }
}
