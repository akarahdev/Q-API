package dev.akarah.entities;

import dev.akarah.datatypes.Location;
import dev.akarah.datatypes.ResourceKey;
import dev.akarah.entities.types.EquipmentComponent;
import dev.akarah.entities.types.HealthComponent;

public class EntityComponent<T> {
    public static EntityComponent<Location> LOCATION =
        new EntityComponent<>(ResourceKey.of("api:location"));
    public static EntityComponent<String> CUSTOM_NAME =
        new EntityComponent<>(ResourceKey.of("api:entity_name"));
    public static EntityComponent<HealthComponent> HEALTH =
        new EntityComponent<>(ResourceKey.of("api:health"));
    public static EntityComponent<EquipmentComponent> EQUIPMENT =
        new EntityComponent<>(ResourceKey.of("api:equipment"));
    public static EntityComponent<Boolean> NO_PHYSICS =
        new EntityComponent<>(ResourceKey.of("api:no_physics"));
    ResourceKey<?> internalName;
    public EntityComponent(ResourceKey<?> internalName) {
        this.internalName = internalName;
    }

    public ResourceKey<?> internalName() {
        return this.internalName;
    }

    @Override
    public int hashCode() {
        return this.internalName.hashCode();
    }
}
