package dev.akarah.entities;

import dev.akarah.component.MutableComponent;

public interface FireComponent extends MutableComponent<String, Entity, EntityComponent> {
    FireComponent ticks(int ticks);
    int ticks();
}
