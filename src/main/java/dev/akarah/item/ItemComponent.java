package dev.akarah.item;

import dev.akarah.component.ComponentMaster;
import dev.akarah.component.MutableComponent;

import java.util.List;
import java.util.Optional;

public class ItemComponent implements ComponentMaster<Item, ItemComponent> {
    public static DamageComponent DAMAGE = new DamageComponent();
    public static CustomDataComponent CUSTOM_DATA = new CustomDataComponent();
    public static ItemNameComponent ITEM_NAME = new ItemNameComponent();
    public static RarityComponent RARITY = new RarityComponent();
    public static MaxStackSizeComponent MAX_STACK_SIZE = new MaxStackSizeComponent();

    private ItemComponent() {
    }

    public static class ItemLoreComponent implements MutableComponent<List<String>, Item, ItemComponent> {
        @Override
        public void set(Item holder, List<String> value) {
            holder.itemLore = value;
        }

        @Override
        public List<String> get(Item holder) {
            return holder.itemLore;
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
        public String get(Item holder) {
            return holder.itemName;
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
            holder.damageComponent = this.copy();
        }

        @Override
        public DamageComponent get(Item holder) {
            return holder.damageComponent.copy();
        }

        @Override
        public boolean isPresent(Item holder) {
            return holder.damageComponent != null;
        }

        public int damage() { return this.damage; }
        public DamageComponent damage(int damage) { this.damage = damage; return this; }

        public int maxDamage() { return this.damage; }
        public DamageComponent maxDamage(int damage) { this.damage = damage; return this; }

        public boolean unbreakable() { return this.unbreakable; }
        public DamageComponent unbreakable(boolean unbreakable) { this.unbreakable = unbreakable; return this; }

        public DamageComponent copy() {
            return new DamageComponent()
                .damage(this.damage)
                .maxDamage(this.maxDamage)
                .unbreakable(this.unbreakable);
        }
    }

    public enum ItemRarity {
        COMMON,
        UNCOMMON,
        RARE,
        EPIC
    }

    public static class RarityComponent implements MutableComponent<ItemRarity, Item, ItemComponent> {
        @Override
        public void set(Item holder, ItemRarity value) {
            holder.rarity = value;
        }

        @Override
        public ItemRarity get(Item holder) {
            return holder.rarity;
        }

        @Override
        public boolean isPresent(Item holder) {
            return holder.rarity != null;
        }
    }

    public static class MaxStackSizeComponent implements MutableComponent<Integer, Item, ItemComponent> {
        @Override
        public void set(Item holder, Integer value) {
            holder.maxStackSize = value;
        }

        @Override
        public Integer get(Item holder) {
            return holder.maxStackSize;
        }

        @Override
        public boolean isPresent(Item holder) {
            return true;
        }
    }
}
