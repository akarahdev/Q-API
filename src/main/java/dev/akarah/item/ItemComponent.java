package dev.akarah.item;

import dev.akarah.component.ComponentMaster;
import dev.akarah.component.MutableComponent;
import dev.akarah.datatypes.server.Identifier;
import dev.akarah.meta.ApiUsage;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ItemComponent implements ComponentMaster<Item, ItemComponent> {
    public static DamageComponent DAMAGE = new DamageComponent();
    public static CustomDataComponent CUSTOM_DATA = new CustomDataComponent();
    public static ItemNameComponent ITEM_NAME = new ItemNameComponent();

    public static class ItemLoreComponent implements MutableComponent<List<String>, Item, ItemComponent> {
        @Override
        public void set(Item holder, List<String> value) {
            holder.itemLore = value;
        }

        @Override
        public Optional<List<String>> get(Item holder) {
            return Optional.ofNullable(holder.itemLore);
        }

        @Override
        public boolean isPresent(Item holder) {
            return holder.itemLore != null;
        }
    }

    public static class ItemNameComponent implements MutableComponent<String, Item, ItemComponent> {
        @Override
        public void set(Item holder, String value) {
            holder.itemName = value;
        }

        @Override
        public Optional<String> get(Item holder) {
            return Optional.ofNullable(holder.itemName);
        }

        @Override
        public boolean isPresent(Item holder) {
            return holder.itemName != null;
        }
    }

    public static class DamageComponent implements MutableComponent<DamageComponent, Item, ItemComponent> {
        int damage;
        int maxDamage;
        boolean unbreakable;

        @Override
        public void set(Item holder, DamageComponent value) {
            holder.damageComponent = this;
        }

        @Override
        public Optional<DamageComponent> get(Item holder) {
            return Optional.ofNullable(holder.damageComponent);
        }

        @Override
        public boolean isPresent(Item holder) {
            return holder.damageComponent != null;
        }
    }

    private ItemComponent() {}
}
