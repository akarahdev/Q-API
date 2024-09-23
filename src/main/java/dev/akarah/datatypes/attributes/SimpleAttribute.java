package dev.akarah.datatypes.attributes;

import dev.akarah.component.MutableComponent;

import java.util.Optional;

public class SimpleAttribute implements MutableComponent<
        Double,
        AttributeContainer,
    BuiltInAttributes> {
    Attribute key;

    public SimpleAttribute(Attribute key) {
        this.key = key;
    }

    @Override
    public void set(AttributeContainer holder, Double value) {
        holder.attributes.put(this.key, value);
    }

    @Override
    public Optional<Double> get(AttributeContainer holder) {
        return Optional.ofNullable(holder.attributes.getOrDefault(this.key, null));
    }

    @Override
    public boolean isPresent(AttributeContainer holder) {
        return false;
    }
}
