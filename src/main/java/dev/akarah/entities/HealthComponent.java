package dev.akarah.entities;

import dev.akarah.component.MutableComponent;

import java.util.Optional;

public class HealthComponent implements MutableComponent<HealthComponent, Entity, EntityComponent> {
    double health;
    double maxHealth;

    public HealthComponent(double health, double maxHealth) {
        this.health = health;
        this.maxHealth = maxHealth;
    }

    public double health() {
        return this.health;
    }

    public double maxHealth() {
        return this.maxHealth;
    }

    public HealthComponent health(double health) {
        return new HealthComponent(health, maxHealth);
    }

    public HealthComponent maxHealth(double maxHealth) {
        return new HealthComponent(health, maxHealth);
    }

    @Override
    public void set(Entity holder, HealthComponent value) {
        holder.unsafe().health = value;
    }

    @Override
    public Optional<HealthComponent> get(Entity holder) {
        return Optional.ofNullable(holder.unsafe().health);
    }

    @Override
    public boolean isPresent(Entity holder) {
        return holder.unsafe().health != null;
    }
}
