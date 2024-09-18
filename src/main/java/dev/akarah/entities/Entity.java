package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;
import dev.akarah.component.ComponentHolder;

public abstract class Entity implements ComponentHolder<Entity, EntityComponent> {
    public static class UnsafeView {
        public EntityType entityType;

        public EquipmentComponent equipment;
        public HealthComponent health;
        public LocationComponent location;

        public IdentityComponent identity;
        public PlayerComponent player;
    }

    UnsafeView unsafeView = new UnsafeView();

    public EntityType entityType() {
        return this.unsafe().entityType;
    }

    @Override
    public Entity copy() {
        return this;
    }

    public UnsafeView unsafe() {
        return this.unsafeView;
    }
}
