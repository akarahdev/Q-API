package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;

import java.util.Optional;

public class CancellableComponent implements AbstractComponent<Boolean, EventData, EventComponents> {
    @Override
    public Boolean get(EventData holder) {
        if (holder.isCancellable) {
            return holder.cancelled;
        } else {
            return null;
        }
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.isCancellable;
    }
}
