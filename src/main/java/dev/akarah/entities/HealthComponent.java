package dev.akarah.entities;

import dev.akarah.component.MutableComponent;

import java.util.Optional;

public interface HealthComponent extends MutableComponent<HealthComponent, Entity, EntityComponent> {
    public double health();
    public double maxHealth();
    public boolean invulnerable();
    public HealthComponent health(double health);
    public HealthComponent maxHealth(double maxHealth);
    public HealthComponent invulnerable(boolean invulnerable);
}
