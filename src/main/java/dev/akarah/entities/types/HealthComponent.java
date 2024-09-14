package dev.akarah.entities.types;

public interface HealthComponent {
    double health();

    double maxHealth();

    HealthComponent health(double health);

    HealthComponent maxHealth(double maxHealth);
}
