package dev.akarah.entities;

import dev.akarah.component.MutableComponent;

public interface CustomNameComponent extends MutableComponent<String, Entity, EntityComponent> {
    CustomNameComponent customName(String name);
    CustomNameComponent visible(boolean isVisible);

    String customName();
    boolean visible();
}
