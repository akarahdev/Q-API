package dev.akarah.item;

import dev.akarah.component.MutableComponent;
import dev.akarah.datatypes.nbt.NbtElement;

import java.util.HashMap;
import java.util.Optional;

public class CustomDataComponent implements MutableComponent<CustomDataComponent, Item, ItemComponent> {
    NbtElement.CompoundValue compound = new NbtElement.CompoundValue(new HashMap<>());

    public boolean hasTag(String tag) {
        return compound.value().containsKey(tag);
    }

    public NbtElement.CompoundValue structure() {
        return this.compound;
    }

    public NbtElement get(String tag) {
        return compound.value().get(tag);
    }

    public void put(String tag, NbtElement value) {
        compound.value().put(tag, value);
    }

    @Override
    public void set(Item holder, CustomDataComponent value) {
        holder.customDataComponent = value;
    }

    @Override
    public Optional<CustomDataComponent> get(Item holder) {
        return Optional.ofNullable(holder.customDataComponent);
    }

    @Override
    public boolean isPresent(Item holder) {
        return holder.customDataComponent != null;
    }
}
