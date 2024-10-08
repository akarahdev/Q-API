package dev.akarah.item;

import dev.akarah.component.ComponentHolder;
import dev.akarah.datatypes.server.Identifier;

import java.util.List;

public class Item implements ComponentHolder<Item, ItemComponent> {
    CustomDataComponent customDataComponent;
    ItemComponent.DamageComponent damageComponent;
    String itemName;
    List<String> itemLore;
    ItemComponent.ItemRarity rarity;
    int maxStackSize;

    Identifier<Item> itemType;
    int amount;

    private Item(Identifier<Item> itemType, int amount) {
        this.itemType = itemType;
        this.amount = 1;
    }

    public static Item of(String itemType) {
        return new Item(Identifier.of(itemType), 1);
    }

    public static Item of(String itemType, int amount) {
        return new Item(Identifier.of(itemType), amount);
    }

    public static Item of(Identifier<Item> itemType) {
        return new Item(itemType, 1);
    }

    public static Item of(Identifier<Item> itemType, int amount) {
        return new Item(itemType, amount);
    }

    @Override
    public Item copy() {
        var item = new Item(this.itemType, this.amount);
        item.itemName = this.itemName;
        item.customDataComponent = this.customDataComponent;
        item.damageComponent = this.damageComponent;
        return item;
    }

    public Identifier<Item> getType() {
        return this.itemType;
    }

    public void test() {

    }
}
