package dev.akarah.events.components;

import dev.akarah.component.AbstractComponent;
import dev.akarah.datatypes.server.Location;

import java.util.Optional;

public class CancellableComponent implements AbstractComponent<Boolean, EventData, EventComponents> {
    @Override
    public Optional<Boolean> get(EventData holder) {
        if(holder.isCancellable) {
            return Optional.of(holder.cancelled);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public boolean isPresent(EventData holder) {
        return holder.isCancellable;
    }
}
