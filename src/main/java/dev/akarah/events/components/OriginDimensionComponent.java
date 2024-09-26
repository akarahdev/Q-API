package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;
import dev.akarah.dimension.Dimension;

public class OriginDimensionComponent implements AbstractComponent<Dimension, EventData, EventComponents> {
    @Override
    public Dimension get(EventData holder) {
        return holder.fromDimension;
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.fromDimension != null;
    }
}
