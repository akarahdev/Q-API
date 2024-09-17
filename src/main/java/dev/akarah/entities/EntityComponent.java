package dev.akarah.entities;

import dev.akarah.component.ComponentMaster;

public class EntityComponent implements ComponentMaster<Entity, EntityComponent> {
    public static LocationComponent LOCATION =
        new LocationComponent(null, null);
    public static HealthComponent HEALTH =
        new HealthComponent(0, 0);
    public static EquipmentComponent EQUIPMENT =
        new EquipmentComponent(null, null, null, null, null, null);

    private EntityComponent() {}
}
