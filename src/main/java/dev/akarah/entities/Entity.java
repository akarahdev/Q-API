package dev.akarah.entities;

import dev.akarah.component.ComponentHolder;

public abstract class Entity implements ComponentHolder<Entity, EntityComponent> {
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

    public static class UnsafeView {
        public EntityType entityType;

        public EquipmentComponent equipment;
        public HealthComponent health;
        public LocationComponent location;

        public IdentityComponent identity;
        public PlayerComponent player;

        public String displayName;
        public boolean invulnerable;
        public boolean noAi;
        public boolean noGravity;
        public boolean ticks;
        public int fire;
    }
}
