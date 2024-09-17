package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;
import dev.akarah.component.ComponentHolder;

public abstract class Entity implements ComponentHolder<Entity, EntityComponent> {
    EntityType entityType;

    EquipmentComponent equipment;
    HealthComponent health;
    LocationComponent location;

    IdentityComponent identity;
    PlayerComponent player;

    public EntityType entityType() {
        return this.entityType;
    }

    @Override
    public Entity copy() {
        return this;
    }
}
