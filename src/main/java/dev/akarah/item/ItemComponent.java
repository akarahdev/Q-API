package dev.akarah.item;

import dev.akarah.datatypes.Identifier;
import dev.akarah.meta.ApiUsage;

import java.util.HashMap;
import java.util.List;

public class ItemComponent<T> {
    public static ItemComponent<String> ITEM_NAME = new ItemComponent<>(
        Identifier.of("minecraft:item_name"));
    public static ItemComponent<String> DISPLAY_NAME = new ItemComponent<>(
        Identifier.of("minecraft:display_name"));
    public static ItemComponent<List<String>> LORE = new ItemComponent<>(
        Identifier.of("minecraft:lore"));
    public static ItemComponent<Integer> DAMAGE = new ItemComponent<>(
        Identifier.of("minecraft:damage"));
    public static ItemComponent<Integer> MAX_DAMAGE = new ItemComponent<>(
        Identifier.of("minecraft:max_damage"));
    public static ItemComponent<HashMap<String, Object>> CUSTOM_DATA = new ItemComponent<>(
        Identifier.of("minecraft:custom_data"));
    Identifier<?> internalName;

    @ApiUsage.Unsafe
    public ItemComponent(Identifier<?> internalName) {
        this.internalName = internalName;
    }

    @Override
    public int hashCode() {
        return this.internalName.hashCode();
    }
}
