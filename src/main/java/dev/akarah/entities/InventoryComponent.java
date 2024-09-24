package dev.akarah.entities;

import dev.akarah.item.Item;

public interface InventoryComponent {
    void addItem(Item... item);

    void setItemInSlot(Item item, int slot);

    boolean hasItems(Item... item);
}
