package dev.akarah.datatypes.attributes;

import dev.akarah.component.ComponentHolder;

import java.util.EnumMap;
import java.util.HashMap;

public class AttributeContainer implements ComponentHolder<
        AttributeContainer,
        Attributes> {
    public EnumMap<Attribute, Double> attributes;

    @Override
    public AttributeContainer copy() {
        return null;
    }
}
