package dev.akarah.entities;

import dev.akarah.component.ComponentMaster;

import java.util.Optional;
import java.util.UUID;

public class EntityComponent implements ComponentMaster<Entity, EntityComponent> {
    public static LocationComponent LOCATION =
        new LocationComponent(null, null);
    public static HealthComponent HEALTH =
        new HealthComponent(0, 0);
    public static EquipmentComponent EQUIPMENT =
        new EquipmentComponent(null, null, null, null, null, null);

    public static PlayerComponent PLAYER = new PlayerComponent() {
        @Override
        public GUIComponent gui() {
            return null;
        }

        @Override
        public InventoryComponent inventory() {
            return null;
        }

        @Override
        public boolean isPresent(Entity holder) {
            return false;
        }
    };

    public static IdentityComponent IDENTITY = new IdentityComponent() {
        @Override
        public int temporaryId() {
            return 0;
        }

        @Override
        public UUID uuid() {
            return null;
        }

        @Override
        public boolean isPresent(Entity holder) {
            return false;
        }
    };

    private EntityComponent() {
    }
}
