package dev.akarah.entities;

import dev.akarah.component.MutableComponent;

import java.util.Optional;

public class HealthComponent implements MutableComponent<HealthComponent, Entity, EntityComponent> {
    double health;
    double maxHealth;
    boolean invulnerable;

    public HealthComponent(double health, double maxHealth, boolean invulnerable) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.invulnerable = invulnerable;
    }

    public double health() {
        return this.health;
    }

    public double maxHealth() {
        return this.maxHealth;
    }

    public boolean invulnerable() { return this.invulnerable; }

    public HealthComponent health(double health) {
        return new HealthComponent(health, maxHealth, invulnerable);
    }

    public HealthComponent maxHealth(double maxHealth) {
        return new HealthComponent(health, maxHealth, invulnerable);
    }

    public HealthComponent invulnerable(boolean invulnerable) {
        return new HealthComponent(health, maxHealth, invulnerable);
    }

    @Override
    public void set(Entity holder, HealthComponent value) {
        holder.unsafe().health = value;
    }

    @Override
    public HealthComponent get(Entity holder) {
        return holder.unsafe().health;
    }

    @Override
    public boolean isPresent(Entity holder) {
        return holder.unsafe().health != null;
    }
}
