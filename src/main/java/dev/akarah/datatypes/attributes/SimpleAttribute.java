package dev.akarah.datatypes.attributes;

import dev.akarah.component.MutableComponent;

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
    public Double get(AttributeContainer holder) {
        return 0.0;
    }

    @Override
    public boolean isPresent(AttributeContainer holder) {
        return false;
    }
}
