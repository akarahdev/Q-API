package dev.akarah.entities;

import dev.akarah.component.ComponentMaster;
import dev.akarah.datatypes.server.Location;
import dev.akarah.dimension.Dimension;
import dev.akarah.item.Item;

import java.util.Optional;
import java.util.UUID;

public class EntityComponent implements ComponentMaster<Entity, EntityComponent> {
    public static LocationComponent LOCATION =
            new LocationComponent() {
                @Override
                public LocationComponent get(Entity holder) {
                    return null;
                }

                @Override
                public boolean isPresent(Entity holder) {
                    return false;
                }

                @Override
                public void set(Entity holder, LocationComponent value) {

                }

                @Override
                public Dimension dimension() {
                    return null;
                }

                @Override
                public LocationComponent dimension(Dimension dimension) {
                    return null;
                }

                @Override
                public Location location() {
                    return null;
                }

                @Override
                public LocationComponent location(Location location) {
                    return null;
                }
            };
    public static HealthComponent HEALTH =
            new HealthComponent() {
                @Override
                public HealthComponent get(Entity holder) {
                    return null;
                }

                @Override
                public boolean isPresent(Entity holder) {
                    return false;
                }

                @Override
                public void set(Entity holder, HealthComponent value) {

                }

                @Override
                public double health() {
                    return 0;
                }

                @Override
                public double maxHealth() {
                    return 0;
                }

                @Override
                public boolean invulnerable() {
                    return false;
                }

                @Override
                public HealthComponent health(double health) {
                    return null;
                }

                @Override
                public HealthComponent maxHealth(double maxHealth) {
                    return null;
                }

                @Override
                public HealthComponent invulnerable(boolean invulnerable) {
                    return null;
                }
            };
    public static EquipmentComponent EQUIPMENT =
            new EquipmentComponent() {
                @Override
                public EquipmentComponent get(Entity holder) {
                    return null;
                }

                @Override
                public boolean isPresent(Entity holder) {
                    return false;
                }

                @Override
                public void set(Entity holder, EquipmentComponent value) {

                }

                @Override
                public Item helmet() {
                    return null;
                }

                @Override
                public EquipmentComponent helmet(Item helmet) {
                    return null;
                }

                @Override
                public Item chestplate() {
                    return null;
                }

                @Override
                public EquipmentComponent chestplate(Item chestplate) {
                    return null;
                }

                @Override
                public Item leggings() {
                    return null;
                }

                @Override
                public EquipmentComponent leggings(Item leggings) {
                    return null;
                }

                @Override
                public Item boots() {
                    return null;
                }

                @Override
                public EquipmentComponent boots(Item boots) {
                    return null;
                }

                @Override
                public Item mainHand() {
                    return null;
                }

                @Override
                public EquipmentComponent mainHand(Item mainHand) {
                    return null;
                }

                @Override
                public Item offHand() {
                    return null;
                }

                @Override
                public EquipmentComponent offHand(Item offHand) {
                    return null;
                }
            };

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
