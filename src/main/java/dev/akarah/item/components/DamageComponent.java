package dev.akarah.item.components;

public interface DamageComponent {
    int damage();
    void damage(int damage);

    int maxDamage();
    void maxDamage(int damage);

    boolean unbreakable();
    void unbreakable(boolean unbreakable);
}
