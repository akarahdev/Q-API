package dev.akarah.item;

import dev.akarah.component.ComponentMaster;
import dev.akarah.datatypes.server.Identifier;
import dev.akarah.meta.ApiUsage;

import java.util.HashMap;
import java.util.List;

public class ItemComponent extends ComponentMaster<Item, ItemComponent> {
    public static DamageComponent DAMAGE = new DamageComponent();
    public static CustomDataComponent CUSTOM_DATA = new CustomDataComponent();
    public static ItemNameComponent ITEM_NAME = new ItemNameComponent();

    private ItemComponent() {}
}
