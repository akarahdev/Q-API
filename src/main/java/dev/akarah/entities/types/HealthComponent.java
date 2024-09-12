package dev.akarah.entities.types;

public class HealthComponent {
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
}
