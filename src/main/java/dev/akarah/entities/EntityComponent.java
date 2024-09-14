package dev.akarah.entities;

import dev.akarah.datatypes.Location;
import dev.akarah.datatypes.Identifier;
import dev.akarah.entities.types.EquipmentComponent;
import dev.akarah.entities.types.HealthComponent;

public class EntityComponent<T> {
    public static EntityComponent<Location> LOCATION =
        new EntityComponent<>(Identifier.of("api:location"));
    public static EntityComponent<String> CUSTOM_NAME =
        new EntityComponent<>(Identifier.of("api:entity_name"));
    public static EntityComponent<HealthComponent> HEALTH =
        new EntityComponent<>(Identifier.of("api:health"));
    public static EntityComponent<EquipmentComponent> EQUIPMENT =
        new EntityComponent<>(Identifier.of("api:equipment"));
    public static EntityComponent<Boolean> NO_PHYSICS =
        new EntityComponent<>(Identifier.of("api:no_physics"));

    Identifier<?> internalName;
    public EntityComponent(Identifier<?> internalName) {
        this.internalName = internalName;
    }

    public Identifier<?> internalName() {
        return this.internalName;
    }

    @Override
    public int hashCode() {
        return this.internalName.hashCode();
    }
}
