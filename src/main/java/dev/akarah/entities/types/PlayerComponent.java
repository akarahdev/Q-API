package dev.akarah.entities.types;

import dev.akarah.item.Item;

public interface PlayerComponent {
    GUIComponent gui();
    InventoryComponent inventory();
}
