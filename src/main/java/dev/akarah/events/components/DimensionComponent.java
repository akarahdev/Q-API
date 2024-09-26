package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;
import dev.akarah.dimension.Dimension;
import dev.akarah.entities.Entity;

public class DimensionComponent implements AbstractComponent<Dimension, EventData, EventComponents> {
    @Override
    public Dimension get(EventData holder) {
        return holder.toDimension;
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.toDimension != null;
    }
}
