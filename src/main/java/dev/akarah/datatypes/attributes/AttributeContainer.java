package dev.akarah.datatypes.attributes;

import dev.akarah.component.ComponentHolder;

import java.util.EnumMap;

public class AttributeContainer implements ComponentHolder<
    AttributeContainer,
    BuiltInAttributes> {
    public EnumMap<Attribute, Double> attributes;

    @Override
    public AttributeContainer copy() {
        return null;
    }
}
