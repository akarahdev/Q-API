package dev.akarah.item;

import dev.akarah.component.MutableComponent;
import dev.akarah.datatypes.nbt.NbtElement;

public class CustomDataComponent implements MutableComponent<CustomDataComponent, Item, ItemComponent> {
    NbtElement.CompoundValue compound;

    boolean hasTag(String tag) {
        return compound.value().containsKey(tag);
    }

    NbtElement.CompoundValue structure() {
        return this.compound;
    }

    NbtElement get(String tag) {
        return compound.value().get(tag);
    }

    void put(String tag, NbtElement value) {
        compound.value().put(tag, value);
    }

    @Override
    public void set(Item holder, CustomDataComponent value) {
        holder.customDataComponent = value;
    }

    @Override
    public CustomDataComponent get(Item holder) {
        return holder.customDataComponent;
    }

    @Override
    public boolean isPresent(Item holder) {
        return holder.customDataComponent != null;
    }
}
