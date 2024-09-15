package dev.akarah.item.components;

import dev.akarah.nbt.NbtElement;

public interface CustomDataComponent {
    String hasTag(String tag);
    NbtElement.CompoundValue structure();
    NbtElement get(String tag);
    void put(String tag, NbtElement value);
}
